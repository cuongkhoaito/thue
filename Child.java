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
public class Child extends Person {
  private boolean diHoc;

    public Child() {
    }
    public Child(String hoTen, int namSinh, boolean gioiTinh , boolean diHoc) {
        super(hoTen, namSinh, gioiTinh);
        this.diHoc = diHoc;
    }

    public boolean isDiHoc() {
        return diHoc;
    }

    public void setDiHoc(boolean diHoc) {
        this.diHoc = diHoc;
    }
  
    public double tinhKhauTru() {
        if(tinhTuoi() <=18 )
            return 500000;
        else
            if(tinhTuoi() <=22 && isDiHoc())
                return 1000000;
            else
                return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", khau tru = "+tinhKhauTru();

    }
    

}
