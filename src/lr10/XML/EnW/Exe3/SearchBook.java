package lr10.XML.EnW.Exe3;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchBook {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr10/XML/Ex1/ex.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите автора или год издания книги: ");
            String query = scanner.nextLine();

            List<Element> books = searchBooks(doc, query);

            if (books.isEmpty()) {
                System.out.println("Книги по заданным критериям не найдены.");
            } else {
                System.out.println("Найденные книги:");
                for (Element book : books) {
                    System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " + book.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Element> searchBooks(Document doc, String query) {
        NodeList nodeList = doc.getElementsByTagName("book");
        List<Element> bookList = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                bookList.add((Element) node);
            }
        }
        return bookList.stream()
                .filter(element -> {
                    String bookAuthor = element.getElementsByTagName("author").item(0).getTextContent();
                    String bookYear = element.getElementsByTagName("year").item(0).getTextContent();
                    return bookAuthor.toLowerCase().contains(query.toLowerCase()) || bookYear.equals(query);
                })
                .collect(Collectors.toList());
    }

}
