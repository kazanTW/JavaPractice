import java.util.Scanner;

@SuppressWarnings("resource")
public class CNGetUni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cnCh, code;
        cnCh = input.nextLine();
        code = cnToUnicode(cnCh);
        System.out.println(code);

    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String str = "";
        for(int i = 0; i < chars.length; i++) {
            str += "b\'\\\\u" + Integer.toString(chars[i], 16) + "\'";
        }
        return str;
    }
}