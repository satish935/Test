*** Settings ***
Library     Selenium2Library
Library     BuiltIn
Library     ExcelRobot



*** Keywords ***

Edit Excel
    ExcelRobot.Open Excel       PracticeExcel.xls


*** Test Cases ***
Verify Excel is open
    ExcelRobot.Open Excel
    ExcelRobot.Open Excel To Write

