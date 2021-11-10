import java.util.Scanner;
import java.lang.Math;
class Quad{
    public static void main(String[] args){
           int a,b,c;
double dis;
           System.out.println("Enter the coefficients of the quadratic equation here:");
           Scanner in = new Scanner(System.in);
 a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
dis=b*b-4*a*c;
if(dis>0){
double r1=(-b+Math.sqrt(dis))/(2*a);
double r2=(-b-Math.sqrt(dis))/(2*a);
System.out.println("The roots are real and distinct");
System.out.println("Root1="+r1+", Root2="+r2);
}
else if(dis==0){
System.out.println("The roots are real and equal");
System.out.println("Root1=Root2="+-b/(2*a));
}
else{
System.out.println("The roots are imaginary!");
}
}
}
