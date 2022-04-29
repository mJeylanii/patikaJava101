public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String steID;
    String classes;
    double gpa;
    boolean isPass;

    Student(String name, String steID, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.steID = steID;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.gpa = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Note\t : " + this.c1.note);
        System.out.println(this.c2.name + " Note\t : " + this.c2.note);
        System.out.println(this.c3.name + " Note\t : " + this.c3.note);
        System.out.printf("GPA : %.2f ", this.gpa);
    }

    void notGir(int final1, int vize1, int final2, int vize2, int final3, int vize3 ) {
        System.out.println(c1.name + " dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.");
        c1.note = (int) (final1 * 0.8 + vize1 * 0.2);
        System.out.println("Ders notunuz :  " + c1.note);
        System.out.println(c2.name + " dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.");
        c2.note = (int) (final2 * 0.8 + vize2 * 0.2);
        System.out.println("Ders notunuz : " + c2.note );
        System.out.println(c3.name + " dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.");
        c3.note = (int) (final3 * 0.8 + vize3 * 0.2);
        System.out.println("Ders notunuz : " + c3.note );
    }

    void isPass() {
        this.gpa = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.gpa >= 55) {
            System.out.println("Student passes");
        } else {
            System.out.println("Student fails");
        }
        printNote();
    }

}
