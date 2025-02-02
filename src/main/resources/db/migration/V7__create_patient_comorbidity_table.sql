
CREATE TABLE IF NOT EXISTS public.tb_patient_comorbidity(
    patient_id character varying(255) NOT NULL,
    comorbidity_id character varying(255) NOT NULL,
    PRIMARY KEY (patient_id, comorbidity_id),
    FOREIGN KEY (patient_id)
        REFERENCES public.tb_patients (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (comorbidity_id)
        REFERENCES public.tb_comorbidities (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)


