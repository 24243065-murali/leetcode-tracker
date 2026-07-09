-- Last updated: 09/07/2026, 10:06:29
SELECT d.Name AS Department,
       e.Name AS Employee,
       e.Salary
FROM Employee e
JOIN Department d
ON e.DepartmentId = d.Id
WHERE (e.DepartmentId, e.Salary) IN (
    SELECT DepartmentId,
           MAX(Salary)
    FROM Employee
    GROUP BY DepartmentId
);