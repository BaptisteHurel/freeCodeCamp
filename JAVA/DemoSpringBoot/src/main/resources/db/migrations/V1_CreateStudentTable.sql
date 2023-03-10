CREATE TABLE IF NOT EXISTS email (
    id UUID NOT NULL PRIMARY KEY,
    email VACHAR(200) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS student (
    id UUID NOT NULL PRIMARY KEY,
    name VACHAR(100) NOT NULL,
    course VACHAR(100) NOT NULL,
    email_id UUID REFERENCES email (id)
);
