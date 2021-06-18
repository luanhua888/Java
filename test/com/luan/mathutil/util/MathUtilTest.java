/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.mathutil.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.luan.mathutil.util.MathUtil.getFactorial;

/**
 *
 * @author ipuil
 */
public class MathUtilTest {

    @Test // tst method  name convention

    public void testFactorrialGivenGoodArgumentsReturnswell() {
        //case 1 getF(5)

        long expected = 120;
        long actual = getFactorial(5);
        assertEquals(expected, actual);

        //case 2, getF(0)
        assertEquals(1, getFactorial(0));

        //case 3, getF(3)
        assertEquals(6, getFactorial(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorrialGivenWrongArgumentsReturnsThrowsException() {
        getFactorial(-5);
        getFactorial(21);
        getFactorial(2);

        // có ngoại lệ mà đúng ngoại lệ mình kì vọng
        //
    }
}
// Máy so sánh giùm kết quả, thay vì mắt người như bên main
// tự động làm mệnh đề Join kết quả:
//  XANH,Hàm đúng nếu, nếu tất cả các casé cùng xanh()
// ĐỎ , Hàm sai, có vấn đề, chỉ cần 1 thằng đỏ thì tất cả coi như đỏ
// giả định: hàm đã chính xác thì ít nhát là phải chính xác trên những case đã test.

//còn tình huống đưa vào âm , >20
// theo thiết kế thì hàm ném ra ngoại lệ vì không xử lí được tham số này
//vậy nếu mình gọi hàm getF(-5) thì cần phải xuất hiện ngoại lệ thì mới coi như hàm ổn
// nếu ném đưuọc ngoại lệ khi chơi <0 hay> 20, ngoại lệ tên là IllegalArgumentException, thì hàm ổn định, thì màu xanh.
// ngoại lệ mà phải mừng vì đúng như thiết kế
//
//JUnit 4.x thì ngoại lệ là thứ ko thể so sánh, vì ko là giá trị
// ko có hàm assertEquals(), chỉ có thể đánh giá rằng mày có xh hay ko?
// chiêu khác đề đo lường sự xuất hiện của Ễxcption

// Cachs viết code ở trên là cách viết  theo kiểu Test Case theo kiểu trộn bộ
// data kiểm thử và câu lệnh cần test , lẫn lộn lệnh và data

//Có sự lặp lại các lệnh trên bộ ddataa => Ý tưởng mới
// Tách Hoàn toàn dât Riêng  1 chỗ, Bao gồm đầu vào, đầu ra kì vọng 
// Sau đó chỉ cần ít hàm test gọi hàm chính cần test vơi bộ ddataa DC
// Đổ Đưa vào, Extract. Feed
//  kĩ thuật test nay được gọi là  Data-driven tesing
// Data để đâu (Data set)
// Excel, 
