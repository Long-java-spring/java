public class LoopExample {

    public static void main(String[] args) {
        forLoopExample();
        System.out.println("==================");
        whileLoopExample();
        System.out.println("==================");
        doWhileLoopExample();
    }

    /**
     * Syntax of for loop:
     * for(initialization; condition ; increment/decrement)
     * {
     *    statement(s);
     * }
     */
    static void forLoopExample() {
        for(int i=10; i>1; i--){
            System.out.println("The value of i is: "+i);
        }
    }

    /**
     * Syntax of while loop
     * while(condition)
     * {
     *    statement(s);
     * }
     */
    static void whileLoopExample() {
        int i=10;
        while(i>1){
            System.out.println(i);
            i--;
        }
    }

    /**
     * Syntax of do-while loop:
     * do
     * {
     *    statement(s);
     * } while(condition);
     */
    static void doWhileLoopExample() {
        int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>1);
    }
}
