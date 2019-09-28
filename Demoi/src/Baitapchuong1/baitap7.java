package Baitapchuong1;
import java.util.Scanner;

public class baitap7 {
	private int N;
	Scanner sc=new Scanner(System.in);
	public void nhapN() {
		System.out.println("BAI TAP 7");
		System.out.println("Nhap vao so nguyen N:");
		N=sc.nextInt();
		System.out.println("So nguyen N="+N);
	}
	public void tongN() {
		int tong=0;
		for(int i=0;i<=N;i++) {
			tong=tong+i;
		}
		System.out.println("a.Tong cac so tu nhien <=N : Tong="+tong);
	}
	public void tongchan() {
		int tong=0;
		for(int i=0;i<N;i++) {
			if(i%2==0) tong=tong+i;
		}
		System.out.println("b.Tong cac so tu nhien chan <=N: Tong="+tong);
	}
	public void tongle() {
		int tong=0;
		for(int i=0;i<N;i++) {
			if(i%2!=0) tong=tong+i;
		}
		System.out.println("c.Tong cac so tu nhien le <=N: Tong="+tong);
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
	public void tongSNT() {
		int tong=0;
		for(int i=0;i<=N;i++) {
			if(SNT(i)==1) 
				tong=tong+i;
		}
		System.out.println("d.Tong cac so nguyen to la Tong="+tong);
	}
	public void nSNT() {
		int  dem=0,tong=0;
			for(int i=0;i<1000;i++) {
					if(SNT(i)==1) {
						System.out.println("e."+i);
						tong=tong+i;
						dem++;
						i++;
						} 
					System.out.println("value dem="+dem);
					System.out.println("Value N = "+N);
					System.out.println("Tong N so nguyen to dau tien la tong="+tong);
					if(dem==N) break;
			}
	}
}
