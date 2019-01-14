package com.vueServer.code.controller;

import com.vueServer.code.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author MaJianGuo.
 * @Date Created in 上午 10:21. 2019/01/08
 * @Description
 * @Version
 */
@RestController()
public class UploadController {

    private static final Logger log = LoggerFactory.getLogger(UploadController.class);

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file){
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        String filePath = "D://";
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        //返回json
        return "uploadimg success";
    }
    @PostMapping("/cancelUpload")
    public String cancelUpload(@RequestParam String file){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "取消上传";
    }
}
