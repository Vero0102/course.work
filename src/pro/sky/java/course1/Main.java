package pro.sky.java.course1;

public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[0] = new Employee("Marina", "Romanova", "Aleksandrovna", 75002.1, 1);
            EMPLOYEES[1] = new Employee("Anton", "Pavlov", "Ivanovich", 85562.5, 1);
            EMPLOYEES[2] = new Employee("Roman", "Ivanov", "Petrovich", 63762.25, 2);
            EMPLOYEES[3] = new Employee("Tigran", "Konev", "Vladimirovich", 69562.55, 2);
            EMPLOYEES[4] = new Employee("Lev", "Arbuzov", "Vladimirovich", 55562.5, 3);
            EMPLOYEES[5] = new Employee("Oleg", "Ruben", "Vladimirovich", 57562, 3);
            EMPLOYEES[6] = new Employee("Larisa", "Ivanova", "Ivanovna", 53562.5, 4);
            EMPLOYEES[7] = new Employee("Andzhelika", "Mordashova", "Vladimirovna", 54562.5, 4);
            EMPLOYEES[8] = new Employee("Olga", "Vinogradova", "Petrovna", 45475.75, 5);
            EMPLOYEES[9] = new Employee("Nadezhda", "Volkova", "Andreevna", 47671.65, 5);
        }
        listOfAllEmployees();
        System.out.println();
        double totalMonthSalaries = totalMonthSalaries();
        System.out.println("Затраты компании на зарплату сотрудников за месяц: " + totalMonthSalaries);
        Employee employeeWithMinimalSalary = minSalaryEmployee();
        System.out.println("Сотрудник с минимальной месячной зарплатой: " + employeeWithMinimalSalary);
        Employee employeeWithMaximalSalary = maxSalaryEmployee();
        System.out.println("Сотрудник с максимальной месячной зарплатой: " + employeeWithMaximalSalary);
        double averageMonthSalaryOfAllEmployees = averageMonthSalaryOfAllEmployees();
        System.out.printf("Средняя месячная зарплата всех сотрудников: %.2f", averageMonthSalaryOfAllEmployees);
        System.out.println();
        System.out.println();
        listFullNamesOfAllEmployees();
    }

    private static void listOfAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static double totalMonthSalaries() {
        double sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalaryEmployee() {
        double minSalary = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getSalary() < minSalary) {
                minSalary = EMPLOYEES[i].getSalary();
                index = i;
            }
        }
        if(index != -1){
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }

    private static Employee maxSalaryEmployee() {
        double maxSalary = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getSalary() > maxSalary) {
                maxSalary = EMPLOYEES[i].getSalary();
                index = i;
            }
        }
        if(index != -1){
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }
    private static double averageMonthSalaryOfAllEmployees() {
        return totalMonthSalaries() / EMPLOYEES.length;
    }
    private static void listFullNamesOfAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymicName());
        }
    }
}

