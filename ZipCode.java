package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ZipCode {
    public static void main(String[] args) {
        String[] pinCodeNums = {"400088", "A400088", "400088B", "400 088", "000000"};

        for (String pinCodeNum : pinCodeNums) {
            validatePinNum(pinCodeNum);
        }
    }

    private static void validatePinNum(String pinCodeNum) {
        Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$");
        //[^[1-9]{1} ChecksFirstNumberRange],[^[0-9]{2} CheckFirstTwoNumber],[^[1-9]{1}[0-9]{2} Check1StNumRange & then CheckAfterTwoNumsRange]
        //[\\s{0,1{ For WhiteSpaces occur once or never],[[0-9]{3} forThreedigitNum], [$ for Ending]
        Matcher matcher = pattern.matcher(pinCodeNum);

        if (matcher.matches()) {
            System.out.println(pinCodeNum + " " + ">>>" + " " + "[" + "valid PinCode" + "]");
            return;
        }
        System.out.println(pinCodeNum + " " + ">>>" + " " + "[" + "Invalid Code" + "]");
    }
}

