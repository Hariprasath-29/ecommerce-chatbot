import { useState, useEffect } from 'react';
import { Product } from '@/types/product';
import { productService } from '@/services/productService';
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card';
import { Badge } from '@/components/ui/badge';
import { Skeleton } from '@/components/ui/skeleton';
import { AlertCircle, Package, DollarSign, Tag, Building } from 'lucide-react';
import { useToast } from '@/hooks/use-toast';

export const ProductList = () => {
  const [products, setProducts] = useState<Product[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const { toast } = useToast();

  useEffect(() => {
    const fetchProducts = async () => {
      try {
        setLoading(true);
        setError(null);
        const data = await productService.getAllProducts();
        setProducts(data);
      } catch (err) {
        const errorMessage = err instanceof Error ? err.message : 'Failed to fetch products';
        setError(errorMessage);
        toast({
          title: "Error",
          description: errorMessage,
          variant: "destructive",
        });
      } finally {
        setLoading(false);
      }
    };

    fetchProducts();
  }, [toast]);

  const formatPrice = (price: number) => {
    return new Intl.NumberFormat('en-US', {
      style: 'currency',
      currency: 'USD'
    }).format(price);
  };

  const calculateMargin = (retailPrice: number, cost: number) => {
    if (cost === 0) return 0;
    return ((retailPrice - cost) / retailPrice * 100);
  };

  if (loading) {
    return (
      <div className="container mx-auto px-4 py-8">
        <div className="mb-8">
          <Skeleton className="h-8 w-64 mb-2" />
          <Skeleton className="h-4 w-96" />
        </div>
        <Card>
          <CardHeader>
            <Skeleton className="h-6 w-32" />
          </CardHeader>
          <CardContent>
            <div className="space-y-4">
              {[...Array(5)].map((_, i) => (
                <div key={i} className="flex items-center space-x-4">
                  <Skeleton className="h-4 w-32" />
                  <Skeleton className="h-4 w-24" />
                  <Skeleton className="h-4 w-20" />
                  <Skeleton className="h-4 w-16" />
                  <Skeleton className="h-4 w-20" />
                  <Skeleton className="h-4 w-24" />
                  <Skeleton className="h-4 w-32" />
                </div>
              ))}
            </div>
          </CardContent>
        </Card>
      </div>
    );
  }

  if (error) {
    return (
      <div className="container mx-auto px-4 py-8">
        <Card className="border-destructive/50 bg-destructive/5">
          <CardContent className="flex items-center gap-4 pt-6">
            <AlertCircle className="h-8 w-8 text-destructive" />
            <div>
              <h3 className="text-lg font-semibold text-destructive">Unable to load products</h3>
              <p className="text-sm text-muted-foreground mt-1">
                Please ensure your backend API is running at http://localhost:8080
              </p>
              <p className="text-sm text-destructive mt-2">{error}</p>
            </div>
          </CardContent>
        </Card>
      </div>
    );
  }

  return (
    <div className="container mx-auto px-4 py-8">
      {/* Header */}
      <div className="mb-8">
        <div className="flex items-center gap-3 mb-4">
          <Package className="h-8 w-8 text-primary" />
          <h1 className="text-3xl font-bold bg-gradient-primary bg-clip-text text-transparent">
            Product Catalog
          </h1>
        </div>
        <p className="text-muted-foreground">
          Manage and view your product inventory with detailed pricing information
        </p>
        <div className="flex items-center gap-4 mt-4">
          <Badge variant="secondary" className="flex items-center gap-2">
            <Package className="h-3 w-3" />
            {products.length} Products
          </Badge>
        </div>
      </div>

      {/* Products Table */}
      <Card className="shadow-card">
        <CardHeader>
          <CardTitle className="flex items-center gap-2">
            <Building className="h-5 w-5" />
            Product Details
          </CardTitle>
        </CardHeader>
        <CardContent className="p-0">
          <div className="overflow-x-auto">
            <table className="w-full">
              <thead>
                <tr className="border-b border-border bg-muted/50">
                  <th className="text-left py-4 px-6 font-semibold text-foreground">
                    Product Name
                  </th>
                  <th className="text-left py-4 px-6 font-semibold text-foreground">
                    Brand
                  </th>
                  <th className="text-left py-4 px-6 font-semibold text-foreground">
                    Category
                  </th>
                  <th className="text-left py-4 px-6 font-semibold text-foreground">
                    Department
                  </th>
                  <th className="text-left py-4 px-6 font-semibold text-foreground">
                    SKU
                  </th>
                  <th className="text-right py-4 px-6 font-semibold text-foreground">
                    Cost
                  </th>
                  <th className="text-right py-4 px-6 font-semibold text-foreground">
                    Retail Price
                  </th>
                  <th className="text-right py-4 px-6 font-semibold text-foreground">
                    Margin
                  </th>
                </tr>
              </thead>
              <tbody>
                {products.map((product, index) => {
                  const margin = calculateMargin(product.retail_price, product.cost);
                  return (
                    <tr 
                      key={product.id || index} 
                      className="border-b border-border hover:bg-accent/50 transition-colors duration-200"
                    >
                      <td className="py-4 px-6">
                        <div className="font-medium text-foreground">
                          {product.name}
                        </div>
                      </td>
                      <td className="py-4 px-6">
                        <Badge variant="outline" className="font-normal">
                          {product.brand}
                        </Badge>
                      </td>
                      <td className="py-4 px-6">
                        <div className="flex items-center gap-2">
                          <Tag className="h-4 w-4 text-muted-foreground" />
                          <span className="text-muted-foreground">{product.category}</span>
                        </div>
                      </td>
                      <td className="py-4 px-6">
                        <div className="flex items-center gap-2">
                          <Building className="h-4 w-4 text-muted-foreground" />
                          <span className="text-muted-foreground">{product.department}</span>
                        </div>
                      </td>
                      <td className="py-4 px-6">
                        <code className="bg-muted px-2 py-1 rounded text-sm font-mono">
                          {product.sku}
                        </code>
                      </td>
                      <td className="py-4 px-6 text-right">
                        <span className="font-medium text-muted-foreground">
                          {formatPrice(product.cost)}
                        </span>
                      </td>
                      <td className="py-4 px-6 text-right">
                        <div className="flex items-center justify-end gap-2">
                          <DollarSign className="h-4 w-4 text-success" />
                          <span className="font-semibold text-foreground">
                            {formatPrice(product.retail_price)}
                          </span>
                        </div>
                      </td>
                      <td className="py-4 px-6 text-right">
                        <Badge 
                          variant={margin > 30 ? "default" : margin > 15 ? "secondary" : "destructive"}
                          className="font-medium"
                        >
                          {margin.toFixed(1)}%
                        </Badge>
                      </td>
                    </tr>
                  );
                })}
              </tbody>
            </table>
          </div>
          
          {products.length === 0 && (
            <div className="text-center py-12">
              <Package className="h-12 w-12 text-muted-foreground mx-auto mb-4" />
              <h3 className="text-lg font-semibold text-foreground mb-2">No products found</h3>
              <p className="text-muted-foreground">
                Your product catalog is empty. Add some products to get started.
              </p>
            </div>
          )}
        </CardContent>
      </Card>
    </div>
  );
};