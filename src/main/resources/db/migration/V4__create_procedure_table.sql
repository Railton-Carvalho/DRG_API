
CREATE TABLE IF NOT EXISTS public.tb_procedures(
    id character varying(255) PRIMARY KEY ,
    average_cost double precision NOT NULL,
    description character varying(255) NOT NULL,
    execute_time integer NOT NULL,
    tuss_code character varying(255) NOT NULL
)