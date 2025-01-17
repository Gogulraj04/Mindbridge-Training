package Day14.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class xml_decoding extends DefaultHandler {
    public static void main(String[] args) {
        try{
            SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
            SAXParser saxParser= saxParserFactory.newSAXParser();
            saxParser.parse("/Users/gogul/Documents/Training/Mindbridge Training/src/Day14/xml/college.xml",new xml_decoding());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void startDocument() throws SAXException{
        System.out.println("Started..!");
    }

    @Override
    public void endDocument() throws SAXException{
        System.out.println("Ended..!");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        System.out.println("Start Element :: "+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        System.out.println("End Element :: "+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters :: "+new String(ch,start,length));
    }
}
