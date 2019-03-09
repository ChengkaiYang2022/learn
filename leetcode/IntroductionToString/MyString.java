package leetcode.IntroductionToString;
public class MyString{
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while ( i < 1000){
            stringBuilder.append("hello");
            i++;
        }
        System.out.println(stringBuilder.toString());

    }
}