package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a và b");
        int a = sc.nextInt(), b = sc.nextInt(), hs;
        int kq= a-b;
        System.out.println(a+"-"+b+" Là gì?");
        System.out.print("Nhập kết quả: ");
        hs = sc.nextInt();
        if(kq!=hs){
            System.out.println("Kết quả sai");
        }else {
            System.out.println("Kết quả đúng");
        }
    }
}
