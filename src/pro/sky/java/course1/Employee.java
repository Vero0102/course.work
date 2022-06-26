package pro.sky.java.course1;

public class Employee {

    private static int counter = 1;

    private final String name;
    private final String surname;
    private final String patronymicName;
    private double salary;
    private int department;
    private final int id;

    public Employee(String name, String surname, String patronymicName, double salary, int department) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ". " +
                "ФИО: " + surname + " " +
                name + " " +
                patronymicName + ". " +
                "Зарплата: " + salary + ". " +
                "Отдел: " + department +
                ".";
    }
}

