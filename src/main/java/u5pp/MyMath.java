package u5pp;

public class MyMath {
    static int abs(int x){
        if (x < 0){
            return -x; // if it's not greater than 0, make it return negativley -> thus returning positive
        } else {
            return x;// if nto just return it.
        }
    }

    static double abs(double x) {
        if (x < 0.0){ // same concept but double
            return -x;
        } else {
            return x;
        }
    }

    static double pow(double base, int exponent){
        double temp = 1;
        for (int i = 0; i < exponent; i++) { // loops every exponent
            temp = temp * base; // base gets mult, stored in temp
        }
        return temp;
    }

    static int perfectSqrt(int x){ // 26
        double base = 1.0; // gets  
        double y = x; // y is a temp
        if (x == 0){ // if it's nothing just return 0
            return 0;
        }
        if (x<2){ // can't be less than 2
            return -1;
        }
        while (y/base > base) { // 26/1 > 1, 26/2 > 2, 26/3 > 3, 26/4 > 4. 26/5 > 5, 26/6 !>6 || checks if it's divisiable by y / it's base
            base = base + 1; // 2, 3, 4, 5, 6, 7, 8, 9, || adds base to check.
        }


        if ((y/base)%1==0){ // checks if it's perf square
            int value = (int)y;
            int value2 = (int)base;
            return value/value2;
        }
        return -1;
    }
}
