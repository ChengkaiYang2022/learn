package Chapter8.pair1.pair2;

import java.time.*;

/**
 * @author yangchengkai
 */
public class PairTest2 {
    public static void main(String[] args){
        LocalDate[] birthday =
                {
                        LocalDate.of(1906, 12, 9),
                        LocalDate.of(1815, 12, 10),
                        LocalDate.of(1903, 12,3),
                        LocalDate.of(1910,6,22),
                };
        Pair<LocalDate> mm= ArrayAlg.minmax(birthday);
        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}
class Pair<T>{
    private T first;
    private T second;

    public Pair(){
        this.first = null;
        this.second = null;
    }
    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }
    public T getSecond(){
        return this.second;
    }
    public void setFirst(T newValue){
        this.first = newValue;
    }
    public void setSecond(T newValue){
        this.second = newValue;
    }
}
class ArrayAlg
{
    /**
     Gets the minimum and maximum of an array of objects of type T.
     @param a an array of objects of type T.
     @return a pair with the min and max value,or null if a is null or empty
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for(int i = 0; i< a.length; i++){
            if(min.compareTo(a[i])>0) min = a[i];
            if(max.compareTo(a[i])<0) max = a[i];

        }
        return new Pair<>(min,max);
    }
}
