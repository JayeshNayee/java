class Employee
{
    int emp_id ;
    String name;
    String company;

    Employee( int emp_id , String name, String company){

    }
    void display()
    {
        System.out.println(emp_id + " " + name +" " + company);
    }
    public static void main(String[] args) {
        
        Employee E1 = new Employee(101,"jay","codeBLocks");
        E1.display();
    
    }

}