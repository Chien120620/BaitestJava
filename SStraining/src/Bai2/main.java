package Bai2;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		Kythuat kythuat = new Kythuat("nv01");
        System.out.print("Nhap ten:");
        kythuat.setHoten(in.nextLine());
        System.out.print("Nhap ngay sinh");
        kythuat.setNamsinh(in.nextLine());
        System.out.print("Nhap dia chi:");
        kythuat.setDiachi(in.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kythuat.setChuyennganh(in.nextLine());
        System.out.println(kythuat.toString());
	}
}
