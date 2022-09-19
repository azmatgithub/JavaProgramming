import java.util.ArrayList;
import java.util.Collections;
public class CreatingArraylist {
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<Integer>list=new ArrayList<Integer>();
        //adding values in arraylist
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);//output-[0, 2, 3]
        //get elements from arraylist
        int elem=list.get(2);
        System.out.println(elem);//output-3
        //add values in between two already filled indexes
        list.add(1,1);
        System.out.println(list);//output-[0, 1, 2, 3]
       // set or modify a value in arraylist
        list.set(1,5);
        System.out.println(list);//output-[0, 5, 2, 3]
        //delete or remove an element from arraylist
        list.remove(2);
        System.out.println(list);//output-[0, 5, 3] 2 index element removed/delete.
        //size of arraylist
        System.out.println(list.size());//output-3 size of arraylist
        //loops in arraylist
        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");//output-0 5 3
        }
        System.out.println();
        //sorting in Arraylist
        Collections.sort(list);
        System.out.println(list);//output-[0, 3, 5] sorted
    }
}
