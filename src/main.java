public class main {
    public static void main(String[] args){

        Employees emp_1 = new Employees("Sean", "Klechak", 101, 1);
        Employees emp_2 = new Employees("Dave", "Davido", 102, 2);
        Employees emp_3 = new Employees("Buddy", "Dog", 103, 3);

        System.out.println("------ Delta Tech - Employee List -------\n");

        emp_1.empDisplay();
        emp_2.empDisplay();
        emp_3.empDisplay();


    }
}
