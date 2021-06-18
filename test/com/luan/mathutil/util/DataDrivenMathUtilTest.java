/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.mathutil.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ipuil
 */
@RunWith(value = Parameterized.class)  // báo hiệu JUnit ta sử dụng  cơ chế tham số hóa là tách data, lát hồi đưa vào

public class DataDrivenMathUtilTest {
// chuẩn cị bộ ddataa:  EXCEL , CSV, table khác trong DB , mảng 2 chiều.
// quy ước bộ data này dùng cho n lần gọi hàm khác nhau để có thể sờ đến nó    
// thì nó cần nằm một chổ cố định trong ram
    //STATIC 

// có ddataa rồi thì cần phải trích nó ra, mỗi dòng mang ý nghĩa input and expected. actual
    @Parameter(value = 0) // lấy values cột 0
    public int input;
    @Parameter(value = 1) // lấy values cột 1
    public long expected;

    @Parameters
    public static Object[][] initData() {

        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {5, 120},
            {6,720},
        };
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        assertEquals(expected, MathUtil.getFactorial(input));
    }

}
