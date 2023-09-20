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

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_txt-Welcome'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/3_Dashboard/Dashboard_msg-Dont Have Bank Acc'), 0)

Mobile.tap(findTestObject('Authentication/3_Dashboard/Dashboard_btn-Add Account'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_titleModal-Add Acc'), 
    0)

Mobile.verifyElementVisible(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_btn-Add'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_btn-Cancel'), 0)

Mobile.setText(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_input-Acc Name'), 'Bank Acc A', 0)

Mobile.setText(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_input-Initial Balance'), '50000', 
    0)

Mobile.tap(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_btn-Add'), 0)

Mobile.tap(findTestObject('Accounts/2_Account Exists/Accounts_btn-PlusAcc'), 0)

Mobile.setText(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_input-Acc Name'), 'Bank Acc B', 0)

Mobile.setText(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_input-Initial Balance'), '100000', 
    0)

Mobile.tap(findTestObject('Accounts/1_No Account Before/1_Modal Card/ModalAccounts_btn-Add'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

