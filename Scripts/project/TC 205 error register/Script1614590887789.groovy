import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/Cactusweb2/')

WebUI.click(findTestObject('Object Repository/Page_Index of Cactusweb2/a_public'))

WebUI.click(findTestObject('Object Repository/Page_Cactus/span__navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Page_Cactus/img_contact us_icon-img-profile-onnav'))

WebUI.click(findTestObject('Object Repository/Page_Login/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Username_txt_username'), 'biw')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Email_txt_email'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_txt_email'), 'biw@123gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_password_txt_password1'), 'ZA5/+7QilAHGnNaiE8Pihg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_password_txt_password'), 'ZA5/+7QilAHGnNaiE8Pihg==')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Default checkbox_btn_register'))

WebUI.verifyTextPresent('sorry username already exists', false)

WebUI.closeBrowser()

