package Chapter8.pair1.pair3;


import Chapter5.inhertance.Employee;
import Chapter5.inhertance.Manager;

/**
 * @author yangchengkai
 */

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
public class PairTest3 {
    public static void main(String[] args){
        Manager ceo = new Manager("Cus Greedy",800000,2003,12,15);
        Manager cfo = new Manager("Sid Sneaky",600000,2003,12,15);
        Pair<Manager> buddies = new Pair<>(ceo,cfo);
        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        Manager[] managers ={ceo, cfo};

        Pair<Employee> result = new Pair<>();
        minmaxBonus(managers,result);
        //
        System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
        System.out.println("stop");
    }
    public static void changeBonus(Manager m){
        m.setBonus(0);
        return;
    }
    public static void setA(int a1){
        a1 = 2;
        return;
    }
    public static void printBuddies(Pair<? extends Employee> p){
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are bounds.");
    }
    public static void minmaxBonus(Manager[] a,Pair<? super Manager> result){
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i =0 ;i<a.length;i++){
            if(min.getBonus()>a[i].getBonus()) min = a[i];
            if(max.getBonus()<a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}
