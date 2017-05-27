@echo off
:: Set JAVA_HOME with the jdk and jre bin folder 
:: (for current user)

FOR /d %%i in ("java=\Program Files\Java\jdk*,\Program Files\Java\jre*") DO set "JAVA_HOME=%JAVA_HOME%;%%i\bin"

:: Save JAVA_HOME into path 
:: (only for the current session)

set "path=%path%;%JAVA_HOME%"

:: Display Variables 

echo ---- JAVA_HOME ----
set "str=%JAVA_HOME%"
FOR %%S in ("%str:;=" "%") DO echo %%~S
echo -------------------

echo ------ PATH -------
set "str=%Path%"
FOR %%S in ("%str:;=" "%") DO echo %%~S
echo -------------------

pause
exit


::======================================================
:: Print function to print env varaibles for %path% and %JAVA_HOME% But it still is buggy
::======================================================

:print
set list=%1
set list=%list:"=%
set "str=%list%"
FOR %%S in ("%str:;=" "%") DO echo %%~S
exit /b

