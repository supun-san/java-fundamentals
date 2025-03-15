package exception;

public class LogicalError {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int z = x + y * 2; // this line logical error
//        int z = (x + y) * 2; //Fixed the error

        System.out.println("z = " + z);
    }

}
