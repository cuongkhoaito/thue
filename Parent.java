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
public class Parent extends Person{
    Child[] con;

    public Parent(Child[] con) {
        this.con = con;
    }

    public Parent( String hoTen, int namSinh, boolean gioiTinh,Child[] con) {
        super(hoTen, namSinh, gioiTinh);
        this.con = con;
    }

    public Child[] getCon() {
        return con;
    }

    public void setCon(Child[] con) {
        this.con = con;
    }
    
    @Override
    public double tinhMucKhauTru(){
        if((isGioiTinh() && tinhTuoi() >65 ) || (isGioiTinh() == false && tinhTuoi() >55));
            return 1600000/demSoCon();
    }
    
    public int demSoCon(){
        return con.length;
    }
    
    
    public String tostring () {
        return super.toString ()+"\t" + tinhMucKhauTru();
    }
}
