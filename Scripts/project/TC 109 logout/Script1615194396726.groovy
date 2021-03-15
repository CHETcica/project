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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/Cactusweb2/')

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('Object Repository/Page_Index of Cactusweb2/a_public'))

WebUI.click(findTestObject('Object Repository/Page_Cactus/img_contact us_icon-img-profile-onnav'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username or Email_txt_username_email'), 'CHETcica')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_txt_password'), 'ZA5/+7QilAHGnNaiE8Pihg==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_btn_login'))

WebUI.click(findTestObject('Object Repository/Page_Cactus/img_contact us_icon-img-profile-onnav_1'))

WebUI.click(findTestObject('Object Repository/Page_Cactus/a_Logout'))

WebUI.closeBrowser()

