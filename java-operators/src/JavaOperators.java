public class JavaOperators {

    public static void main(String[] args) {
        arithmeticOperator();
        System.out.println("====================");
        assignmentOperator();
        System.out.println("====================");
        autoOperator();
        System.out.println("====================");
        logicalOperator();
        System.out.println("====================");
        relationalOperator();
        System.out.println("====================");
        bitwiseOperator();
        System.out.println("====================");
        ternaryOperator();
    }

    /**
     * 1) Basic Arithmetic Operators
     * Basic arithmetic operators are: +, -, *, /, %
     * + is for addition.
     * – is for subtraction.
     */
    static void arithmeticOperator() {
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );
    }

    /**
     * 2) Assignment Operators
     * Assignments operators in java are: =, +=, -=, *=, /=, %=
     * num2 = num1 would assign value of variable num1 to the variable.
     * num2+=num1 is equal to num2 = num2+num1
     * num2-=num1 is equal to num2 = num2-num1
     * num2*=num1 is equal to num2 = num2*num1
     * num2/=num1 is equal to num2 = num2/num1
     * num2%=num1 is equal to num2 = num2%num1
     */
    static void assignmentOperator() {
        int num1 = 10;
        int num2;

        num2 = num1;
        System.out.println("= Output: "+num2);
        num2 += num1;
        System.out.println("+= Output: "+num2);
        num2 -= num1;
        System.out.println("-= Output: "+num2);
        num2 *= num1;
        System.out.println("*= Output: "+num2);
        num2 /= num1;
        System.out.println("/= Output: "+num2);
        num2 %= num1;
        System.out.println("%= Output: "+num2);
    }

    /**
     * 3) Auto-increment and Auto-decrement Operators
     * ++ and —
     * num++ is equivalent to num=num+1;
     * num–- is equivalent to num=num-1;
     */
    static void autoOperator() {
        int num1=100;
        int num2=200;
        num1++;
        num2--;
        System.out.println("num1++ is: "+num1);
        System.out.println("num2-- is: "+num2);
    }

    /**
     * 4) Logical Operators
     * Logical Operators are used with binary variables. They are mainly used in conditional statements and loops for evaluating a condition.
     * Logical operators in java are: &&, ||, !
     * Let’s say we have two boolean variables b1 and b2.
     * b1&&b2 will return true if both b1 and b2 are true else it would return false.
     * b1||b2 will return false if both b1 and b2 are false else it would return true.
     * !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true.
     */
    static void logicalOperator() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }

    /**
     * 5) Comparison(Relational) operators
     * We have six relational operators in Java: ==, !=, >, <, >=, <=
     * == returns true if both the left side and right side are equal
     * != returns true if left side is not equal to the right side of operator.
     * > returns true if left side is greater than right.
     * < returns true if left side is less than right side.
     * >= returns true if left side is greater than or equal to right side.
     * <= returns true if left side is less than or equal to right side.
     */
    static void relationalOperator() {
        int num1 = 10;
        int num2 = 50;
        if (num1==num2) {
            System.out.println("num1 and num2 are equal");
        } else{
            System.out.println("num1 and num2 are not equal");
        }

        if( num1 != num2 ){
            System.out.println("num1 and num2 are not equal");
        } else{
            System.out.println("num1 and num2 are equal");
        }

        if( num1 > num2 ){
            System.out.println("num1 is greater than num2");
        } else{
            System.out.println("num1 is not greater than num2");
        }

        if( num1 >= num2 ){
            System.out.println("num1 is greater than or equal to num2");
        } else{
            System.out.println("num1 is less than num2");
        }

        if( num1 < num2 ){
            System.out.println("num1 is less than num2");
        } else{
            System.out.println("num1 is not less than num2");
        }

        if( num1 <= num2){
            System.out.println("num1 is less than or equal to num2");
        } else{
            System.out.println("num1 is greater than num2");
        }
    }

    /**
     * 6) Bitwise Operators
     * There are six bitwise Operators: &, |, ^, ~, <<, >>
     * num1 = 11;
     * num2 =22;
     */
    static void bitwiseOperator() {
        int num1 = 11;  /* 11 = 00001011 */
        int num2 = 22;  /* 22 = 00010110 */
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2: "+result);
        result = num1 | num2;
        System.out.println("num1 | num2: "+result);
        result = num1 ^ num2;
        System.out.println("num1 ^ num2: "+result);
        result = ~num1;
        System.out.println("~num1: "+result);
        result = num1 << 2;
        System.out.println("num1 << 2: "+result); result = num1 >> 2;
        System.out.println("num1 >> 2: "+result);
    }

    /**
     * 7) Ternary Operator
     * This operator evaluates a boolean expression and assign the value based on the result.
     * Syntax:
     * variable num1 = (expression) ? value if true : value if false
     * If the expression results true then the first value before the colon (:) is assigned to the variable num1 else the second value is assigned to the num1.
     */
    static void ternaryOperator() {
        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100: 200;
        System.out.println( "num2: "+num2);

        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100: 200;
        System.out.println( "num2: "+num2);
    }
}
