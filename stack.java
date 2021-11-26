import java.util.Scanner;
class stack{
      int stack_arr[]=new int[5];
      int top=-1;
      void push(){
         if(top==4){
             System.out.println("Stack overflow!!");
         }
         else{
           Scanner sc=new Scanner(System.in);
           top++;
           System.out.println("Enter the number you want to insert in the stack here:");
           stack_arr[top]=sc.nextInt();
           }
      }
      int pop(){
           int n;
           if(top==-1){
              System.out.println("Stack underflow !! Error!");
              return 0;
           }
           else{
              System.out.println("Top element is deleted successfully!");
              n=stack_arr[top];
              top--;
              return n;
           }
      }
     void display(){
           if(top==-1){
             System.out.println("Error! Stack underflow!");
           }
           else{
               for(int i=top;i>=0;i--){
                   System.out.println(stack_arr[i]);
               }
         }
}
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int choice=0;
           stack stacks[]=new stack[3];
           for(int i=0;i<3;i++){
               stacks[i]=new stack();
           }
           for(int i=0;i<3;i++){
           while(choice!=4){
                System.out.println("Enter your choice here:");
                choice=sc.nextInt();
                switch (choice){
                    case 1: stacks[i].push();
                    break;
                    case 2: stacks[i].pop();
                    break;
                    case 3: stacks[i].display();
                    break;
                    case 4:
                    break;
                    default: System.out.println("Error!, Enter valid input!");
                 }
           }
         }
  }
}
               