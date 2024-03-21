# Bike Rental Service

Eine kleine Applikation zum Verwalten von Leihrädern. Das Projekt wurde angehalten und soll nun fortgeführt werden.

## Aufgaben

* Bestehenden Code sichten und verstehen
* Offensichtliche Fehler fixen für die Grundfunktionalität (Status, Ausleihen, Zurückgeben)
* Weitere Anforderungen umsetzen

## Basis-Anforderungen

* Es sollen Fahrräder ausgeliehen und zurückgegeben werden können über die Konsole
* Es soll jederzeit der aktuelle Status *aller* Fahrräder eingesehen werden können
* Beim Ausleihen sollen nur Fahrräder sichtbar sein, die nicht bereits ausgeliehen sind
* Beim Zurückgeben sollen nur Fahrräder sichtbar sein, die tatsächlich ausgeliehen sind
* Die Reihenfolge der Fahrräder soll in jedem Menü gleich sein
* Eine konsistente Menüführung für den Benutzer soll vorhanden sein (Alle Menüs sollen auf die gleiche Weise bedienbar
  sein)

## Weitere Anforderungen

* Es sind nun auch E-Bikes im Angebot. Erweitere das Datenmodell, um bei jedem Fahrrad die Eigenschaft, ob es ein E-Bike
  ist, sichtbar zu machen
* Beim Ausleihen soll es nicht mehr möglich sein, ein bestimmtes Fahrrad zu wählen, sondern es soll eine Auswahl über
  Kategorien ermöglicht werden. Folgende Kategorien soll es geben: "Normale Fahrräder" und "E-Bikes"
* Je nach Auswahl soll zufällig eines der in diese Kategorie fallenden Fahrräder ausgeliehen werden
