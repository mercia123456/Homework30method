package main;

public class BooleanTest {

    public static void main(String[] args) {
        String str1 = "Not immutable";
        String str2 = "String are immuntable";
        StringBuffer str3 = new StringBuffer("Not immunitable");


        boolean result = str1.contentEquals(str3);
        System.out.println(result);


        result = str2.contentEquals(str3);{
    }
}

}

