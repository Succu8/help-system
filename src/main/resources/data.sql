INSERT INTO categories (name) VALUES
                                ('Category 1'),
                                ('Category 2'),
                                ('Category 3'),
                                ('Category 4'),
                                ('Category 5'),
                                ('Category 6'),
                                ('Category 7'),
                                ('Category 8'),
                                ('Category 9'),
                                ('Category 10');


INSERT INTO clients (iin, name, surname, birthdate) VALUES
                                                      ('1234567890121', 'Client Name 1', 'Client Surname 1', '1990-01-01'),
                                                      ('1234567890122', 'Client Name 2', 'Client Surname 2', '1990-01-02'),
                                                      ('1234567890123', 'Client Name 3', 'Client Surname 3', '1990-01-03'),
                                                      ('1234567890124', 'Client Name 4', 'Client Surname 4', '1990-01-04'),
                                                      ('1234567890125', 'Client Name 5', 'Client Surname 5', '1990-01-05'),
                                                      ('1234567890126', 'Client Name 6', 'Client Surname 6', '1990-01-06'),
                                                      ('1234567890127', 'Client Name 7', 'Client Surname 7', '1990-01-07'),
                                                      ('1234567890128', 'Client Name 8', 'Client Surname 8', '1990-01-08'),
                                                      ('1234567890129', 'Client Name 9', 'Client Surname 9', '1990-01-09'),
                                                      ('1234567890130', 'Client Name 10', 'Client Surname 10', '1990-01-10');


INSERT INTO actions (name, begin_date, end_date) VALUES
                                                   ('Action 1', '2024-04-13T08:30:00Z', '2024-04-13T08:30:00Z'),
                                                   ('Action 2', '2024-01-02', '2024-02-02'),
                                                   ('Action 3', '2024-01-03', '2024-02-03'),
                                                   ('Action 4', '2024-01-04', '2024-02-04'),
                                                   ('Action 5', '2024-01-05', '2024-02-05'),
                                                   ('Action 6', '2024-01-06', '2024-02-06'),
                                                   ('Action 7', '2024-01-07', '2024-02-07'),
                                                   ('Action 8', '2024-01-08', '2024-02-08'),
                                                   ('Action 9', '2024-01-09', '2024-02-09'),
                                                   ('Action 10', '2024-01-10', '2024-02-10');


INSERT INTO products (name, price, description, category_id, action_id) VALUES
                                                                          ('Product 1', 10.0, 'Description for product 1', 1, 1),
                                                                          ('Product 2', 20.0, 'Description for product 2', 2, 2),
                                                                          ('Product 3', 30.0, 'Description for product 3', 3, 3),
                                                                          ('Product 4', 40.0, 'Description for product 4', 4, 4),
                                                                          ('Product 5', 50.0, 'Description for product 5', 5, 5),
                                                                          ('Product 6', 60.0, 'Description for product 6', 6, 6),
                                                                          ('Product 7', 70.0, 'Description for product 7', 7, 7),
                                                                          ('Product 8', 80.0, 'Description for product 8', 8, 8),
                                                                          ('Product 9', 90.0, 'Description for product 9', 9, 9),
                                                                          ('Product 10', 100.0, 'Description for product 10', 10, 10);

