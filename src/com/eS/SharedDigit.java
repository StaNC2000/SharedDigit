package com.eS;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        int firstNumberFirstDigit = firstNumber / 10;
        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberFirstDigit = secondNumber /10;
        int secondNumberLastDigit = secondNumber % 10;

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99 ){
            return false;
        }

        else if (firstNumberFirstDigit == secondNumberFirstDigit || firstNumberLastDigit == secondNumberLastDigit || firstNumberFirstDigit == secondNumberLastDigit || firstNumberLastDigit == secondNumberFirstDigit){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(hasSharedDigit(-2,21));
        System.out.println(hasSharedDigit(-12,21));
        System.out.println(hasSharedDigit(-21,21));
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(55,15));
        System.out.println(hasSharedDigit(100,10));

    }
}
