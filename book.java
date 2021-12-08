import java.util.Scanner;
class book{
        String name;
        String author;
        int price;
        int num_pages;
        book(){
        }
        book(String name,String author,int price,int num_pages){
               this.name=name;
               this.author=author;
               this.price=price;
               this.num_pages=num_pages;
        }
        void accept(){
            Scanner sc=new Scanner(System.in);
            System.out.println("<<<< Enter Book details here >>>>");
            System.out.print("Enter book name here: ");
            name=sc.next();
            System.out.print("Enter the name of the author of the here: ");
            author=sc.next();
            System.out.print("Enter the price of the book here: ");
            price=sc.nextInt();
            System.out.print("Enter here the number of pages in the book: ");
            num_pages=sc.nextInt();
        }
       public String toString(){
            return("Book name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of Pages: "+num_pages);
        }
       public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                book b1=new book("Naakutanti","Bendre",129,321);
                System.out.println("Details of the constructor book:\n"+b1);
                System.out.println("Enter the number of books you want to add in your library: ");
                int n=sc.nextInt();
                book[] b=new book[n];
                for(int i=0;i<n;i++){
                      b[i]=new book();
                      System.out.println("Enter the deatils of the book"+i+1+" here");
                      b[i].accept();
                }
                System.out.println("Details of all the books in your library >>>>>");
                for(int i=0;i<n;i++){
                      System.out.println("\nDetails of the book"+i+1+" :::");
                      System.out.println(b[i]);
                }
      }
}