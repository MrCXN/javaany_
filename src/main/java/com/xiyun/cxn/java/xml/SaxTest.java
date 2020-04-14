package xiyun.cxn.java.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * @program javaany_
 * @description: sax 解析xml测试类
 * @author: cxn
 * @create: 2019/11/25 13:56
 */
public class SaxTest {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLReader xmlReader = saxParser.getXMLReader();
            xmlReader.setContentHandler(new DefaultHandler() {
                @Override
                public void startDocument() throws SAXException {
                    super.startDocument();
                    System.out.println("开始解析整个xml文档");
                }

                @Override
                public void endDocument() throws SAXException {
                    super.endDocument();
                    System.out.println("结束解析整个xml文档");
                }

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    super.startElement(uri, localName, qName, attributes);
                    System.out.println("开始解析元素：" + qName);
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);
                    System.out.println("结束解析标签： " + qName);
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    super.characters(ch, start, length);
                    String value = new String(ch, start, length);
                    System.out.println("找到一个值： " + value);
                }
            });

            xmlReader.parse("/Users/cxn/Downloads/untitled.xml");
            System.out.println(xmlReader.toString());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
