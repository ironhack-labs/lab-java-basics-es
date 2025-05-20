import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Empleado #" + (i + 1));

            System.out.print("¿Es un Intern? (true/false): ");
            boolean isIntern = Boolean.parseBoolean(scanner.nextLine().trim());

            System.out.print("Nombre: ");
            String name = scanner.nextLine();

            System.out.print("Departamento: ");
            String department = scanner.nextLine();

            System.out.print("Salario: ");
            double salary = Double.parseDouble(scanner.nextLine());

            if (isIntern) {
                employees[i] = new intern(name, department, salary);
            } else {
                employees[i] = new Employee(name, department, salary);
            }

            System.out.println();
        }

        System.out.println("Lista de empleados:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        scanner.close();
    }
}