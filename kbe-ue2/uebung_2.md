#KBE - Übung 2

##a.)
1. Nein, EE erweitert SE, ist also davon abhängig.
2. 
    - Objektrelationales Mapping
    - multitier architecture
    - Webservices
3.
    - *convention over configuration*
    - *annotations*
4. *convention over configuration*: (*Designparadigma*) der Entwickler sollte sich in den meisten Fällen den durch die Implementierung vorgegebenen Konventionen beugen, statt selbst zu konfigurieren (Konfiguration ist so vorgegeben, dass diese für die meisten Anwendungsfälle ausreicht)
5. Schichtarchitektur: Aufteilung in einzelne Schichten deren Komponenten einem der Schicht zugeordnetem Zweck dienen. Des weiteren greifen höhere Schichten auf die Charakteristiken der Unteren zu, nicht aber umgekehrt.
6. Weil es MVC ist. (*halbrichig, Schichten sollten eigentlich physikalisch getrennt sein*)
7. Das *Web Profile* definiert eine Sammlung von Komponenen der EE die für die Entwicklung von Webanwendungen verwendet werden können.

##c.)
- presentation-oriented: generiert interaktive Webseiten mit (HTML, XHML, XML...) und dynamische Inhalte für eingegangene Anfragen, vom Menschen nutzbar
- service-oriented: implementiert den Endpunkt eines Webservices, gibt also eine Mannigfaltigkeit von Daten zurück, von Maschinen nutzbar

##d.)
Schritte der Entwicklung einer Web-Applikation
1. Code der Web-Komponente entwickeln (die Funktionalität), i.e. ManagedBeans, Facelets, Utilities
2. Entwickeln des Application Deployment Desciptors (Informationen die der Sever braucht um die Applikation zu starten und laufen zu lassen, i.e. die web.xml)
3. Komplilieren der Web-Applikation und Helferklassen
4. Web-Applikation in Entwicklungseinheit verpacken, i.e. WAR-File
5. Web-Applikation in einem Container einbauen
6. Web-Applikation über URL ansteuern

##e.) 
- FlowScoped: Objekt wird nur in einem bestimmten Anwendungsverlauf gespeichert, also einen vordefinierten Pfad von Interaktionen des Benutzers mit der Applikation
- Dependent: Exisitiert nur im Rahmen der Existenz eines anderen Objekts

##f.)
FlowScoped taucht in der Beschreibung nicht auf. Wieso?
CDI - Context and Dependency Injection
