package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int i = array.length-1;
        return array[i];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int i = array.length-2;
        return array[i];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String e : array) {
            if(e.equals(value)){
                return true;
            }
        }
        return false;
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
         String temp;
         int start = 0;
         int end = array.length-1;
         while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
         return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String [] copy = new String[array.length];
        String temp;
        int start = 0;
        int end = array.length-1;
        while(start < end){
            temp = array[start];
            copy[start] = array[end];
            copy[end] = temp;

            start++;
            end--;
        }
        if(array.length %2 != 0){
        copy[start] = array[end];
        }
        return Arrays.equals(copy,array) ? true:false;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < array.length; i++){
            sb.append(array[i]);
        }
        String str =sb.toString();
        return str.toLowerCase()
                .replaceAll("[^a-z]","")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int amountOfTimes = 0;
        for(String e: array){
            if(e.equals(value)){
                amountOfTimes++;
            }
        }
        return amountOfTimes;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayL = new ArrayList<String>(Arrays.asList(array));
        arrayL.removeIf(value -> value.equals(valueToRemove));
        return arrayL.toArray(new String[arrayL.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayL = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                arrayL.add(array[i]);
            }
            if(i >= 1) {
                if (!array[i].equals(array[i-1])) {
                    arrayL.add(array[i]);
                }
            }
        }
        return arrayL.toArray(new String[arrayL.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayL = new ArrayList<String>();
        String temporary = "";
        for (int i = 0; i < array.length; i++) {
            String current = array[i];

            return arrayL.toArray(new String[arrayL.size()]);
        }



}
