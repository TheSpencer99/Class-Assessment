import java.util.Scanner;

        public class SecondLargestNumber {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();
                int[] numbers = new int[n];
                System.out.println("Enter the elements:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }


                int largest = numbers[0];
                int secondLargest = Integer.MIN_VALUE;

                for (int i = 1; i < n; i++) {
                    if (numbers[i] > largest) {
                        secondLargest = largest;
                        largest = numbers[i];
                    } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                        secondLargest = numbers[i];
                    }
                }
                System.out.println("The second largest number is " + secondLargest);
                }
            }




