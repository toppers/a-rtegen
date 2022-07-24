@echo off
set SCRIPT=%~0
for /f "delims=\ tokens=*" %%z in ("%SCRIPT%") do (
   set BASEDIR=%%~dpz
)

java -cp "%BASEDIR%\..\lib\*" -DA_RTE_HOME="%BASEDIR%\.." -Djava.util.logging.config.file="%BASEDIR%\logging.properties" jp.ac.nagoya_u.is.nces.a_rte.app.RteGeneratorApp %*
