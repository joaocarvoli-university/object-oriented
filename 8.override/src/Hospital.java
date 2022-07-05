public class Hospital {
    public static void main(String[] args) {
        Doctor doctor01 = new Doctor("Amanda", "Miramar 1812", 26, "123456789", "F", 12831, 34000, "Child");
        System.out.println(doctor01.printValues());

        Patiant person01 = new Patiant("João", "Professor 1526", 19, "987654321","M", "stomach ache", "Buscopam");
        person01.setPain();
        System.out.println(person01.printValues());
    }
}
