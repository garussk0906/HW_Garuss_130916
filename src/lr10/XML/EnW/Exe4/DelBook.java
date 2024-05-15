package lr10.XML.EnW.Exe4;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.Scanner;

public class DelBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги для удаления: ");
        String bookTitleToDelete = scanner.nextLine();

        try {
            File inputFile = new File("src/lr10/XML/Ex1/ex.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    if (title.equals(bookTitleToDelete)) {
                        // Нашли книгу для удаления
                        node.getParentNode().removeChild(node);
                        System.out.println("Книга \"" + title + "\" успешно удалена из файла.");
                    }
                }
            }

            // Удаляем пустые строки после удаления книг
            NodeList nodesToRemove = doc.getElementsByTagName("book");
            Node lastNode = nodesToRemove.item(nodesToRemove.getLength() - 1);
            Node sibling = lastNode.getNextSibling();
            while (sibling != null && sibling.getNodeType() == Node.TEXT_NODE && sibling.getNodeValue().trim().isEmpty()) {
                Node nextSibling = sibling.getNextSibling();
                lastNode.getParentNode().removeChild(sibling);
                sibling = nextSibling;
            }

            // Добавляем пустой текстовый узел между последней книгой и закрывающим тегом </library>
            Node libraryNode = doc.getElementsByTagName("library").item(0);
            libraryNode.appendChild(doc.createTextNode("\n"));

            // Сохраняем изменения в XML файле
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/XML/Ex1/ex.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}