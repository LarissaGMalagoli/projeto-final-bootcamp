INSERT INTO product(category, name, price) VALUES ('FS','queijo',5),('RF','presunto',5);
INSERT INTO warehouse(code) VALUES ('a');
INSERT INTO section(code, size, warehouse_id) VALUES ('a',10,1),('secao b',5,1);
INSERT INTO inbound_order(order_date, section_id) VALUES ('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1),('2021-08-05',1);
INSERT INTO stock(current_quantity, current_temperature, due_date, initial_quantity, manufacturing_date, manufacturing_time, minimum_temperature, inbound_order_order_number, product_id) VALUES (10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,1,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,2,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,3,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,4,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,5,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,6,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,7,1),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,8,2),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,9,2),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,10,2),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,11,2),(10,50,'2021-08-05',10,'2021-08-05','2021-08-05 19:35:00.000000',60,12,2);
INSERT INTO buy_order(buyer_id, date, order_status) VALUES (1,'2021-08-10','CR'),(1,'2021-08-10','CR'),(1,'2021-08-10','CR'),(1,'2021-08-10','CR'),(1,'2021-08-10','CR');
INSERT INTO cart_item(product_id, quantity) VALUES (1,1),(1,1),(1,1),(2,2),(1,1),(2,2),(1,1),(2,2);
INSERT INTO buy_order_cart_items VALUES (1,1),(2,2),(3,3),(3,4),(4,5),(4,6),(5,7),(5,8);
INSERT INTO profiles(role) VALUES ('representante'),('comprador');
INSERT INTO integrantes(name, password) VALUES ('jorge','$2a$10$vviww86InXz7RggmP873pubArXf05vwKGTalArLRZXEFTtD1xZ7cm'),('carlos','$2a$10$vviww86InXz7RggmP873pubArXf05vwKGTalArLRZXEFTtD1xZ7cm');
INSERT INTO integrantes_profiles VALUES (1,1),(2,2);
