import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
       List<Integer> arr=new ArrayList<>();
       arr.add(9);
       arr.add(3);
       arr.add(8);
       arr.add(5);
       arr.add(4);
       arr.add(1);

//        for (Integer integer : arr) {
//            System.out.println(integer);
//
//        }
        List<Integer> arr1=new LinkedList<>();
        arr1.add(9);
        arr1.add(3);
        arr1.add(8);
        arr1.add(5);
        arr1.add(4);
        arr1.add(1);



       Iter(arr1);


    }

    private static <T>void Iter(Iterable<T> obj){
        Iterator<T> iterator=obj.iterator();
        while (iterator.hasNext()){
            T next=iterator.next();
            System.out.println(next);




        }

    }
}
