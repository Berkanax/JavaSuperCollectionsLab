package JavaZaawansowana._01_Exceptions;

import java.util.Random;

public class RandomExceptionApp {
    public void generateException() throws Exception {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0){
            throw new FirstException("Pierwszy wyjątek", 001);
        } else if (i == 1){
            throw new SecondException("Drugi wyjątek", 002);
        } else if (i == 2){
            throw new ThirdException("Trzeci wyjątek", 003);

        }

    }
}
