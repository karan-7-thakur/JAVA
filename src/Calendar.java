
import java.util.Scanner;
public class Calendar {

    public static void convert(int totalDays){
        int years = totalDays/365;    // total years
        totalDays = totalDays % 365;  //remaining left

        int months =  totalDays/30;
        totalDays %= 30;

        int weeks = totalDays/7;
        totalDays %= 7;

        int days = totalDays;

        System.out.println("years: "+ years);
        System.out.println("months: "+ months);
        System.out.println("weeks: "+ weeks);
        System.out.println("days: "+ days);
    }

    public static void calcDays(int y, int m, int w, int d){ 
        
        int days = (y*365) + (m*30) + (w*7) + (d);
        System.out.println("Total no. of days = "+ days);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y,m,w,d;

        y = sc.nextInt();
        m = sc.nextInt();
        w = sc.nextInt();
        System.out.println("Input total num of days: ");
        d = sc.nextInt();

        calcDays(y,m,w,d);  //arguments(actual values) or actual parameters
        convert(d);
    }
}
