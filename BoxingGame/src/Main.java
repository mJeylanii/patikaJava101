public class Main {

    public static void main(String[] args) {
        System.out.println("<==================== This is a boxing game! ====================>");
        Fighter marc = new Fighter("Marco Polo", 10, 100, 90, 0);
        Fighter alex = new Fighter("Alexandro", 10, 100, 100, 0);
        Ring roma = new Ring(marc, alex, 90, 100);

        roma.run();
    }
}
