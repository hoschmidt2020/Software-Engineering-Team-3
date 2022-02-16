#!/bin/bash

# Abort if any errors occur
set -u -e

# Run this function if script is aborted before due to an error
on_exit() {
    echo "[-] There was an error; exiting now."	
}
trap on_exit ERR

# Compile java files into bytecode and store them in the dist folder
javac -d ./dist ./*.java
echo "[+] Compilation complete. Running application..."

# Run bytecode from the dist folder using the JVM 
java -cp ./dist ApplicationRun