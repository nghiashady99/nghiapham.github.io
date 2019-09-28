package Baitapchuong1;
import java.util.Scanner;
public class baitap4 {
	private int N;
	Scanner sc=new Scanner(System.in);
	public void nhapN() {
		System.out.println("BAI TAP 4");
		System.out.println("Nhap so nguyen N: ");
		N=sc.nextInt();
		System.out.println("So nguyen N="+N);	
	}
	public void kiemtra() {
		if(N%2==0) {
			System.out.println("N la so chan");
		}
		else System.out.println("N la so le ");
	}
}
