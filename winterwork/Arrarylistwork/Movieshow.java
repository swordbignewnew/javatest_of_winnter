package winterwork.Arrarylistwork;

//用集合存储电影对象并进行遍历

import java.util.ArrayList;

public class Movieshow {
    public static void main(String[] args) {
        ArrayList<Moviesmode> movies=new ArrayList<>();

        Moviesmode m1=new Moviesmode("流浪地球",10.0,"吴京");
        movies.add(m1);
        movies.add(new Moviesmode("红海",10.0,"吴京"));

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getName());
            System.out.println(movies.get(i).getScore());
            System.out.println(movies.get(i).getActor());
            System.out.println("--------------");
        }
    }
}
