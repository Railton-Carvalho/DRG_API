
CREATE TABLE IF NOT EXISTS public.tb_drgs(
    id character varying(255) PRIMARY KEY ,
    drg_code character varying(255) UNIQUE NOT NULL,
    description character varying(255),
    admitted_in_icu boolean NOT NULL,
    icu_percentage double precision NOT NULL,
    average_cost double precision NOT NULL,
    average_time integer NOT NULL,
    max_cost double precision NOT NULL,
    min_cost double precision NOT NULL
)