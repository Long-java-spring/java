public class VariablesInJava {

    /**
     * declare data_type variable_name = value;
     */
    public static void main(String[] args) {
        staticVariables();
        instanceVariable();
        localVariable();
    }

    /**
     * static variables are also known as class variable because they are associated with the class and common for all the instances of class
     */
    public static String myClassVar = "class or static variable";
    public static void staticVariables() {
        VariablesInJava obj = new VariablesInJava();
        VariablesInJava obj2 = new VariablesInJava();
        VariablesInJava obj3 = new VariablesInJava();

        //All three will display "class or static variable"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //changing the value of static variable using obj2
        obj2.myClassVar = "Changed Text";

        //All three will display "Changed Text"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }

    /**
     * Instance variable
     * Each instance(objects) of class has its own copy of instance variable.
     */
    String myInstanceVar="instance variable";
    public static void instanceVariable(){
        VariablesInJava obj = new VariablesInJava();
        VariablesInJava obj2 = new VariablesInJava();
        VariablesInJava obj3 = new VariablesInJava();

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        obj2.myInstanceVar = "Changed Text";

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }

    /**
     * Local Variable
     * These variables are declared inside method of the class.
     * Their scope is limited to the method which means that You can’t change their values and access them outside of the method.
     */
    public String myVar="instance variable";
    public void myMethod() {
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void localVariable(){
        // Creating object
        VariablesInJava obj = new VariablesInJava();
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}
