package Day14.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DomExample {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
            Document document=documentBuilder.parse("/Users/gogul/Documents/Training/Mindbridge Training/src/Day14/xml/college.xml");

            NodeList list=document.getElementsByTagName("id");
            NodeList list1=document.getElementsByTagName("name");
            NodeList list2=document.getElementsByTagName("department");
            NodeList list3=document.getElementsByTagName("grade");

            for (int i = 0; i < list.getLength() && i<list1.getLength() && i<list2.getLength() && i<list3.getLength(); i++) {
                Node node=list.item(i);
                Node node1=list1.item(i);
                Node node2=list2.item(i);
                Node node3=list3.item(i);

                System.out.println(node.getNodeName()+" :: "+node.getFirstChild().getNodeValue());
                System.out.println(node1.getNodeName()+" :: "+node1.getFirstChild().getNodeValue());
                System.out.println(node2.getNodeName()+" :: "+node2.getFirstChild().getNodeValue());
                System.out.println(node3.getNodeName()+" :: "+node3.getFirstChild().getNodeValue());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
