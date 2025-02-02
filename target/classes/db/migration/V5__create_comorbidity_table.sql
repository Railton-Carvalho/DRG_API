
CREATE TABLE IF NOT EXISTS public.tb_comorbidities(
    id character varying(255) PRIMARY KEY ,
    code character varying(255) UNIQUE NOT NULL,
    description character varying(255) NOT NULL,
    name character varying(255) NOT NULL
)