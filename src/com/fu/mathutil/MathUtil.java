/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author 2uang
 */
//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì
//cho riêng ta, hàm static giúp làm điều này
public class MathUtil {
    
    
    //n!  = 1.2.3.4.5.6....n
    //Quy ước 0! = 1! =1 
    //ko tính giai thừa cho số âm
    //20! vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm hay, 21 giai thừa, ta éo tính, ta đập vào mặt ai xàm hàm này
    //một ngoại lệ, chửi éo tính được
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0");
            //hàm dừng liền k cần return
        }
        //xuống đến đây thì n = 0 ... 20 òi
        if (n == 0 || n == 1) {
            return 1;//dừng ngày khi n đặc biệt
            //xuống đến đây, n = 2..20 òi
            //chơi for hoặc đệ quy - recursion
            //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
            //i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích  
        }
        long product = 1;// tích khởi đầu bằng 1, nhồi 2 3 4 5 6 ...
        for (int i = 2; i <= n; i++) {
//            product = product * i;
            product *= i;
        }   //nhân từ 2 đến n
        return product;
        
    }
}
