#Aufgabe 1-1

##1 und 2
s0542820@saturn19:~/$ mvn -version
Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T18:29:23+01:00)
Maven home: /usr/local/maven
Java version: 1.8.0_40, vendor: Oracle Corporation
Java home: /usr/lib/jvm/java-8-oracle/jre
Default locale: de_DE, platform encoding: UTF-8
OS name: "linux", version: "3.13.0-48-generic", arch: "amd64", family: "unix"

##3
###a.)
- Opensource Webserver und Container
- Implentierung von Java Servlet / JavaServer Pages
- zur Ausführung von Webservices

###b.)
- /etc/init.d/tomcat7 start
- /etc/init.d/tomcat7 stop

s0542820@saturn19:~$ tomcat7-instance-create my-instance
You are about to create a Tomcat instance in directory 'my-instance'
* New Tomcat instance created in my-instance
* You might want to edit default configuration in my-instance/conf
* Run my-instance/bin/startup.sh to start your Tomcat instance

s0542820@saturn19:~/my-instance$ sh bin/startup.sh 
Using CATALINA_BASE:   /home/05/42820/my-instance
Using CATALINA_HOME:   /usr/share/tomcat7
Using CATALINA_TMPDIR: /home/05/42820/my-instance/temp
Using JRE_HOME:        /usr/lib/jvm/java-8-oracle
Using CLASSPATH:       /usr/share/tomcat7/bin/bootstrap.jar:/usr/share/tomcat7/bin/tomcat-juli.jar
Tomcat started.
Tomcat started
s0542820@saturn19:~/my-instance$ sh bin/shutdown.sh 
Using CATALINA_BASE:   /home/05/42820/my-instance
Using CATALINA_HOME:   /usr/share/tomcat7
Using CATALINA_TMPDIR: /home/05/42820/my-instance/temp
Using JRE_HOME:        /usr/lib/jvm/java-8-oracle
Using CLASSPATH:       /usr/share/tomcat7/bin/bootstrap.jar:/usr/share/tomcat7/bin/tomcat-juli.jar
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/common/classes], exists: [false], isDirectory: [false], canRead: [false]
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/common], exists: [false], isDirectory: [false], canRead: [false]
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/server/classes], exists: [false], isDirectory: [false], canRead: [false]
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/server], exists: [false], isDirectory: [false], canRead: [false]
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/shared/classes], exists: [false], isDirectory: [false], canRead: [false]
Apr 10, 2015 1:41:42 PM org.apache.catalina.startup.ClassLoaderFactory validateFile
WARNUNG: Problem with directory [/usr/share/tomcat7/shared], exists: [false], isDirectory: [false], canRead: [false]
Tomcat stopped
