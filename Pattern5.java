import java.util.Scanner;
public class Pattern5 {
    private static Scanner in() {
        return new Scanner(System.in);
    }
    public static void main(String[] args){
        int n=in().nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}