-- Users table
CREATE TABLE users (
                       id          CHAR(36) PRIMARY KEY,         -- UUID stored as 16 bytes
                       first_name  VARCHAR(100) NOT NULL,
                       last_name   VARCHAR(100) NOT NULL
);

-- Projects table
CREATE TABLE projects (
                          id          CHAR(36) PRIMARY KEY,
                          name        VARCHAR(200) NOT NULL,
                          description TEXT
);

-- Tasks table
CREATE TABLE tasks (
                       id           CHAR(36) PRIMARY KEY,
                       name         VARCHAR(200) NOT NULL,
                       description  TEXT,
                       status       VARCHAR(50) NOT NULL,

    -- Relations
                       project_id   CHAR(36),
                       user_id      CHAR(36),

                       CONSTRAINT fk_task_project FOREIGN KEY (project_id) REFERENCES projects(id),
                       CONSTRAINT fk_task_user    FOREIGN KEY (user_id)    REFERENCES users(id)
);
