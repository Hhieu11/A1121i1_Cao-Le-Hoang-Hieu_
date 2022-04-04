package ss16_IOFileText.ThucHanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
   public  void readFileText(String filePath)

    {
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);

            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);

        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample= new ReadFileExample();

        readFileExample.readFileText("file.txt.txt");

    }

}

