package com.tencorners.fileupload.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UploadController {

    @PostMapping("/upload")
    public String upload(@RequestParam(name = "files") MultipartFile[] files) {

        int i = 0;
        for(MultipartFile file : files) {
            System.out.println(i + " : received file name             : " + file.getName());
            System.out.println(i + " : received file size             : " + file.getSize());
            System.out.println(i + " : received file contentType      : " + file.getContentType());
            System.out.println(i + " : received file originalFilename : " + file.getOriginalFilename());
            System.out.println("----------------------------------------------------------------------");
            i++;
        }

        return "{\"status\":\"ok\"}";
    }
}
