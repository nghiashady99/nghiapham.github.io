package Baitapchuong1;
import java.util.Scanner;

public class baitap2 {
	private int a,b;
	private int chuvi,dientich;
	Scanner sc=new Scanner(System.in);
	public void nhapHCN() {
		System.out.println("BAI TAP 2");
		System.out.println("Nhap vao chieu dai va chieu rong: ");
		System.out.println("Nhap vao chieu dai : ");
		a=sc.nextInt();
		System.out.println("Nhap vao chieu rong : ");
		b=sc.nextInt();
	}
	public void xuatHCN() {
		System.out.println("Chieu dai = "+a);
		System.out.println("Chieu rong = "+b);
	}
	public void chuviHCN() {
		chuvi=(a+b)*2;
		System.out.println("Chu vi cua hinh chu nhat la:("+a+"+"+b+")"+"*2"+"= "+chuvi);
	}	
	public void dientichHCN() {
		dientich=a*b;
		System.out.println("Dien tich cua hinh chu nhat la "+a+"*"+b+"= "+dientich);
	}
	
}
