package ru.netology.sqr;

public class SQRService {

    public static int getSqrCount(int number1, int number2) {
        int sqrCounter = 0;
        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            if (sqr >= number1 && sqr <= number2) {
                sqrCounter++;
            }
        }
        return sqrCounter;
    }
}
