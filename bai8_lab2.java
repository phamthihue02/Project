import java.util.Scanner;
public class bai8_lab2 {
	public static void main(String[] args) {
		int n,tong=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Moi nhap cac so nguyen: ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			tong += arr[i];
		}
		System.out.println("Trung binh cong la: "+ (float)(tong/n));
		
	}

}
