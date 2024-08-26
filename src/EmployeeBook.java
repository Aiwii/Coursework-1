public class EmployeeBook {
    private final Employee[] employees;
    private int currentIndex;

    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
        this.currentIndex = 0;
    }

    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length) {
            employees[currentIndex++] = employee;
        }
    }

    public void indexAllSalaries(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public Employee findMinSalaryInDepartment(int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateTotalSalaryInDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        double totalSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? totalSalary / count : 0;
    }

    public void indexSalariesInDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double salary) {
        System.out.println("Сотрудники с зарплатой меньше " + salary + ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterThanOrEqual(double salary) {
        System.out.println("Сотрудники с зарплатой больше или равно " + salary + ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}