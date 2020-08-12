package com.junittest;

public class Utilities {

    //return a char array every nth char
    // when length of source array < n, return source array

    public char[] charArrays(char[] sourceArray, int n) {
        if(sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for(int i = n-1; i < sourceArray.length; i++) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    public String removePairs(String source) {
        //if length < 2, there wont be pairs
        if(source.length() < 2) {
            return source;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] string = source.toCharArray();
        for(int i = 0; i < string.length - 1; i++) {
            if(string[i] != string[i+1]) {
                stringBuilder.append(string[i]);
            }
        }
        stringBuilder.append(string[string.length - 1]);
        return stringBuilder.toString();

    }

    public int converter(int a, int b) {
        //b cannot be 0
        try {
            return (a/b) + (a * 30) - 2;
        } catch (ArithmeticException e) {
            System.out.println("b cannot be 0");
        }
        return -1;

    }

    public String nullIfOddLength(String source) {
        if(source.length() % 2 == 0) {
            return source;
        }
        return null;
    }
}
