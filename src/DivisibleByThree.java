public class DivisibleByThree {
        public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of integers between 1 and 30 that are divisible by 3: " + sum);
        }
    }


