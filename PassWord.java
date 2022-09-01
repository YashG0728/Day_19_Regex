package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWord {
    public static void main(String[] args) {

        String[] passWord = {"Yash2828","Spasrh2028","bhavya2528"};

        for (String passWords : passWord) {
            validatePassWord(passWords);
        }
    }
    private static void validatePassWord(String passWords) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{8,}");

        Matcher matcher = pattern.matcher(passWords);

        if (matcher.matches()) {
            System.out.println(passWords + " " + ">>>" + " " + "[" + "Strong Password" + "]");
            return;
        }
        System.out.println(passWords + " " + ">>>" + " " + "[" + "Try to make strong password" + "]");
    }
}

