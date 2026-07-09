-- Last updated: 09/07/2026, 10:06:34
SELECT e.Name AS Employee
FROM Employee e
JOIN Employee m
ON e.ManagerId = m.Id
WHERE e.Salary > m.Salary;