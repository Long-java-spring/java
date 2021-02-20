public class IfElseStatement {

    public static void main(String[] args) {
        ifStatementExample();
        System.out.println("===================");
        nestedIfExample();
        System.out.println("===================");
        ifElseExample();
        System.out.println("===================");
        ifElseIfExample();
    }

    /**
     * If statement
     * If statement consists a condition, followed by statement or a set of statements as shown below:
     * if(condition){
     *   Statement(s);
     * }
     */
    static void ifStatementExample() {
        int num = 70;
        if( num < 100 ){
            /* This println statement will only execute,
             * if the above condition is true
             */
            System.out.println("number is less than 100");
        }
    }

    /**
     * Nested if statement in Java
     * When there is an if statement inside another if statement then it is called the nested if statement.
     * The structure of nested if looks like this:
     */
    static void nestedIfExample() {
        int num = 70;
        if( num < 100 ){
            System.out.println("number is less than 100");
            if(num > 50){
                System.out.println("number is greater than 50");
            }
        }
    }

    /**
     * If else statement in Java
     * This is how an if-else statement looks:
     *
     * if(condition) {
     *    Statement(s);
     * }
     * else {
     *    Statement(s);
     * }
     */
    static void ifElseExample() {
        int num=120;
        if( num < 50 ){
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");
        }
    }

    /**
     * if-else-if Statement
     * if-else-if statement is used when we need to check multiple conditions.
     * In this statement we have only one “if” and one “else”, however we can have multiple “else if”.
     * It is also known as if else if ladder.
     */
    static void ifElseIfExample() {
        int num=1234;
        if(num <100 && num>=1) {
            System.out.println("Its a two digit number");
        }
        else if(num <1000 && num>=100) {
            System.out.println("Its a three digit number");
        }
        else if(num <10000 && num>=1000) {
            System.out.println("Its a four digit number");
        }
        else if(num <100000 && num>=10000) {
            System.out.println("Its a five digit number");
        }
        else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
