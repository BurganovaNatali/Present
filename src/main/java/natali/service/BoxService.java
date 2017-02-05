package natali.service;

import natali.candy.Box;
import natali.candy.Candy;

import java.util.ArrayList;


public class BoxService {



    public int allWeight(Box box) {

        int allWeight = 0;

        for (Candy candy : box.getKonfety()) {
            allWeight += candy.getWeight();
        }

        return allWeight;
    }

    public ArrayList<Candy> findBySugar(Box box, int num1, int num2) {

        ArrayList<Candy> candy = new ArrayList();

        for (Candy candies : box.getKonfety()) {
            if (candies.getSugar() >= num1 && candies.getSugar() <= num2 ){
                candy.add(candies);
            }
        }
        return candy;
    }

    }


