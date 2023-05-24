# Write your MySQL query statement below
SELECT name as Customers FROM customers where id not in (select customerid from orders);
