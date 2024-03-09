package personal;

import org.testng.annotations.DataProvider;

public class datapro {
@DataProvider (name="auto")
public Object[][] data()
{
	return new Object[][]
	    {
		{"selenium","12345"},
		{"api","2345"}
					
        };
        
        
}
}
