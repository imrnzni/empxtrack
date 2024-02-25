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

WebUI.click(findTestObject('Empxtrack_SSLeave/Page_Home page/div_Self services'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Leave transactions'), 0)

WebUI.waitForElementVisible(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Regularize attendance'), 0)

WebUI.click(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Regularize attendance'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_SSAttendance/Page_Home page/input_In time_inTime'), 0)

WebUI.sendKeys(findTestObject('Empxtrack_SSAttendance/Page_Home page/input_In time_inTime'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Empxtrack_SSAttendance/Page_Home page/input_In time_inTime'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Empxtrack_SSAttendance/Page_Home page/input_In time_inTime'), '08:00')

WebUI.click(findTestObject('Empxtrack_SSAttendance/Page_Home page/button_Done'))

WebUI.click(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Minus'))

WebUI.click(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Minus(1)'))

WebUI.setText(findTestObject('Empxtrack_SSAttendance/Page_Home page/textarea_0_commonNotesData'), 'Notes01')

WebUI.click(findTestObject('Empxtrack_SSAttendance/Page_Home page/a_Submit'))

WebUI.verifyElementPresent(findTestObject('Empxtrack_SSAttendance/Page_Home page/div_The workflow has been created'), 0)

