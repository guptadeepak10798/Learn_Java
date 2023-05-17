package learnCollections;

import java.util.ArrayList;

class Emp{
    String name,company_name;
    int age;

    public Emp(String name, String company_name, int age) {
        this.name = name;
        this.company_name = company_name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", age=" + age +
                '}';
    }
}



public class UserDefinedClass {

    public static void main(String[] args) {

        ArrayList<Emp> arrayList = new ArrayList<Emp>();

        Emp e1 = new Emp("user1", "ABC", 21);
        Emp e2 = new Emp("user2", "XYZ", 22);
        Emp e3 = new Emp("user3", "PQR", 29);

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        System.out.println(arrayList);
    }

}
