package baitap.ra.business.implement;

import baitap.ra.business.config.InputMethods;
import baitap.ra.business.design.CRUD;
import baitap.ra.business.entity.Student;

public class StudentImplement implements CRUD {
    private static Student[] students = new Student[100];
    private int size = 0;

    @Override
    public void create() {
        if (size == 100) {
            System.err.println("mảng đầy");
        } else {
            // logic thêm mới
            // ta 1 đối tượng student
            Student newStudent = new Student();
            newStudent.inputData();
            // thêm vào mang
            students[size] = newStudent;
            size++; // tăng số lương
        }
    }

    @Override
    public void display() {
        if (size == 0) {
            System.err.println("mảng ko co ptu");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public void edit() {
        if (size == 0) {
            System.err.println("mảng ko co ptu");
            return;
        }

        System.out.println("Nhập mã sinh viên cần sửa");
        int editStudentId = InputMethods.getInteger();
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId() == editStudentId) {
                check = true;
                // thông tin trước khi sửa
                System.out.println("Thông tin sinh viên có mã " + editStudentId);
                System.out.println(students[i]);
                // tiến hành sửa
                System.out.println("mời bạn nhập sửa");
                students[i].inputData();

                System.out.println("Thông tin sinh viên có mã " + editStudentId + " đã chỉnh sửa");
                System.out.println(students[i]);
            }
        }
        if (!check) {
            System.out.println("không tìm thấy sinh viên cần sửa có mã " + editStudentId);
        }
    }


    @Override
    public void delete() {
        if (size == 0) {
            System.err.println("mảng ko co ptu");
            return;
        }
        System.out.println("mời bạn nhập id cần xóa");
        int deleteStudentId = InputMethods.getInteger();
        boolean check = false;
        for (int i = 0; i < size; i++) {
            check = true;
            if (students[i].getStudentId() == deleteStudentId) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                size--;
                break;
            }
        }
        if (!check) {
            System.out.println("không có id cần xóa");
        }
    }
}
