import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }

        Iterator<Integer> iterator = list.iterator();
        int sum = 0;

        System.out.println("ArrayList contents:");
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
            sum += num;
        }

        System.out.println("Total Sum: " + sum);

        iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("ArrayList after removing even numbers:");
        System.out.println(list);

        try {
            iterator = list.iterator();
            while (iterator.hasNext()) {
                list.add(123); 
                iterator.next();
            }
        } catch (Exception e) {
            System.out.println("Exception during list modification: " + e.getMessage());
        }
    }
}
