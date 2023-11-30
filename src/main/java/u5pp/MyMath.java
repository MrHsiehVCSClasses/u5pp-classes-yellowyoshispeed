package u5pp;

public class MyMath {
    static int abs(int x){
        if (x < 0){
            return -x;
        } else {
            return x;
        }
    }

    static double abs(double x) {
        if (x < 0.0){
            return -x;
        } else {
            return x;
        }
    }

    static double pow(double base, int exponent){
        double temp = 1;
        for (int i = 0; i < exponent; i++) { // 1
            temp = temp * base; // 16
        }
        return temp;
    }

    static int perfectSqrt(int x){ // 26
        double base = 1.0;
        double y = x;
        if (x == 0){
            return 0;
        }
        if (x<2){
            return -1;
        }
        while (y/base > base) { // 26/1 > 1, 26/2 > 2, 26/3 > 3, 26/4 > 4. 26/5 > 5, 26/6 !>6
            base = base + 1; // 2, 3, 4, 5, 6, 7, 8, 9,
        }


        if ((y/base)%1==0){
            int value = (int)y;
            int value2 = (int)base;
            return value/value2;
        }
        return -1;
    }
}
