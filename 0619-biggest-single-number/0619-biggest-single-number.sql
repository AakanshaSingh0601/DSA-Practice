# Write your MySQL query statement below
SELECT * FROM MyNumbers GROUP BY num HAVING count(num)=1 UNION ALL SELECT NULL  ORDER BY num desc limit 1


