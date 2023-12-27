package com.web.fpt_example.services;

import com.web.fpt_example.models.CongViec;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CongViecService {

    CongViec addCongViec(CongViec congViec);

    List<CongViec> getAllCongViec();
}
