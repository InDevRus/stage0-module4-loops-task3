package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        var divisor1 = Math.max(first, second);
        var divisor2 = Math.min(first, second);

        if (divisor2 == 0) {
            System.out.println(divisor1);
            return;
        }

        while (divisor2 > 0) {
            var modulo = divisor1 % divisor2;
            divisor1 = divisor2;
            divisor2 = modulo;
        }

        System.out.println(divisor1);
    }
}
