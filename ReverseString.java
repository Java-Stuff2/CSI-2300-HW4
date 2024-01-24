
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception {

        String str = "Hello, nice to meet you!", nstr = "";
        char ch;

        System.out.println("Hello, nice to meet you!");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println(nstr);
        Scanner scnnr = new Scanner(System.in);
        System.out.println("What is your name?");
        String stri = scnnr.nextLine();
        scnnr.close();
        char[] arr = stri.toCharArray();
        String rev = "";
        for (int i = stri.length() - 1; i >= 0; i--) {
            rev = rev + stri.charAt(i);
        }
        System.out.println("Hello, " + rev + " lovely name!");
    }
}
