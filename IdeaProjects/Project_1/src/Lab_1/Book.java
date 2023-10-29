package Lab_1;

public class Book {
    private String Name;
    private int Page;
    public Book (String m, int p){
        Name = m;
        Page = p;
    }
    public Book(String m){
        Name = m;
        Page = 0;
    }
    public Book(){
        Name = "Rop";
        Page = 0;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setPage(int Page){
        this.Page = Page;
    }
    public String getName(String Name){
        return Name;
    }
    public int getPage(){
        return Page;
    }
    public String toString(){
        return this.Name+", page "+this.Page;
    }
}
