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

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Pokemon Team Builder/a_MOVES'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Moves/button_Show Filters'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Moves/select_---------  razor-wind  swords-dance _10f168'), 
    '470', true)

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Moves/button_Search'))

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Moves/li_cross-chop  fighting'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_cross-chop Details/h1_cross-chop Details'), 
    'cross-chop Details')

WebUI.closeBrowser()

