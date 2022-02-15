:: Disabling the batch file from outputting every line run to the terminal
@echo off

:: Compile all of the java files in the current directory, and store class files in dist 
javac -d ./dist ./*.java

:: If there is an error, output error message, else output success message and run game
if %errorlevel% neq 0 (
	echo [-] There was an error; exiting now.	
) else (
	echo [+] Compilation complete. Running Game...
	java -cp ./dist ApplicationRun	
)