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

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_TEAMS'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/input_Username_username'), 'KataTeams')

WebUI.setEncryptedText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Login/button_Submit'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_TEAMS'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Teams/li_KataTestTeam'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KataTestTeam Details/button_Edit'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Edit Team/input_Team Name_name'), 'KataTestTeamEdited')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Edit Team/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KataTestTeamEdited Details/h1_KataTestTeamEdited Members'), 
    'KataTestTeamEdited Members')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KataTestTeamEdited Details/button_Edit'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Edit Team/input_Team Name_name'), 'KataTestTeam')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Edit Team/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KataTestTeam Details/h1_KataTestTeam Members'), 
    'KataTestTeam Members')

WebUI.closeBrowser()

