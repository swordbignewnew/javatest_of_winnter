package winterwork.movie;

public class Test {
    public static void main(String[] args) {
        Movie []movies=new Movie[2];
        movies[0]=new Movie("原神",10.0,"mhy");
        movies[1]=new Movie("胡桃",10.0,"陶典");
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i].getName()+"\t");
            System.out.print(movies[i].getScore()+" ");
            System.out.println(movies[i].getActor());

        }
    }
}
