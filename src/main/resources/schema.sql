CREATE TABLE if not exist employee
(
    id integer NOT NULL,
    firstname character varying(255) NOT NULL,
    lastname character varying(255) NOT NULL,
    age character integer NOT NULL,
    org character varying(255) NOT NULL,
    CONSTRAINT flashcards_pk PRIMARY KEY (id)
    )
