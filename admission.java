class student {
    public String name;
    public int percentage;
    student(String name, int percentage){
        this.name = name;
        this.percentage = percentage;
    }
    
}
class ugstudent extends student{
  ugstudent(String name, int percentage){
  super(name,percentage);
  }

  void geteligibilty(){
    if (percentage>=60){
        System.out.println(name+" is eligible for Ug admission");
    }else{
        System.out.println(name+" is not  eligible for Ug admission");
    }
  }
}

class pgstudent extends student{
    pgstudent(String name, int percentage){
    super(name,percentage);
    }  
    void geteligibilty(){
      if (percentage>=70){
          System.out.println(name+" is eligible for pg admission");
      }else{
          System.out.println(name+" is not  eligible for pg admission");
      
      }
    }
}

public class admission{
    public static void main(String[] args){
        ugstudent student1 = new ugstudent("ram",40);
        student1.geteligibilty();
        pgstudent student2 =new pgstudent("kumar",90);
        student2.geteligibilty();
    }
}