/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author LamaA
 */
public class readBooks {

    //private DataBase database = new DataBase();

    public static void main(String[] args) throws IOException {
        String url = "https://www.goodreads.com/shelf/show/free-online";
        List<String> bookTitles = new ArrayList<>();
        List<String> bookAuthors = new ArrayList<>();
        List<String> bookPublishe = new ArrayList<>();

        try {
            // Connect to website and get HTML content
            Document doc = Jsoup.connect(url).get();
            // Extract book titles, authors, and prices

            Elements titles = doc.select("div.elementList div.left a.bookTitle");
            for (Element title : titles) {
                bookTitles.add(title.text());
            }
            Elements authors = doc.select("div.elementList div.left span div.authorName__container a.authorName");
            for (Element author : authors) {
                bookAuthors.add(author.text());
            }
            Elements published = doc.select("div.elementList div.left span.greyText.smallText");
            for (Element publishe : published) {
                bookPublishe.add(publishe.text());
            }

            // Write book information to file
            PrintWriter writer = new PrintWriter(new FileWriter("books.txt"));

            for (int i = 0; i < bookTitles.size(); i++) {

                writer.println( bookTitles.get(i) + "@" + bookAuthors.get(i) + "@" + bookPublishe.get(i));
            }

            writer.close();

            //database.insert_book(Username, Fname, Lname, password, Phone, Email);
            //System.out.println("Book information saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
