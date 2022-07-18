package scripts;



import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import genericlib.Screenshot;
import pomPages.AddtoCartpage;
import pomPages.SkillraryDemoLoginpage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() throws IOException {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		
		SkillraryDemoLoginpage sd = new SkillraryDemoLoginpage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtoCartpage a = new AddtoCartpage(driver);
		driverutilities.doubleClick(driver, a.getAddbtn());
		a.addtocartpage();
		driverutilities.alertpopup(driver);
		
		Screenshot s1=new Screenshot();
		s1.getPhoto(driver, null);
		
	}
		
		
	
	

}
