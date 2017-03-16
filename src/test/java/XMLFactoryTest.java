import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pl.sdaacademy.model.User;
import pl.sdaacademy.xmlFactory.XMLFactory;

/**
 * Created by k.czechowski83@gmail.com on 2017-03-13.
 */
public class XMLFactoryTest {
    private String login;
    private String password;
    private String xmlUserResult="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>Kowalski</login><password>abc123</password></User>";

    public String getXmlUserResult() {
        return xmlUserResult;
    }

    public XMLFactoryTest() {
    }

    @Before
    public void setUp() {
        login = "Kowalski";
        password = "abc123";
    }

    @Test
    public void objectToXML() {
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        User user = new User(login, password);
        String xmlUser = xmlFactory.objectToXML(user);
        System.out.println(xmlUser);
//        Assert.assertTrue(user.equals(xmlUser));
        Assert.assertEquals("xmlUser not correct",getXmlUserResult(),xmlUser);
    }

    @Test
    public void XMLToObject(){
        User userExpected=new User(login,password);
        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
        User userActual=xmlFactory.xmlToObject(xmlUserResult);
        Assert.assertTrue(userExpected.equals(userActual));
    }


}
