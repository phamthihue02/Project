import java.util.Scanner;
public class bai6_lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.print("Nhap so nguyen duong: ");
			a =sc.nextInt();
		}while(a<0);
		long gt=1;
		for(int i=1;i<=a;i++){
            gt *= i;
        }
		System.out.println("Giai thua cua "+ a+" la "+gt);}

}
