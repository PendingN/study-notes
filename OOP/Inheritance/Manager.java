public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager() {
        super();
        this.position = "Head of Administrative Office";
        this.department = "Administration";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.department = "Administration";
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        double basicSalary = 1150;
        return basicSalary * salaryCoefficientPosition;
    }

    @Override
    public double getSalary() {
        double basicSalary = 1150;
        double emulationCoefficient = 1.0;
        double salary = basicSalary
                + basicSalary * (salaryCoefficientPosition + emulationCoefficient)
                + getSenioritySalary()
                + bonusByPosition();
        return salary;
    }

    @Override
    public String toString() {
        return "Manager Information:" +
                "\nPosition: " + position +
                "\nDepartment: " + department +
                "\nSalary Coefficient by Position: " + salaryCoefficientPosition +
                "\nEmulation Grade: " + considerEmulation() +
                "\nPosition Bonus: " + bonusByPosition() +
                "\nTotal Salary: " + getSalary() +
                "\n--------------------------------------";
    }
}
