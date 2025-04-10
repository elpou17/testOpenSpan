import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint


WebUI.openBrowser(GlobalVariable.OpenSpan, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h1_Sign in to Pega Robotic Automation Training'), 3)

WebUI.takeScreenshot()

CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Login/input_Please enter a user name of at least 4 characters_user_name'), 
    findTestData('OpenSpan').getValue(1, 1))

WebUI.delay(3)

CustomKeywords.'entidad.OpcionComun.escribirTextoEncriptado'(findTestObject('Object Repository/Login/input_Please enter a password of at least 4 characters_user_pass'), 
    findTestData('OpenSpan').getValue(2, 1))

WebUI.delay(3)

WebUI.takeScreenshot()

CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Login/input_Please enter a password of at least 4 characters_login_button'))

WebUI.takeScreenshot()

//WebUI.acceptAlert()




