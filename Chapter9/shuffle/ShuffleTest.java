package Chapter9.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1;i<=7;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
//        System.out.println(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);

        System.out.println(winningCombination);
        System.out.println(Collections.binarySearch(winningCombination,4));
    }
}
