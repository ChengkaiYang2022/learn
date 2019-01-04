package Chapter8.pair1.genericReflection;

import java.lang.reflect.*;
import java.util.*;

/**
 * @version 1.10 2019-01-04
 * @author yangchengkai
 *
 */
public class GenericReflectionTest
{
    public static void main(String[] args){
        // read class name from command line or user input
        String name;
        if(args.length > 0) name = args[0];
        else{
            try(Scanner in = new Scanner(System.in)){
                System.out.println("Enter class name (e.g. java.util.Collection): ");
                name = in.next();
            }
        }

        try{
            // print generic info for class and public methods
            Class<?> cl = Class.forName(name);
            printClass(cl);

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void printClass(Class<?> cl){
        System.out.println(cl);
        printTypes(cl.getTypeParameters(),"<",",",">",true);
    }
    public static void printTypes(Type[] types, String pre, String sep, String suf, boolean isDefinition){
        if(pre.equals(" extends ") && Arrays.equals(types,new Type[]{ Object.class})) return;
        if(types.length > 0) System.out.print(pre);
        for (int i = 0; i< types.length; i++){
            if(i > 0) System.out.print(sep);
            printType(types[i],isDefinition);
        }
    }
    public static void printType(Type type,boolean isDefinition){
        if(type instanceof Class){
            Class<?> t = (Class<?>) type;
            System.out.print(t.getName());
        }else if(type instanceof TypeVariable){
            TypeVariable<?> t= (TypeVariable<?>) type;
            System.out.print(t.getName());
            if(isDefinition){
                printTypes(t.getBounds(), " extends ", " & ", "", false);

            }
        }
    }


}

