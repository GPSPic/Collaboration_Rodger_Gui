DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

CREATE TABLE authors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    genre VARCHAR(255),
    author_id INT NOT NULL REFERENCES authors(id) ON DELETE CASCADE
);

INSERT INTO authors (id, name) VALUES (1, 'Stephen King');
INSERT INTO authors (id, name) VALUES (2, 'Agatha Christie');
INSERT INTO authors (id, name) VALUES (3, 'J.R.R. Tolkien');

INSERT INTO books (id, title, genre, author_id) VALUES (1, 'IT', 'Horror', 1);
INSERT INTO books (id, title, genre, author_id) VALUES (2, 'Hercules Poirot', 'Mystery', 2);
INSERT INTO books (id, title, genre, author_id) VALUES (3, 'The Hobbit', 'Fantasy', 3);