package ss18_String_Regex.ThucHanh;

public class EmailExampleTest {
    private static EmailExample emailExample;
    private static  final String[] validEmail= new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample= new EmailExample();
        for(String o:validEmail){
            boolean isvali=emailExample.validate(o);
            System.out.println("Email is"+o+"is valid"+isvali);
        }
        for(String u:invalidEmail){
            boolean unvalid=emailExample.validate(u);
            System.out.println("Email í"+u+"is valid"+unvalid);
        }
    }
}
