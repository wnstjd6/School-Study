package Deepening;
class AA{
    public AA(){
        System.out.println("생성자 A");
    }
}
class BB extends AA{
  public BB(){
      System.out.println("생성자 B");
  }
}
class C extends BB{
    public C(){
        System.out.println("생성자 C");
    }
}
public class parents01 {
    public static void main(String[] args){
        C c;
        c = new C();
    }
}
