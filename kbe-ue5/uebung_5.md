#1
##a.)
$ mvn --version
    Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T18:29:23+01:00)
    Maven home: /usr/local/maven
    Java version: 1.8.0_40, vendor: Oracle Corporation
    Java home: /usr/lib/jvm/java-8-oracle/jre
    Default locale: de_DE, platform encoding: UTF-8
    OS name: "linux", version: "3.13.0-48-generic", arch: "amd64", family: "unix"

##c.)
- Source code liegt in src
- java main
- beim ausfüren sollte *hello world* auf der Konsoloe ausgegeben werden

##d.)
###Build Lifecycle
1. validate
2. compile
3. test
4. package
5. integration-test
6. verify
7. install
8. deploy

##e.)
    $ mvn compile
    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building kbe_ue5_1 1.0
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ kbe_ue5_1 ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/src/main/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ kbe_ue5_1 ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 1 source file to /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/target/classes
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 1.667 s
    [INFO] Finished at: 2015-05-22T12:47:40+02:00
    [INFO] Final Memory: 13M/212M
    [INFO] ------------------------------------------------------------------------

Es wird der Ordner *target* angelegt in welchem die kompilierten Klassen abgelegt werden.

##f.)
$ mvn exec:java -Dexec.mainClass="de.htw_berlin.ai_bachelor.kbe.App"
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building kbe_ue5_1 1.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.3.2:java (default-cli) @ kbe_ue5_1 ---
[WARNING] Warning: killAfter is now deprecated. Do you need it ? Please comment on MEXEC-6.
Hello World!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.819 s
[INFO] Finished at: 2015-05-22T13:09:18+02:00
[INFO] Final Memory: 9M/150M
[INFO] ------------------------------------------------------------------------

Ja.

##g.)
    $ mvn test
    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building kbe_ue5_1 1.0
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ kbe_ue5_1 ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/src/main/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ kbe_ue5_1 ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ kbe_ue5_1 ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/src/test/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ kbe_ue5_1 ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 1 source file to /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/target/test-classes
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ kbe_ue5_1 ---
    [INFO] Surefire report directory: /home/05/42820/repos/kbe/kbe-ue5/kbe_ue5_1/target/surefire-reports

    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running de.htw_berlin.ai_bachelor.kbe.AppTest
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec

    Results :

    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 1.950 s
    [INFO] Finished at: 2015-05-22T13:13:52+02:00
    [INFO] Final Memory: 13M/158M
    [INFO] ------------------------------------------------------------------------

Im *target* werden die Unterordner *surefire-reports* und *test-classes* mi den kompilierten Test-Klassen. 

##h.)
Struktur wird neu angelegt und files kompiliert.

##i.)
Läuft.

##j.)
Build läuft.
Es werden die .jar und die .pom im home unter .m2 abgelegt.

##k.)
*target* wird gelöscht, also das komplette Kompilat.

#2.)
##e.) Es passiert nichts, da die Klassen nicht von App verwendet werden.

#Beleg
##2.) 
###Warum ist JUnit ein Framework? 
- Ist ein wiederverwendbarer Entwurf
- Hat eine Implementierung
- Ist für ein bestimmtes Anwendungsgebiet
- Wird von Entwicklern erweitert (wahrscheinlich)
- Don‘t call us, we‘ll call you!

###Welche Fälle müssen bedacht werden?
Alle vorstellbaren und unvorstellbaren Use-Cases.