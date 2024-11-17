package School1;

class Car{
    String color = "";
    String size = "";
    int door = 0;

    Car(){
        this("Red","midium",4);
    }
    Car(String color){
        this(color,"large",2);
    }

    public Car( String color,String size,int door){
        this.color = color;
        this.size = size;
        this.door = door;
        System.out.println("차량의 색 : "+color);
        System.out.println("차량 사이즈 : "+size);
        System.out.println(  "문 개수 : "+door);
    }
}
public class T1 {
    public static void main(String[] args){
        Car car01 = new Car();
        Car car02 = new Car("White");
        Car car03 = new Car("Yellow","small",4);
    }
}
