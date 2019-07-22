//package com.vueServer.code.util;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.streaming.SXSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Majg on 2019-07-08
// **/
//public class ExcelReaderUtil {
//
//    /**
//     * 根据fileType不同读取excel文件
//     *
//     * @param path
//     * @param sheetNo 第几个sheet,从0开始
//     * @return
//     */
//    public static List<List<String>> readExcel(String path, int sheetNo) {
//        String fileType = path.substring(path.lastIndexOf(".") + 1);
//        // return a list contains many list
//        List<List<String>> lists = new ArrayList<List<String>>();
//        //读取excel文件
//        InputStream is = null;
//        try {
//            is = new FileInputStream(path);
//            //获取工作薄
//            Workbook wb = null;
//            if (fileType.equals("xls")) {
//                wb = new HSSFWorkbook(is);
//            } else if (fileType.equals("xlsx")) {
//                wb = new XSSFWorkbook(is);
//            } else {
//                return null;
//            }
//
//            //读取第一个工作页sheet
//            Sheet sheet = wb.getSheetAt(sheetNo);
//            //第一行为标题
//            for (Row row : sheet) {
//                ArrayList<String> list = new ArrayList<String>();
//                for (Cell cell : row) {
//                    //根据不同类型转化成字符串
//                    cell.setCellType(Cell.CELL_TYPE_STRING);
//                    list.add(cell.getStringCellValue());
//                }
//                lists.add(list);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (is != null) is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return lists;
//    }
//
//
//    /**
//     * 创建Excel.xls
//     *
//     * @param lists  需要写入xls的数据
//     * @param titles 列标题
//     * @param name   文件名
//     * @return
//     * @throws IOException
//     */
//    public static Workbook creatExcel(List<List<String>> lists, String[] titles, String name) throws IOException {
//        //创建新的工作薄
////        Workbook wb = new HSSFWorkbook();
//        SXSSFWorkbook wb = new SXSSFWorkbook(5000);
//
//        // 创建第一个sheet（页），并命名
//        Sheet sheet = wb.createSheet(name);
//        // 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
////        for (int i = 0; i < titles.length; i++) {
////            sheet.setColumnWidth((short) i, (short) (35.7 * 150));
////        }
//
//        // 创建第一行
//        Row row = sheet.createRow(0);
//
//        // 创建两种单元格格式
//        CellStyle cs = wb.createCellStyle();
//        CellStyle cs2 = wb.createCellStyle();
//
//        // 创建两种字体
//        Font f = wb.createFont();
//        Font f2 = wb.createFont();
//
//        // 创建第一种字体样式（用于列名）
//        f.setFontHeightInPoints((short) 10);
//        f.setColor(IndexedColors.BLACK.getIndex());
//        f.setBoldweight(Font.BOLDWEIGHT_BOLD);
//
//        // 创建第二种字体样式（用于值）
//        f2.setFontHeightInPoints((short) 10);
//        f2.setColor(IndexedColors.BLACK.getIndex());
//
//        // 设置第一种单元格的样式（用于列名）
//        cs.setFont(f);
//        cs.setBorderLeft(CellStyle.BORDER_THIN);
//        cs.setBorderRight(CellStyle.BORDER_THIN);
//        cs.setBorderTop(CellStyle.BORDER_THIN);
//        cs.setBorderBottom(CellStyle.BORDER_THIN);
//        cs.setAlignment(CellStyle.ALIGN_CENTER);
//
//        // 设置第二种单元格的样式（用于值）
//        cs2.setFont(f2);
//        cs2.setBorderLeft(CellStyle.BORDER_THIN);
//        cs2.setBorderRight(CellStyle.BORDER_THIN);
//        cs2.setBorderTop(CellStyle.BORDER_THIN);
//        cs2.setBorderBottom(CellStyle.BORDER_THIN);
//        cs2.setAlignment(CellStyle.ALIGN_CENTER);
//        //设置列名
//        for (int i = 0; i < titles.length; i++) {
//            Cell cell = row.createCell(i);
//            cell.setCellValue(titles[i]);
//            cell.setCellStyle(cs);
//        }
//        if (lists == null || lists.size() == 0) {
//            return wb;
//        }
//        //设置每行每列的值
//        for (int i = 1; i <= lists.size(); i++) {
//            // Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
//            // 创建一行，在页sheet上
//            Row row1 = sheet.createRow(i);
//            for (int j = 0; j < titles.length; j++) {
//                // 在row行上创建一个方格
//                Cell cell = row1.createCell(j);
//                cell.setCellValue(lists.get(i - 1).get(j));
//                cell.setCellStyle(cs2);
//            }
//        }
//        return wb;
//    }
//
//    public static void main(String[] args) {
////        String path = "D:\\ecars_poi\\ecars.xlsx";
//////        String path = "D:\\ecars_poi\\tbl_passport.xlsx";
////        List<List<String>> lists = readExcel(path, 0);
////        for (List<String> list : lists) {
////            for (String strs : list) {
////                System.out.println(strs);
////            }
////        }
//
////        List<List<String>> listsW = new ArrayList<>();
////        List<String> src = new ArrayList<>();
//////        数据列名:车牌号，号牌种类，卡口行政区划（镇街名称），卡口名称，通过次数。
////        src.add("粤SY4882");
////        src.add("02");
////        src.add("测试镇");
////        src.add("【松山湖】[公]49 辅助卡口_自西向东\n");
////        src.add("12345");
////        listsW.add(src);
////        String[] s = new String[]{"车牌号", "号牌种类", "卡口行政区划（镇街名称）", "卡口名称", "通过次数"};
////        try {
////            Workbook excel = creatExcel(listsW, s, "测试文件");
////
////            FileOutputStream fileOutputStream = new FileOutputStream(new File("D://result.xls"));
////            excel.write(fileOutputStream);
////            fileOutputStream.flush();
////            fileOutputStream.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//
//}
