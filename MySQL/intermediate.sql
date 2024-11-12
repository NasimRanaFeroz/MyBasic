SELECT * 
FROM parks_and_recreation.employee_demographics;

SELECT * 
FROM employee_demographics
JOIN employee_salary
	ON employee_demographics.employee_id = employee_salary.employee_id;
    
SELECT *
FROM employee_salary sal
RIGHT JOIN employee_demographics dem
	ON dem.employee_id = sal.employee_id;
    
SELECT *
FROM employee_salary sal
LEFT JOIN employee_demographics dem
	ON dem.employee_id = sal.employee_id;    
    
SELECT first_name, last_name
FROM employee_demographics
UNION
SELECT first_name, last_name
FROM employee_salary;

SELECT first_name, last_name
FROM employee_demographics
UNION ALL
SELECT first_name, last_name
FROM employee_salary;

SELECT first_name, last_name, 'Old Lady' as Label
FROM employee_demographics
WHERE age > 40 AND gender = 'Female'
UNION
SELECT first_name, last_name, 'Old Man'
FROM employee_demographics
WHERE age > 40 AND gender = 'Male'
UNION
SELECT first_name, last_name, 'Highly Paid Employee'
FROM employee_salary
WHERE salary >= 70000
ORDER BY first_name;

SELECT first_name, LENGTH(first_name) 
FROM employee_demographics;

SELECT first_name, UPPER(first_name) 
FROM employee_demographics;

SELECT LTRIM('     I           love          SQL');

SELECT first_name, LEFT(first_name,4) 
FROM employee_demographics;

SELECT SUBSTRING('Alexander', 2, 3);

SELECT REPLACE(first_name,'a','z')
FROM employee_demographics;

SELECT first_name, LOCATE('a',first_name) 
FROM employee_demographics;

SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM employee_demographics;

SELECT first_name, last_name, salary,
CASE
	WHEN salary > 45000 THEN salary + (salary * 0.05)
    WHEN salary < 45000 THEN salary + (salary * 0.07)
END AS new_salary,
CASE
	WHEN dept_id = 6 THEN salary * .10
END AS Bonus
FROM employee_salary;

SELECT first_name, 
salary, 
(SELECT AVG(salary) 
	FROM employee_salary)
FROM employee_salary;

SELECT gender, AVG(Min_age)
FROM (SELECT gender, MIN(age) Min_age, MAX(age) Max_age, COUNT(age) Count_age ,AVG(age) Avg_age
	FROM employee_demographics
	GROUP BY gender) AS Agg_Table
GROUP BY gender;

SELECT dem.employee_id, dem.first_name, gender, salary, AVG(salary) OVER(PARTITION BY gender)
FROM employee_demographics dem
JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
    
SELECT dem.employee_id, dem.first_name, gender, salary,
SUM(salary) OVER(PARTITION BY gender ORDER BY employee_id)
FROM employee_demographics dem
JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
    
SELECT dem.employee_id, dem.first_name, gender, salary,
ROW_NUMBER() OVER(PARTITION BY gender ORDER BY salary desc) row_num,
Rank() OVER(PARTITION BY gender ORDER BY salary desc) rank_1,
dense_rank() OVER(PARTITION BY gender ORDER BY salary desc) dense_rank_2 -- this is numerically ordered instead of positional like rank
FROM employee_demographics dem
JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
