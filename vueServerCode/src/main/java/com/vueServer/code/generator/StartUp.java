package com.vueServer.code.generator;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.mybatis.generator.api.ShellRunner;

/**
 * Created by Majg on 2019-07-15
 **/
public class StartUp {


//    public static void main(String[] args) {
//        args = new String[] { "-configfile", "D:\\Develop_Code\\vue\\vue_serverCode\\vueServerCode\\src\\main\\resources\\mybatis-generator-config.xml", "-overwrite" };
//        ShellRunner.main(args);
//    }

    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("D:\\Develop_Code\\vue\\vue_serverCode\\vueServerCode\\"); // 项目根目录
        config.setProjectName("vue_serverCode"); // 项目名称
//        config.addJavaSrcPath("D:\\Develop_Code\\vue\\vue_serverCode\\vueServerCode\\src\\main\\java\\com\\vueServer\\code\\controller");
        config.setApiVersion("V1.0");       // 声明该API的版本
        config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
        Docs.buildHtmlDocs(config); // 执行生成文档
    }
}
