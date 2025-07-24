import java.util.*;
public class magicn {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        int y =0;
        while(n>0){
            y=y+(n%10);
            n=n/10;
            if(y>9 && n==0){
            n=y;
            y=0;
            }
        }
        System.out.println(y);
        if(y==1){
            System.out.println("Magic number");
        }
        else{
            System.out.println("Not Magic number");
        }
    }
}
