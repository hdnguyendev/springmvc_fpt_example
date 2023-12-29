package com.web.fpt_example.services;

import com.web.fpt_example.models.Truong;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TruongService {
    Truong addTruong(Truong truong);

    List<Truong> getAllTruong();

    Truong findTruongById(String maTruong);

    void updateTruong(Truong truong);

    void delTruongById(String maTruong);
}
