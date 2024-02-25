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

WebUI.click(findTestObject('Object Repository/Empxtrack_Profile/Page_Home page/div_Self services'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_Profile/Page_Home page/a_View or Edit Profile'), 0)

WebUI.click(findTestObject('Object Repository/Empxtrack_Profile/Page_Home page/a_View or Edit Profile'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_Profile/Page_Home page/a_Hobbies (1)'), 0)

WebUI.click(findTestObject('Empxtrack_Profile/Page_Home page/a_Hobbies (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Empxtrack_Profile/Page_Home page/a_Add (1)'))

WebUI.waitForElementVisible(findTestObject('Empxtrack_Profile/Page_Home page/input_Your Hobbies  Interests_hobbies0 (1)'), 
    0)

WebUI.click(findTestObject('Empxtrack_Profile/Page_Home page/i_Your Hobbies  Interests_fa fa-save (1)'))

WebUI.verifyElementPresent(findTestObject('Empxtrack_Profile/Page_Home page/div_Please enter valid text'), 0)

