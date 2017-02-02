package natali.service;

import natali.candy.Box;
import natali.candy.Candy;

import java.util.ArrayList;


public class BoxService {
    private Box box;

    public BoxService(Box box) {
        this.box = box;
    }

    public int allWeight() {

        int allWeight = 0;

        for (Candy candy : box.getKonfety()) {
            allWeight += candy.getWeight();
        }

        return allWeight;
    }

    public ArrayList<Candy> findBySugar(int num1, int num2) {

        ArrayList<Candy> candy = new ArrayList<Candy>();

        for (Candy candies : box.getKonfety()) {
            if (candies.getSugar() >= num1 && candies.getSugar() <= num2 ){
                candy.add(candies);
            }
        }
        return candy;
    }


}
