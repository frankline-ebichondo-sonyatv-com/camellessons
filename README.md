camellessons
============
Camel lessons is a simple application testing out camel functionality as I learn it. May you find this useful too.

Obtaining 
----------
1. Make sure  you have maven and git installed on your environment
2. Obtain a copy of the code by running the following command
   git clone https://github.com/frankline-ebichondo-sonyatv-com/camellessons <folderchoice>

Compiling
----------
1. Go into the folder and run:
   mvn install.
2. You can run other maven commands to test, deploy and clean the application (maven will not be discussed here)
 
Running
-------
1. Camel plays nic with activeMQ, so this example has been made to run in activeMQ.
2. Insert ftp credentials in the properties file located at src/resources/config.properties.
3. Add all files to be accessed in the ftp location.
4. Startup activeMQ with the connectors tcp://localhost:61616
5. Go to the camellessons folder and run
   mvn exec:java -Dexec.mainClass="com.sonyatv.camel.App"
6. You can check your queue via the activemq web console.
