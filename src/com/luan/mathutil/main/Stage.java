/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.mathutil.main;

import static com.luan.mathutil.util.MathUtil.getFactorial;

/**
 *
 * @author ipuil
 */
public class Stage {

    public static void main(String[] args) {
        //Case 1
        //test 5! co bang 120 hay ko
        //expected = 120 neu neu ta tinh 5!, thuc the xu li la bao nhieu laf actual
        long expected = 120;
        long actual = getFactorial(5);

        System.out.println("Expected: " + expected + "\nActual: " + actual);

        // regression is test hoi quy  test laij nhung gi tung test khi no da tac dongma truoc do no van chayj ngon
        // Case 2
        // 0!  co bawng 1 hay khoong
        System.out.println("Expected: 1" + "\nActual: " + getFactorial(0));

        //Case 3 21!  ngoai le dap vao mat
        System.out.println("Expected: => Exception 1" + "\nActual: " + getFactorial(21));
        //Can mau sac de ket luan ddee khong luan ang mat maf chi can cha ve ma~ mau'
    }
}
