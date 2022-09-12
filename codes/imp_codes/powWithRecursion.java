package imp_codes;

public class powWithRecursion {


    public static double power(int base , int exp)
    {
        if(exp == 0){
            return 1;
        } else if (exp>0) {
            return base * power(base, exp-1);

        }
        else {
            return 1/power(base,-exp);
        }
    }

    public static void main(String[] args) {
       double result = power(2,-3);
        System.out.println(result);


    }

}
