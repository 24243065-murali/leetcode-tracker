-- Last updated: 09/07/2026, 10:06:32
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;