public class Employees {
    private String emp_Fname = "";
    private String emp_Lname = "";
    private int emp_num = 0;
    private int emp_shft = 0;

    public Employees(String emp_Fname, String emp_Lname, int emp_num, int emp_shft) {
        this.emp_Fname = emp_Fname;
        this.emp_Lname = emp_Lname;
        this.emp_num = emp_num;
        this.emp_shft = emp_shft;
    }

    public String getEmp_Fname() {
        return emp_Fname;
    }

    public void setEmp_Fname(String emp_Fname) {
        this.emp_Fname = emp_Fname;
    }

    public String getEmp_Lname() {
        return emp_Lname;
    }

    public void setEmp_Lname(String emp_Lname) {
        this.emp_Lname = emp_Lname;
    }

    public int getEmp_num() {
        return emp_num;
    }

    public void setEmp_num(int emp_num) {
        this.emp_num = emp_num;
    }

    public int getEmp_shft() {
        return emp_shft;
    }

    public void setEmp_shft(int emp_shft) {
        this.emp_shft = emp_shft;
    }


    public void empDisplay() {

        System.out.println("Employee Name: " + getEmp_Fname() + " " + getEmp_Lname());
//        System.out.printf("\n %-15s","Employee Last Name: " + getEmp_Lname());
//        System.out.println("Employee Shift : " + getEmp_shft());
        System.out.println("Employee Number: " + getEmp_num());
        System.out.println("Employee Shift : " + getEmp_shft() + "\n");
    }
}
