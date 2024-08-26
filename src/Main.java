public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 55000));
        employeeBook.addEmployee(new Employee("Петрова Мария Сергеевна", 2, 66000));
        employeeBook.addEmployee(new Employee("Сидоров Алексей Викторович", 3, 47000));
        employeeBook.addEmployee(new Employee("Смирнова Анна Павловна", 4, 75000));
        employeeBook.addEmployee(new Employee("Кузнецов Дмитрий Александрович", 5, 80000));
        employeeBook.addEmployee(new Employee("Соколова Ольга Николаевна", 1, 58000));
        employeeBook.addEmployee(new Employee("Попов Андрей Михайлович", 2, 45000));
        employeeBook.addEmployee(new Employee("Васильева Екатерина Ивановна", 3, 49000));
        employeeBook.addEmployee(new Employee("Романов Максим Сергеевич", 4, 79000));
        employeeBook.addEmployee(new Employee("Лебедева Татьяна Владимировна", 5, 85000));

        employeeBook.printAllEmployees();

        employeeBook.indexAllSalaries(10);
        System.out.println("После индексации зарплат на 10%:");
        employeeBook.printAllEmployees();

        int department = 1;
        System.out.println("Сумма затрат на зарплату в отделе " + department + ": " + employeeBook.calculateTotalSalaryInDepartment(department));

        System.out.println("Средняя зарплата в отделе " + department + ": " + employeeBook.calculateAverageSalaryInDepartment(department));

        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + employeeBook.findMinSalaryInDepartment(department));

        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + employeeBook.findMaxSalaryInDepartment(department));

        employeeBook.indexSalariesInDepartment(department, 5);
        System.out.println("После индексации зарплат в отделе " + department + " на 5%:");
        employeeBook.printEmployeesInDepartment(department);

        employeeBook.printEmployeesWithSalaryLessThan(60000);

        employeeBook.printEmployeesWithSalaryGreaterThanOrEqual(60000);
    }
}