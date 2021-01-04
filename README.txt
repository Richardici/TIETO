Schéma súbora pre prípadne vytvorenie vlastneho predpisu topológie:
1. Súbor músi byť uložený vo formáte *.json
2. Samotná schéma súboru:
[
	{"ipAddress": "100.22.1.0",
	 "links": 3,
	 "name": "Router1",
	 "connectedTo": []
	},
	{"ipAddress": "100.21.1.0",
	 "links": 3,
	 "name": "Router2",
	 "connectedTo": ["Router3, Router1"]
	},
	{"ipAddress": "100.25.1.0",
	 "links": 3,
	 "name": "Router3",
	 "connectedTo": [ "Router1"]
	},
	{"ipAddress": "100.26.1.0",
	 "links": 1,
	 "name": "Router4",
	 "connectedTo": [ "Router1"]
	}
 ]
je to pole daných routers.
ipAddress- ip Adresa Routra
links- počet lokálnych PC pripojených na daný router(IP adresa lokálnych PC sa vypočíta na základe IP adresy routra)
name- jednoznačný identifikátor routra
connectedTo- pole, ktoré špecifikuje ako sú prepojené dané routers v topologii.

SPUSTENIE:
Testované na lokálnom servery Tomcat v7.0
Pred spustením servera je potrebné do priečinka Tomcat/webapps skopírovať priložený .wav súbor.
Potom spustiť súbor Tomcat/bin/startup, ktorý spustí server a následne do prehliadiača zadať https://localhost:8080/com.topology/ (port a host zaleži na konfigurácii servra)   