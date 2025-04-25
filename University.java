public class University{
     String universityName = "Amrita";
class Department{
     String departmentName = "CSE" ;
     int departmentCode = 101;

    void departmentDetails(){
        System.out.println("Department: " + departmentName + ", Departmentcode:" + departmentCode );
    }
}

class Students{
     String studentName = "M.SRIMANTH";
     int studentRollNo = 24228;
    
     void studentDetails() {
        System.out.println("Student: " + studentName + ", Roll No: " + studentRollNo);
    }
}
public static void main(String[] args) {
        University uni = new University();
        System.out.println(uni.universityName);
        University.Department dept= uni.new Department();
        dept.departmentDetails();
       University.Students student1 = uni.new Students();
       student1.studentDetails();
    }
}