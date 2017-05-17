#!/bin/bash
# Compiling the java files and running them

#get current directory
pwd

# Compiling all of the java files
javac -cp "src/javahero" *.java
compile=$? 

#To put the system on hold for 3 seconds
sleep 3 

# Running the javahero.Test file with the main in it, cp = class path
java -cp "src/javahero" Test.class
run=$? 

echo "Compile Status: $compile"
echo "Run Status: $run"



exit 0