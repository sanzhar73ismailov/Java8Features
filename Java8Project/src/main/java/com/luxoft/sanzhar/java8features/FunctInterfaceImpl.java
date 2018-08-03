package com.luxoft.sanzhar.java8features;

import java.util.Arrays;
import java.util.Objects;

public class FunctInterfaceImpl {

    public static void main(String[] args) {
        
        short[] array = {(short) 1, (short) 2, (short) 3};
        byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));

        byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
        System.out.println("transformedArray = " + Arrays.toString(transformedArray));
        System.out.println("expectedArray = " + Arrays.toString(expectedArray));
    }

    public static byte[] transformArray(short[] array, FunctInterface function) {
        byte[] transformedArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            transformedArray[i] = function.applyAsByte(array[i]);
        }
        return transformedArray;
    }

}
