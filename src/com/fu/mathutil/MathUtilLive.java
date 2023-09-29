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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5); // ham tinh di coi la may
        
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1;   actual: " + MathUtil.getFactorial(0));
        
        //MathUtil.getFactorial(-5); nem ngoai le that roi, ai bieu dua ca chon chi
        
        //Them code sau lan dau tien lam chuyen ay - code len Server 6:13PM 29/9/2023
        System.out.println("expected: 1! = 1;   actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6;   actual: " + MathUtil.getFactorial(3));
        
        
        //ki thuat kiem thu phan mem; uoc luong xem gia tri tra ve cua ham la gi
        //expected value: 5! = 120
        //may/ham ai do viet khi chay thuc te la may - actual, gia su 120
        //if expected == actual, ham ngon trong tinh huong nay
    }
    
}
