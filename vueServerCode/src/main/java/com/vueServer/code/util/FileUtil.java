package com.vueServer.code.util;

import java.io.*;

/**
 * @author MaJianGuo.
 * @Date Created in 下午 03:24. 2019/01/14
 * @Description
 * @Version
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    /*
     * 读取文件
     * fileInputStream
     */
    public static String read(File f) {
        //File f = new File(fileName);
        if (!f.exists()) {
            return "File not found!";
        }
        FileInputStream fs;
        String result = null;
        try {
            fs = new FileInputStream(f);
            byte[] b = new byte[fs.available()];
            fs.read(b);
            fs.close();
            result = new String(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /*
     *写文件
     */
    public static boolean write(File f, String fileContent) {
        boolean result = false;
        //File f = new File(fileName);
        try {
            FileOutputStream fs = new FileOutputStream(f);
            byte[] b = fileContent.getBytes();
            fs.write(b);
            fs.flush();
            fs.close();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /*
     * 追加内容到文件
     */
    public static boolean append(File f, String fileContent) {
        boolean result = false;
        //File f = new File(fileName);
        try {
            if (f.exists()) {
                FileInputStream fsIn = new FileInputStream(f);
                byte[] bIn = new byte[fsIn.available()];
                fsIn.read(bIn);
                String oldFileContent = new String(bIn);
                //System.out.println("旧内容:" + oldFileContent);
                fsIn.close();
                if (!oldFileContent.equalsIgnoreCase("")) {
                    fileContent = oldFileContent + "\r\n" + fileContent;
                    //System.out.println("新内容:" + fileContent);
                }
            }

            FileOutputStream fs = new FileOutputStream(f);
            byte[] b = fileContent.getBytes();
            fs.write(b);
            fs.flush();
            fs.close();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 读入TXT文件
     */
    public static void readFile() {
        String pathname = "./log.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
                writeFile(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入TXT文件
     */
    public static void writeFile(String source) {
        try {
            File writeName = new File("D:\\develop\\IDEA_workFolders\\hy_tool\\hy_dps\\src\\test\\java\\com\\example\\demo\\logto.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            System.out.println(writeName);
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.append(source);
//                out.write("我会写入文件啦1\r\n"); // \r\n即为换行
//                out.write("我会写入文件啦2\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
