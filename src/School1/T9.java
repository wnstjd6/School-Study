package School1;
class Point{
    int x;
    int y;
    void Xy(){
        System.out.println("x좌표 : "+x);
        System.out.println("y좌표 : "+y);
    }
}
class ColorPoint extends Point{
    String color;
    ColorPoint(int x, int y, String color){
        super.x = x;//this로 변경 가능
        super.y = y;//this로 변경 간으
        this.color = color;
    }
    void col(){
        System.out.println("색깔 : "+color);
    }
}
public class T9 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(3,4,"red");

        cp.Xy();
        cp.col();

    }
}
