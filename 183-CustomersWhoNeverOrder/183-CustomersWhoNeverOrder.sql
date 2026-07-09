-- Last updated: 09/07/2026, 10:06:31
SELECT c.Name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.Id = o.CustomerId
WHERE o.Id IS NULL;