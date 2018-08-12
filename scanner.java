import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class scanner {
    public static void readfile()  {
        try{
            //Scanner in = new Scanner(Paths.get("README.md"));
            //System.out.println(in);
            PrintWriter out = new PrintWriter("README.md");
            System.out.println(out);
        }catch (IOException e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /**
        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year,you'll be " + (age + 1));
        */
        readfile();
    }


}
