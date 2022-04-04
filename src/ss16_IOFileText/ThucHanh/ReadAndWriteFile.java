package ss16_IOFileText.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {


    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                number.add(Integer.parseInt(line));

            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try{
            FileWriter fileWriter = new FileWriter(filePath, true);

            BufferedWriter bufferedWrite = new BufferedWriter(fileWriter);
            bufferedWrite.write("gia tri lon nhat " + max);
            bufferedWrite.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max > number.get(i)) {
                max = number.get(i);
            }
        }
        return max;

    }
    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> integerList = readAndWriteFile.readFile("number.txt");
        int maxValue = findMax(integerList);
        System.out.println("ssssss");
        readAndWriteFile.writeFile("result.txt ", maxValue);
    }


}
