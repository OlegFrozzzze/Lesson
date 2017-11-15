package tutorial;

public class Arrays {
    public static void arraysHello(){
        byte a = Byte.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        short c = Short.MAX_VALUE;
        long d = Long.MAX_VALUE;
        double e = Double.MAX_VALUE;
        float f = Float.MAX_VALUE;

        Object[] arrays = new Object[]{a,b,c,d,e,f};
        for(int i = 0; i<=5;i++){
            System.out.println(arrays[i]);
        }
    }

    public static void main(String[] args) {
        arraysHello();
    }
}
