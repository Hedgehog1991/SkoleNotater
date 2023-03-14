Større oppgaver
Velg én for nå og fortsett med den andrei løpet av semesteret som mengdetrening(selvstudie).

Dissetooppgavene ervage, hvor et utgangspunkt for hver av oppgavene vil bli gitt utnærmere helgen. Detteutgangspunktet kan brukes i sin helhet eller for å tilpasse din egenkode så langt når den tid kommer.

Ikke forsøk å tolk og løs hele oppgaven på en gang.Begynn smått, ta én ting om gangen og identifiser hva som må til for å løse det som detspørres om.

Gjerne gå igjennom oppgaveteksten for å planlegge først.

Alle oppgavene tar utgangspunkt at brukergrensesnittet erterminalen (inne i IntelliJ) og atdet skal lages en meny som vises i terminalen. Brukeren av programmet skal kunne velge framenyen for å kunne gjøre ulike handlinger.

Oppgave #3 i oppgavesettet 05 kan brukes som et innledende utgangspunkt.

Det er gitt at du er nødt til å legge inn eksempler selv i ArrayList og HashMapsom dukkeroppi oppgavene for å kunne teste løsningen.

Neste uke legges det ut utvidelser til oppgavenefor å ta disse videreog gjøre det endastørre, hvor det også vil legges ut ekstra oppgaver.

Oppgave #0(utgangspunkt for alle oppgavene)
Da alle oppgavene trenger en eller annen form for en terminalmeny, vilfølgende oppgave tadeg igjennom hva som trengs av en slik terminalmeny.

Last ned følgende Java-klasse fra Canvas-modulen «Kodet i forelesning»-Uke 3–Terminal.javaLag en main-metode og forsøk å ta i bruk den statiske metoden «log» ved å skrive følgendeinne i main-metoden: «Terminal.log("PGR112", "Test 1 2 3");»

Legg merke til at denne metoden printer ut dato og tidspunkt sammen med infoen du gasom argumenter til metoden log().

Bruk gjerne denne metoden for å loggføre hva som skjerunderveis når du koder påløsningen din.

Denne Terminal-klassen er et bra sted å ha alt relatert til terminalen,hvor alle metodene idenne klassen skal værestatic.

De ulike oppgavene vil ha flere ulike menyer, hvor det da er forventet at hver enesteterminalmeny er i en egen statisk metode i Terminal-klassen som returnerer hvilket valgbrukeren valgte.

For å bryte dette ned:

Når enspesifik meny skal lages, opprett en egen statisk metode for å gjøre dettemed et passende navn for hva menyen er
Denne metoden skal da gjøre følgende:
1)Vise valgenei en nummerert liste
2)La brukeren skrive inn valget sittmed å skrive inn tallet som tilsvarer valget
3)Returnere valget brukeren valgte fra menyen
Om brukeren skriverinn et feil valg, startprosessen om igjen fra 1)
Oppgave #01
I denne oppgaven skal du lage en minibankhvordu kan:

Logge inn med brukernavn og pin-kode
Sette inn penger på en konto
Ta ut penger fra en konto
Vise saldo på en konto
Sende penger til et annetbrukernavn
Start med en klasse som heterMiniBank, hvor main-metoden i denne klassen tar i brukTerminal-klassen for å gjøredetsom involverer terminalen.I starten av main-metodenopprett et HashMap hvor nøkkelen er brukernavn (String) og verdiene er pin-koden (String).Legg til minst to brukere.

I Terminal-klassen, opprett en statisk metode som heter «mainMenu» som håndtererfølgende meny:

Logg inn
Avslutt
Dersom 1) velges, skal brukeren skrive inn brukernavn og pin-kode.Om informasjonen gitt er feil,skal en feilmelding printes ut og prosessen startes på nytt.Om informasjonen gitt er riktig, skal følgende meny vises:

Vis saldo
Sett inn penger
Ta ut penger
Send penger til en annen
Logg ut
«Vis saldo»= Vise hvor mye penger personen som er logget innhar på konto«Sett inn penger»= Hent inn tall på hvor mye som skal settes inn«Ta ut penger»= Hent inn tall på hvor mye som skal taes ut,pass på at vi ikke kan ta ut mer enn det som er på konto«Send penger til en annen»= Hent inn brukernavn og hvor mye som skal sendes,pass på at det er nok penger på konto før det sendes,og at mottakeren får sin saldo økt«Logg ut»= Brukeren logges ut og taes tilbake til hovedmenyenfor å logge inn på nytt eller avslutte programmet.

Oppgave #2
Du skal lage et enkelt system for utleiere for å holde oversikt over hvem som bor i etkollektiv.

Klasser du vil trenge:

Collective
Room
Person
RentalAgreement
HvertRoomharsitt eget romnummer som identifiserer rommet.Videre så har hvertRoomen referanse til hvem som bor der (Person) og hvor lenge de skalbo der (RentalAgreement).

Personhar informasjon som navn, alder og e-postadresse.

RentalAgreementinneholderpersonen den gjelder for,en dato for innflytting og en datofor utflytting.

Collectiveinneholder alle rommene i kollektivet som skal lagres i et felt av typen HashMap.Nøkkelen i HashMappet er romnummeret (int) og rommet (Room).

Du vil også være nødt til å opprette egne objekter, altså at du må opprette flereRoom-,Person-ogRentalAgreement-objekter selv, slik at du kan bruke disse for å teste løsningendin underveis.

Opprett en klasse ved navnCollective.

Lag en main-metode iCollectivesom viser følgende menyved å kalle på en «mainMenu»metode iTerminal-klassen, og lag et program som implementerer følgende muligheter:

Print ut antall rom
Print ut alle rommene hvor det ikke bor noen
Print ut alle rommenehvor det bor noen der
Print ut informasjon omperson gitt romnummer
Her skal brukeren skrive inn et romnummer og få ut informasjon om det bornoen der eller ikke, og dersom det gjør det: Print ut informasjon om personensom bor der.
Print utalle leieperioder gitt årstall
Her skal brukeren skrive innet årstall og så skal alle rommene som har enRentalAgreementmed dato for utflyttning som er det året det spørres omprintes utHint: Utforsk klassen LocalDate, sjekk ut f.eks. log() metoden iTerminal-klassen