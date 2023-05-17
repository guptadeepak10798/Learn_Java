package learnCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList extends Object {


//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

    public static void main(String[] args) {

        /*DemoArrayList d = new DemoArrayList();
        System.out.println(d);*/

        List arrayList = new ArrayList();
        System.out.println(arrayList);
        arrayList.add(10);
        arrayList.add("hello");
        arrayList.add(10);
        arrayList.add(10.5236);
        arrayList.add('D');
        System.out.println(arrayList);

        List arrayList1 = new ArrayList(2);

        List arrayList2 = new ArrayList(arrayList);
        arrayList2.add("Hii");
        arrayList2.add("Bye");
        System.out.println(arrayList2);

        arrayList2.add(2,45);
        System.out.println(arrayList2);

        arrayList2.set(2,60);
        System.out.println(arrayList2);

//        arrayList2.getClass();
//        arrayList2.removeAll(arrayList);
        System.out.println(arrayList2);

        arrayList2.retainAll(arrayList);
        System.out.println(arrayList2);

        //Traverse using for loop
        System.out.println("Traverse using for loop");
        for (int i = 0; i < arrayList2.size(); i++){
            System.out.println(arrayList2.get(i));
        }

        //Traverse using foreach loop
        System.out.println("Traverse using foreach loop");
        for (Object o : arrayList2){
            System.out.println(o);
        }
        //Traverse using iterator
        System.out.println("Traverse using iterator");
        Iterator iterator = arrayList2.iterator();
        System.out.println("iterator - "+iterator);
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }






        /*int arr[]=new int[4];
        System.out.println(arr.toString());*/

//        int arr[] = { 12,2,15,67};
        /* int arr[]=new int[4];
        arr[0]=12;
        arr[1]=2;
        arr[2]=15;
        arr[3]=67;

        System.out.println(arr.length);
        System.out.println("Array travers");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Contents of the array using for each loop: ");
        for (int element: arr) {
            System.out.println(element);
        }
        */
    }
}
