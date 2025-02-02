CREATE TABLE IF NOT EXISTS public.tb_patients (
    id VARCHAR(255) PRIMARY KEY,
    admittedinicu BOOLEAN NOT NULL,
    age INTEGER NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    lengthofstay INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    sex VARCHAR(255) NOT NULL,
    hospital_id VARCHAR(255),
    principal_diagnosis_id VARCHAR(255),
    FOREIGN KEY (hospital_id) REFERENCES public.tb_hospitals (id)
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    FOREIGN KEY (principal_diagnosis_id) REFERENCES public.tb_diagnoses (id)
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
