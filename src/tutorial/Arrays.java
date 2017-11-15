package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
    public static void arraysMAX() {
        byte a = Byte.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        short c = Short.MAX_VALUE;
        long d = Long.MAX_VALUE;
        double e = Double.MAX_VALUE;
        float f = Float.MAX_VALUE;

        Object[] arrays = new Object[]{a, b, c, d, e, f};
        for (int i = 0; i <= 5; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void arraysMIN() {
        byte a = Byte.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        short c = Short.MIN_VALUE;
        long d = Long.MIN_VALUE;
        double e = Double.MIN_VALUE;
        float f = Float.MIN_VALUE;

        Object[] arrays = new Object[]{a, b, c, d, e, f};
        for (int i = 0; i <= 5; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void arraysHelloTwo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вибирите: MIN или MAX");
        String value = reader.readLine();
        if (value.equals("MIN")){
            arraysMIN();

        } else {
            if (value.equals("MAX")) {
                arraysMAX();
            } else {
                System.out.println("Ошибка ввода введите заново");
                arraysHelloTwo();
            }
        }
    }
}
