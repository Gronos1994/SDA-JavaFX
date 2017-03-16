import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sdaacademy.model.Adress;
import pl.sdaacademy.model.Company;
import pl.sdaacademy.model.StreetPrefix;
import pl.sdaacademy.model.User;
import pl.sdaacademy.service.DataService;

import java.util.List;

public class DataServiceTest {
    private DataService dataService;
    private String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>Kowalski</login><password>abc123</password></User>";
    private User userFromLoad;
    private User xmlUser;
    private User userXML;
    private Company company;

    @Before
    public void setUp() throws Exception {
        company = new Company();
        company.setName("Biedronka");
        company.setAdress(new Adress("Cwiartki","3", "4","60-666","Poznań","Poland", StreetPrefix.STREET));
        company.setNip("342435353");
        dataService = new DataService();
        userXML = new User("Kowalski", "abc123");
    }

    public void loadData() {
        userFromLoad = dataService.loadUserFromData();
    }

    public void saveData() {
        dataService.saveData(xmlString);
    }

    @Test
    public void saveAndLoadData() {
        saveData();
        loadData();
        Assert.assertTrue(userFromLoad.equals(userXML));

    }

    @Test
    public void prinCompanyInfo() {
        List<String> companyInfo = dataService.printCompanyInfo(company);
        boolean resultAssert = true;
        resultAssert &= companyInfo.get(0).equals("Biedronka");
        System.out.println("resultAssert" + resultAssert);
        resultAssert &= companyInfo.get(1).equals("ul.Cwiartki 3/4\n60-666 Poznań");
        System.out.println("resultAssert" + resultAssert);

        resultAssert &= companyInfo.get(2).equals("342435353");
        System.out.println("resultAssert" + resultAssert);

        for (String line: companyInfo){
            System.out.println(line);
        }
        Assert.assertTrue(resultAssert);



    }

}
