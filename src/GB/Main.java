package GB;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Владимир Владимирович Путин", "Президент", "kgb@kgb.ru", "11111111111", 773400, 67);
        Employee employee2 = new Employee("Алексей Анатольевич Навальный", "Политик", "shtab@navalny.com", "88003330295", 439417, 43);
        Employee employee3 = new Employee("Юрий Александрович Дудь", "Журналист-блогер", "yurij-dud.ru", "88002000700", 8386045, 33);
        Employee employee4 = new Employee("Сергей Семенович Собянин", "Мэр", "sobyanin.ru", "7777777", 773400, 61);
        Employee employee5 = new Employee("Иванов Иван Иванович", "Тракторист", "отсутствует", "Nokia3310", 43417, 38);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
        employee4.displayInfo();
        employee5.displayInfo();

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        System.out.println("Сотрудники старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40)
                System.out.println(employee.getFullName());
        }

    }
}
