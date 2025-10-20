package ABD.Learnovate.class1;

import javax.xml.transform.Source;

class Book{
    void Bookname(String book){
        System.out.println("Book: "+book);
    }
    void author(String name){
        System.out.println("Name of the author: "+name);
    }
}
public class A{
    public static void main(String[] args) {
        Book b=new Book();
        b.Bookname("ASOIAF");
        b.author("George R.R. Martin");
    }
}
