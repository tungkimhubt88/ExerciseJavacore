import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Waiter> waiters = new ArrayList<>();
        waiters.add(new Waiter(1,"tungkim",22,3000000,1000000));
        waiters.add(new Waiter(2,"yen",20,4000000,2000000));
        waiters.add(new Waiter(3,"hien",50,2500000,1500000));

        Collections.sort(waiters,(o1,o2)->Waiter.compareName(o1,o2));
        waiters.forEach(n ->System.out.println(n+"\t"));
        System.out.println("--------------------------");
        Collections.sort(waiters,Waiter::compareSalary);
        waiters.forEach(n -> System.out.println(n+"\t"));
        System.out.println("--------------------------");


        ArrayList<Kitchen> kitchens = new ArrayList<>();
        kitchens.add(new Kitchen(1,"tungkim",22,3000000,1000000));
        kitchens.add(new Kitchen(2,"yen",20,4000000,2000000));
        kitchens.add(new Kitchen(3,"hien",50,2500000,1500000));

        Collections.sort(kitchens,(o1,o2)->Kitchen.compareName(o1,o2));
        kitchens.forEach(n ->System.out.println(n+"\t"));
        System.out.println("--------------------------");

        Collections.sort(kitchens,Kitchen::compareSalary);
//        kitchens.forEach(n -> System.out.println(n+"\t"));
        kitchens.forEach(System.out::println);
    }
}
