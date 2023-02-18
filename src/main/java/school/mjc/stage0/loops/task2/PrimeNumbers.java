package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2, divider = 2, flag;
        while (number <= printToInclusive) {
            flag = 1;
            while (divider <= (number - 1)) {
                if ((number % divider) == 0) {
                    flag = 0;
                }
                divider++;
            }
            if (flag == 1) {
                System.out.println(number);
            }
            number++;
            divider = 2;
        }
    }
}
