package cn.tjuscs.selenium;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 


public class TestBaidu {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	@Before
	public void setUp() {
		 System.setProperty("webdriver.gecko.driver", "fox\\geckodriver.exe");
	     driver = new FirefoxDriver();
		 js = (JavascriptExecutor) driver;
		 vars = new HashMap<String, Object>();
	}
	public static String[][] readExeclFile() throws Exception {
		 // 创建输入流
		 //InputStream in = new FileInputStream("F:\\Selenium+Lab2020.xlsx");
		 // 创建工作空间
		 String str[][] = new String[50][5000];
		 XSSFWorkbook wb = new XSSFWorkbook("F:\\Selenium+Lab2020.xlsx");
		 // 获取工作表
		 XSSFSheet sheet = wb.getSheetAt(0);// 获取第一个工作表
		 // 获取总行数
		 int rowNums = sheet.getLastRowNum();
		 // 获取总列数
		 int colNums = sheet.getPhysicalNumberOfRows();
		 // 工作行
		 Row row = null;
		 // 工作单元格
		 Cell cell = null;
		 // 循环遍历每行的内容
		 for (int i = 1; i <= 20; i++) {
		 // 获取第i行的工作行，第0行是列头，所以从第1行开始
		 row = sheet.getRow(i);
		 // 获取每个单元格的值
		 for (int j =1; j<3; j++) {
		 cell = row.getCell(j);
		 str[i][j-1]=cell.toString();
		 }
		 }
		 return str;
		 
		 }

	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testBD() throws Exception {
	 driver.get("http://103.120.226.190/selenium-demo/git-repo");
	 driver.manage().window().setSize(new Dimension(1936, 1056));
	 String ans[][]= new String[50][5000];
	 ans=readExeclFile();
//	 for(int i =1;i<21;i++) {
//		 for(int j=0;j<2;j++) {
//			 System.out.print(ans[i][j]);
//		 }
//	 }
	 for(int a=1;a<21;a++) {
		 driver.findElement(By.name("user_number")).click();
		 driver.findElement(By.name("user_number")).sendKeys(ans[a][0]);
		 driver.findElement(By.name("password")).click();
		 driver.findElement(By.name("password")).sendKeys(ans[a][1]);
		 driver.findElement(By.cssSelector(".btn.btn-primary.btn-user.btn-block")).click();

	 }
	 
	}
}