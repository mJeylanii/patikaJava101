public class Main {

    public static void main(String[] args) {
        Teacher emre = new Teacher("Emre Man", "TRH", "9999545645");
        Teacher cabir= new Teacher("Cabir Khan", "FZK", "99993333");
        Teacher joe = new Teacher("Joe Dough", "MAT", "999931111");
        Course tarih = new Course("Tarih", "101", "TRH", emre);
        Course fizik= new Course("Fizik", "110", "FZK", cabir);
        Course mat = new Course("Mat", "129", "MAT", joe);
        Student st1 = new Student("Frank Marc", "994443333", "4", tarih, fizik, mat);
        st1.notGir(56, 56, 99, 44, 11, 65);

        st1.isPass();
    }
}
