package com.web.fpt_example.services.impls;

import com.web.fpt_example.models.Nganh;
import com.web.fpt_example.repositories.NganhRepository;
import com.web.fpt_example.services.NganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NganhServiceImpl implements NganhService {

    @Autowired
    NganhRepository nganhRepository;

    @Override
    public Nganh addNganh(Nganh nganh) {
        return nganhRepository.save(nganh);
    }

    @Override
    public List<Nganh> getAllNganh() {
        return nganhRepository.findAll();
    }
}
