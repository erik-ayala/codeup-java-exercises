package CompanyTwo;


//abstract class using abstract keyword
// abstact classes cannot be instantiated
// intantiated = to create an instance or an object of that class
// can create a subclass from the abstract and then instantiate the subclass

abstract class EmployeeTwo {
    // define properties
    private String salary;
    private String name;

    public String doWork() {
        return "I am Working.";
    };
}
