package learnCollections;

import java.util.ArrayList;

public class DemoArrayList extends Object {


//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

    public static void main(String[] args) {

        DemoArrayList d = new DemoArrayList();
        System.out.println(d);

        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);

        int arr[]=new int[4];
        System.out.println(arr.getClass().getName());

//        int arr[] = { 12,2,15,67};
//        int arr[]=new int[4];
//        arr[0]=12;
//        arr[1]=2;
//        arr[2]=15;
//        arr[3]=67;

//        System.out.println(arr.length);
//        System.out.println("Array travers");
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("Contents of the array using for each loop: ");
//        for (int element: arr) {
//            System.out.println(element);
//        }
    }
}
