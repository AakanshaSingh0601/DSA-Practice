# Write your MySQL query statement below
SELECT unique_id, name FROM Employees as e LEFT OUTER JOIN  EmployeeUNI as ui on e.id= ui.id