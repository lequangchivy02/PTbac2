package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), hs;
        int kq= a-b;
        System.out.println(a+"-"+b+"Là gì?");
        System.out.println("Nhập kết quả");
        hs = sc.nextInt();
        if(kq!=hs){
            System.out.println("Kết quả sai");
        }else {
            System.out.println("Kết quả đúng");
        }
    }
}
