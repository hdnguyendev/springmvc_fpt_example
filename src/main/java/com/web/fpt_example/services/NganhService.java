package com.web.fpt_example.services;

import com.web.fpt_example.models.Nganh;
import com.web.fpt_example.models.Truong;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NganhService {
    Nganh addNganh(Nganh nganh);

    List<Nganh> getAllNganh();
}
