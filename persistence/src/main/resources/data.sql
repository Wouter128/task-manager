-- Insert Users
INSERT INTO users (id, first_name, last_name)
VALUES
    ('11111111-1111-1111-1111-111111111111', 'Alice', 'Anderson'),
    ('22222222-2222-2222-2222-222222222222', 'Bob', 'Brown'),
    ('33333333-3333-3333-3333-333333333333', 'Charlie', 'Clark');

-- Insert Projects
INSERT INTO projects (id, name, description)
VALUES
    ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'Task Manager', 'A project to manage tasks'),
    ('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'Website Redesign', 'Revamping the company website');

-- Insert Tasks
INSERT INTO tasks (id, name, description, status, project_id, user_id)
VALUES
    ('10101010-1010-1010-1010-101010101010', 'Set up DB schema', 'Define schema for tasks, projects, and users', 'DONE',
     'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa',
     '11111111-1111-1111-1111-111111111111'),

    ('20202020-2020-2020-2020-202020202020', 'Implement persistence layer', 'Create JPA entities and repos', 'IN_PROGRESS',
     'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa',
     '22222222-2222-2222-2222-222222222222'),

    ('30303030-3030-3030-3030-303030303030', 'Design homepage', 'Draft the new homepage UI', 'TODO',
     'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb',
     '33333333-3333-3333-3333-333333333333');
