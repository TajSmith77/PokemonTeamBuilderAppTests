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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://pokemonteambuilder-env-2.eba-dimafhn3.us-east-2.elasticbeanstalk.com/home/')

WebUI.verifyTextPresent('LOGIN', false)

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_LOGIN'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/a_Register'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Registration Form/input_First name_first_name'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Registration Form/input_Last name_last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Registration Form/input_Username_username'), 'KatalonTestUser')

WebUI.setEncryptedText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Registration Form/input_Password_password'), 'DaViKV2JRFNByWBaTPSPNQ==')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Registration Form/button_Submit'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/input_Username_username'), 'KatalonTestUser')

WebUI.setEncryptedText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/input_Password_password'), 'DaViKV2JRFNByWBaTPSPNQ==')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_LOGOUT'), 'LOGOUT')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_PROFILE'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KatalonTestUsers Profile/li_Name Katalon, Test'), 'Name: Katalon, Test')

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KatalonTestUsers Profile/li_Username KatalonTestUser'), 'Username: KatalonTestUser')

WebUI.closeBrowser()

