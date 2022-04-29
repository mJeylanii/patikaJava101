public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.department.equals(this.prefix)) {
            this.teacher = teacher;
           printTeacher();
        }
        else  {
            System.out.println("ERROR 404");
        }
    }

    void printTeacher() {
        System.out.println("New teacher added successfully");
        teacher.print();
    }
}
