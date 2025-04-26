package day01Java_SamuelSibuea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        bagian challange Iterration //
//        pattern1(5);
//        pattern2(5);
//            pattern3(5);
//            pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7();
//        pattern9(9);
//            pattern10(9);

//        bagian challange Math and String
//        Reverse();
//        IsPalindrome();
//        Capitalize();
//        IsNoDuplicateChar();
//        IsBrace();
//

    }

    public static void pattern1(int x){

        int number = 1;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.printf("%4d", number);
                number += 1;
            }
            System.out.println();
        }

    }
    public static void pattern2(int x){
        for(int i = 1; i <= x; i++){
            int number = i;
            for(int j = 1; j <= i; j++){
                System.out.printf(number + "");
                number++;
            }
            System.out.println();
        }
    }
    public static void pattern3(int x){
        for(int i = 1; i <= x; i++){
            for(int j = i; j <= x; j++){
                System.out.printf(j + "");
            }
            System.out.println();
        }
    }
    public static void pattern4(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern5(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < i) {
                    System.out.print("20 ");
                } else if (j == i) {
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print("10 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern6(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < i) {
                    System.out.print("10 ");
                } else if (j == i) {
                    System.out.print((x - i) + " ");
                } else {
                    System.out.print("20 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input jumlah baris piramid = ");
        int x = scanner.nextInt();

        for (int i = x; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void pattern9(int n){
        for(int i = 0; i < n; i ++){
            if (i % 2 == 0){
                for (int j = n; j >= 1; j--){
                    System.out.print(j + " ");
                }
            }else {
                for (int j = 1; j <= n; j++){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
        public static void pattern10(int n){
            for(int i = 0; i < n; i ++){
                if (i % 2 == 0){
                    for (int j = 1; j <= n; j++){
                        if (j % 2 == 0){
                            System.out.print(j);
                        }else{
                            System.out.print(" - ");
                        }
                    }
                }else {
                    for (int j = 1; j <= n; j++){
                        if (j % 2 == 0){
                            System.out.print(" - ");
                        }else{
                            System.out.print(j);
                        }
                    }
                }
                System.out.println();
            }
        }

    public static void Reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        int reversed = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Hasil reverse dari " + original + " adalah: " + reversed);
    }
    public static void IsPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        boolean result = checkPalindrome(n);

        System.out.println("untuk " + n + " adalah palindrom: " + result);
    }

    public static boolean checkPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static void Capitalize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);

        System.out.println("Hasil kapitalisasi: " + result);
    }

    public static String capitalizeWords(String input) {
        String[] words = input.split(" ");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedString.toString().trim();
    }

    public static void IsNoDuplicateChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat untuk memeriksa karakter duplikat: ");
        String input = scanner.nextLine();

        boolean result = checkNoDuplicateChar(input);

        System.out.println("Hasil pemeriksaan duplikat karakter: " + result);
    }

    public static boolean checkNoDuplicateChar(String s) {

        boolean[] charSet = new boolean[256]; // Asumsi karakter ASCII

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);


            if (charSet[currentChar]) {
                return false;
            }


            charSet[currentChar] = true;
        }

        return true;
    }

    public static void IsBrace() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanda kurung untuk memeriksa: ");
        String input = scanner.nextLine();

        boolean result = checkBrace(input);

        System.out.println("Hasil pemeriksaan kurung: " + result);
    }

    public static boolean checkBrace(String s) {
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                balance++;
            } else if (currentChar == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }


        return balance == 0;
    }





}