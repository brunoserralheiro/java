--CREATE 
--use database ContactManager;
CREATE TABLE Contact
(
    id              INT PRIMARY KEY AUTO_INCREMENT,
    firstname    VARCHAR(30),
    lastname    VARCHAR(30),
    telephone   VARCHAR(15),
    email         VARCHAR(30),
    created     TIMESTAMP DEFAULT NOW()
);
