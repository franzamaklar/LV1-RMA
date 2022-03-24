<p align="center">
 <h2 align="center">Yahtzee Game</h2>
 <p align="center">Laboratorijska vježba 1 iz kolegija Razvoj mobilnih aplikacija</p>
</p>

<p align="justify">U ovom repozitoriju se nalazi programski kod u Kotlinu za Laboratorijsku vježbu 1 iz kolegija Razvoj mobilnih aplikacija.
  Za vježbu je kao izvješće bilo bitno napraviti igru Jamb (<i>eng. Yahtzee</i>). </p>


 <h2 align="left">How it is Played</h2>
  <h3 align="left">Jamb u stvarnom životu: </h3>
  <p align="justify"> Jamb je igra koju mogu igrati najmanje dva igrača. Potrebni su igrači papir za Jamb, olovke i šest kockica. Svaki igrač baca kockice tri puta pritom svaki
put kada baci kockicu, on ih može "zaključati" s obzirom na dobiveni ishod kockica. Svoj rezultat zapisuje u jedno od četiri stupaca koji sugeriraju 
smjerove kretanja popunjava listića (gore/dolje), najave te slobodno popunjavanje. Postoje nekoliko mogućih rezultata koje igrač može dobiti, a samo neki od njih su:
Jamb (pet istih kockica), Poker (četiri iste kockice), Skala (poredane vrijednosti kockice u nizu u kojem je svaka kockica veća od prethodne za jedan)...</p>

<h3 align="left">Jamb implementiran u programsko sučelje na ovom repozitoriju: </h3>
<p align= "justify">Ovo programsko sučelje implementira Jamb igru pokretanjem konzole za svakog igrača posebno. To znači da će svaki igrač morati pokrenuti konzolu kada je njegov red za bacanje.
<ol><li>Nakon što se izgeneriraju prvih šest kockica u prvom bacanju (1/3), konzola zatraži od igrača da upiše broj kockica koje želi spremiti. </li>
    <li>Zatim konzola zatraži da upiše prvi broj kockice koje će "zaključati" s obzirom na redoslijed pojavljivanja u nizu
        <ul> <li>To znači ako imamo niz [5,4,5,2,4,3] i ako igrač želi uzeti zadnju trojku, morat će navesti indeks niza = 6 </li>
              <li>Kockica koja se zaključala, briše iz "otključanog niza", sljedeći se element 
                (i elementi iza njega) pomiče za jedno mjesto unaprijed tako da u gornjem slučaju će se pomaknuti 4, 3 za jedan unaprijed ako se uzme 2.</li>
            <li> Ako se utvrdi da postoji više kockica koje igrač mora spremiti (više od jedne), tada će konzola zatražiti ponovni unos indeksa kockice u polju
              s obzirom na novo formirano otključano polje bez prethodno zaključane kockice. </li>
          <li> <b>Pažnja!</b> Jednom kada se zaključaju prvi put kockice, ne mogu se više otključati! Također, ako igrač unese indeks višeg broja od kapaciteta 
              polja otključanih kockica, oduzima mu se jedna kockica koje se trebala spremiti kao penal.</li>
      </ul>
   <li>Nakon prvog bacanja, ponavlja se isti postupak za drugo i treće bacanje.
   <li>Kada se dovrše sva tri bacanja i zaključavanja, igraču se ispisuju zaključane kockice zajedno s rezultatom. Moguća su četiri rezultata:
     <ul> <li> Jamb (pet jednakih kockica) </li>
       <li> Poker (četiri jednake kockice) </li>
       <li> Skala (niz brojeva s diferencijom jedan) </li>
       <li> Neuspješan rezultat, odnosno niti jedan od mogućih dobitaka nije postignut</li>
     </ul>
   <li>Zatim se konzola gasi, završava runda za tog igrača ili je kraj igre.
</ol>
</p>
