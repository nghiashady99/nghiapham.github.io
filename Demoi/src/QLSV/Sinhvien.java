package QLSV;
import java.util.Scanner;

public class Sinhvien {
	private String masosv;
	private String hoten;
	private String ngaysinh;
	private String diachi;
	private String dienthoai;
	private static String noihoc="DHSG";
	private int n;
	private int m;
	public String sinhvien[]=new String[n];
	Scanner sc=new Scanner(System.in);
	public Sinhvien() {
		masosv=null;
		hoten=null;
		ngaysinh=null;
		diachi=null;
		dienthoai=null;
	}
	public Sinhvien(String masosv, String hoten, String ngaysinh,
		String diachi, String dienthoai, String noihoc) {
		this.masosv=masosv;
		this.hoten=hoten;
		this.ngaysinh=ngaysinh;
		this.diachi=diachi;
		this.dienthoai=dienthoai;
//		this.noihoc=noihoc;
	}
	public void setMasosv(String masosv) {
		this.masosv=masosv;
	}
	public void setHoten(String hoten) {
		this.hoten=hoten;
	}
	public void setNgaysin(String ngaysinh) {
		this.ngaysinh=ngaysinh;
	}
	public void setDiachi(String diachi) {
		this.diachi=diachi;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai=dienthoai;
	}
	public void setNoihoc(String noihoc) {
		this.noihoc=noihoc;
	}
	public String getMasosv() {
		return masosv;
	}
	public String getHoten() {
		return hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public String getNoihoc() {
		return noihoc;
	}
	public void nhap() {
		System.out.println("----------------------------------");
		System.out.print("masosv=");
		masosv=sc.nextLine();
		System.out.println("hoten=");
		hoten=sc.nextLine();
		System.out.println("ngaysinh=");
		ngaysinh=sc.nextLine();
		System.out.println("diachi=");
		diachi=sc.nextLine();
		System.out.println("dienthoai=");
		dienthoai=sc.nextLine();
/*		System.out.println("noihoc=");
		hoten=sc.nextLine();*/
	}
	public void xuat() {
		System.out.println("MA SO SINH VIEN: "+masosv);
		System.out.println("HO TEN SINH VIEN: "+hoten);
		System.out.println("NGAY SINH SINH VIEN: "+ngaysinh);
		System.out.println("DIA CHI SINH VIEN: "+diachi);
		System.out.println("DIEN THOAI SINH VIEN: "+dienthoai);
		System.out.println("NOI HOC SINH VIEN: "+noihoc);
	}
	public void nhapMang() {
		System.out.println("=======================================");
		System.out.println("Nhap vao so luong sinh vien : ");
		n=sc.nextInt();
		m=sc.nextInt();
		sinhvien=new String[n];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				System.out.println("Nhap vao thong tin sinh vien:");
				System.out.println(i+".Nhap ma so sinh vien : ");
				sinhvien[i][j]=sc.nextLine();
				System.out.println(i+"Nhap ho ten sinh vien: ");
				sinhvien[i][j]=sc.nextLine();
				System.out.println(i+"Nhap ngay sinh cua sinh vien: ");
				sinhvien[i][j]=sc.nextLine();
		}
	}
}
