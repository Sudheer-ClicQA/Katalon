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

WebUI.click(findTestObject('Object Repository/Trains/Page_Live Train Status, Spot Your Train wit_ebe134/span_Book Train tickets_styles_FswTripTypeI_d34499'))

WebUI.click(findTestObject('Object Repository/Trains/Page_PNR Status, Check Train PNR Status Enq_23b18d/span_Check PNR Status_styles_FswTripTypeIte_18daa6'))

WebUI.click(findTestObject('Object Repository/Trains/Page_Book Train Tickets Online, Use IRCTC L_471c60/span_IRCTC Authorized Partner_styles_FswTri_7fa31a'))

WebUI.click(findTestObject('Object Repository/Trains/Page_Book Train Tickets Online, Use IRCTC L_471c60/p_Enter Source Name'))

