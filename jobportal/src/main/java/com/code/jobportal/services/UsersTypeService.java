package com.code.jobportal.services;

import com.code.jobportal.entity.UsersType;
import com.code.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {
    private UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository){
        this.usersTypeRepository = usersTypeRepository;
    }
    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }
}
