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

WebUI.callTestCase(findTestCase('Empxtrack Login'), [('url') : 'https://hrportal.empxtrack.com/empxtrack/logon.do?activity=display&__nored_=1&location=testbitssdnbhd&selMenuItemChoice=clear'
        , ('username') : 'empxt.latihan04@yopmail.com', ('password') : 'cIjZX7FQSD5JPNYeXpMicQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Empxtrack_Profile_Icon/Page_Home page/div_e'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_Profile_Icon/Page_Home page/a_Update password'), 0)

WebUI.click(findTestObject('Empxtrack_Profile_Icon/Page_Home page/a_Update password'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_Profile_Icon/Page_Home page/input_Old password_oldPassword'), 0)

WebUI.setEncryptedText(findTestObject('Empxtrack_Profile_Icon/Page_Home page/input_Old password_oldPassword'), password)

WebUI.setEncryptedText(findTestObject('Empxtrack_Profile_Icon/Page_Home page/input_New password_password'), shortPassword)

WebUI.setEncryptedText(findTestObject('Empxtrack_Profile_Icon/Page_Home page/input_Confirm password_cpassword'), shortPassword)

WebUI.click(findTestObject('Empxtrack_Profile_Icon/Page_Home page/a_Update'))

WebUI.verifyElementPresent(findTestObject('Empxtrack_Profile_Icon/Page_Home page/div_Invalid password. Policy Mix of numeric, lower case and upper case characters with minimum length of 6 characters'), 
    0)

