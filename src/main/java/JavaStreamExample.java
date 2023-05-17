import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JavaStreamExample {

    public static final List<String> NAMES = Arrays.asList("Rita", "Gita", "Nita", "Ritesh", "Nitesh", "Ganesh", "Yogen", "Prateema");
    public static String pickLuckyNameOldWay(final List<String> names, final String startingLetter) {
        String luckyName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                luckyName = name;
                break;
            }
        }
        return luckyName != null ? luckyName : "No lucky name found";
    }

    public static String pickLuckyNameWIsPresent(final List<String> names, final String startingLetter) {
        final Optional<String> luckyName = names.stream().filter(name -> name.
                startsWith(startingLetter)).findFirst();

//        return luckyName.isPresent() ? luckyName.get() : "No lucky name found";
        if(!luckyName.isEmpty()){
            System.out.println("inside if");
        }
        return luckyName.orElse("No lucky name found");
    }

    public static void pickLuckyNameOldWay1( List<String> names,  String startingLetter) {
        String luckyName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                luckyName = name;
                break;
            }
        }
        if (luckyName != null) {
            postMessage(luckyName);
        }
    }
    public static void postMessage(final String winnerName) {
        System.out.println(String.format("Congratulations, %s!", winnerName));
    }

    public static void main(String[] args) {

        String op = pickLuckyNameOldWay(NAMES,"R");
        System.out.println(op);

        String op1 = pickLuckyNameWIsPresent(NAMES,"D");
        System.out.println(op1);

        pickLuckyNameOldWay1(NAMES,"R");


        System.out.println("Hello Stream API");

        Stream.iterate(1,element -> element+1).
                    filter(element->element%6==0).
                    limit(10)
//                    .forEach(System.out::println)
        ;

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
                 System.out.println(totalPrice2);

        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(s, price)->s+price);   // accumulating price
                 System.out.println(totalPrice);

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("New thread created");
                    }
                }
        ).start();

        new Thread(
                () -> {
                    System.out.println("New thread created");
                }
        ).start();



    }
}

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
