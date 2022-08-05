import java.util.ArrayList;

public class ArrayListExample {



    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        multiplyByTwoAndPrint(items);

    }

    public static void multiplyByTwoAndPrint(ArrayList<Integer> items){
        for ( Integer item : items) {
            System.out.println(item*2);
        }
    }
}
