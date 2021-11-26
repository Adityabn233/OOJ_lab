import java.util.Scanner;
import java.lang.Math;
class arrop{
   public static void main(String[] args){
        int n,x=0,y=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        int[] C=new int[n];
        for(int i=0;i<n;i++){
          A[i]=sc.nextInt();
          if(A[i]%2==1){
              B[x]=A[i];
              x++;
          }
          else if(A[i]%2==0){
              C[y]=A[i];
              y++;
          }
        }
        int S=0;
        for(int i=0;i<y;i++){
              S=S+C[i];
        }
        double avg=S/y;
        int max=C[0];
        for(int i=0;i<y;i++){
             if(max<=C[i]){
                  max=C[i];
              }
        }
        int min=C[0];
        for(int i=0;i<y;i++){
             if(min>=C[i]){
                  min=C[i];
              }
        }
        System.out.println("Sum = "+S+", Avg = "+avg+", Max = "+max+", Min = "+min);
    }
}
        