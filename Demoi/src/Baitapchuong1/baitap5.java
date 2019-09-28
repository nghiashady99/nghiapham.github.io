package Baitapchuong1;
import java.util.Scanner;
public class baitap5 {
	private int N;
	Scanner sc=new Scanner(System.in);
	public void nhapN() {
		System.out.println("BAI TAP 5");
		System.out.println("Nhap vao so nguyen N: ");
		N=sc.nextInt();
		System.out.println("So nguyen N="+N);
	}
	public void kiemtra() {
		if(N>0) {
			System.out.println("N la so duong");
		}
		else if(N==0) System.out.println("N la so zero");
		else System.out.println("N la so am ");
	}
}
