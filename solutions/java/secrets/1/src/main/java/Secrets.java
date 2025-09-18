public class Secrets {
// desplazo hacia la derecha
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }
//es como de bit or bit y solo se va a estabecer 1 bit lo indicado 
    public static int setBits(int value, int mask) {
        return value | mask;  
    }
    //va  a invertir los bits indicados por la mascara 
    public static int flipBits(int value, int mask) {
        return value ^ mask; 
    }
// va a borrar lo s bits 
    public static int clearBits(int value, int mask) {
        return value & ~mask; 
    }
}

