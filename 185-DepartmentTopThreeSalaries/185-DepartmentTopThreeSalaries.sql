-- Last updated: 09/07/2026, 10:06:27
SELECT Department,
       Employee,
       Salary
FROM (
    SELECT d.Name AS Department,
           e.Name AS Employee,
           e.Salary,
           DENSE_RANK() OVER (
               PARTITION BY e.DepartmentId
               ORDER BY e.Salary DESC
           ) AS rnk
    FROM Employee e
    JOIN Department d
    ON e.DepartmentId = d.Id
) t
WHERE rnk <= 3;