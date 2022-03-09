package ss8.Refactoring.ThucHanh.Th2;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean b = number % 3 == 0 && number % 5 == 0;
        if(b)
            return "FizzBuzz";

        boolean b1 = number % 3 == 0;
        if(b1)
            return "Fizz";

        boolean b2 = number % 5 == 0;
        if(b2)
            return "Buzz";

        return number + "";
    }
}

