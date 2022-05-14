package com.company;

class Library{
    String[] arr ={"Angelmaker","Annabel","Americanah","Autumn","","","","","","","","","","","",""};
    public void addBook(String bookName){
        arr[4] = bookName;
    }
    public void showAvailableBooks(){
        System.out.println("Name of books are as follows..");
        for (String a:arr) {
            System.out.println(a);
        }
    }
    public void issueBook(String bookName){
            showAvailableBooks();
    }
    public void returnBook(String bookName){

    }
}

public class kk_51_library_practice {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books



    }
}
