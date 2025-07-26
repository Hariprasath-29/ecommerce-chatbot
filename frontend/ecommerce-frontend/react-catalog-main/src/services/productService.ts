import axios from 'axios';
import { Product } from '@/types/product';

const API_BASE_URL = 'http://localhost:8080/api';

export const productService = {
  async getAllProducts(): Promise<Product[]> {
    try {
      const response = await axios.get(`${API_BASE_URL}/products`);
      return response.data;
    } catch (error) {
      console.error('Error fetching products:', error);
      throw new Error('Failed to fetch products');
    }
  }
};