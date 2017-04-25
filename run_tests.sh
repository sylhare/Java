#!/bin/bash
# Compiling the java files and running them

javac scr/*.java  # Compiling all of the java files
compile=$? 
java -cp ./scr Test  # Running the Test file with the main in it, cp = class path
run=$? 

# Watching a movie after work

timeout 100 firefox https://www.youtube.com/watch?v=wdxlc2UdAmg
movie=$? 

echo "Compile Status: $compile"
echo "Run Status: $run"
echo "Movie Status: $movie"

sleep 90 #To put the system on hold for 90 seconds

exit 0