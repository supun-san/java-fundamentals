package data_types;

public class WrapperClass {

    Byte aByte;
    Short aShort;
    Integer integer;
    Long aLong;
    Float aFloat;
    Double aDouble;
    Boolean aBoolean;
    Character character;

    public static void main(String[] args) {
        WrapperClass wrapperClass = new WrapperClass();
        System.out.println("wrapperClass.aByte = " + wrapperClass.aByte);
    }
}
