
CREATE TABLE IF NOT EXISTS public.tb_patient_procedure(
    id character varying(255) PRIMARY KEY,
    procedure_date date NOT NULL,
    real_cost double precision,
    patient_id character varying(255) NOT NULL,
    procedure_id character varying(255) NOT NULL,
    FOREIGN KEY (patient_id)
        REFERENCES public.tb_patients (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (procedure_id)
        REFERENCES public.tb_procedures (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
