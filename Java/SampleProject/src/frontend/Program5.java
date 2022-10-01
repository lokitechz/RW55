package frontend;

import backend.Exercise5;
import entity.Staff;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// Tạo biến để nhập vào dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		// Tạo biến lưu trữ trạng thái của chương trình
		boolean exit = false;
		do {
			Exercise5.showMenu();
			// Lưu chữ sự lựa chọn
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				// Thêm mới nhân viên
				case 1:
					Exercise5.addStaff();
					break;

				// Tìm kiếm theo tên
				case 2:
					Staff staff = Exercise5.searchByName();
					// Dựa vào dữ liệu trả về
					if (staff != null) {
						System.out.println(staff);
					} else {
						System.out.println("Không tìm thấy thông tin nhân viên với tên này");
					}
					break;

				// Hiển thị danh sách nhân viên
				case 3:
					Exercise5.showListStaff();
					break;

				// Xoá theo tên
				case 4:
					Exercise5.deleteByName();
					break;

				case 5:
					// Gán trạng thái của trương chình là thoát
					exit = true;
					break;

				default:
					System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
					break;
			}
		} while (!exit);
	}

}