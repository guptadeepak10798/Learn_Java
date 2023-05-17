package learnCollections;

import java.util.ArrayList;
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
        arrayList.add(10.5236);
        arrayList.add('D');
        System.out.println(arrayList);

        List arrayList1 = new ArrayList(2);

        List arrayList2 = new ArrayList(arrayList);
        arrayList2.add("Hii");
        arrayList2.add("Bye");
        System.out.println(arrayList2);
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
