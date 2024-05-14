public class TestProgram {
    public static void main(String[] args) {
        Person person = new Person("cumar cabdi", "123 Waddada Koowaad", "555-555-5555", "omar@example.com");
        Student student = new Student("najmo ali", "124 Waddada Labaad", "555-555-5556", "najmo@example.com", Student.FRESHMAN);
        MyDate dateHired = new MyDate("2024-01-01"); // Assuming this is correctly implemented
        Employee employee = new Employee("ayub said", "125 Waddada Saddexaad", "555-555-5557", "osman@example.com", "Xafiiska 2aad", 1000, dateHired);
        Faculty faculty = new Faculty("hafsa   ", "9-5", "555-555-555", "Fatima@gmai.com","Xafiiska 4aad", 1355, dateHired, "100","1");
        Staff staff = new Staff("nuuro    ", "Secretary", "555-555-555", "Aisha@gmail.com","Xafiisla 3aad", 1567, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}
