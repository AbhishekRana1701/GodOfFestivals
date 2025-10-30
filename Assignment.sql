CREATE DATABASE sales_dept; 

USE sales_dept; 

CREATE TABLE salesman ( 

    salesman_id INT PRIMARY KEY, 

    name VARCHAR(100), 

    city VARCHAR(100), 

    commission DECIMAL(5, 2) 

); 

CREATE TABLE customer ( 

    customer_id INT PRIMARY KEY, 

    customer_name VARCHAR(100), 

    city VARCHAR(100), 

    grade CHAR(1), 

    salesman_id INT, 

    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id) 

); 

CREATE TABLE orders ( 

    order_no INT PRIMARY KEY, 

    purchase_amount DECIMAL(10, 2), 

    order_date DATE, 

    customer_id INT, 

    salesman_id INT, 

    FOREIGN KEY (customer_id) REFERENCES customer(customer_id), 

    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id) 

); 

INSERT INTO salesman (salesman_id, name, city, commission) VALUES 

(1, 'Atharv', 'Dehradun', 500.00), 

(2, 'Anand', 'Ranchi', 600.00), 

(3, 'Kamran', 'Gaya', 550.00); 

  

INSERT INTO customer (customer_id, customer_name, city, grade, salesman_id) VALUES 

(1, 'Paras', 'Dehradun', 'A', 1), 

(2, 'Vivek', 'Bokaro steel', 'B', 2), 

(3, 'Sunny', 'Patna', 'A', 3); 

  

INSERT INTO orders (order_no, purchase_amount, order_date, customer_id, salesman_id) VALUES 

(1001, 1500.00, '2023-01-15', 1, 1), 

(1002, 2500.00, '2023-02-20', 2, 2), 

(1003, 1800.00, '2023-03-10', 3, 3); 

  

