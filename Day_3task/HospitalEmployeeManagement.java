
abstract class Employee {

    private int id;
    private String name;
    private double basicSalary;

    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.basicSalary = 0;
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}


class Doctor extends Employee {

    private double consultationAllowance;

    Doctor() {
        super();
        consultationAllowance = 0;
    }

    Doctor(int id, String name, double basicSalary,
           double consultationAllowance) {
        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    public double getConsultationAllowance() {
        return consultationAllowance;
    }

    public void setConsultationAllowance(double consultationAllowance) {
        this.consultationAllowance = consultationAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Doctor -----");
        super.displayDetails();
        System.out.println();
    }
}

class Nurse extends Employee {

    private double nightShiftAllowance;

    Nurse() {
        super();
        nightShiftAllowance = 0;
    }

    Nurse(int id, String name, double basicSalary,
          double nightShiftAllowance) {
        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    public double getNightShiftAllowance() {
        return nightShiftAllowance;
    }

    public void setNightShiftAllowance(double nightShiftAllowance) {
        this.nightShiftAllowance = nightShiftAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Nurse -----");
        super.displayDetails();
        System.out.println();
    }
}


class LabTechnician extends Employee {

    private double labAllowance;

    LabTechnician() {
        super();
        labAllowance = 0;
    }

    LabTechnician(int id, String name, double basicSalary,
                  double labAllowance) {
        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    public double getLabAllowance() {
        return labAllowance;
    }

    public void setLabAllowance(double labAllowance) {
        this.labAllowance = labAllowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Lab Technician -----");
        super.displayDetails();
        System.out.println();
    }
}


public class HospitalEmployeeManagement {

    public static Employee findHighestPaid(Employee[] employees) {

        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {

            if (employees[i].calculateSalary() >
                highest.calculateSalary()) {

                highest = employees[i];
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Doctor(
                101,
                "Dr. Arun",
                80000,
                20000
        );

        employees[1] = new Nurse(
                102,
                "Priya",
                40000,
                8000
        );

        employees[2] = new LabTechnician(
                103,
                "Karthik",
                35000,
                7000
        );

        for (Employee employee : employees) {
            employee.displayDetails();
        }

        Employee highestPaid = findHighestPaid(employees);

        System.out.println("===== Highest Paid Employee =====");
        System.out.println("Name: " + highestPaid.getName());
        System.out.println("Final Salary: " +
                           highestPaid.calculateSalary());
    }
}