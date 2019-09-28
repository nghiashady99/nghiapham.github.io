package Baitapchuong1;
import java.util.Scanner;
public class baitap8 {
	public int n;
	public int a[]=new int[n];
	
	public void nhapMang(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so phan tu cua mang");
        n = sc.nextInt();
        a= new int[n];
       
        for(int i=0; i< a.length;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            a[i]= sc.nextInt();     
        }
	} 
		
	public void xuatMang(){
	System.out.println("Mang ban dau la :");
		for (int i=0;i< a.length;i++){
        System.out.println(a[i]+"\t");
		}
    System.out.println();
	}	
	public void tongMang() {
		int tong=0;
		for(int i=0;i<n;i++) {
			tong=tong+a[i];
		}
		System.out.println("Tong cua mang = "+tong);
	}
	public void tongChan() {
		int tongchan=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				tongchan=tongchan+a[i];
			}
		}
		System.out.println("Tong cac phan tu chan :tong="+tongchan);
	}
	public void tongLe() {
	int tongle=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0)
				tongle=tongle+a[i];
		}
		System.out.println("Tong cac phan tu le  :tong="+tongle);
	}
	public int SNT(int n) {
		int dem=0;
		for(int i=1;i<=n;i++) {
			if(n%i==2)
				dem++;
		}
		if(dem==2) return 1;
		else return 0;
	}
	
	public int tongSNT() {
		int tongsnt=0;
		for(int i=1;i<n;i++) {
			if(SNT(i)==1) {
				System.out.println(" "+a[i]);
				tongsnt=tongsnt+a[i];
			}
		}
		System.out.println("Tong cac so nguyen to cua mang : tong="+tongsnt);
		return tongsnt;
	}

	
}
