package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a = ");
        float a = sc.nextFloat();
        System.out.print("Nhập b = ");
        float b = sc.nextFloat();
        System.out.print("Nhập c = ");
         float c = sc.nextFloat();
        float dt = b*b -4*a*c;
        if(a==0){
            System.out.println("Phương trình là phương trình bậc nhất bx + c = 0");
            if(b==0&&c!=0){
                System.out.println("Phương trình vô nghiệm");
            }else if(b == 0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm x= "+(-b)/a);
            }
        }else{
            System.out.println("Phương trình là phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
            if(dt>0){
                System.out.println("Phương trình có hai nghiệm phân biệt");
                System.out.println("x1 = "+((-b+Math.sqrt(dt))/(2*a)));
                System.out.println("x2 = "+((-b-Math.sqrt(dt))/(2*a)));
            }else if(dt==0){
                System.out.println("Phương trình có một nghiệm kép");
                System.out.println("x = "+(-b/(2*a)));
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
