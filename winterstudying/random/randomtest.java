package winterstudying.random;

import winterproject.ATMmodel.Account;

import java.util.ArrayList;
import java.util.Random;

public class randomtest {
    public static void main(String[] args) {
      Random r =new Random();
        int number= 0;
        for (int i=0;i<5;i++) {
            number = r.nextInt(100000000);
            System.out.print(number+"\t");
        }

}
}
