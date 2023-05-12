import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println(method(new ArrayList<>(List.of(1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0))));
        System.out.println(method(new LinkedList<>(List.of(1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0))));

    }
    static ArrayList method(ArrayList<Integer> arrayList){
        System.out.println("arraylist:");
            Collections.sort(arrayList);
            return arrayList;
    }

    static LinkedList method(LinkedList<Integer>linkedList){
        System.out.println("LinkedList:");
        Collections.sort(linkedList);
            return linkedList;


    }
}