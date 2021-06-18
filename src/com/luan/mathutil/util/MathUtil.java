/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.mathutil.util;

/**
 *
 * @author ipuil
 */
public class MathUtil {

    /* code chinh dung cho nhieu noi khac nhau */
    //tinh n! = 1.2.3...n quy uoc 0!=1! =1;
    //20! vua du kieu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be  between 0...20");
        }
        if (n == 0) {
            return 1;
        }
        // here sure n>1
        // ki thuat nhan don con heo dat
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
