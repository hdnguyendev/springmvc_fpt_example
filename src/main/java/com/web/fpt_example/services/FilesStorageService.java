package com.web.fpt_example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public interface FilesStorageService {
    public String save(MultipartFile file);

}
