package com.web.fpt_example.services.impls;

import com.web.fpt_example.models.Truong;
import com.web.fpt_example.repositories.TruongRepository;
import com.web.fpt_example.services.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruongServiceImpl implements TruongService {
    private TruongRepository truongRepository;

    @Autowired
    public TruongServiceImpl(TruongRepository truongRepository) {
        this.truongRepository = truongRepository;
    }

    @Override
    public Truong addTruong(Truong truong) {
        return truongRepository.save(truong);
    }

    @Override
    public List<Truong> getAllTruong() {
        return truongRepository.findAll();
    }

    @Override
    public Truong findTruongById(String maTruong) {
        return truongRepository.findById(maTruong).get();
    }

    @Override
    public void updateTruong(Truong truong) {
        truongRepository.save(truong);
    }

    @Override
    public void delTruongById(String maTruong) {
        truongRepository.deleteById(maTruong);
    }
}
