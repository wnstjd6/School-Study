package Deepening;

public class Q10 {
    private String title;
    private String singer;
    private int year;
    private String country;

    public Q10(String title,String singer,int year,String country){
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }

    void show(){
        System.out.println(year+"년 "+country+"의 "+singer+"가 부른 "+title);
    }

    public static void main(String[] args){
         Q10 q = new Q10("welcomr to the Show","DAY6",2024,"한국");
         q.show();
    }
}