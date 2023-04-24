package exception2;

public class LAB6 {

    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            StackTraceElement[] StackTraceElement = e.getStackTrace();
            for (int i=0; i<StackTraceElement.length; i++) {
            System.out.println(StackTraceElement[0].getClassName());
            System.out.println(StackTraceElement[0].getMethodName());
            System.out.println(StackTraceElement[0].getFileName());
            System.out.println(StackTraceElement[0].getLineNumber());
            }
        }
    }
    
}
