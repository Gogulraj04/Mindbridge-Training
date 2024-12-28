package Day2.Constructors;

public class Book {
    String title;
    String author;

    Book(){
        this.title=null;
        this.author=null;
    }
    Book(String title1){
        this.title=title1;
        this.author=null;
    }
    Book(String title1,String author1){
        this.title=title1;
        this.author=author1;
    }
    public void display(){
        System.out.println("Title Name :"+title);
        System.out.println("Author Name :"+author);
    }
}
class Example{
    public static void main(String [] args){
        Book b1=new Book();
        b1.display();
        Book b2=new Book("Introduction of Java");
        b2.display();
        Book b3=new Book("Introduction of c++","Bjarne Stroustrup");
        b3.display();
    }
}
