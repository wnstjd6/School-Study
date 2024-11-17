package School1;
class Car01{
    String name = "차";
    String print(){
        return "[나는"+name+"이다.]";
    }
}
class Bus extends Car01{
    String name = "버스";
    String print(){
        return "[나는"+name+"이다.]";
    }
}
class Truck1 extends Car01{
    String name = "트럭";
    String print(){
        return "[나는"+name+"이다.]";
    }
}
public class T10 {
    public static void main(String[] args){
        Car01 mycar, yourcar;
        Bus mybus, yourbus;
        Truck1 mytruck, yourtruck;
       mycar = new Car01();
        mybus = new Bus();
        mytruck = new Truck1();
        System.out.println();
    }
}
