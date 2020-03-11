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

WebUI.navigateToUrl('https://p3.demo.iadholding.com/')

WebUI.click(findTestObject('Object Repository/Page_Welcome page/header'))

WebUI.click(findTestObject('Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Page_IAD/input_Identifiant_username'), '15245@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('Page_IAD/input_Mot de passe_password'), 'M1qipU8GjAM=')

WebUI.click(findTestObject('Page_IAD/input_Identifiant_username'))

WebUI.click(findTestObject('Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Backoffice'))

WebUI.click(findTestObject('Object Repository/Page_IAD/li_Annuaire'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Annuaire'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_SOBIERAJ Laurie_mat-button-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_dition'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Numro de mobile 1'))

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.doubleClick(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Numro de mobile 1_mat-input-9'), '21 02 0')

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Veuillez saisir un numro de tlphone v_c6b225'), '05 12 56 56 66')

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Numro de mobile 1_mat-input-9'), '06 84 75 45 45')

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.doubleClick(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Email professionnel_mat-input-8'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Enregistrer'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Confirmer'))

