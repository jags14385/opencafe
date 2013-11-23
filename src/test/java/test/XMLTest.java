package test;

import domain.Customer;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.StringReader;

public class XMLTest {

    @Test
    public void xmlUnMarshallTest() throws Exception {

        System.out.println("--XML--");

        JAXBContext jaxbContext = JAXBContext.newInstance(domain.Customer.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        StringBuffer xmlStr = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<customer id=\"14385\">\n" +
                "    <age>25</age>\n" +
                "    <name>Jags</name>\n" +
                "</customer>");

        Customer customer = (Customer) jaxbUnmarshaller.unmarshal(new StreamSource(new StringReader(xmlStr.toString())));
        System.out.println(customer);

        InputStream stream = XMLTest.class.getResourceAsStream("/hello.xml");
        customer = (Customer) jaxbUnmarshaller.unmarshal(stream);
        System.out.println(customer.getAge());

    }


}
