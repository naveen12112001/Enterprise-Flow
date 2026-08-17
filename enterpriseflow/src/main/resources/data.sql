CREATE TABLE IF NOT EXISTS employees (
  id serial PRIMARY KEY,
  name varchar(255),
  department varchar(255)
);
INSERT INTO employees (name, department) VALUES ('Naveen', 'Engineering');
INSERT INTO employees (name, department) VALUES ('Lakshita', 'Farming');
INSERT INTO employees (name, department) VALUES ('Parimala', 'Industries');

