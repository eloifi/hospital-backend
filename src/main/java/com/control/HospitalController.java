package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.HospitalDao;
import com.model.acceuil.Hospital;

@RestController
public class HospitalController
{
    @Autowired
    private HospitalDao hospitalDao;

    @GetMapping("/getHotels")
    public String getHotels()
    {
        return "a list of hotels must be displayed in json format, change this message to test openshift autobuid";
    }

    @GetMapping("/getHospitals")
    public List<Hospital> getHospitals()
    {
        return hospitalDao.findAll();
    }
}
