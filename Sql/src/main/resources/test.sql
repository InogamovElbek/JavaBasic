-- create function addition(a int, b int)
--     returns int as
-- $$
-- begin
--     --logikalar
--     return a + b;
-- end;
-- $$ language plpgsql;
--
-- select addition(123, 321);











-- CREATE OR REPLACE FUNCTION get_employee_salary(employee_id INT)
--     RETURNS DECIMAL AS $$
-- DECLARE
--     salary DECIMAL;
-- BEGIN
--     SELECT e.salary INTO salary
--     FROM employees e
--     WHERE e.id = employee_id;
--
--     RETURN salary;
-- END;
-- $$ LANGUAGE plpgsql;

--
--
--
-- CREATE OR REPLACE PROCEDURE update_employee_salary(employee_id INT, new_salary DECIMAL)
--     LANGUAGE plpgsql AS $$
-- BEGIN
--     UPDATE employees
--     SET salary = new_salary
--     WHERE id = employee_id;
-- END;
-- $$;
--

--4 CREATE OR REPLACE PROCEDURE increase_all_salaries(increment DECIMAL)
--     LANGUAGE plpgsql AS $$
-- BEGIN48
--     UPDATE employees
--     SET salary = salary + increment;
-- END;
-- $$;



--
-- create or replace function yangi_foydalanuvchi_qoshish(name varchar, position varchar, salary numeric)
--     returns void as
-- $$
-- begin
--     insert into employee (name, position, salary)
--     values (name, position, salary);
-- end;
-- $$ language plpgsql;
--
--
-- select yangi_foydalanuvchi_qoshish('Ali', 'Doktor', 3000);


--
-- CREATE OR REPLACE FUNCTION get_total_employees()
--     RETURNS INT AS $$
-- DECLARE
--     total_count INT;
-- BEGIN
--     SELECT COUNT(*) INTO total_count FROM employees;
--     RETURN total_count;
-- END;
-- $$ LANGUAGE plpgsql;
