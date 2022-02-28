#!/bin/bash

# Abort if any errors occur
set -u -e

# Run this function if script is aborted before due to an error
on_exit() {
    echo "[-] There was an error; exiting now."
}
trap on_exit ERR

# Clean out all persisting class files
if [ -d dist ]; then 
    rm -r dist 
fi

# Compile .java files, and store bytecode in dist
javac -d ./dist *.java
echo "[+] Compilation complete. Running application..."

# FIXME manually copying image directory from splashscreen into dist
cp -r ./splashScreen/images ./dist/splashScreen

# Run bytecode from the dist folder using the JVM 
java -cp ./dist ApplicationRun