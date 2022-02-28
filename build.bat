:: Disabling the batch file from outputting every line run to the terminal
@echo off

:: Clean out all persisting class files
if exist dist ( rmdir /s /q dist )

:: Compile .java files from source list, and store bytecode in dist 
javac -d ./dist *.java

:: FIXME manually copying image directory from splashscreen into dist
xcopy "./splashScreen/images" "./dist/splashScreen/images" /i /q >nul

:: If there is an error, output error message, else output success message and run application
if %errorlevel% neq 0 (
	echo [-] There was an error; exiting now.	
) else (
	echo [+] Compilation complete. Running application...
	java -cp ./dist ApplicationRun
)