package com.syntax.class15;

public class MD2 {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        ArrayUtils arrayutils=new ArrayUtils();
        arrayutils.printArray(arr);
        int sum= arrayutils.sumArray(arr);
        System.out.println(sum);
    }
}
