
package rikkei.academy;

//Tạo lớp TestStudent
public class Main {
    public static void main(String[] args) {
        // tạo đối tượng
        Student st1 = new Student();

        //In ra đối tượng student 1 dể xem tên và lớp của đối tượng ban đầu
        System.out.println("Student 1 trước khi gọi phương thức ======== " + st1);

        // Truy cập đến các phương thức setName(name: String) và setClasses(classes: String) để thay đổi lại tên và lớp
        st1.setName("Nguyen Thanh Long");
        st1.setClasses("Microsoft");

        //In ra đối tượng student 1 dể xem tên và lớp của đối tượng sau khi gọi phg thức setName và setClasses
        System.out.println("Student 1 sau khi gọi phương thức ======== " + st1);

    }
}