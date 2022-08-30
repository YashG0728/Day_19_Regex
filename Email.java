package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {
    public static void main(String[] args) {
        String[] emails = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
                "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"
                ,"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};

        for (String email : emails) {
            validateEmail(email);
        }
    }

    private static void validateEmail(String email) {
       Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");

        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " " + ">>>" + " " + "[" + "valid EmailId" + "]");
            return;
        }
        System.out.println(email + " " + ">>>" + " " + "[" + "Invalid EmailId" + "]");
    }
}
