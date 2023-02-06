package com.coding;

import com.sun.tools.javac.comp.Check;

import java.util.Arrays;
import java.util.Optional;
import java.util.PriorityQueue;

public class Jan24coding {


    public static int BiggerNumAmongTwo(int a, int b){
        if(a > b) return a;
        else return b;
    }

    public static String CheckEvenOddUnaryOperation(int num){

        if(num % 2 == 0){
            return "even";
        }
        else {
            return "odd";
        }
    }

    public static int BiggerNumAmongThree(int x, int y, int z){
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        q.add(x);
        q.add(y);
        q.add(z);
        return q.peek();
    }

    public static String findVowelOrConsonant(Character ch){

        Character[] c = new Character[]{'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < c.length; i++){
            if(Character.toLowerCase(ch) == c[i]){
                return "vowel";
            }
        }
        return "consonant";
    }

    public static boolean findAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charArray1 = new char[]{}, charArray2 = new char[]{};
        if(str1.length() == str2.length()) {
            charArray1 = str1.toCharArray();
            charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
        }
        return Arrays.equals(charArray1, charArray2);
    }

    public static int[] findSecondMaxAndMin(int[] arr){
        if(arr.length < 2){
            return new int[]{};
        }
        int[] result = new int[2];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        PriorityQueue<Integer> q = new PriorityQueue();
        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
        }
        q.poll();
        min = q.poll();

        q = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
        }
        q.poll();
        max = q.poll();


        return new int[]{max, min};
    }


    public static void main(String[] args){
        //1
        System.out.println(BiggerNumAmongTwo(1, 2));


        //2
        int a = 5, b = 3;
        System.out.println("before swap " + a + " and " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("after swap " + a + " and " + b);

        //3
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("swap without extra variable " + a + " and " + b);

        //4
        int num = 5;
        System.out.println("unary check odd even: " + num + " is " + CheckEvenOddUnaryOperation(num));

        //5
        int x = 5, y = 7, z = 3;
        System.out.println(BiggerNumAmongThree(x, y, z));

        //6
        char c = 'D';
        System.out.println(String.valueOf(c) + " is " + findVowelOrConsonant(c));

        //Q1 find second max and min


        //Q2 find anagram
        if(findAnagram("abc sss", "s ab css")){// is anagram
            System.out.println("is anagram");
        }
        else{
            System.out.println("is not anagram");
        }

        //Q2
        int[] maxmin = findSecondMaxAndMin(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("2nd max is " + maxmin[0] +  " and 2nd min is " + maxmin[1]);
    }
}
