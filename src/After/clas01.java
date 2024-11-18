package After;
class Vehicle{
    int speed;
    int maxSpeed;
    void  accelerate(int up){
        speed+=up;
    }
    void Break(int br){
        speed-=br;
    }
}
class Bicycle extends Vehicle{
    Bicycle(int speed){
        this.speed = speed;
    }
}
class Carr extends Vehicle{
    int boostSpeed;
    void boost(int cnrk){

    }
}
public class clas01 {

}
