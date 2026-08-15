CREATE TABLE conta (
    id BIGSERIAL PRIMARY KEY,
    name varchar(255) NOT NULL,
    type varchar(15) NOT NULL,
    institution varchar(100) NOT NULL,
    balance DECIMAL NOT NULL,
    createdAt TIMESTAMP NOT NULL
);