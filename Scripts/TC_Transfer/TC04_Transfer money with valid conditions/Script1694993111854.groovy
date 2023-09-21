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

Mobile.tap(findTestObject('Authentication/3_Dashboard/Dashboard_btn-navbar'), 0)

Mobile.tap(findTestObject('Authentication/3_Dashboard/1_Navbar/Dashboard_navbarOptions-Make a Transfer'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer/Transfer_pageTitle-Transfer'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer/Transfer_txt-title-Select Sending Account'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer/Transfer_txt-title-Select Receiving Account'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer/Transfer_dropdown-Send'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer/Transfer_dropdown-Receive'), 0)

Mobile.selectListItemByLabel(findTestObject('Transfer/Transfer_dropdown-Send'), 'Bank Acc A ($55000.00)', 0)

Mobile.tap(findTestObject('Transfer/Transfer_dropdownTxt-Sender Bank Acc A'), 0)

def selected_account_text = Mobile.getText(findTestObject('Transfer/Transfer_dropdownTxtValue-Bank Acc A'), 0)

def amountAccText = selected_account_text.replaceAll('[^0-9.]', '')

def amount = null

try {
    amount = Float.parseFloat(amountAccText)
}
catch (NumberFormatException e) {
    println("Error parsing amount: $e.message")
} 

if (amount != null) {
    txtTransferAmount = Mobile.setText(findTestObject('Transfer/Transfer_input-Transfer Amount'), '75000', 0)

    getTxtTransferAmount = Mobile.getText(findTestObject('Transfer/Transfer_input-Transfer Amount'), 0)

    floatTransferAmount = getTxtTransferAmount.replaceAll('[^0-9.]', '')

    floatTransferAmount = null

    try {
        floatTransferAmount = Float.parseFloat(getTxtTransferAmount)
    }
    catch (NumberFormatException e) {
        println("Error parsing amount: $e.message")
    } 
    
    println(floatTransferAmount)

    println(amount)

    if (floatTransferAmount > amount) {
        println('Transfer amount exceeds the maximum allowed amount. Please enter less amount to make it valid.')

        Mobile.setText(findTestObject('Transfer/Transfer_input-Transfer Amount'), '30000', 0)
    } else {
        Mobile.setText(findTestObject('Transfer/Transfer_input-Transfer Amount'), '75000', 0)
    }
} else {
    println('Error: Amount could not be parsed as a float.')
}

Mobile.selectListItemByLabel(findTestObject('Transfer/Transfer_dropdown-Receive'), 'Bank Acc B ($100000.00)', 0)

Mobile.tap(findTestObject('Transfer/Transfer_dropdownTxt-Receive Bank Acc B'), 0)

Mobile.tap(findTestObject('Transfer/Transfer_btn-Confirm Transfer'), 0)

Mobile.callTestCase(findTestCase('Reusable_Test/TC0_Terminate App'), [:], FailureHandling.STOP_ON_FAILURE)

