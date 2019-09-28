/*package Baitap8;
import java.util.Scanner;
public class Baitap8 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao n phan tu : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Phan tu thu "+i+": ");
			a[i]=sc.nextInt();   
		}
		System.out.println("Mang ban dau :");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"\t");
		}
		int tong=0;
		for(int i=0;i<n;i++) {
			tong=tong+a[i];
		}
		System.out.println("Tong cua mang = "+tong);
		int tongchan=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				tongchan=tongchan+a[i];
			}
		}
		System.out.println("Tong cac phan tu chan :tong="+tongchan);
		int tongle=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0)
				tongle=tongle+a[i];
		}
		System.out.println("Tong cac phan tu le  :tong="+tongle);
		int tongsnt=0;
		for(int i=0;i<a.length;i++) {
			if(SNT(a[i])==1) {
				tongsnt=tongsnt+a[i];
			}
			System.out.println("Tong cac so nguyen to : tong="+tongsnt);
		}
		
	}
	public static int SNT(int a[]) {
		int dem=0;
		for(int i=1;i<=n;i++) {
			if(n%i==2)
				dem++;
		}
		if(dem==2) return 1;
		else return 0;
	}
}*/
