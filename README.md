# acuari
Practica Examen 30 juny 2023 Acuari
Enunciat
Volem crear un programa per a gestionar els components d'un aquari. En un aquari hi viuen
animals i plantes. La informació rellevant relativa a tots els organismes (peixos i plantes) és:
 El nom del peix o de la planta.
 La espècie o família a la qual pertany.
 El tipus de llum que necessita l'animal o la planta. La llum estarà codificada amb tres
lletres en funció de les necessitats de cada organisme: "A" alta, mitjana "M" i Baixa
"B".
 La temperatura màxima que pot tolerar el peix o planta.
 La temperatura mínima que pot tolerar el peix o planta.
 El PH màxim que pot tolerar el peix o planta.
 El PH mínim que pot tolerar el peix o planta.
La informació rellevant relativa a tots els peixos és:
 La procedència geogràfica del peix.
 La dieta codificada segons aquesta escala ("A" Algues, "O" Omnívor, "F" Fulles).
 La longitud en cm del peix.
La informació rellevant relativa a totes les plantes és:
 1. El tipus de planta, codificant-lo de la següent manera:
o "T" Tija,
o "B" Bulb,
o "A" Arrels.
A partir de les dades anteriors, volem efectuar les operacions següents:
ACTIVITAT 1
(5 punts)
1. Per a cada organisme, retornar una cadena amb els marges d'acidesa de
l'aigua acceptables. Per exemple: 6-7.
2. Per a cada organisme, retornar una cadena amb els marges de temperatura
acceptables. Per exemple: 10-20.
3. Per a cada peix, traduir el codi del tipus de dieta a l'explicació pertinent. Si
és 'A', "Algues", etc.
4. Per a cada organisme, traduir el codi de tipus de necessitats de llum a
l'explicació pertinent. Si és 'A', "Necessitats altes de llum", etc.
5. Per a cada planta, traduir el codi de tipus de planta a l'explicació pertinent.
Si és 'T', "Tija", etc.
ACTIVITAT 2
(5 punts)
A més, farem una classe de nom GestioAquari amb un mètode main() que
realitzarà les següents tasques:
1. Crear 3 objectes de tipus Peix i 3 de tipus Planta i afegir-los a un ArrayList
d'organismes.
2. Recórrer l'ArrayList i per a cada element mostrar per pantalla les dades de
l'organisme i escriure també per pantalla les dades específiques d'aquell
organisme (si és peix la procedència, la longitud i la dieta; si és planta el
tipus).
3. Mostrar el número de peixos omnívors que hi ha a l'aquari.
4. Mostrar per pantalla les màxims i mínims de temperatura i PH que pot
suportar el nostre aquari.
5. A part dels indicats, crea els constructors i mètodes que necessitis per a fer
les tasques indicades.
6. En els constructors i setters (si es defineixen) controlar els valors correctes
dels atributs amb excepcions
