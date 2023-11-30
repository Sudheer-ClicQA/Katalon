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

WebUI.click(findTestObject('Object Repository/Cabs/Page_Cab Booking - Outstation cabs, Car Ren_73d4f1/span_Outstation One-way_CustomRadioButtonUI_db1216'))

WebUI.click(findTestObject('Object Repository/Cabs/Page_Cab Booking - Outstation cabs, Car Ren_73d4f1/span_Outstation Round trip_CustomRadioButto_52f97c'))

WebUI.click(findTestObject('Object Repository/Cabs/Page_Airport Taxi, Book Airport Cabs with u_16cb83/span_Airport transfer_CustomRadioButtonUIst_497a33'))

WebUI.setText(findTestObject('Object Repository/Cabs/Page_Book Hourly Car Rental  Save Upto 200 _aba43f/input_From_autosuggest'), 
    'Hyderabad')

