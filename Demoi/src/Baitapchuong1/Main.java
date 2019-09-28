package Baitapchuong1;

public class Main {
	public static void main(String[] args) {
		baitap1 b1=new baitap1(); //Viết chương trình nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.
		baitap2 b2=new baitap2(); //Viết chương trình nhập chiều dài, chiều rộng hình chữ nhật, xuất chu vi, diện tích của hình chữ nhật đó.
		baitap3 b3=new baitap3(); //Viết chương trình nhập bán kính hình tròn, xuất chu vi, diện tích của hình tròn đó.
		baitap4 b4=new baitap4(); //Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số chẵn/lẻ
		baitap5 b5=new baitap5(); //Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số âm/zero/dương
		baitap6 b6=new baitap6(); //Viết chương trình nhập số tự nhiên N, kiểm tra và xuất kết quả N là số nguyên tố hay không.
		baitap7 b7=new baitap7(); //Viết chương trình nhập số tự nhiên N, xuất kết quả :
				//a. Các số tự nhiên &lt;=N và tổng của chúng
				//b. Các số tự nhiên chẵn &lt;=N và tổng của chúng
				//c. Các số tự nhiên lẻ &lt;=N và tổng của chúng
				//d. Các số tự nhiên là số nguyên tố &lt;=N và tổng của chúng
				//e. N số nguyên tố đầu tiên
		baitap8 b8=new baitap8();
		b1.nhapSonguyen();
		b1.xuat();
		b1.tong2so();
		b1.hieu2so();
		b1.tich2so();
		b1.Thuong2so();
		b2.nhapHCN();
		b2.xuatHCN();
		b2.chuviHCN();
		b2.dientichHCN();
		b3.nhapbankinh();
		b3.xuatbankinh();
		b3.chuviHT();
		b3.dientichHT();
		b4.nhapN();
		b4.kiemtra();
		b5.nhapN();
		b5.kiemtra();
		b6.nhapN();
		b6.KTSNT();
		b7.nhapN();
		b7.tongN();
		b7.tongchan();
		b7.tongle();
		b7.tongSNT();
		b7.nSNT();
		b8.nhapMang();
		b8.xuatMang();
		b8.tongMang();
		b8.tongChan();
		b8.tongLe();
		b8.tongSNT();
	}
}
