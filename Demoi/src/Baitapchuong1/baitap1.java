package Baitapchuong1;
import java.util.Scanner;

public class baitap1 {
	private int a,b;
	Scanner sc=new Scanner(System.in);
	public void nhapSonguyen() {
		System.out.println("BAI TAP 1");
		System.out.println("Nhap vao so nguyen a va b: ");
		System.out.println("Nhap vao so nguyen a: ");
		 a=sc.nextInt();
		System.out.println("Nhap vao so nguyen b: ");
		 b=sc.nextInt();
	}
	
	public void xuat() {
		System.out.println("so nguyen a= "+a);
		System.out.println("so nguyen b= "+b);
	}
	public void tong2so() {
		System.out.println("Tong a+b="+(a+b));
	}
	public void hieu2so() {
		System.out.println("Hieu a-b="+(a-b));
	}
	public void tich2so() {
		System.out.println("Tich a*b="+(a*b));
	}
	public void Thuong2so() {
		System.out.println("Tong a/b="+(a/b));
	}
	
}
