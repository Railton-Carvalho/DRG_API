
CREATE TABLE IF NOT EXISTS public.tb_diagnoses(
    id character varying(255) PRIMARY KEY ,
    cid10_code character varying(255) UNIQUE NOT NULL,
    description character varying(255) NOT NULL
)