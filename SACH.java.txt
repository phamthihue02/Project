package Lab3;
import java.util.Scanner;
public class SACH
{
        private String maSach;
        private String tenSach;
        private String tenTacGia;
        private int soTrang;
        private String loaiSach;
        private String nhaXuatBan;
        private int soTap;
        private double gia;
    
        public void nhapSach() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Nhap ma sach: ");
            maSach = scanner.nextLine();
    
            System.out.print("Nhap ten sach: ");
            tenSach = scanner.nextLine();
    
            System.out.print("Nhap ten tac gia: ");
            tenTacGia = scanner.nextLine();
    
            System.out.print("Nhap so trang: ");
            soTrang = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Nhap loai sach: ");
            loaiSach = scanner.nextLine();
    
            System.out.print("Nhap nha xuat ban: ");
            nhaXuatBan = scanner.nextLine();
    
            System.out.print("Nhap so tap: ");
            soTap = scanner.nextInt();
    
            System.out.print("Nhap gia: ");
            gia = scanner.nextDouble();
        }
    
        public void inSach() {
            System.out.println("Ma sach: " + maSach);
            System.out.println("Ten sach: " + tenSach);
            System.out.println("Ten tac gia: " + tenTacGia);
            System.out.println("So trang: " + soTrang);
            System.out.println("Loai sach: " + loaiSach);
            System.out.println("Nha xuat ban: " + nhaXuatBan);
            System.out.println("So tap: " + soTap);
            System.out.println("Gia: " + gia);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Nhap so luong sach: ");
            int n = scanner.nextInt();
    
            SACH[] sachList = new SACH[n];
    
            for (int i = 0; i < n; i++) {
                sachList[i] = new SACH();
                System.out.println("Nhap thong tin sach thu " + (i + 1) + ": ");
                sachList[i].nhapSach();
            }
    
            System.out.println("Danh sach cac cuon sach: ");
            for (int i = 0; i < n; i++) {
                System.out.println("Sach thu " + (i + 1) + ": ");
                sachList[i].inSach();
                System.out.println();
            }
        }
}
    