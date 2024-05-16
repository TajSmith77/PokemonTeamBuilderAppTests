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

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_POKEMON'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokedex/button_Show Filters'))

WebUI.setText(findTestObject('PokemonTeamBuilderApp/Page_Pokedex/input_Min SPEED_min_speed'), '80')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokedex/button_Apply Filters'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokedex/a_next'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokedex/li_49  venomoth  bug, poison'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_venomoth Details/h1_49 venomoth'), 
    '49 venomoth')

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_venomoth Details/li_Speed 90'), 'Speed: 90')

WebUI.closeBrowser()

