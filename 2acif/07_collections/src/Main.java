import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        List<Integer> lstInts = new ArrayList<Integer>();
        lstInts.add(1);   // 0
        lstInts.add(10);  // 1
        lstInts.add(100); // 2
        lstInts.add(1000); // 3
//        int sizeBeforeRemove = lstInts.size();
//        lstInts.removeLast();
//        int sizeAfterRemove = lstInts.size();

        // setze 200 auf Stelle 0
        lstInts.set(0, 200);
        for (int i = 0; i < lstInts.size(); i++){
            int elem = lstInts.get(i);
            System.out.println((i+1)+":" +elem);
        }

        System.out.println("========================= foreach");
        for(int elem : lstInts){
            System.out.println(elem);
        }


//        List<Integer>  lstInts2 = new ArrayList<Integer>();
//        lstInts2.addAll(lstInts);
        lstInts.clear();
        int sizeAfterClear = lstInts.size();
    }
}