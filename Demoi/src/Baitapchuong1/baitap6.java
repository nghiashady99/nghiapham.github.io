package Baitapchuong1;
import java.util.Scanner;
public class baitap6 {
	private int N;
	Scanner sc=new Scanner(System.in);
	public void nhapN() {
		System.out.println("BAI TAP 6");
		System.out.println("Nhap so nguyen N");
		N=sc.nextInt();
		System.out.println("So nguyen N="+N);
	}
	public int SNT(int N) {
		int dem=0;
		for(int i=1;i<=N;i++)
		{
			if(N%i==0) dem++;
		}
		if(dem==2)
			return 1;
		else return 0;
	}
	public void KTSNT() {
		if(N>1) 
		{
			if(SNT(N)==1)
				System.out.println("N la so nguyen to");
			else System.out.println("N khong phai la so nguyen to ");
		}
	}
}
