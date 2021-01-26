Delete * from assets;
Delete * from users;
Delete * from departments
Delete * from asset_type;
-- Asset Types Data

INSERT INTO asset_type (id, description, name) VALUES (1, 'Computer Case', 'Computer Case');
INSERT INTO asset_type (id, description, name) VALUES (2, 'Monitor Dell', 'Monitor');
INSERT INTO asset_type (id, description, name) VALUES (3, 'Keyboard', 'Keyboard');
INSERT INTO asset_type (id, description, name) VALUES (4, 'Mouse', 'Mouse');

-- Departments Data

INSERT INTO departments (id, department_name, description) 
VALUES (1, 'Delivery Unit 01', 'DU1 of G3 - CMC');

INSERT INTO departments (id, department_name, description) 
VALUES (2, 'Delivery Unit 02', 'DU2 of G3 - CMC');

INSERT INTO departments (id, department_name, description) 
VALUES (3, 'Delivery Unit 03', 'DU3 of G3 - CMC');

-- Users Data
INSERT INTO users (id, description, email, name, password) 
VALUES (1, 'Vu Hoang Tu', 'vhtu1@cmc.com.vn', 'vhtu1', '123456');

INSERT INTO users (id, description, email, name, password) 
VALUES (2, 'Vu Hoang Tu 2', 'vhtu1@cmc.com.vn', 'vhtu2', '123456');

INSERT INTO users (id, description, email, name, password) 
VALUES (3, 'Vu Hoang Tu 3', 'vhtu1@cmc.com.vn', 'vhtu3', '123456');

-- Assets Data
INSERT INTO assets (id, asset_code, asset_name, description, dept_id, type_id, user_id) 
VALUES (1, 'CASE02393', 'Computer Case of TuVH DU1', 'Inspiron Computer Case', 1, 1, 1);

INSERT INTO assets (id, asset_code, asset_name, description, dept_id, type_id, user_id) 
VALUES (2, 'CASE02393', 'Monitor of TuVH DU1', 'Dell Monitor', 1, 2, 1);

INSERT INTO assets (id, asset_code, asset_name, description, dept_id, type_id, user_id) 
VALUES (3, 'CASE02393', 'Keyboard of TuVH DU1', 'Dell Keyboard', 1, 3, 1);

INSERT INTO assets (id, asset_code, asset_name, description, dept_id, type_id, user_id) 
VALUES (4, 'CASE02393', 'Mouse of TuVH DU1', 'Dell Mouse', 1, 4, 1);
