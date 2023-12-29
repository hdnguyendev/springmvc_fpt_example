package com.web.fpt_example.services.impls;

import com.web.fpt_example.services.FilesStorageService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
@Service
public class FilesStorageServiceImpl implements FilesStorageService {
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\uploads";

    @Override
    public String save(MultipartFile file){
        String fileName = generateRandomFileName(file.getOriginalFilename());
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, fileName);
        try {
            Files.copy(file.getInputStream(), fileNameAndPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("THÊM ẢNH VÀO SERVER THÀNH CÔNG!");
        } catch (IOException e) {
            return "avatar-default.png";
        }
        return fileName;
    }
    public static String generateRandomFileName(String originalFileName) {
        // Lấy phần mở rộng của tên tệp
        String fileExtension = StringUtils.getFilenameExtension(originalFileName);

        // Tạo một UUID ngẫu nhiên
        String randomUUID = UUID.randomUUID().toString();

        // Kết hợp UUID với phần mở rộng để tạo tên tệp ngẫu nhiên
        String randomFileName = randomUUID + "." + fileExtension;

        return randomFileName;
    }
}
