public class Teacher {
    String name;
    String mpno;
    String department;

    Teacher(String name, String department, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.department = department;
    }
    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("MPNO : " + this.mpno);
        System.out.println("Department : " + this.department);
    }
}
