SELECT * 
FROM parks_and_recreation.employee_demographics;

SELECT first_name,
last_name,
age,
age*2
FROM parks_and_recreation.employee_demographics;

SELECT *
FROM employee_demographics
LIMIT 3;

SELECT *
FROM employee_demographics
LIMIT 2, 1;

SELECT DISTINCT gender
FROM parks_and_recreation.employee_demographics;

SELECT *
FROM employee_salary
WHERE salary >= 50000 AND dept_id = 1;

SELECT *
FROM employee_salary
WHERE first_name LIKE 'a%';

SELECT *
FROM employee_salary
WHERE first_name LIKE 'a__';

SELECT gender, AVG(age), MAX(age), COUNT(age)
FROM employee_demographics
GROUP BY gender;

SELECT *
FROM employee_demographics
ORDER BY gender DESC, age;

SELECT gender, AVG(age)
FROM employee_demographics
GROUP BY gender
HAVING AVG(age) > 40;

SELECT gender, AVG(age) AS avg_age
FROM employee_demographics
GROUP BY gender
HAVING avg_age > 40;
