package JavaReviewCodes;

public class Ques2 {
    public static void main(String[] args) {
//        // Set it to the number of elements you want in the Fibonacci Series
//        int maxNumber = 10;
//        int previousNumber = 0;
//        int nextNumber = 1;
//        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
//        for (int i = 1; i <= maxNumber; ++i) {
//            System.out.print(previousNumber + " ");
//            /* On each iteration, we are assigning second number
//             * to the first number and assigning the sum of last two
//             * numbers to the second number
//             */
//            int sum = previousNumber + nextNumber;
//            previousNumber = nextNumber;
//            nextNumber = sum;
//        }
//    }
            for (int i = 0; i < 11; i++) {
                System.out.println(fib(i));
            }
            int a = 0;
            int b = 1;
            int c;
            for (int i = 0; i < 11; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        public static int fib ( int seq){
            if (seq <= 1) {
                return seq;
            } else {
                return fib(seq - 2) + fib(seq - 1);
            }
        }
    }
