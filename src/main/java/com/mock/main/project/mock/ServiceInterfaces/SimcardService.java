package com.mock.main.project.mock.ServiceInterfaces;

import com.mock.main.project.mock.Entites.Simcards;
import com.mock.main.project.mock.Pojo.SimCardPojo;

public interface SimcardService {

    Simcards saveSimcards(SimCardPojo simCardPojo);
}
