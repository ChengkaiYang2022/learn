package Chapter8.pair1;


class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(U newValue) {
        second = newValue;
    }
}
public class PairTest1 {
    public static void main(String[] args){
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String,String> mm = ArrayAlg.minmax(words);
        System.out.println("min: " + mm.getFirst());
        System.out.println("max: " + mm.getSecond());
    }
}

class ArrayAlg
{
    /**
     * Gets the minimum and maximum of an array of strings
     * @param a an array of strings
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static Pair<String,String> minmax(String[] a)
    {
        if (a == null|| a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1;i < a.length;i++){
            String b = a[i];
            Integer min_1 = min.compareTo(b);
            Integer max_1 = max.compareTo(b);
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}