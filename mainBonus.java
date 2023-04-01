class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.05;// 5%
    }
}

class salesDepartment extends Employee {

    public salesDepartment(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;// 10%
    }

}

class marketDepartment extends Employee {

    public marketDepartment(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.07;// 7%
    }
}

class mainBonus {
    public static void main(String[] args) {
        Employee e1 = new Employee("jhon", 40000.0);// parent clsss
        System.out.println(e1.name + " bonus is $ " + e1.calculateBonus());
        salesDepartment e2 = new salesDepartment("jaya", 67473.8);// child1
        System.out.println(e2.name + " bonus is $ " + e2.calculateBonus());
        marketDepartment e3 = new marketDepartment("sony", 64673.0);// child2
        System.out.println(e3.name + " bonus is $ " + e3.calculateBonus());
    }
}