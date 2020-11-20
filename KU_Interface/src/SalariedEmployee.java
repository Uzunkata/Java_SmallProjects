public class SalariedEmployee extends Employee{

    private double weekLySalary;

    public SalariedEmployee(String first, String last,String ssn, double salary){
        super(first, last, ssn);
        setWeekLySalary(salary);
    }

    public void setWeekLySalary(double salary){
        weekLySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary(){
        return weekLySalary;
    }

    public double getPaymentAmount(){
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary() );
    }
}
