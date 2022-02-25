#!/bin/bash

# Abort if any errors occur
set -u -e

# Run this function if script is aborted before due to an error
on_exit() {
    echo "[-] There was an error; exiting now."
    rm *.class
}
trap on_exit ERR

# Compile java files into bytecode and store them in the dist folder
javac splashScreen/splashScreen.java ApplicationRun.java Controller.java DBService.java Graphics.java View.java
echo "[+] Compilation complete. Running application..."

# Run bytecode from the dist folder using the JVM 
java ApplicationRun
rm *.class