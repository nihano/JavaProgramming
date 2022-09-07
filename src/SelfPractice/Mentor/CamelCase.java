package SelfPractice.Mentor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class CamelCase {



        public static String camelCase(String str){

            String[] array = str.split("");
            String result = "";

            for (String each : array) {
                if (!each.equals(each.toUpperCase())) {
                    result += each;
                } else if ((each.equals(each.toUpperCase()))) {
                    result += " " + each.toUpperCase();
                }
            }
            result = result.replace(result.substring(0, 1), result.substring(0, 1).toUpperCase());
            return result;
    }


    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));

    }
}
