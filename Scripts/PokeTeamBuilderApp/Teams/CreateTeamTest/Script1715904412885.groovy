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

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Teams/button_Create Team'))

WebUI.setText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/input_Team Name_name'), 'KataTestTeam')

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/input_Public_is_public'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97'), 
    '68', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_gutsno-guardsteadfast'), 
    '56', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_ccc634'), 
    '271', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_ccc634_1'), 
    '90', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_ccc634_1_2'), 
    '32', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_ccc634_1_2_3'), 
    '39', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97_1'), 
    '612', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_unnerverivalrymold-breaker'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutbody-slamtake-downdou_7825e0'), 
    '141', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutbody-slamtake-downdou_7825e0_1'), 
    '277', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutbody-slamtake-downdou_7825e0_1_2'), 
    '156', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutbody-slamtake-downdou_7825e0_1_2_3'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97_1_2'), 
    '448', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_inner-focusjustifiedsteadfast'), 
    '53', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-danceheadbuttbody-slamtake-do_60a0ca'), 
    '220', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-danceheadbuttbody-slamtake-do_60a0ca_1'), 
    '218', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-danceheadbuttbody-slamtake-do_60a0ca_1_2'), 
    '274', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97_1_2_3'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_torrentrain-dish'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbutttacklebody-slamtake-downdoub_18edfb'), 
    '187', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbutttacklebody-slamtake-downdoub_18edfb_1'), 
    '235', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbutttacklebody-slamtake-downdoub_18edfb_1_2'), 
    '232', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbutttacklebody-slamtake-downdoub_18edfb_1_2_3'), 
    '231', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97_1_2_3_4'), 
    '230', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_sniperdampswift-swim'), 
    '49', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_4ff3fc'), 
    '200', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_4ff3fc_1'), 
    '89', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_4ff3fc_1_2'), 
    '185', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_headbuttbody-slamtake-downdouble-edg_4ff3fc_1_2_3'), 
    '591', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_---------  bulbasaur  ivysaur  venus_990c97_1_2_3_4_5'), 
    '257', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_blazespeed-boost'), 
    '121', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutheadbuttbody-slamtake_ab05fc'), 
    '291', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutheadbuttbody-slamtake_ab05fc_1'), 
    '143', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutheadbuttbody-slamtake_ab05fc_1_2'), 
    '482', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/select_swords-dancecutheadbuttbody-slamtake_ab05fc_1_2_3'), 
    '574', true)

WebUI.click(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_Create Team/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PokemonTeamBuilderApp/Page_KataTestTeam Details/h1_KataTestTeam Members'), 
    'KataTestTeam Members')

WebUI.closeBrowser()

