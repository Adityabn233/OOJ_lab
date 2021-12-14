import java.util.Scanner;
abstract class shape{
         double a,b;
         abstract void printArea();
}
class rectangle extends shape{
          void printArea(){
                  System.out.println("The area of the rectangle is: "+(a*b)+"sq units");
          }
}
class triangle extends shape{
          void printArea(){
                  System.out.println("The area of the given triangle is: "+(0.5*a*b)+"sq units");
          }
}
class circle extends shape{
          void printArea(){
                  System.out.println("The area of the given circle is: "+(3.142*a*a)+"sq units");
          }
}
public class Main{
          public static void main(String[] args){
                  Scanner sc=new Scanner(System.in);
                  shape si;
                  rectangle r=new rectangle();
                  triangle t= new triangle();
                  circle c= new circle();
                  int ch=0;
                  while(ch!=4){
                          System.out.println("1/2/3/4");
                          ch=sc.nextInt();
                          switch(ch){
                              case 1:System.out.print("Enter here the l and b of the ractangle:");
                                     r.a=sc.nextDouble();
                                     r.b=sc.nextDouble();
                                     r.printArea();
                              break;
                              case 2:System.out.print("Enter here the base and height of the triangle:"); 
                                     t.a=sc.nextDouble();
                                     t.b=sc.nextDouble();
                                     t.printArea();
                              break;
                              case 3:System.out.print("Enter here the radius of the Circle:");
                                     c.a=sc.nextDouble();
                                     c.printArea();
                              break;
                              case 4:
                              break;
                              default: System.out.println("Error!!, Enter valid input!");
                              break;
                           }
                   }
         }
}
             