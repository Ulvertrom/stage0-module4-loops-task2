package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void powerOfTwo(int power){
        int result = 1, counterPower = 0;
        while (counterPower <= power) {
            if (result >= 0) {
                System.out.println(result);
                result *= 2;
            } else {
                System.out.println("too much power");
            }
            counterPower++;
        }
    }
}
