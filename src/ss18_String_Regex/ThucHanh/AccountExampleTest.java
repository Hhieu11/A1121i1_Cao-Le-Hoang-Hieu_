package ss18_String_Regex.ThucHanh;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for(String o:validAccount){
            boolean isvalid=accountExample.validate(o);
            System.out.println("Acc is "+o+"is valid"+isvalid);

        }
        for (String u :invalidAccount){
            boolean unvalid=accountExample.validate(u);
            System.out.println("Acc is"+u+"is valid"+unvalid);
        }
    }

}
