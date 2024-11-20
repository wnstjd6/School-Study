package Deepening;
class Bk{
    String title;
    String author;
    public Bk(String title){
        this.title =title;
        author = "작가미상";
    }
    public Bk(String title,String author){
        this.title = title;
        this.author = author;
    }
    void a(){
        System.out.println("작가 : "+title+"\n제목 : "+author);
    }

}
public class Q12 {
    public static void main(String[] args){
        Bk b = new Bk("백설공주");
        Bk b1 = new Bk("어린왕자","강재호");
        b.a();
        b1.a();
    }
}
