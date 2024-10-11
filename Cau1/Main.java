/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1;

/**
 *
 * @author truon
 */
public class Main {
    public static void main(String[] args ){
        
        HinhChuNhat hcna = new HinhChuNhat();
        hcna.Chieudai = 2.5;
        hcna.Chieurong = 2;
        System.out.println("Diein tich nhcn la : " + hcna.DienTich() );
        System.out.println("Chu vi nhcn la : " +  hcna.ChuVi());
        
        HinhChuNhat hcnb = new HinhChuNhat();
        hcnb.Chieudai = 7;
        hcnb.Chieurong = 8.2;
        System.out.println("Diein tich nhcn la : " + hcnb.DienTich() );
        System.out.println("Chu vi nhcn la : " +  hcnb.ChuVi());
    }
}
