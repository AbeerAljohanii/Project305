package project305;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private Connection conn;
    private int rowsInserted;
    public void createDatabase() {
        try {

            ConnectionDataBase();

            // establishing the connection
            System.out.println("Connection successful!");

            // creating Database
            Statement Createstatement = conn.createStatement();
            // Createstatement.executeUpdate("CREATE database BookTracking");

            // creating tables
            // table 1: book
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS book ( bookID INT  PRIMARY KEY,"
                    + "  title VARCHAR(50),\n"
                    + "  authorName VARCHAR(50),\n"
                    + "  publishDate VARCHAR(50),\n"
                    + "  rate DECIMAL(3,2)\n"
                    + ");");

            // table 2: user
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS users (\n"
                    + "  userID INT PRIMARY KEY,\n"
                    + "  username VARCHAR(50),\n"
                    + "  fname VARCHAR(50),\n"
                    + "  lname VARCHAR(50),\n"
                    + "  password VARCHAR(50),\n"
                    + "  phone VARCHAR(10),\n"
                    + "  email VARCHAR(50)\n"
                    + ");");

            // table 3: user_book
            Createstatement.executeUpdate("CREATE TABLE IF NOT EXISTS user_books (\n"
                    + "   user_id INT,\n"
                    + "   book_id INT,\n"
                    + "   status VARCHAR(10),\n"
                    + "   page_number INT,\n"
                    + "   PRIMARY KEY (user_id, book_id),\n"
                    + "   FOREIGN KEY (user_id) REFERENCES users(userID),\n"
                    + "   FOREIGN KEY (book_id) REFERENCES book(bookID),\n"
                    + "   rate DECIMAL(3,2)\n"
                    + ");");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //PreparedStatement statement = conn.prepareStatement("delete from users where userID = 1");
        //statement.executeUpdate();

    }

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

    public void insert_Book(int bookID, String title, String authorName,
            String publishDate, Double rate) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("INSERT INTO book (bookID, title,"
                + " authorName, publishDate, rate) VALUES (?, ?, ?, ?, ?)")) {

            statement.setInt(1, bookID);
            statement.setString(2, title);
            statement.setString(3, authorName);
            statement.setString(4, publishDate);
            statement.setDouble(5, rate);

            rowsInserted = statement.executeUpdate();
        }
    }

    public void insert_user(int userID, String username, String fname, String lname,
            String password, String phone, String email) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("INSERT INTO users (userID, username,"
                + " fname, lname, password, phone, email) VALUES (?, ?, ?, ?, ?, ?,?)");) {

            statement.setInt(1, userID);
            statement.setString(2, username);
            statement.setString(3, fname);
            statement.setString(4, lname);
            statement.setString(5, password);
            statement.setString(6, phone); // if empty = null
            statement.setString(7, email);

            rowsInserted = statement.executeUpdate();

        }
    }

    public void insert_user_book(int user_id, int book_id, String status,
            int page_number, Double rate) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("INSERT INTO user_books "
                + "(user_id, book_id, status, page_number, rate) VALUES (?, ?, ?, ?, ?)")) {

            statement.setInt(1, user_id);
            statement.setInt(2, book_id);
            statement.setString(3, status); // if status currently reading page # must be entered
            statement.setInt(4, page_number);
            statement.setDouble(5, rate); // only if status is read

            rowsInserted = statement.executeUpdate();

        }
    }

    // resetting password in case user forgot
    public void resetPassword(String email, String newPassword) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("UPDATE users SET password = ? WHERE email = ?")) {
            statement.setString(5, newPassword);
            statement.setString(7, email);
            statement.executeUpdate();
        }
    }

    // check if email exists
    public boolean checkEmail(String email) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("select * from users where email= ?")) {
            statement.setString(7, email);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return true;
            }
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
}
