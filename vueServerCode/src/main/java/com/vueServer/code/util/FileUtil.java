package com.vueServer.code.util;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author MaJianGuo.
 * @Date Created in 下午 03:24. 2019/01/14
 * @Description
 * @Version
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
