
CREATE TABLE IF NOT EXISTS public.tb_hospitals(
    id character varying(255) PRIMARY KEY ,
    name character varying(255) NOT NULL,
    cnpj character varying(18) UNIQUE NOT NULL,
    address character varying(255) NOT NULL,
    average_drg_cost double precision NOT NULL,
    bed_capacity integer NOT NULL,
    current_occupancy integer NOT NULL,
    specialties character varying(500) NOT NULL
)