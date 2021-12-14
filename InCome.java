/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thue;

/**
 *
 * @author NGUYEN DUC CUONG
 */
public class InCome {  // thu nhap
    private String ndThuNhap;
    private double soTien;

    public InCome() {
    }

    public InCome(String ndThuNhap, double soTien) {
        this.ndThuNhap = ndThuNhap;
        this.soTien = soTien;
    }

    public String getNdThuNhap() {
        return ndThuNhap;
    }

    public void setNdThuNhap(String ndThuNhap) {
        this.ndThuNhap = ndThuNhap;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    
    
}
