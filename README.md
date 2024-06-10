# Eksāmena Darbs par ciklu ar pēcnosacijumu

Java programma, kas lietotājam liek ievadīt vārdu, lai identificētu, kas pilda testu un tad 
lietotājam uzdod 10 jautājumus par tēmu cikls ar pēcnosacijumu, lai pārbaudītu lietotāja 
zināšanas par tēmu. Programmā ir tikai 1 pareizā atbilde no 4, pēc lietotāja atbildes
ievades, programma uzrāda, vai lietotāja izvēlētā atbilde ir pareiza vai nē un testa beigās
lietotājam tiek izvadīts viņa/viņas rezūltāts, cik punktus ir ieguvis/ieguvusi no 10 jautājumiem.
Lietotājam arī tiek parādītas visas nepareizās atbildes uz kurām bija atbildēts nepareizi un pareizā
atbilde uz jautājumu.

![transparent-java-logo-java-logo-with-blue-and-orange-color-1710879311376-removebg-preview](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/f995ea58-875d-4b7e-a22d-b9d64847f43f)
-
&ensp; 
 

Sākuma logs:
&ensp; 

![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/0b0303af-1892-487c-944b-1ad141c9451f)
 
Šajā logā mums ir iespēja iziet no pašas programmas un sākt testu. Lietotājs nevar sākt testu, kamēr nav ievadijis savu vārdu,
vārda nepieciešamība ir vajadzīga, lai identificētu testa lietotāju. Vārds nedrīkst būt mazāk kā 3 burti un vārdā nedrīkst būt
iekļauti jebkādi simboli vai cipari.

&ensp;
 
 Sākuma logs ar kļūdu:
  
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/c12d46f0-89a6-4f98-9e77-de6de6c61f26)
 
Ja lietotājs ievadīs vārdu, kas ir pārāk īss vai saturēs kādu simbolu vai ciparu, logs izmetīs brīdinājuma tekstu.

&ensp;
Testa logs:
 
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/432de3df-2a78-4467-86af-9b449cc663cc)
 
Šajā logā mēs varam izvēlēties vienu atbildi no četrām, no šīm četrām atbildēm tikai viena ir pareiza, kā redzams labā pusē
ir redzams logs, kas satur jautājumu uz kuru lietotājam ir jāatbild

   
&ensp;
Testa logs ar kļudu
 
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/e0cdde6a-a1e1-4b55-a834-138bcb635b0b)
  
 
Ja lietotājs nav atzīmējis nevienu atbildi, programma izvadīs kļūdas ziņu, informējot lietotāju, ka neviena atbilde nav atzīmēta

 &ensp;
  
Testa logs ar pareizo atbildi
 
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/ac012a03-92af-4fd6-a128-ca4cbacfcd46)
 
Ja lietotājs ir atbildējis uz jautājumu pareizi, programma izvdada JOptionPane ziņu informējot lietotāju, ka izvēlēta
atbilde ir pareiza

 &ensp;
Testa logs ar nepareizo atbildi:
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/10ebf4a9-bb8b-4fe5-8045-fbbd4beaf1c0)
 
Ja lietotājs ir atbildējis uz jautājumu nepareizi, programma izvada JOptionPane ziņu informējot lietotāju, ka izvēlētā
atbilde ir nepareiza
 
&ensp;
 Rezultāta logs:
  
![image](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/798171d3-1d51-4d23-98f9-8e709cd774c3)

Šajā logā ir redzam, cik punktus lietotājis ir dabujis, jeb uz cik jautājumiem lietotājs ir atbildējis no 10. Logā ir redzams visas nepareizās
atbildes uz kurām lietotājs ir atbildējis nepareizi un zem jautājuma ir pareizā abilde.

&ensp;

 # Testa UML diagrammas

<h2>1. Aktivitāšu diagramma:</h2>


![AktivitasuDiagramma drawio](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/02d948f2-6910-4625-95d7-921c31ee34f1)



<h2>2. Use Case diagramma:</h2>


![CaseDiagramma drawio](https://github.com/ArtuursSkola/ArtursKliecisEksamens/assets/165995209/fa425857-f80e-48ea-8420-7891d586c733)
