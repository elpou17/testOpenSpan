package entidad

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class OpcionComun {

	/**  Método: darClick
	 * * @params TestObject, Object.
	 * * Ejemplo:N/A
	 * * Verificar que exista un Elemento y luego dar clic.
	 * * @return Click
	 * * @author Miguel Pou
	 * * @since 03/09/2020
	 * * @author_Modified Ingeniero Miguel Pou
	 * * @since_Modified N/a
	 * * @comment_Modified
	 * * N/A.
	 * * N/A. */

	@Keyword
	def darClick(TestObject object) {
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true) {
			WebUI.click(object)
		}
	}

	/**  Método: escribirTexto
	 * * @params TestObject object, String string2.
	 * * Ejemplo: N/A
	 * * Verificar que exista un Elemento y luego escribe.
	 * * @return Click
	 * * @author Miguel Pou
	 * * @since 03/09/2020
	 * * @author_Modified Miguel Pou
	 * * @since_Modified N/a
	 * * @comment_Modified
	 * * N/A.
	 * * N/A. */

	@Keyword
	public void escribirTexto(TestObject object, String string2) {
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true) {
			WebUI.setText(object, string2)
		}
	}

	/**  Método: escribirTextoEncriptado
	 * * @params TestObject, Object, String string2.
	 * * Ejemplo: N/A
	 * * Verificar que exista un Elemento y luego escribe texto Encriptado.
	 * * @return Valor
	 * * @author Miguel Pou
	 * * @since 03/09/2020
	 * * @author_Modified Ingeniero Miguel Pou
	 * * @since_Modified N/a
	 * * @comment_Modified
	 * * N/A.
	 * * N/A. */

	@Keyword
	public void escribirTextoEncriptado(TestObject object, String string2) {
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true) {
			WebUI.setEncryptedText(object, string2)
		}
	}

	@Keyword
	public void Alerta(TestObject object, String string2) {
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true) {
			WebUI.acceptAlert()(string2)
		}
	}
}
