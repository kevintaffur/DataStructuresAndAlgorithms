package ch01.reinforcement;

import java.util.Scanner;

public class Exercises {
//    R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different value of
//    each base type from the standard input device and prints it back to the standard
//    output device
    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a int value: ");
        int i = scanner.nextInt();
        System.out.println("Enter a double value: ");
        double d = scanner.nextDouble();
        System.out.println("Enter a float value: ");
        float f = scanner.nextFloat();
        System.out.println("Enter a char value: ");
        char c = scanner.next().charAt(0);
        System.out.println("Enter a long value: ");
        long l = scanner.nextLong();
        System.out.println("Enter a short value: ");
        short s = scanner.nextShort();
        System.out.println("Enter a boolean value: ");
        boolean b = scanner.nextBoolean();
        System.out.println("Enter a byte value: ");
        byte bt = scanner.nextByte();

        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("char: " + c);
        System.out.println("long: " + l);
        System.out.println("short: " + s);
        System.out.println("boolean: " + b);
        System.out.println("byte: " + bt);
    }

//    R-1.2 Suppose that we create an array A of GameEntry objects, which has an integer
//    scores field, and we clone A and store the result in an array B. If we then im-
//    mediately set A[4].score equal to 550, what is the score value of the GameEntry
//    object referenced by B[4]?

//    R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and
//    returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
    public static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }

//    R-1.4 Write a short Java method, isEven, that takes an int i and returns true if and only
//    if i is even. Your method cannot use the multiplication, modulus, or division
//    operators, however.
    public static boolean isEven(int i) {
        boolean even = false;
        for (int j = 0; j <= i; j++) {
            even = !even;
        }
        return even;
    }

//    R-1.5 Write a short Java method that takes an integer n and returns the sum of all
//    positive integers less than or equal to n.
    public static int sumOf(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

//    R-1.6 Write a short Java method that takes an integer n and returns the sum of all the
//    odd positive integers less than or equal to n.
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

//    R-1.7 Write a short Java method that takes an integer n and returns the sum of the
//    squares of all positive integers less than or equal to n.
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

//    R-1.8 Write a short Java method that counts the number of vowels in a given character
//    string.
    public static int countVowels(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sum += 1;
                    break;
            }
        }
        return sum;
    }

//    R-1.9 Write a short Java method that uses a StringBuilder instance to remove all the
//    punctuation from a string s storing a sentence, for example, transforming the
//    string "Let’s try, Mike!" to "Lets try Mike".
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case '.':
                case ':':
                case '?':
                case '!':
                case '¿':
                case '¡':
                case ',':
                case '"':
                case '\'':
                case ';':
                case '’':
                    sb.deleteCharAt(i);
                    break;
            }
        }
        return sb.toString();
    }

//    R-1.10 Write a Java class, Flower, that has three instance variables of type String, int,
//    and float, which respectively represent the name of the flower, its number of
//    petals, and price. Your class must include a constructor method that initializes
//            each variable to an appropriate value, and your class should include methods for
//    setting the value of each type, and getting the value of each type.

//    R-1.11 Modify the CreditCard class from Code Fragment 1.5 to include a method that
//    updates the credit limit.

//    R-1.12 Modify the CreditCard class from Code Fragment 1.5 so that it ignores any re-
//    quest to process a negative payment amount

//    R-1.13 Modify the declaration of the first for loop in the main method in Code Frag-
//    ment 1.6 so that its charges will cause exactly one of the three credit cards to
//    attempt to go over its credit limit. Which credit card is it?


    public static void main(String[] args) {
        // R 1.1
        System.out.println("--------------------- R 1.1 ---------------------");
//        inputAllBaseTypes();

        // R 1.2
        System.out.println("--------------------- R 1.2 ---------------------");
        GameEntry[] A = {
                new GameEntry(50),
                new GameEntry(100),
                new GameEntry(200),
                new GameEntry(400),
                new GameEntry(800)
        };

        GameEntry[] B = A.clone();
        A[4].score = 550;
        System.out.println(B[4].score); // A. 550

        // R 1.3
        System.out.println("--------------------- R 1.3 ---------------------");
        System.out.println(isMultiple(36, 6)); // true
        System.out.println(isMultiple(40, 6)); // false

        // R 1.4
        System.out.println("--------------------- R 1.4 ---------------------");
        System.out.println(isEven(5)); // false
        System.out.println(isEven(6)); // true

        // R 1.5
        System.out.println("--------------------- R 1.5 ---------------------");
        System.out.println(sumOf(10)); // 55

        // R 1.6
        System.out.println("--------------------- R 1.6 ---------------------");
        System.out.println(sumOfOddNumbers(10)); // 25

        // R 1.7
        System.out.println("--------------------- R 1.7 ---------------------");
        System.out.println(sumOfSquares(5)); // 55

        // R 1.8
        System.out.println("--------------------- R 1.8 ---------------------");
        System.out.println(countVowels("abc e i ou")); // 5

        // R 1.9
        System.out.println("--------------------- R 1.9 ---------------------");
        System.out.println(removePunctuation("Let’s try, Mike!")); // Lets try Mike

        // R 1.10
        System.out.println("--------------------- R 1.10 ---------------------");
        Flower flower = new Flower("flower1", 2, 2.99f);
        System.out.println(flower.getName()); // flower1

        // R 1.11 and R 1.13
        System.out.println("--------------------- R 1.11 and R 1.13 ---------------------");
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 58; val++) { // Changing 16 to 58 the charge fails using credit card 1.
            boolean r1 = wallet[0].charge(3 * val);
            boolean r2 = wallet[1].charge(2 * val);
            boolean r3 = wallet[2].charge(val);
            if (!r1) {
                System.out.println("Iteration " + val + " charge couldn't be done using card 1.");
            }
            if (!r2) {
                System.out.println("Iteration " + val + " charge couldn't be done using card 2.");
            }
            if (!r3) {
                System.out.println("Iteration " + val + " charge couldn't be done using card 3.");
            }
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }

        wallet[2].updateLimit(10000);
        CreditCard.printSummary(wallet[2]);

        // R 1.12
        System.out.println("--------------------- R 1.12 ---------------------");
        wallet[1].makePayment(-200);
    }
}
