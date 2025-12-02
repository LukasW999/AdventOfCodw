package org.example.fuenfUndZwanzig;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day_1_Secret_Entrance {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/java/org/example/fuenfUndZwanzig/input.txt");

        Scanner s = new Scanner(f);
        int currentNumber = 50;
        int zeroCounter = 0;
        while (s.hasNext()){
            String directionAndNumber = s.next();
            String number = String.valueOf(directionAndNumber.charAt(1));
            char direction = directionAndNumber.charAt(0);
            for (int i = 2; i < directionAndNumber.length(); i++) {
                number = number.concat(String.valueOf(directionAndNumber.charAt(i)));
            }
            int intNumber = Integer.parseInt(number);
            int tempCurrent = currentNumber;
            if (intNumber>100){

            }
            if (direction == 'L'){
                currentNumber = currentNumber - intNumber;
                if (currentNumber<0){
                    currentNumber+=100;
                }
            }else {
                currentNumber = currentNumber + intNumber;
                if (currentNumber>100){
                    currentNumber-=100;
                }
            }
            System.out.println("anweisung"+directionAndNumber+" vorher "+tempCurrent+ "-> "+currentNumber);
            if (currentNumber==0){
                zeroCounter++;
            }
        }
        System.out.println(zeroCounter);

    }

}
