package Deepening;
class Point01{
    private int x = 0;
    private int y = 0;
    public Point01(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("x좌표 : "+x+" y좌표 : "+y);
    }
}
class ColorPoint01 extends Point01{
    String color = "";
    public ColorPoint01(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint01(){
        System.out.println("색깔 : "+color);
        showPoint();

    }
}
public class parents03 {
    public static void main(String[] args){
        ColorPoint01 cp = new ColorPoint01(5,6,"red");
        cp.showColorPoint01();
    }
}
