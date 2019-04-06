Anwendung: "Handyreparatur"

Kurzbeschreibung: Verwaltungstool von Reparaturaufträgen für die Mitarbeiter


Verwendete Technologien:


Maven als Build-Werkzeug und zur Paketverwaltung, zur Erleichterung der Probleme mit Abhängigkeiten.
Für die Jakarta EE notwendigen APIs werden in das Projekt eingebunden.
Apache Tomcat wird als Server für das Deployen benutzt.

Der Quellcode der Anwendung ist dabei wie folgt strukturiert:

Die Servlets dienen als Controller-Schicht und reagieren auf Events.
Die Enterprise Java Beans dienen als Model-Schicht und kapseln die fachliche Anwendungslogik.

Die Persistence Entities modellieren das Datenmodell, für die Zugriffe auf die Datenbank.
Die View wird durch Java Server Pages in Form von HTML-Strukturen erstellt.


Folgende Entwicklungswerkzeuge kommen dabei zum Einsatz:



NetBeans: Freie Entwicklungsumgebung, die hauptsächlich für Java gemacht wurde
Maven:	  Build-Werkzeug zur Erleichterung der Abhängigkeitsprobleme

GitHub:   Versionsverwaltung des Quellcodes zur besseren Collaboration
TomEE:    Applikationsserver zum lokalen Testen der Anwendung



Copyright


Michael Ihly   ihly.michael@gmail.com
Jonas   Braun  braun.jonas1996@gmail.com

Github Link: 
https://github.com/JonasBraun1996/Verteilte-Systeme-Handyreparatur


