package Baitapchuong1;
import java.util.Scanner;

public class baitap3 {
	final private double PI=3.14;
	private int r;
	private double chuvi;
	private double dientich;
	Scanner sc=new Scanner(System.in);
	public void nhapbankinh() {
		System.out.println("BAI TAP 3");
		System.out.println("Nhap ban kinh hinh tron");
		r=sc.nextInt();
	}
	public void xuatbankinh() {
		System.out.println("Ban kinh hinh tron r="+r);
	}
	public void chuviHT() {
		chuvi=2*PI*r;
		System.out.println("Chu vi hinh tron = "+chuvi);
	}
	public void dientichHT() {
		dientich=PI*r*r;
		System.out.println("Dien tich hinh tron = "+dientich);
	}
	
}
