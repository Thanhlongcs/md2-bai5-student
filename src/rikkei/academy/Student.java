package rikkei.academy;
public class Student {
    //Khởi tạo hai thuộc tính name và class có access modifier là private
    // name (string) có giá trị mặc định là "John"
    private String name = "John";
    // classes (String) có giá trị mặc định là "C02"
    private String classes = "C02";

    //Viết hàm tạo (constructor) không có tham số.
    public Student() {
    }

    //Viết 2 phương thức có access modifier là public: setName và setClasses.
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setClasses(String classes){
//        this.classes = classes;
//    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getClasses() {
        return classes;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

    //Gọi method ToString để in ra thông tin đối tượng
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}