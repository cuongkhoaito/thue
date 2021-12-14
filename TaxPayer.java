/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thue;
import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC CUONG
 */
public class TaxPayer extends Person {  // nguoi nop thue
    Child [] con;
//    Child [] conBoMe;
    private Parent bo,me;
    private double thuNhap;
    public TaxPayer () {
        
    }
    public TaxPayer (String ht, int ns, boolean gt, Child[] con,Parent bo, Parent me, double thuNhap ) {
        super(ht,ns,gt);
        this.con = con;
        this.thuNhap = thuNhap;
        this.bo = bo;
        this.me = me;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
    
   
    public void in(){
        System.out.println("Thong tin nguoi chiu thue: ");
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Tuoi: " + tinhTuoi()+ "t");
        System.out.println("Thu nhap: "+ getThuNhap());
        System.out.println("Bo : "+ bo);
        System.out.println("Me : " + me);
        System.out.println("------------------------------------");
     
        for (int i = 0; i < con.length; i++) {
            System.out.print("| ");
            System.out.print("Con " + (i + 1) + ": " + con[i]);
            System.out.println(" |");
        }
        System.out.println("------------------------------------");
        System.out.println("Khau tru gia canh: " + tinhKhauTru());
        System.out.println("Thu nhap chiu thue: " + (getThuNhap() - tinhKhauTru()));
        System.out.println("Tinh thue: " + tinhThue());
    }
    
    
    
    public double tinhKhauTru(){
        double khauTruBanThan = super.tinhMucKhauTru();
        double khauTruCon =0;
        double khauTruBo = bo.tinhMucKhauTru();
        double khauTruMe = me.tinhMucKhauTru();
        if(con.length == 0)
            khauTruCon = 0;
        else
            for(int i=0; i < con.length; i++){
                khauTruCon += con[i].tinhKhauTru();
            }
        return khauTruCon + khauTruBanThan +khauTruMe +khauTruBo ;
    }
    
    public double tinhThue(){
        
        double thuNhapChiuThue = getThuNhap () - tinhKhauTru ();
        if (thuNhapChiuThue <= 2000000) {
            return thuNhapChiuThue* 0.05;
         } else {
            return (thuNhapChiuThue* 0.05) + (thuNhapChiuThue - 2000000) * 0.01;
        }
   }
    
    public static void main(String[] args) {
//        Person ps = new Person();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap thong tin nguoi chiu thue : ");
//        String ten = sc.next();
//        System.out.println("Nhap nam sinh ");
//        int nsinh = sc.nextInt();
//        System.out.println("Nhap gioi tinh ");
//        boolean gtinh = sc.nextBoolean();
//        
//        ps.Person(ten,nsinh, gtinh);  
        
        
        //Person p = new Person ();
//        System.out.println("Thong tin nguoi chiu thue: ");
//        TaxPayer t = new TaxPayer ("Nguyen Van A", 1987, true, 20000000) ;
//        
//        
       
        Child[] con = new Child[2];
        con [0] = new Child ("Nguyen Van b", 2018, true, true);
        con[1] = new Child ("Nguyen Van c", 2021, true, true);

        Child[] conBoMe = new Child[2];
        conBoMe[0] = new Child("Anh Hai", 1983, true, true);
        conBoMe[1] = new Child("Em ut", 1990, false, true);
        
        Parent bo = new Parent("Cha", 1960, true, conBoMe);
        Parent me = new Parent ("Me", 1960, false, conBoMe) ;
        
        TaxPayer t = new TaxPayer("Nguyen Van A", 1987, true, con,bo , me, 9000000) ;
        System.out.println ( t.toString ());  // in nguoi thu thue
        t.in(); //in con 
    }
}
