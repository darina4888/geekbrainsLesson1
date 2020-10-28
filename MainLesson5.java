package ru.geekbrains;

public class MainLesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich","architect","ivanov@gmail.com","89456789012",33000,35);
        employees[1] = new Employee("Petrov Petr Petrovich","engineer","petrov@gmail.com","89456789013",45000,48);
        employees[2] = new Employee("Sidorova Natalya Alexandrovna","accountant","sidorova@gmail.com","89456789014",30000,37);
        employees[3] = new Employee("Alyoshina Zinaida Petrovna","treasurer","alyoshina@gmail.com","89456789015",36000,28);
        employees[4] = new Employee("Horkin Denis Ivanovich","manager","horkin@gmail.com","89456789016",43000,45);

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40)
                employees[i].printEmployeeInfo();
        }
    }
}
