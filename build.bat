:: Disabling the batch file from outputting every line run to the terminal
@echo off

:: Compile all of the java files in the current directory, and store class files in dist
javac splashScreen/splashScreen.java ApplicationRun.java Controller.java DBService.java Graphics.java View.java

:: If there is an error, output error message, else output success message and run application
if %errorlevel% neq 0 (
	echo [-] There was an error; exiting now.	
	del *.class
) else (
	echo [+] Compilation complete. Running application...
	java ApplicationRun
	del /s /q *.class
)