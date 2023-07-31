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

WebUI.verifyElementPresent(findTestObject('Homepage/title_CURA Healthcare Service'), 0)

WebUI.waitForElementPresent(findTestObject('Homepage/button_Make Appointment'), 0)

WebUI.click(findTestObject('Homepage/button_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('Login/title_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Login/text_Please login to make appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Login/button_Login'), 0)

WebUI.setText(findTestObject('Login/textbox_username'), 'John Doe')

WebUI.setText(findTestObject('Login/textbox_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Book Appointment/title_Make Appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Book Appointment/button_Book Appointment'), 0)

WebUI.selectOptionByValue(findTestObject('Book Appointment/dropdown_facility'), 'Seoul CURA Healthcare Center', false)

WebUI.uncheck(findTestObject('Book Appointment/checkbox_hospital readmission'))

WebUI.check(findTestObject('Book Appointment/radiobutton_None_programs'))

WebUI.setText(findTestObject('Book Appointment/date_Visit Date (Required)'), '02/07/2022')

WebUI.setText(findTestObject('Book Appointment/textarea_Comment'), 'Sore eyes')

WebUI.click(findTestObject('Book Appointment/button_Book Appointment'))

WebUI.waitForElementNotPresent(findTestObject('Appointment Confirmation/tittle_Appointment Confirmation'), 3)

WebUI.verifyElementNotPresent(findTestObject('Appointment Confirmation/tittle_Appointment Confirmation'), 10)

WebUI.click(findTestObject('Toggle menu/menu-toggle_CURA Healthcare'))

WebUI.click(findTestObject('Toggle menu/menu-toggle_History'))

WebUI.verifyElementPresent(findTestObject('History/title_History'), 0)

WebUI.verifyElementPresent(findTestObject('History/text_No appointment'), 10)

WebUI.closeBrowser()

