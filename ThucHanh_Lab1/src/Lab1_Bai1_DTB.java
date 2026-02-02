import java.util.Scanner;

public class Lab1_Bai1_DTB {

	public Lab1_Bai1_DTB() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập họ và tên sinh viên: ");
	        String hoTen = sc.nextLine();

	        System.out.print("Nhập điểm trung bình: ");
	        double dtb = sc.nextDouble();

	        System.out.println("Họ và tên: " + hoTen);
	        System.out.println("Điểm trung bình: " + dtb);
	}

}
