import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

       Test tt = new Test();
        tt.UserTableCreate();
        tt.VideoTableCreate();
        tt.FavoriteTableCreate();
    }
}