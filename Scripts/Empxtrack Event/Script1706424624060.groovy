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

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/a_Add New Event'))

WebUI.setText(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/input_Subject_subject'), 'Subject01')

WebUI.setText(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/input_Location_location'), 'Location01')

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/input_Start date_date_selectedStartDate'))

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/a_31'))

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/input_Start time_startTime'))

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/div_0900'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/select_Duration'), '4:0', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/select_TimeZone'), timeZone, 
    false)

WebUI.click(findTestObject('Object Repository/Empxtrack_Event/Page_Home page/a_Save'))

WebUI.verifyElementPresent(findTestObject('Empxtrack_Event/Page_Home page/div_Confirmation'), 0)

