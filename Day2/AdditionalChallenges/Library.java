package Day2.AdditionalChallenges;

import java.util.ArrayList;
import java.util.Scanner;

//Create a program to manage a library system using OOP concepts, including classes for Book, Member, and Librarian.
class Book{
    public int bookId;
    public String author;
    public String title;
    public boolean isavailable;

    Book(int bookId,String author,String title){
        this.bookId=bookId;
        this.author=author;
        this.title=title;
        this.isavailable=true;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isavailable;
    }
    public void setAvailable(boolean is){
        this.isavailable=is;
    }
    public void displayBookDetails(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isavailable ? "Yes" : "No"));
    }
}

class Member{
    private int memberId;
    private String memberName;

    Member(int id,String name){
        this.memberId=id;
        this.memberName=name;
    }
    public int getMemberId(){
        return memberId;
    }
    public String getMemberName(){
        return memberName;
    }
    public void displayMemberDetails(){
        System.out.println("Member Id : " + memberId);
        System.out.println("Member Name : " + memberName);
    }
}

class Librarian{
    public ArrayList<Book> books=new ArrayList<>();
    protected ArrayList<Member> members=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully..!");
    }
    public void addMember(Member member){
        members.add(member);
        System.out.println("Member added successfully..!");
    }
    public void issueBook(int bookId){
        for(Book i:books){
            if(i.getBookId()==bookId){
                if(i.isAvailable()){
                    i.setAvailable(false);
                    System.out.println("Book Issued");
                }else{
                    System.out.println("Book is already taken");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
    public void returnBook(int bookId){
        for(Book i:books){
            if(i.getBookId()==bookId){
                if(!i.isAvailable()){
                    i.setAvailable(true);
                    System.out.println("Book returned");
                }else{
                    System.out.println("Book already returned");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
    public void displayAllBook(){
        if(books.isEmpty()){
            System.out.println("No Books");
        }
        for(Book book:books){
            book.displayBookDetails();
            System.out.println();
        }
    }
    public void displayAllMember(){
        if(members.isEmpty()){
            System.out.println("No member's");
        }
        for(Member mem:members){
            mem.displayMemberDetails();
            System.out.println();
        }
    }
}


public class Library {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Librarian admin=new Librarian();
        System.out.println("----------<<<<<<<<<<Welcome to library>>>>>>>>>>----------");
        boolean condition=true;
        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Get Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter book id :");
                    int bookId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book author :");
                    String author=sc.nextLine();
                    System.out.println("Enter book title :");
                    String title=sc.nextLine();
                    admin.addBook(new Book(bookId,author,title));
                    break;

                case 2:
                    System.out.println("Enter Member id");
                    int memId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Member name");
                    String memberName=sc.nextLine();
                    admin.addMember(new Member(memId,memberName));
                    break;

                case 3:
                    System.out.println("Tell book id :");
                    bookId=sc.nextInt();
                    admin.issueBook(bookId);
                    break;

                case 4:
                    System.out.println("Return book id :");
                    bookId=sc.nextInt();
                    admin.returnBook(bookId);
                    break;

                case 5:
                    System.out.println("The books we have in this library are :");
                    admin.displayAllBook();
                    break;

                case 6:
                    System.out.println("The subscribed members in this library are :");
                    admin.displayAllMember();
                    break;

                case 7:
                    System.out.println("Thank You...!");
                    System.out.println("-------Visit Again----------");
                    condition=false;
                    break;

                default:
                    System.out.println("Enter valid choice...?");
            }
            if(!condition){
                break;
            }
        }
    }
}
