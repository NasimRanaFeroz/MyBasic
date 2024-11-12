SELECT * 
FROM employee_demographics;

SELECT * 
FROM employee_salary;

WITH CTE_Example AS 
(
SELECT gender, SUM(salary), MIN(salary), MAX(salary), COUNT(salary), AVG(salary)
FROM employee_demographics dem
JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id
GROUP BY gender
)
SELECT *
FROM CTE_Example;

CREATE TEMPORARY TABLE temp_table
(first_name varchar(50),
last_name varchar(50),
favorite_movie varchar(100));

INSERT INTO temp_table
VALUES ('Alex','Freberg','Lord of the Rings: The Twin Towers');

SELECT *
FROM temp_table;

CREATE TEMPORARY TABLE salary_over_50k
SELECT *
FROM employee_salary
WHERE salary > 50000;

SELECT *
FROM salary_over_50k;

DELIMITER $$
CREATE PROCEDURE large_salaries2()
BEGIN
	SELECT *
	FROM employee_salary
	WHERE salary >= 60000;
	SELECT *
	FROM employee_salary
	WHERE salary >= 50000;
END $$
DELIMITER ;

CALL large_salaries2();


DELIMITER $$
CREATE TRIGGER employee_insert2
	AFTER INSERT ON employee_salary
    FOR EACH ROW
BEGIN
    INSERT INTO employee_demographics (employee_id, first_name, last_name) 
    VALUES (NEW.employee_id,NEW.first_name,NEW.last_name);
END $$
DELIMITER ;

DROP EVENT IF EXISTS delete_retirees;
DELIMITER $$
CREATE EVENT delete_retirees
ON SCHEDULE EVERY 1 month
DO BEGIN
	DELETE
	FROM parks_and_recreation.employee_demographics
    WHERE age >= 60;
END $$
DELIMITER ;
