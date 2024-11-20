import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


String username = ""
String password = ""

try{

TestData OpenSpan = findTestData('null')

for (int i = 1; i <= OpenSpan.getRowNumbers(); i++) {

	if(OpenSpan.getObjectValue('estado', i).toString().equalsIgnoreCase('TRUE')){
		usuario  = OpenSpan.getObjectValue('Username', i).toString()
		password = OpenSpan.getObjectValue('Password', i).toString()
	}
}

WebUI.openBrowser(GlobalVariable.OpenSpan)

WebUI.takeScreenshot()

CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Login/input_Please enter a user name of at least 4 characters_user_name'), username)

/**CustomKeywords.'entidad.OpcionComun.escribirTexto'(null, null)
 CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject(''), username , GlobalVariable.tiempoEspera)
 CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject(''),	findTestData('null').getValue(1, 1))
 CustomKeywords.'entidad.OpcionComun.escribirTextoEncriptado'(findTestObject(''),findTestData('null').getValue(2, 1))
 entidad.OpcionComun.setText(findTestObject('Object Repository/Login/TxtDocumentoIdentidad'), username , GlobalVariable.tiempoEspera)
 **/

}catch (Exception e) {
println('Error al ejecutar el login. ' + (e))
}

