package ru.geekbrains;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String _fullName, String _position, String _email, String _phone, int _salary, int _age) {
        this.fullName = _fullName;
        this.position = _position;
        this.email = _email;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String  _email) {
        this.email = _email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String  _phone) {
        this.phone = _phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int _salary) {
        if (_salary >= 0) this.salary = _salary;
        else System.out.println("Введена некорректная зарплата");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        if (_age >= 0) this.age = _age;
        else System.out.println("Введен некорректный возраст");
    }

    /**
     * Вывод информации о сотруднике
     */
    public void printEmployeeInfo() {
        System.out.println(fullName);
        System.out.println("     [ дожность " + position + " | email " + email + " | телефон " + phone + " | зарплата " + salary + " | возраст " + age + "]");
    }
}
