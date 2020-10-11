package com.example.SearchAndRegister.AWS;

import com.amazonaws.services.s3.model.S3Object;
import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

    String uploadFile(MultipartFile multipartFile);
    S3Object downloadFile(String filename,String bucketname);
}
