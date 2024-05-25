package List;
import java.util.ArrayList;
import java.util.List;
//This code explains the asynchronized behaviour of the ArrayList implementation of the List Interface
public class ArrayListSynchro {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Creating two threads that will add elements to the ArrayList concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                arrayList.add(i);
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // Waiting for both threads to finish
        //join 
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}
//The length of the arraylist is less than 2000 because of the concurrent operations

