#!/bin/bash
# Compiling the java files and running them

# Compiling all of the java files
javac *.java -cp"../src/javahero" 
compile=$? 

#To put the system on hold for 3 seconds
sleep 3 

# Running the javahero.Test file with the main in it, cp = class path
java Test.class -cp"../src/javahero" 
run=$? 

echo "Compile Status: $compile"
echo "Run Status: $run"



exit 0