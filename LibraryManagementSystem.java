class Library{
    String[] books;
    int nofbooks;
    Library(){
        this.books=new String[100];
        this.nofbooks=0;
    }
    void addbooks(String book){
        this.books[nofbooks]= book;
        nofbooks++;
        System.out.println(book +" book has been added!");
    }
    void displaybooks(){
        System.out.println("Available Books are :");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuebooks(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued : "+book);
                this.books[i]=null;
                return;

            }
        }
        System.out.println("The book doesn't exist...");
    }
    void returnbook(String book){
        addbooks(book);
        System.out.println("The book has been returned : "+book);

    }

}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library l=new Library();
        l.addbooks("The End");
        l.addbooks("Fairy");
        l.addbooks("No more");
        l.addbooks("Life dead");
        l.addbooks("From");
        l.displaybooks();
        l.issuebooks("No more");
        l.displaybooks();
        l.returnbook("No more");
        l.displaybooks();

    }
}
