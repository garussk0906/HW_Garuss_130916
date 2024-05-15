package lr10.XML.EnW.Exe2;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AddBook {
    private Document doc;
    private String filePath;

    public AddBook(String filePath) throws Exception {
        this.filePath = filePath;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(filePath);
    }

    public void addBook(String title, String author, String year) {
        Element newBook = doc.createElement("book");

        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        newBook.appendChild(titleElement);

        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));
        newBook.appendChild(authorElement);

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        newBook.appendChild(yearElement);

        doc.getDocumentElement().appendChild(newBook);
    }

    public void save() throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Включение отступов
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(filePath);
        transformer.transform(source, result);

        // Удаление пустых строк
        removeEmptyLines();
    }

    private void removeEmptyLines() throws IOException {
        File file = new File(filePath);

        List<String> lines = Files.lines(file.toPath())
                .filter(line -> !line.trim().isEmpty())
                .collect(Collectors.toList());

        Files.write(file.toPath(), lines);
    }


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Запрос данных о новой книге
            System.out.println("Введите название книги:");
            String title = scanner.nextLine();
            System.out.println("Введите автора книги:");
            String author = scanner.nextLine();
            System.out.println("Введите год издания книги:");
            String year = scanner.nextLine();


            AddBook addBook = new AddBook("src/lr10/XML/Ex1/ex.xml");
            addBook.addBook(title, author, year);
            addBook.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





