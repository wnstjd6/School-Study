package After;
abstract class supplies{
    String name;
    public supplies(String name) {
        this.name = name;
    }

    public abstract void use();
    public abstract String identify();
    public abstract void replace();

}
class Pencil extends supplies{
    String hardness;
    public Pencil(String hardness) {
        super("연필");
        this.hardness = hardness;
    }
    public void use(){
            System.out.println(name+"(진하기 :"+hardness+")로 쓰고있습니다.");
    }
    public String identify(){
       return "이것은 "+hardness+"진하기의 "+name+"입니다.";
    }
    public void replace(){
        System.out.println(name+"을(를)교체합니다.");
    }
}
class Pen extends supplies{
    String color;
    public Pen(String color) {
        super("볼펜");
        this.color = color;
    }
    public void use(){
        System.out.println("이것은"+color+"색상의"+name+"입니다.");
    }
    public String identify(){
        return name+"(색상: "+color+")으로 쓰고 있습니다.";
    }
    public void replace(){
        System.out.println(name+"을(를) 교체합니다.");
    }
}
class Eraser extends supplies{
    int size=0;
    public Eraser(int size) {
        super("지우개");
        this.size = size;
    }
    public void use(){
        if(size>0){
        System.out.println("이것은 크기가 "+size+"인 지우개입니다.");
        size--;
        }
        else if(size==0){
            System.out.println("지우개가 너무 작아 더 이상 사용할 수 없습니다.");
        }
    }
    public String identify(){
        return name+"로 글자를 지우고 있습니다.";
    }
    public void replace(){
        System.out.println(name+"을(를) 교체합니다.");
    }
}
public class Clas05 {
    public static void main(String[] args){
       supplies[] stationeryItems = {
                new Pencil("2B"),
                new Pen("파랑"),
                new Eraser(5)
        };

        for (int i = 0; i < stationeryItems.length; i++) {
            System.out.println(stationeryItems[i].identify());
            stationeryItems[i].use();
            stationeryItems[i].replace();
        }
        stationeryItems[2].use();
        stationeryItems[2].use();
        stationeryItems[2].use();
        stationeryItems[2].use();
        stationeryItems[2].use();

    }

}

