-- Last updated: 09/07/2026, 10:06:38
SELECT score,
       DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;