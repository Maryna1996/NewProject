
CREATE TABLE Homework (
                          id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(256) NOT NULL,
                          description TEXT
);
CREATE TABLE Lesson (
                        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(256) NOT NULL,
                        updatedAt TIMESTAMP,
                        homework_id INT,
                        FOREIGN KEY (homework_id) REFERENCES Homework(id)
);
CREATE TABLE Schedule (
                          id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(256) NOT NULL,
                          updatedAt TIMESTAMP
);
CREATE TABLE Schedule_Lesson (
                                 schedule_id INT,
                                 lesson_id INT,
                                 FOREIGN KEY (schedule_id) REFERENCES Schedule(id),
                                 FOREIGN KEY (lesson_id) REFERENCES Lesson(id)
);
INSERT INTO Homework (name, description) VALUES ('Homework 1', 'Description 1');
INSERT INTO Lesson (name, updatedAt, homework_id) VALUES ('Lesson 1', NOW(), 1);
INSERT INTO Schedule (name, updatedAt) VALUES ('Schedule 1', NOW());

INSERT INTO Lesson_Schedule (lesson_id, schedule_id) VALUES (1, 1);