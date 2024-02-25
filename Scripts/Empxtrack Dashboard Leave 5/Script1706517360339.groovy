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

WebUI.waitForElementVisible(findTestObject('Empxtrack_DashLeave/Page_Home page/i_Earned Leave_fas fa-ellipsis-h'), 0)

WebUI.click(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/i_Earned Leave_fas fa-ellipsis-h'))

WebUI.click(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/i_Apply_fa fa-arrow-circle-right (1)'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.startDate (1)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.startDate (1)'), 
    '31/01/2024')

WebUI.click(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.endDate (1)'))

WebUI.sendKeys(findTestObject('Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.endDate (1)'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.endDate (1)'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/input_Step 1.Duration_date_dataObject.endDate (1)'), 
    '31/01/2024')

WebUI.setText(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/textarea_Step 2.Specify a reason for the le_ccdaad'), 
    'reason02')

WebUI.click(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/a_Apply'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/div_You can not create leave request since _34d67a'), 
    0)

WebUI.click(findTestObject('Object Repository/Empxtrack_DashLeave/Page_Home page/button_OK'))

