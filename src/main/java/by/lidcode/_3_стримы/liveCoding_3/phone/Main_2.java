package by.lidcode._3_стримы.liveCoding_3.phone;

import java.util.stream.Stream;

public class Main_2 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        Integer reduce = phoneStream.filter(s -> s.getPrice() < 50000)
                // .map(Phone::getPrice)

                .reduce(0, (x, y) -> x + y.getPrice(), (x, y) -> x + y);
        System.out.println(reduce);

    }
}



