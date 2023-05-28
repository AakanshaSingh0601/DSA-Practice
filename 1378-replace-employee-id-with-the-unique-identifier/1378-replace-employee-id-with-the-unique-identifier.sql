# Write your MySQL query statement below
SELECT ui.unique_id, e.name FROM Employees as e LEFT OUTER JOIN  EmployeeUNI as ui on e.id= ui.id