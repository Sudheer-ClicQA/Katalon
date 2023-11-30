import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.goibibo.com/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Bus/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Daily Steal Deals  Special Discounts_l_c0692f'))

WebUI.click(findTestObject('Object Repository/Bus/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/p_Hotels'))

WebUI.click(findTestObject('Object Repository/Bus/Page_Book Train Tickets Online, Use IRCTC L_471c60/p_Trains'))

WebUI.click(findTestObject('Object Repository/Bus/Page_Book Train Tickets Online, Use IRCTC L_471c60/p_Cabs'))

WebUI.click(findTestObject('Object Repository/Bus/Page_Cab Booking - Outstation cabs, Car Ren_73d4f1/p_Bus'))

WebUI.click(findTestObject('Object Repository/Bus/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Daily Steal Deals  Special Discounts_l_c0692f'))

WebUI.delay(5)

WebUI.closeBrowser()
