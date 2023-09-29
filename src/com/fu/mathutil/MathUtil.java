/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author CHIBAO
 */
//Ta viet cac class de cung cap tien ich cho noi khac xai
//khi ta cung cap tien ich cho noi khac xai, do la luc ta ko can nho cai gi
//cho rieng ta, ham static giup lam dieu nay
public class MathUtil {
    
    //n! = 1.2.3.4.5.6...n
    //0! = 1! = 1
    //ko tinh giai thua cho so am
    //20! la vùa khop kieu long, kieu long toi da 18 con so 0
    // 21! lo kieu long
    //neu dua vao am hay 21! ta eo tinh, ta dap vao mat ai xai ham 
    //mot cai ngoai le, chui eo tinh dc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between "
                    + "0...20");
        //ham dung lien eo can return
        
        //xuong day la n = 0..20 oi
        if (n == 0 || n == 1)
            return 1; //dung ngay khi n dac biet
        
        //xuong den day, n = 2..20 oi
        //choi for hoac de quy - recursion
        //ki thuat nhoi con heo dat, oc bu don thit
        //i = 2, i = 3, i = 4, i = n nhoi lien tuc i vao tich
        long product = 1;//tich khoi dau = 1, nhoi 2 3 4 5 6...n
        for (int i = 2; i <= n; i++)
            product *= i; 
        
        return product;
    }
}
