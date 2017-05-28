/**
 * Created by hao on 5/28/17.
 */
import java.util.*;

class Solution {

    public static void main(String[] args) {
        System.out.print("Nhap T:");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Nhap n:");
            int n = in.nextInt();
            System.out.print("Nhap k:");
            int k = in.nextInt();
            int dem=0;
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                System.out.print("Nhap a"+a_i+":");
                a[a_i] = in.nextInt();

                if(a[a_i]<=0) dem++;
            }
            if(dem>k)
                System.out.print("No");
            else System.out.print("Yes");
        }
    }
}