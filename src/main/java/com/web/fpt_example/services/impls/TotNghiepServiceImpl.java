package com.web.fpt_example.services.impls;

import com.web.fpt_example.models.TotNghiep;
import com.web.fpt_example.repositories.TotNghiepRepository;
import com.web.fpt_example.services.TotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotNghiepServiceImpl implements TotNghiepService {

    @Autowired
    TotNghiepRepository totNghiepRepository;
    @Override
    public TotNghiep addTotNghiep(TotNghiep totNghiep) {
        return totNghiepRepository.save(totNghiep);
    }

    @Override
    public List<TotNghiep> findAllTotNghiep() {
        return totNghiepRepository.findAll();
    }
}
