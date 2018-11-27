package FIZZBUZZ;

public class Fizz {

    public void Start() {
        int i;
        for (i = 1; i < 101; i++) {
            int f = i / 3;
            int b = i / 5;
            if (f * 3 == i) {
                if (b * 5 == i) {
                    System.out.println("FizzBuzz " + i);
                } else {
                    System.out.println("Fizz " + i);
                }
            } else if (b * 5 == i) {
                System.out.println("Buzz " + i);
            }
        }
    }

    public void Start2(int a, int b, int m) {
        int i;
        for (i = 1; i < m+1; i++) {
            if (i%a == 0) {
                if (i%b == 0) {
                    System.out.println("FizzBuzz " + i);
                } else {
                    System.out.println("Fizz " + i);
                }
            } else if (i%b == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }

}
