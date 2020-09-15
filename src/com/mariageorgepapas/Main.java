package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

	// Write a method with the name sumDigits that has one int parameter called number.
    // If parameter is >=10 then the method should process the number and return sum of all digits, otherwise return -1
    // to indicate invalid value. The numbers 0-9 have 1 digit so we don't want to process them, also we don't want to
    // process negative numbers, so also return -1 for negative numbers. Example: sumDigits(125) should return 8 since
    // 1+2+5=8, sumDigits(1) should return -1 as per requirements described above.
    // Hint: use n % 10 to extract the least-significant digit
    //       use n = n / 10 to discard the least-significant digit

        System.out.println("The sum of the digits in number 125 is " +sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " +sumDigits(-125));
        System.out.println("The sum of the digits in number 9 is " +sumDigits(9));
        System.out.println("The sum of the digits in number 32123 is " +sumDigits(32123));
    }

    private static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // number = 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        // we use number > 0 as the condition because we have to divide the number by 10 to drop the digit and once we
        // have dropped all digits the number will become zero, we are going to keep looping while the number is greater
        // than zero
        while(number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;  // same as number = number / 10;
        }
        return sum;
    }
}
