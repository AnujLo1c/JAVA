import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args){
        boolean t=true;
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print(t?1:0);
                    t=t?false:true;
                }
                System.out.println();
                t=(i%2==0)?false:true;
            }
        }
        
    }
}
