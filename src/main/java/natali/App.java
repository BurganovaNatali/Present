package natali;

import natali.candy.*;
import natali.service.BoxService;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Choco("Мишка на севере", 300));
        candies.add(new Caramel("Кузнечик", 200));
        candies.add(new Iris("Вася", 100));


        for (Candy candy : candies) {
            System.out.println(candy.toString());
        }
        Box box = new Box(candies);

        BoxService boxService = new BoxService(box);
        System.out.println("Вес коробки: " + boxService.allWeight());

        for (Candy candy : boxService.findBySugar(800, 1500)) {
            System.out.println(candy.toString());
        }
    }
}
