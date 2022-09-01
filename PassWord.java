package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWord {
    public static void main(String[] args) {

        String[] passWord = {"YashGHARDe","SPArSHgharde","bHavyaGa04nDhi"};

        for (String passWords : passWord) {
            validatePassWord(passWords);
        }
    }
    private static void validatePassWord(String passWords) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z][0-9])?.{8,}$");

        Matcher matcher = pattern.matcher(passWords);

        if (matcher.matches()) {
            System.out.println(passWords + " " + ">>>" + " " + "[" + "Strong Password" + "]");
            return;
        }
        System.out.println(passWords + " " + ">>>" + " " + "[" + "password Not Matched With Conditions" + "]");
    }
}

