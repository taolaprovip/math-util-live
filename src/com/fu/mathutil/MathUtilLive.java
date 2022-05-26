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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);// hàm tính đi coi là mấy
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
//        MathUtil.getFactorial(-5); mém ngoại lệ thật rồi, ai biểu đưa cà chớn
        //kĩ thuật kiểm thử phần mềm: ước lượng giá trị trả về của hàm là gì
        //expected value :5! = 120
        //mày/hàm ai đó viết khi chạy thực tế là mấy - actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
        
    }
    
}
