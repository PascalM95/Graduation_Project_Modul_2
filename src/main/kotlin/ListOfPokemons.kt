// Pokémon vom Typ "Normal"
val rattfratz = Normal("Rattfratz", 58.0, 38.0, 26.0, 30, tackle, biss, ruckzuckhieb, knirscher)
val evoli = Normal("Evoli", 73.0, 38.0, 35.0, 30, biss, tackle, bezirzer, sternschauer)
val relaxo = Normal("Relaxo", 136.0, 71.0, 44.0, 30, zuflucht, schlecker, schnarcher, knirscher)

// Pokémon vom Typ "Pflanze"
val endivie = Plant("Endivie", 67.0, 34.0,44.0, 30, tackle, rasierblatt, zauberblatt, bodyslam)
val geckarbor = Plant("Geckarbor", 64.0, 32.0, 26.0, 30, klaps, blattwerk, gigasauger, ruckzuckhieb)
val tuska = Plant("Tuska", 70.0, 56.0, 29.0, 30, giftstachel, absorber, kugelsaat, gegenstoss)

// Pokémon vom Typ "Feuer"
val glumanda = Fire("Glumanda", 63.0, 36.0, 30.0, 30, glut, feuerodem, kratzer, schlitzer)
val panflam = Fire("Panflam", 66.0, 39.0, 31.0, 30, steigerungshieb, flammenrad, kratzfurie, glut)
val fynx = Fire("Fynx", 64.0, 32.0, 29.0, 30, glut, nitroladung, psystrahl, kratzer)

// Pokémon vom Typ "Wasser"
val schiggy = Water("Schiggy", 66.0, 33.0, 44.0, 30, tackle, aquaknarre, biss, nassschweif)
val plinfa = Water("Plinfa", 71.0, 35.0, 36.0, 30, klaps, pikser, blubbstrahl, lake)
val karnimani = Water("Karnimani", 70.0, 44.0, 43.0, 30, aquaknarre, lehmschelle, eiszahn, knirscher)

// Pokémon vom Typ "Elektro"
val pikachu = Electro("Pikachu", 61.0, 38.0, 29.0, 30, donnerschock, eisenschweif, ruckzuckhieb, funkensprung)
val elekid = Electro("Elekid", 67.0, 42.0, 27.0, 30, donnerschock, sternschauer, schockwelle, ruckzuckhieb)
val voltobal = Electro("Voltobal", 64.0, 23.0, 35.0, 30, walzer, sternschauer, tackle, donnerschock)

// Pokémon vom Typ "Gift"
val rettan = Poison("Rettan", 61.0, 41.0, 31.0, 30, giftstachel, biss, saeure, entfessler)
val nidoran = Poison("Nidoran", 67.0, 39.0, 29.0, 30, kratzer, doppelkick, biss, giftstachel)
val smogon = Poison("Smogon", 64.0, 44.0, 62.0, 30, tackle, smog, schlammbad, gewissheit)

var listOfPokemon =
    mutableListOf<Pokemon>(rattfratz, evoli, relaxo, endivie, geckarbor, tuska, glumanda, panflam, fynx, schiggy,
                           plinfa, karnimani, pikachu, elekid, voltobal, rettan, nidoran, smogon)