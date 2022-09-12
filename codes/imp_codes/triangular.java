package imp_codes;

import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Range Limit");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((i*(i+1))/2 +" ");
        }

    }
}
