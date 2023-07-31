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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.setViewPortSize(GlobalVariable.ViewPortWidth, GlobalVariable.ViewPortHeight)

WebUI.verifyElementPresent(findTestObject('Homepage/title_CURA Healthcare Service'), 0)

WebUI.verifyElementPresent(findTestObject('Homepage/button_Make Appointment'), 0)

WebUI.click(findTestObject('Homepage/button_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('Login/title_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Login/text_Please login to make appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Login/button_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Toggle menu/menu-toggle_CURA Healthcare'), 0)

WebUI.click(findTestObject('Toggle menu/menu-toggle_CURA Healthcare'))

WebUI.verifyElementPresent(findTestObject('Toggle menu/menu-toggle_Home'), 0)

WebUI.verifyElementPresent(findTestObject('Toggle menu/menu-toggle_Login'), 0)

WebUI.closeBrowser()

