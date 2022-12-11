import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = second%10;
        int fourth = second%100/10;
        int five = second/100;
        System.out.println(first*third);
        System.out.println(first*fourth);
        System.out.println(first*five);
        System.out.println(first*second);
        
        }
    }
