

public class stringLearn {
    public static void main(String[] args){
        System.out.println("xx");
        String greeting = "Hello";
        System.out.println(greeting.substring(0,3));
        if (greeting.length() > 0){
            System.out.println(greeting.length());
        }
        if (greeting.equalsIgnoreCase("hello")){
            System.out.println("equals");
        }
        System.out.println(greeting.startsWith("a"));
        StringBuilder builder = new StringBuilder();
        builder.append('x');
        builder.append("my name is");
        String compeletedString = builder.toString();
        System.out.println(compeletedString);
    }
}
