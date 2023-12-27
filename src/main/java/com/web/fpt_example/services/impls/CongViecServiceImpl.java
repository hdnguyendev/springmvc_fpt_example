package com.web.fpt_example.services.impls;

import com.web.fpt_example.models.CongViec;
import com.web.fpt_example.repositories.CongViecRepository;
import com.web.fpt_example.services.CongViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongViecServiceImpl implements CongViecService {

    @Autowired
    CongViecRepository congViecRepository;
    @Override
    public CongViec addCongViec(CongViec congViec) {
        return congViecRepository.save(congViec);
    }

    @Override
    public List<CongViec> getAllCongViec() {
        return congViecRepository.findAll();
    }
}
