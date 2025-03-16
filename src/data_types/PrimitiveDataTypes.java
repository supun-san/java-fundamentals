package data_types;

public class PrimitiveDataTypes {
    byte byteOne = 127;
    short shortOne = 32767;
    int intOne = 12548484;
    long longOne = 4554545454545454L;
    float floatOne = 12454.55F;
    double doubleOne = 25454874545.584;
    boolean booleanOne = true;
    char charOne = 'd';


    byte byteDefault;
    short shortDefault;
    int intDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    boolean booleanDefault;
    char charDefault;

    public static void main(String[] args) {
        PrimitiveDataTypes types = new PrimitiveDataTypes();
        System.out.println("types.byteOne = " + types.byteOne);
        System.out.println("types.shortOne = " + types.shortOne);
        System.out.println("types.intOne = " + types.intOne);
        System.out.println("types.longOne = " + types.longOne);
        System.out.println("types.floatOne = " + types.floatOne);
        System.out.println("types.doubleOne = " + types.doubleOne);
        System.out.println("types.byteOne = " + types.booleanOne);
        System.out.println("types.charOne = " + types.charOne);

        System.out.println("types.byteDefault = " + types.byteDefault);
        System.out.println("types.shortDefault = " + types.shortDefault);
        System.out.println("types.intDefault = " + types.intDefault);
        System.out.println("types.longDefault = " + types.longDefault);
        System.out.println("types.floatDefault = " + types.floatDefault);
        System.out.println("types.doubleDefault = " + types.doubleDefault);
        System.out.println("types.booleanDefault = " + types.booleanDefault);
        System.out.println("types.charDefault = " + types.charDefault);

    }

}
