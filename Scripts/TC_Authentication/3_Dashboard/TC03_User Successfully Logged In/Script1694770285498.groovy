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

Mobile.callTestCase(findTestCase('TC_Authentication/1_Login/TC01_Login with valid user'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_titlePage-Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_txt-Welcome'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_logo-Bank'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_msg-Dont Have Bank Acc'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_btn-navbar'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_btn-Add Account'), 0)

