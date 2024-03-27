package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Bases;
import com.mock.main.project.mock.Pojo.BasePojo;
import com.mock.main.project.mock.Repositories.BaseRepository;
import com.mock.main.project.mock.ServiceInterfaces.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasesServiceImpl implements BaseService {

    @Autowired
    BaseRepository baseRepository;
    @Override
    public Bases saveBases(BasePojo basePojo) {

        Bases bases = new Bases();
        bases.setBaseSerial(basePojo.getBaseSerial());
        return baseRepository.save(bases);
    }
}
