package School1;

class Rec{
    int width;
    int height;
    public Rec(){
        int width = 1;
        int height = 1;
    }

    public int cal(){
     return (width*2)+(height*2);
    }
    public int calc(){
        return width*height;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int setW(int Wit){
        if(Wit<0||Wit>20){
            System.out.println("오류 메세지");
    }
        else{
            this.width = Wit;
        }
        return Wit;
    }
    public int setH(int Hei){
        if(Hei<0||Hei>20){
            System.out.println("오류 메세지");
        }
        else{
             this.height = Hei;
        }
        return Hei;
    }



}
public class T2 {
    public static void main(String[] args){
    Rec ec = new Rec();
    ec.setW(19);
    ec.setH(19);
    System.out.println("가로 길이 : "+ec.getWidth());
    System.out.println("세로 길이 : "+ec.getHeight());
    System.out.println("둘레 : "+ec.cal() );
    System.out.println("넚이 : "+ec.calc());
    }
}
