CREATE TABLE "users" (
    id SERIAL PRIMARY KEY,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    enabled INTEGER NOT NULL
);

CREATE TABLE authorities (
    id SERIAL PRIMARY KEY,
    username VARCHAR(45) NOT NULL,
    authority VARCHAR(45) NOT NULL
);

INSERT INTO "users" (username, password, enabled) VALUES ('ccagide', '1201', 1) ON CONFLICT DO NOTHING;
INSERT INTO authorities (username, authority) VALUES ('ccagide', 'write') ON CONFLICT DO NOTHING;
