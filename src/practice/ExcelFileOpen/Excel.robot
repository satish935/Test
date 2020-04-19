*** Settings ***
Library     Selenium2Library
Library     BuiltIn
Library     ExcelRobot



*** Keywords ***

Edit Excel
    ExcelRobot.Open Excel       PracticeExcel.xls
    ExcelRobot.Close Excel

*** Test Cases ***
Verify Excel is open
    ExcelRobot.Open Excel
    ExcelRobot.Open Excel To Write

