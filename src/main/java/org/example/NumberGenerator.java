package org.example;

import java.util.Random;

public class NumberGenerator {

    Random random = new Random();

    public int generateNumber (){
        return random.nextInt(100);
    }
}
