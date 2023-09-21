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

Mobile.callTestCase(findTestCase('Reusable_Test/TC0_Launch Exist App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Authentication/1_Login Page/Login_btn_Create Profile'), 0)

Mobile.verifyElementExist(findTestObject('Authentication/2_Register Page/Register_btn-Back to Login'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_txt-titlePage-Create Profile'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-First Name'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-Last Name'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-Username'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-Password'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-Confirm Password'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-Country'), 0)

def randomFirstName = 'Jeon' + CustomKeywords.'random.utility.randomNumber.RandomNumber5'()

def randomLastName = 'Wonwoo' + CustomKeywords.'random.utility.randomNumber.RandomNumber5'()

def randomUsername = 'wonu_svt' + CustomKeywords.'random.utility.randomNumber.RandomNumber5'()

// Set the random values in global variables
GlobalVariable.FirstName = randomFirstName

GlobalVariable.LastName = randomLastName

GlobalVariable.Username = randomUsername

def inputField = Mobile.verifyElementVisible(findTestObject('Authentication/2_Register Page/Register_input-First Name'), 
    10)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-First Name'), randomFirstName, 0)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-Last Name'), randomLastName, 0)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-Country'), GlobalVariable.Country, 0)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-Username'), randomUsername, 0)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-Password'), GlobalVariable.Password, 0)

Mobile.setText(findTestObject('Authentication/2_Register Page/Register_input-Confirm Password'), GlobalVariable.Password, 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Authentication/2_Register Page/Register_btn-Create Profile'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Authentication/1_Login Page/Login_txt-titlePage-Bank App Demo'), 10)

Mobile.setText(findTestObject('Authentication/1_Login Page/Login_input-Uname'), randomUsername, 0)

Mobile.verifyElementVisible(findTestObject('Authentication/1_Login Page/Login_input-Pw'), 10)

Mobile.setText(findTestObject('Authentication/1_Login Page/Login_input-Pw'), 'Wonusvt123', 0)

Mobile.checkElement(findTestObject('Authentication/1_Login Page/Login_checkBox_Remember Credentials'), 0)

Mobile.tap(findTestObject('Authentication/1_Login Page/Login_btn_Login'), 0)

Mobile.pressBack()

