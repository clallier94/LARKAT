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

WebUI.navigateToUrl('https://preprod.iadholding.com/')

WebUI.click(findTestObject('Object Repository/Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Identifiant_username'), '2020@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IAD/input_Mot de passe_password'), 'M1qipU8GjAM=')

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Dmarrer'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Quitter'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Production'))

WebUI.click(findTestObject('Object Repository/Page_IAD/a_Myiad contacts'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Crer'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Nouveau contact_myiad-avatar'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Prnom_firstName'), 'RAJAA')

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Nom_lastName'), 'LARKAT')

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Choisir'))

WebUI.click(findTestObject('Object Repository/Page_IAD/span_MACAO'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Contact  Adresse'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Tlphone_phone2'), '06 45 85 45 87')

WebUI.click(findTestObject('Object Repository/Page_IAD/span_Enregistrer le contact'))

WebUI.closeBrowser()

