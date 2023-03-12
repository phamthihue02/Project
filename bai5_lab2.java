import java.util.Scanner;
public class bai5_lab2 {
	public static void main(String[] args) {
		int n,tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Co bao nhieu so nguyen: ");
		n = sc.nextInt();
		System.out.print("Nhap cac so nguyen: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			tong += arr[i];
			if(tong>100) { System.out.println("Tong: "+ tong);
			break;}
		}
		if(tong<=100) System.out.println("Tong: "+ tong);
		}
	}
