package org.example;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ProductDatabase db= ProductDatabase.getInstance();

        while(true){
            System.out.println("----------Quan Ly San Pham------------");
            System.out.println("1.them san pham");
            System.out.println("2.xem danh sach san pham");
            System.out.println("3.cap nhat thong tin san pham");
            System.out.println("4.xoa san pham");
            System.out.println("5. thoat");
            System.out.println("-----------------------------------------");
            System.out.println("lua chon cua ban");
            int choice= sc.nextInt();

            switch (choice){
                case  1:
                    System.out.printf("nhap ten san pham:");
                    String name=sc.nextLine();
                    System.out.printf("nhap gia san pham");
                    double price=sc.nextDouble();



            }

        }

    }
}