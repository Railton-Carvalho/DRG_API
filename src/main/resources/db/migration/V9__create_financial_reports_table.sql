
CREATE TABLE IF NOT EXISTS public.tb_financial_reports(
    id character varying(255) PRIMARY KEY ,
    above_average_percentage double precision,
    average_patient_cost double precision NOT NULL,
    estimated_cost_difference double precision,
    report_date date NOT NULL,
    total_expense double precision NOT NULL,
    drg_code character varying(255) NOT NULL,
    hospital_id character varying(255) NOT NULL,
    patient_id character varying(255) NOT NULL,
    FOREIGN KEY (drg_code)
        REFERENCES public.tb_drgs (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (hospital_id)
        REFERENCES public.tb_hospitals (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (patient_id)
        REFERENCES public.tb_patients (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)