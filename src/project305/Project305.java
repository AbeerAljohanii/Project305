package project305;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Project305 {

    public static void main(String[] args) throws SQLException, IOException, FileNotFoundException, ClassNotFoundException {
        DataBase d = new DataBase();
        //d.createDatabase();
        d.raedBook();

    }

}
