package ss17_IOFileBnary.ThucHanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream= new FileInputStream(source);
            outputStream= new FileOutputStream(dest);

            byte[]bufer=new byte[1024];
            int length;
            while ((length=inputStream.read())>0){
                outputStream.write(bufer,0,length);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            outputStream.close();
            inputStream.close();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
