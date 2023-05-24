package project305;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private Connection conn;

    public void createDatabase() throws SQLException {
        try {

            ConnectionDataBase();

            // establishing the connection
            System.out.println("Connection successful!");

            // creating Database
            Statement Createstatement = conn.createStatement();
            //Createstatement.executeUpdate("CREATE database BookTracking");

            // creating tables
            // table 1: book
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS book ( bookID INT primary key AUTO_INCREMENT,"
                    + "  title VARCHAR(100),\n"
                    + "  authorName VARCHAR(100),\n"
                    + "  publishDate VARCHAR(100)\n"
                    + ");");

            // table 2: user
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS users (\n"
                    + "  username VARCHAR(50) PRIMARY KEY,\n"
                    + "  fname VARCHAR(50),\n"
                    + "  lname VARCHAR(50),\n"
                    + "  password VARCHAR(50),\n"
                    + "  phone VARCHAR(10),\n"
                    + "  email VARCHAR(50)\n"
                    + ");");

            // table 3: user_book
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS user_books (\n"
                    + "   username VARCHAR(50),\n"
                    + "   book_id INT,\n"
                    + "   status VARCHAR(10),\n"
                    + "   page_number INT,\n"
                    + "   PRIMARY KEY (username, book_id),\n"
                    + "   FOREIGN KEY (username) REFERENCES users(username),\n"
                    + "   FOREIGN KEY (book_id) REFERENCES book(bookID),\n"
                    + "   Review VARCHAR(200)\n"
                    + ");");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
//        PreparedStatement statement = conn.prepareStatement("delete from users where userID = 1");
//        statement.executeUpdate();

    }
//BookTracking

    private void ConnectionDataBase() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/BookTracking"; // database URL
        String usernameDataBase = "root"; // username
        String password = "abeer1234"; // password
        // loading the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            // establishing the connection
            conn = DriverManager.getConnection(url, usernameDataBase, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void insert_Book(String title, String authorName,
            String publishDate) throws SQLException, ClassNotFoundException {
        ConnectionDataBase();
        PreparedStatement statement = conn.prepareStatement("INSERT INTO book (title,"
                + " authorName, publishDate) VALUES (?, ?, ?)");

        statement.setString(1, title);
        statement.setString(2, authorName);
        statement.setString(3, publishDate);
        statement.executeUpdate();
    }

    public void insert_user(String username, String fname, String lname,
            String password, String phone, String email) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("INSERT INTO users (username,"
                + " fname, lname, password, phone, email) VALUES (?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, username);
            statement.setString(2, fname);
            statement.setString(3, lname);
            statement.setString(4, password);
            statement.setString(5, phone); // if empty = null
            statement.setString(6, email);
            statement.executeUpdate();

        }
    }

    public void insert_user_book(String username, int book_id, String status,
            int page_number, Double rate) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("INSERT INTO user_books "
                + "(username, book_id, status, page_number, rate) VALUES (?, ?, ?, ?, ?)")) {

            statement.setString(1, username);
            statement.setInt(2, book_id);
            statement.setString(3, status); // if status currently reading page # must be entered
            statement.setInt(4, page_number);
            statement.setDouble(5, rate); // only if status is read
            statement.executeUpdate();

        }
    }

    public void raedBook() throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("books.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] books = line.split("@");
            String[] published = line.split("—");
            insert_Book(books[0], books[1], published[2]);
        }
        br.close();
    }

    // resetting password in case user forgot
    public void resetPassword(String email, String newPassword) throws SQLException {
        try {
            ConnectionDataBase();
            PreparedStatement statement = conn.prepareStatement("UPDATE users SET password = ? WHERE email = ?");
            statement.setString(1, newPassword);
            statement.setString(2, email);

            statement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    // check if email exists
    public boolean checkEmail(String email) throws SQLException {
        try {
            ConnectionDataBase();
            PreparedStatement statement = conn.prepareStatement("select * from users where email= ?");
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // check if user name exists
    public boolean checkUsername(String username) throws ClassNotFoundException {
        try {
            ConnectionDataBase();
            PreparedStatement statement = conn.prepareStatement("select * from users where username = ?");
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // check if user name and password exist
    public boolean checkUsername_Password(String username, String Password) throws ClassNotFoundException {
        try {
            ConnectionDataBase();
            PreparedStatement statement = conn.prepareStatement("select * from users where username = ? AND password = ?");

            statement.setString(1, username);
            statement.setString(2, Password);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public String ProfileInfo(String username) throws ClassNotFoundException {
        String result = username;
        try {
            ConnectionDataBase();
            PreparedStatement statement = conn.prepareStatement("select email from users where username = ? ");

            statement.setString(1, username);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String email = rs.getString("email");
                result += " " + email;

            }
            // count # of books for each status
            statement = conn.prepareStatement("SELECT COUNT(*) FROM user_books where username = ? AND status = ?");

            // 1: Get the number of books currently reading
            statement.setString(1, username);
            statement.setString(2, "CurrentlyReading");
            ResultSet resultSet = statement.executeQuery();

            int numberOfBooksRead = 0;
            while (resultSet.next()) {
                numberOfBooksRead = resultSet.getInt(1);
            }
            result += " " + numberOfBooksRead;

            // 2: Get the number of books want to read
            statement.setString(1, username);
            statement.setString(2, "WantToRead");
            resultSet = statement.executeQuery();

            numberOfBooksRead = 0;
            while (resultSet.next()) {
                numberOfBooksRead = resultSet.getInt(1);
            }
            result += " " + numberOfBooksRead;

            // 3: Get the number of books read
            statement.setString(1, username);
            statement.setString(2, "Read");
            resultSet = statement.executeQuery();

            numberOfBooksRead = 0;
            while (resultSet.next()) {
                numberOfBooksRead = resultSet.getInt(1);
            }
            result += " " + numberOfBooksRead;
            // Close the connection
            conn.close();

            return result;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet books() throws ClassNotFoundException {
        try {
            ConnectionDataBase();
            Statement st = conn.createStatement();
            String sql = "select * from book";
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
