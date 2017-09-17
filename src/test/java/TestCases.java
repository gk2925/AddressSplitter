import org.junit.Assert;
import org.junit.Test;

public class TestCases {

@Test
    public void addressTest()
{
    AddressSplitter splitter = new AddressSplitter();
    Assert.assertEquals("Winterallee",splitter.getStreetName("Winterallee 3"));
    Assert.assertEquals("3",splitter.getStreetNumber("Winterallee 3"));

    Assert.assertEquals("Musterstrasse",splitter.getStreetName("Musterstrasse 45"));
    Assert.assertEquals("45",splitter.getStreetNumber("Musterstrasse 45"));

    Assert.assertEquals("Blaufeldweg",splitter.getStreetName("Blaufeldweg 123B"));
    Assert.assertEquals("123B",splitter.getStreetNumber("Blaufeldweg 123B"));

    Assert.assertEquals("Am Bachle",splitter.getStreetName("Am Bachle 23"));
    Assert.assertEquals("23",splitter.getStreetNumber("Am Bachle 23"));

    Assert.assertEquals("Auf der Vogelwiese",splitter.getStreetName("Auf der Vogelwiese 23 b"));
    Assert.assertEquals("23 b",splitter.getStreetNumber("Auf der Vogelwiese 23 b"));

    Assert.assertEquals("Broadway Av",splitter.getStreetName("200 Broadway Av"));
    Assert.assertEquals("200",splitter.getStreetNumber("200 Broadway Av"));

    Assert.assertEquals("Calle Aduna",splitter.getStreetName("Calle Aduna,29"));
    Assert.assertEquals("29",splitter.getStreetNumber("Calle Aduna,29"));

    Assert.assertEquals("rue de la revolution",splitter.getStreetName("4, rue de la revolution"));
    Assert.assertEquals("4",splitter.getStreetNumber("4, rue de la revolution"));

    Assert.assertEquals("Almstadtstrasse",splitter.getStreetName("Almstadtstrasse,17"));
    Assert.assertEquals("Almstadtstrasse",splitter.getStreetName("17 Almstadtstrasse"));

    Assert.assertEquals("Almstadtstrasse",splitter.getStreetName("Almstadtstrasse 17"));
    Assert.assertEquals("TestStreet Turmstardse",splitter.getStreetName("TestStreet Turmstardse 17"));

    Assert.assertEquals("14",splitter.getStreetNumber("14,TestStreet"));
    Assert.assertEquals("14",splitter.getStreetNumber("14 TestStreet"));

    Assert.assertEquals("16",splitter.getStreetNumber("Test street 16"));
    Assert.assertEquals("16 C",splitter.getStreetNumber("Test street 16 C"));
}


}
