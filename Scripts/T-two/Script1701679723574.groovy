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

WebUI.click(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_check-in'))

WebUI.click(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_flight status'))

WebUI.click(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_manage booking'))

WebUI.click(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_Login'))

WebUI.setText(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/input_Email_css-1cwyjr8 r-homxoj r-13awgt0 _3c21b0'), 
    '9703948362')

WebUI.setEncryptedText(findTestObject('Object Repository/Spicejet/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/input_Password_css-1cwyjr8 r-homxoj r-13awg_28fcfc'), 
    'idygeP2nDz4QKwwkRs6Kgw==')

