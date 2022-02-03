import java.util.Scanner;

@SuppressWarnings("resource")
public class UniToCN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String unicode, cnChar;
        unicode = input.nextLine();
        cnChar = UniToCN(unicode);
        System.out.println(cnChar);
    }

    private static String UniToCN(String unicode) {
        String[] strs = unicode.split("\\\\u");
        String str = "";
        for(int i = 1; i < strs.length; i++) {
            str += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return str;
    }
}