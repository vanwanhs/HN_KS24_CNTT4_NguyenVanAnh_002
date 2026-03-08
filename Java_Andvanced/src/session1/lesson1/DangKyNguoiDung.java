package session1.lesson1;
import java.util.Scanner;

public class DangKyNguoiDung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập năm sinh của bạn: ");
            String input = sc.nextLine();

            int namSinh = Integer.parseInt(input);

            int namHienTai = 2026;
            int tuoi = namHienTai - namSinh;

            System.out.println("Tuổi của bạn là: " + tuoi);
        }
        catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập số cho năm sinh. Ví dụ: 2003");
        }
        finally {
            sc.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}
