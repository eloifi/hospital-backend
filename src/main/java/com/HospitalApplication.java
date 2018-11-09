package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dao.HospitalDao;
import com.model.acceuil.Hospital;

@SpringBootApplication
public class HospitalApplication
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(HospitalApplication.class, args);
        HospitalDao hospitalDao = (HospitalDao) ctx.getBean(HospitalDao.class);
        hospitalDao.save(new Hospital("souissi"));
        hospitalDao.save(new Hospital("my abdellah"));
        hospitalDao.save(new Hospital("razi"));
    }
}
