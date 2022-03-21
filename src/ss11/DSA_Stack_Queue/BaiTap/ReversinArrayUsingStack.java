package ss11.DSA_Stack_Queue.BaiTap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReversinArrayUsingStack {
    public static void main(String[] args) {

        ReverseNumber();
        reverseString();


    }

    private static void ReverseNumber() {
        int arr[];
        System.out.println("Nhap vao do dai ");
        int n;
        Scanner scanner= new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        n= scanner.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println("Mang vua tao" + Arrays.toString(arr));
        int[] reverseArray = new int[n];
        for(int i=0; i<n; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("Mang dao nguoc:"+Arrays.toString(reverseArray));
    }
    private static void  reverseString(){

        String input = "H I E U";
        System.out.println("Mang vua nhap "+ input);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str.append(stack.pop());
        }
        System.out.println(" Mang dao nguoc "+str.toString());





    }


}
