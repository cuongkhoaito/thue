/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thue;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author NGUYEN DUC CUONG
 */
public class Person {
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;

    public Person() {
    }

    public Person(String hoTen, int namSinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public double tinhMucKhauTru(){
        return 4000000;
    }
    
    public int tinhTuoi(){
        Calendar instance = Calendar.getInstance ();
        int year = instance.get (Calendar.YEAR) ;
        return year - namSinh;
    }
    
    @Override
    public String toString() {
        return   "hoTen=" + hoTen + ", tuoi= "+ tinhTuoi()+ ", gioiTinh=" + gioiTinh + '}';
    }

  
}
