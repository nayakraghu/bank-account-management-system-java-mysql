CREATE DATABASE IF NOT EXISTS bank_db; USE bank_db;
CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50),password VARCHAR(50));
INSERT INTO users(username,password) VALUES('admin','admin123');
CREATE TABLE IF NOT EXISTS accounts(id INT AUTO_INCREMENT PRIMARY KEY,holder_name VARCHAR(100),email VARCHAR(100),account_type VARCHAR(50),balance DOUBLE,open_date DATE);
INSERT INTO accounts(holder_name,email,account_type,balance,open_date) VALUES('Ramesh Gupta','ramesh@gmail.com','Savings',25000,'2022-01-10'),('Kavita Sharma','kavita@gmail.com','Current',150000,'2021-06-15'),('Arjun Patel','arjun@gmail.com','Savings',8000,'2023-03-20'),('Sunita Rao','sunita@gmail.com','Savings',42000,'2020-11-05');
