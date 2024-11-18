package Deepening;
 class Rectangle{
     int width;
     int height;
     public Rectangle(){this(1,1);}
     public Rectangle(int width){this(width,width);}
     public Rectangle(int width, int height){
         this.width = width;
         this.height = height;
     }
     void area(){
         System.out.println("가로 : "+width+"\n세로 : "+height+"\n넓이 : "+width*height);
     }
 }
public class csl01{
    public static void main(String[] args){
            Rectangle rec = new Rectangle();
            Rectangle rec1 = new Rectangle(10);
            Rectangle rec2 = new Rectangle(10,20);
            rec.area();
            rec1.area();
            rec2.area();
    }
}
