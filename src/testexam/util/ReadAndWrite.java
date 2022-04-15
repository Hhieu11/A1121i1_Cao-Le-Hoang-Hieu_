package testexam.util;

import testexam.model.dienthoaichinhhang;
import testexam.model.dienthoaixachtay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    //    public List<String[]> readFile(String filePath){
//        List<String[]>list= new ArrayList<>();
//        try{
//            FileReader fileReader= new FileReader(filePath);
//            BufferedReader bufferedReader= new BufferedReader(fileReader);
//
//            String line = null;
//
//            while ((line=bufferedReader.readLine())!=null&&!line.equals("")){
//                String[] element=line.split(",");
//                list.add(element);
//
//
//            }
//            bufferedReader.close();
//        }
//        catch (IOException e){
//            e.getStackTrace();
//        }
//        return list;
//    }
//    public void writeFile(String filePath,String line){
//        try {
//            FileWriter fileWriter= new FileWriter(filePath);
//            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//
//        }
//        catch (IOException e){
//            e.getStackTrace();
//        }
//    }
    final static String MOBILE_CH = "D:\\laptrinhcodegym\\Module_2\\src\\testexam\\util\\dienthoaichinhhang.csv";
    final static String MOBILE_XT = "D:\\laptrinhcodegym\\Module_2\\src\\testexam\\util\\dienthoaixachtay.csv";

    public static void writemobileCH(List<dienthoaichinhhang> dienthoaichinhhangList, boolean append) {
        File file = new File(MOBILE_CH);

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (dienthoaichinhhang o : dienthoaichinhhangList) {
                bufferedWriter.write(o.getToCv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void writemobileXT(List<dienthoaixachtay> dienthoaixachtayList, boolean append) {
        File file = new File(MOBILE_XT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (dienthoaixachtay o : dienthoaixachtayList) {
                bufferedWriter.write(o.getToCv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static List<dienthoaichinhhang> readmobileCH() {
        List<dienthoaichinhhang> dienthoaichinhhangList = new ArrayList<>();
        File file = new File(MOBILE_CH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String[] array = null;

            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                dienthoaichinhhang dienthoaichinhhang1 = new dienthoaichinhhang(Integer.parseInt(array[0]), array[1],
                        Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4], Integer.parseInt(array[5]), array[6]);
                dienthoaichinhhangList.add(dienthoaichinhhang1);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
        return dienthoaichinhhangList;
    }

    public static List<dienthoaixachtay> readmobileXT() {
        List<dienthoaixachtay> dienthoaixachtayList = new ArrayList<>();
        File file = new File(MOBILE_XT);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                dienthoaixachtay dienthoaixachtay1 = new dienthoaixachtay(Integer.parseInt(array[0]), array[1],
                        Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4], (array[5]), array[6]);
                dienthoaixachtayList.add(dienthoaixachtay1);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return dienthoaixachtayList;
    }

}
