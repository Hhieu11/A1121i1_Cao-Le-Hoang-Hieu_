package ss16_IOFileText.ThucHanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CountryMain {
    public static List<Country>readFile(String filePath){
        List<Country>countryList= new ArrayList<>();
        try{
            File file = new File(filePath);
            BufferedReader reader= new BufferedReader(new FileReader(file));
            String line = "";
            while ((line=reader.readLine())!=null){
                final String c=",";
                String[]str=line.split(c);
                int id=Integer.parseInt(str[0]);
                String code=str[1];
                String name=str[2];
                Country country= new Country(id,code,name);
                countryList.add(country);

            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return countryList;

    }

    public static void main(String[] args) {
        CountryMain countryMain= new CountryMain();
        List<Country>countryList= countryMain.readFile("D:\\laptrinhcodegym\\Module_2\\CsvFile.csv");

        for (Country o:countryList){
            System.out.println(o.toString());
        }
    }
}
