package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Employment;
import com.techspirit.casein.repository.EmploymentRepository;
import com.techspirit.casein.service.prototype.ServiceEmployment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentService implements ServiceEmployment {
    private final EmploymentRepository employmentRepository;

    public EmploymentService(EmploymentRepository employmentRepository) {
        this.employmentRepository = employmentRepository;
    }

    @Override
    public void create(Employment employment) {
        employmentRepository.save(employment);
    }

    @Override
    public List<Employment> readALL(){
        return employmentRepository.findAll();
    }

    @Override
    public Employment read(int id){
        return employmentRepository.getOne(id);
    }

    @Override
    public boolean update(Employment employment, int id)
    {
        if(employmentRepository.existsById(id)) {
            employment.setId(id);
            employmentRepository.save(employment);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (employmentRepository.existsById(id))
        {
            employmentRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
