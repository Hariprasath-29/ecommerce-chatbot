-- Insert into distribution_centers
INSERT INTO distribution_center (id, name, latitude, longitude) VALUES
('dc1', 'Central Distribution', 12.9716, 77.5946),
('dc2', 'North Hub', 28.7041, 77.1025);

-- Insert into product
INSERT INTO product (id, cost, category, name, brand, retail_price, department, sku, distribution_center_id) VALUES
('p1', 250.0, 'Electronics', 'Bluetooth Speaker', 'Sony', 299.99, 'Audio', 'SPK123', 'dc1'),
('p2', 1500.0, 'Appliances', 'Microwave Oven', 'LG', 1899.99, 'Kitchen', 'MWO456', 'dc2');

-- Insert into inventory_item
INSERT INTO inventory_item (id, product_id, created_at, sold_at, cost, product_category, product_name, product_brand, product_retail_price, product_department, product_sku, product_distribution_center_id) VALUES
('inv1', 'p1', '2024-05-01 10:00:00', NULL, 250.0, 'Electronics', 'Bluetooth Speaker', 'Sony', 299.99, 'Audio', 'SPK123', 'dc1'),
('inv2', 'p2', '2024-05-02 11:00:00', '2024-06-01 14:30:00', 1500.0, 'Appliances', 'Microwave Oven', 'LG', 1899.99, 'Kitchen', 'MWO456', 'dc2');

-- Insert into users
INSERT INTO "user" (id, first_name, last_name, email, age, gender, state, street_address, postal_code, city, country, latitude, longitude, traffic_source, created_at) VALUES
('u1', 'Hari', 'Rao', 'hari@example.com', 24, 'Male', 'Karnataka', '123 MG Road', '560001', 'Bangalore', 'India', 12.9716, 77.5946, 'Google Ads', '2024-04-01 09:00:00');

-- Insert into orders
INSERT INTO "order" (order_id, user_id, status, gender, created_at, returned_at, shipped_at, delivered_at, num_of_item) VALUES
('o1', 'u1', 'Delivered', 'Male', '2024-06-01 08:00:00', NULL, '2024-06-01 10:00:00', '2024-06-03 15:00:00', 1);

-- Insert into order_item
INSERT INTO order_item (id, order_id, user_id, product_id, inventory_item_id, status, created_at, shipped_at, delivered_at, returned_at) VALUES
('oi1', 'o1', 'u1', 'p2', 'inv2', 'Delivered', '2024-06-01 08:10:00', '2024-06-01 10:30:00', '2024-06-03 15:00:00', NULL);
