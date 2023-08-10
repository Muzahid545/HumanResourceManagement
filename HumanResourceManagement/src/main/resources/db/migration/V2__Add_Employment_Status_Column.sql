-- V2__Add_Employment_Status_Column.sql

-- Add the employmentstatus column to the Employee table
ALTER TABLE employee_db.employee
ADD COLUMN employment_status VARCHAR(255);
