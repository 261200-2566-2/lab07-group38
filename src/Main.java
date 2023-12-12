import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Init Data for testing
        CustomSet<Integer> set = new CustomSet<Integer>();
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        //Test Add function with duplicate scenario
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.print("Set Elements : ");
        set.printSet();

        // Using the iterator to iterate through the elements
        Iterator<Integer> iterator = set.iterator();
        System.out.print("Set Elements using Iterator : ");
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Test Remove function
        set.remove(5);
        System.out.print("Set Elements after remove 5 : ");
        set.printSet();

        //Test Size function
        System.out.print("Set Size: ");
        System.out.println(set.size());

        //Test contains function
        System.out.println("Set contain 5 : " + set.contains(5));
        System.out.println("Set contain 6 : " + set.contains(6));

        //Test containsAll function
        System.out.println("Set contain 1-4 : " + set.containsAll(intList));
        intList.add(5);
        System.out.println("Set contain 1-5 : " + set.containsAll(intList));

        //Test retainAll function
        set.retainAll(intList); //Retain 1-5 but 5 is not in current set so result will be only 1-4
        System.out.print("Set after retain 1-5: ");
        set.printSet();

        //Test isEmpty function
        System.out.println("is Set empty : " + set.isEmpty());

        //Test removeAll function
        set.removeAll(intList);
        System.out.println("Set after remove 1-5 : ");
        set.printSet();

        //Test isEmpty function when set is empty
        System.out.println("is Set empty after remove all: " + set.isEmpty());


        //Init data for testing last function
        set.add(5);

        //Test clear all
        set.clear();
        System.out.println("is Set empty after clear set : " + set.isEmpty());

    }


}
