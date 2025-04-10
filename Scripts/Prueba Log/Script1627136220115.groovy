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

//WebUI.openBrowser('http://training.openspan.com/login')
WebUI.openBrowser(GlobalVariable.OpenSpan, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Prueba Log/Page_Sign In  Pega Studio Training Web Application/h1_Sign in to Pega Robotic Automation Training'), 
    2)

//WebUI.setText(findTestObject('Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a user name of at least 4 characters_user_name'), 
//   'Ricardo')
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a user name of at least 4 characters_user_name'), 
    'Ricardo')

WebUI.delay(2)

CustomKeywords.'entidad.OpcionComun.escribirTextoEncriptado'(findTestObject('Object Repository/Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_user_pass'), 
    '3lwydc8jGgE=')

//WebUI.setEncryptedText(findTestObject('Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_user_pass'), 
//  '3lwydc8jGgE=')
WebUI.takeScreenshot()

CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_login_button'))

//WebUI.click(findTestObject('Prueba Log/Page_Sign In  Pega Studio Training Web Application/input_Please enter a password of at least 4 characters_login_button'))
WebUI.takeScreenshot()

WebUI.closeBrowser()

