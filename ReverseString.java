
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

    }
}
