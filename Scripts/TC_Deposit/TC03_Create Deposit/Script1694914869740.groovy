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

Mobile.callTestCase(findTestCase('TC_Accounts/2_Create Account/TC02_Create Account with No Acc'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Authentication/3_Dashboard/Dashboard_btn-navbar'), 0)

Mobile.tap(findTestObject('Authentication/3_Dashboard/1_Navbar/Dashboard_navbarOptions-Make a Deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/Deposit_titleModal-Select Acc to Deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/Deposit_btn-Cancel'), 0)

Mobile.verifyElementVisible(findTestObject('Deposit/Deposit_dropdown-Bank Acc'), 0)

Mobile.selectListItemByLabel(findTestObject('Deposit/Deposit_dropdown-Bank Acc'), 'Bank Acc 1 ($50000.00)', 15)

Mobile.tap(findTestObject('Deposit/Deposito_btn-Bank Acc 1'), 0)

Mobile.setText(findTestObject('Deposit/Deposit_input-Enter Deposit Amount'), '5000', 0)

Mobile.tap(findTestObject('Deposit/Deposit_btn-Deposit'), 0)

