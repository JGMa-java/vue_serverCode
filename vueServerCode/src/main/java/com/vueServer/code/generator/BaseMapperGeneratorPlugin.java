//package com.vueServer.code.generator;
//
//import org.mybatis.generator.api.IntrospectedTable;
//import org.mybatis.generator.api.PluginAdapter;
//import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
//import org.mybatis.generator.api.dom.java.Interface;
//import org.mybatis.generator.api.dom.java.TopLevelClass;
//
//import java.util.List;
//
///**
// * Created by Majg on 2019-07-17
// * mybatis逆向工程自定义mapper注释注解
// **/
//public class BaseMapperGeneratorPlugin extends PluginAdapter {
//
//    @Override
//    public boolean validate(List<String> warnings) {
//        return true;
//    }
//
//    /**
//     * 生成mapper接口
//     */
//    @Override
//    public boolean clientGenerated(Interface interfaze,
//                                   TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
////        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("Mapper<"
////                + introspectedTable.getBaseRecordType() + ">");
////        FullyQualifiedJavaType imp = new FullyQualifiedJavaType(
////                "com.github.abel533.mapper.Mapper");
//        FullyQualifiedJavaType imp2 = new FullyQualifiedJavaType(
//                "org.springframework.stereotype.Component");
//        /**
//         * extends MybatisBaseMapper
//         */
////        interfaze.addSuperInterface(fqjt);
//
//        /**
//         * 导包
//         */
////        interfaze.addImportedType(imp);
//        interfaze.addImportedType(imp2);
//        /**
//         * 清楚原有方法
//         */
////        interfaze.getMethods().clear();
//        //interfaze.getAnnotations().clear();
//        // 根据业务自己灵活发挥，本次需要spring注入
//        interfaze.addAnnotation("@Component(\"" + introspectedTable.getFullyQualifiedTable() + "\")");
//        return true;
//    }
//
//}
