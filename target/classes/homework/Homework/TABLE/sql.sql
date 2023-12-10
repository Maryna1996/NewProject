CREATE TABLE Homework (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          description TEXT
);

CREATE TABLE Lesson (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        updatedAt TIMESTAMP NOT NULL,
                        homework_id INT,
                        FOREIGN KEY (homework_id) REFERENCES Homework(id)
);
INSERT INTO Homework (name, description) VALUES ('Homework 1', 'Description of Homework 1');
INSERT INTO Homework (name, description) VALUES ('Homework 2', 'Description of Homework 2');
INSERT INTO Homework (name, description) VALUES ('Homework 3', 'Description of Homework 3');
INSERT INTO Homework (name, description) VALUES ('Homework 4', 'Description of Homework 4');
INSERT INTO Homework (name, description) VALUES ('Homework 5', 'Description of Homework 5');

SELECT * FROM Lesson WHERE updatedAt IS NULL;



