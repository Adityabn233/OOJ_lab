import java.util.Scanner;
import java.lang.Math;
class student{
        String usn,name;
        int[] cred=new int[20];
        double[] mark=new double[20];
        int n;
        double sgpa=0;
        void accept(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of Courses you have here:");
                n = sc.nextInt();
                System.out.println("Enter your details here below...");
                System.out.println("Enter your name here :");
                name=sc.next();
                System.out.println("Enter your USN here :");
                usn=sc.next();
                for(int i=0;i<n;i++){
                      System.out.println("Course-"+(i+1)+" Credits: ");
                      cred[i]=sc.nextInt();
                      System.out.println("Course-"+(i+1)+" Marks: ");
                      mark[i]=sc.nextDouble();
                }
        }
         void display(){
               int[] gp=new int[n];
               int sum=0;
               for(int i=0;i<n;i++){
                      gp[i]=(int)(mark[i]/10)+1;
                      sgpa=sgpa+gp[i]*cred[i];
                      sum=sum+cred[i];
               }
               sgpa=sgpa/sum;
               System.out.println("Your SGPA is calculated as : "+sgpa);
          }
      public static void main(String[] args){
                 student s1=new student();
                 s1.accept();
                 s1.display();
          }
     }
                 
        
         
       
                
                
                