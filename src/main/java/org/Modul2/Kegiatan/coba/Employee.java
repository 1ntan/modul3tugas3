package main.java.org.Modul2.Kegiatan.coba;//package main.java.org.Modul2.Kegiatan;
//
//public class Employee {
//    public String name;
//    public int id;
//    public double salary;
//    public String department;
//    public static final double BONUS_RATE = 0.1;
//
//    // method setter (memasukkan sebuah nilai/values ke dalam suatu variabel) (1)
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public Employee(String name, int id, double salary, String department) {
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//        this.department = department;
//    }
//
//    public void printDetails() {
//        System.out.println("Employee ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Salary: " + salary);
//        System.out.println("Department: " + department);
//    }
//
//    // inline variable pada variabel bonus (3)
//    public void applyBonus() {
//        salary += calculateBonus();
//        System.out.println("Bonus applied! New salary: " + salary);
//    }
//
//    //extract methode logika perhitungan bonus (2)
//    private double calculateBonus() {
//        double bonus = salary * BONUS_RATE;
//        return bonus;
//    }
//
//    public void updateDepartment(String newDepartment) {
//        department = newDepartment;
//        System.out.println("Department update to: " + department);
//    }
//}
//
//class Project {
//    public String projectName;
//    public String projectDeadLine;
//    public Employee projectLeader;
//    public double budget;
//
//    public Project(String projectName, String projectDeadLine, Employee projectLeader, double budget) {
//        this.projectName = projectName;
//        this.projectDeadLine = projectDeadLine;
//        this.projectLeader = projectLeader;
//        this.budget = budget;
//    }
//
//    public void printProjectDetails() {
//        System.out.println("Project Name: " + projectName);
//        System.out.println("Project Deadline: " + projectDeadLine);
//        System.out.println("Budget: " + budget);
//        projectLeader.printDetails();
//    }
//
//    public void updateBudget(double newBudget) {
//        budget = newBudget;
//        System.out.println("Budget update to: " + budget);
//    }
//}
//
//class Client{
//    public String clientName;
//    public String clientEmail;
//    public Project project;
//
//    public Client(String clientName, String clientEmail, Project project){
//        this.clientName = clientName;
//        this.clientEmail = clientEmail;
//        this.project = project;
//    }
//
//    public void printClientDetails(){
//        System.out.println("CLient Name: " + clientName);
//        System.out.println("Client Email: " + clientEmail);
//        project.printProjectDetails();
//    }
//}
//
