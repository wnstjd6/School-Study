package After;
public class Array08 {
    public static void main(String[] args){
        int [] games = {5,4,3,9,4,1,3,12,36};
        for(int i = 0; i<games.length; i++){
            if(games[i]==3||games[i]==6||games[i]==9){
                System.out.println(games[i]+" = clap");
            }
        }
    }
}
