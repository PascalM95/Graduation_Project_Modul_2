// Pokémon vom Typ "Normal"
val rattfratz = Normal("Rattfratz", 58, 38, 26, 30, listOf(tackle, biss, ruckzuckhieb, knirscher))
val evoli = Normal("Evoli", 73, 38, 35, 30, listOf(biss, tackle, bezirzer, sternschauer))
val relaxo = Normal("Relaxo", 136, 71, 44, 30, listOf(zuflucht, schlecker, schnarcher, knirscher))

// Pokémon vom Typ "Pflanze"
val endivie = Plant("Endivie", 67, 34,44, 30, listOf(tackle, rasierblatt, zauberblatt, bodyslam))
val geckarbor = Plant("Geckarbor", 64, 32, 26, 30, listOf(klaps, blattwerk, gigasauger, ruckzuckhieb))
val tuska = Plant("Tuska", 70, 56, 29, 30, listOf(giftstachel, absorber, kugelsaat, gegenstoss))

// Pokémon vom Typ "Feuer"
val glumanda = Fire("Glumanda", 63, 36, 30, 30, listOf(glut, feuerodem, kratzer, schlitzer))
val panflam = Fire("Panflam", 66, 39, 31, 30, listOf(steigerungshieb, flammenrad, kratzfurie, glut))
val fynx = Fire("Fynx", 64, 32, 29, 30, listOf(glut, nitroladung, psystrahl, kratzer))

// Pokémon vom Typ "Wasser"
val schiggy = Water("Schiggy", 66, 33, 44, 30, listOf(tackle, aquaknarre, biss, nassschweif))
val plinfa = Water("Plinfa", 71, 35, 36, 30, listOf(klaps, pikser, blubbstrahl, lake))
val karnimani = Water("Karnimani", 70, 44, 43, 30, listOf(aquaknarre, lehmschelle, eiszahn, knirscher))

// Pokémon vom Typ "Elektro"
val pikachu = Electro("Pikachu", 61, 38, 29, 30, listOf(donnerschock, eisenschweif, ruckzuckhieb, funkensprung))
val elekid = Electro("Elekid", 67, 42, 27, 30, listOf(donnerschock, sternschauer, schockwelle, ruckzuckhieb))
val voltobal = Electro("Voltobal", 64, 23, 35, 30, listOf(walzer, sternschauer, tackle, donnerschock))

// Pokémon vom Typ "Gift"
val rettan = Poison("Rettan", 61, 41, 31, 30, listOf(giftstachel, biss, saeure, entfessler))
val nidoran = Poison("Nidoran", 67, 39, 29, 30, listOf(kratzer, doppelkick, biss, giftstachel))
val smogon = Poison("Smogon", 64, 44, 62, 30, listOf(tackle, smog, schlammbad, gewissheit))

var listOfPokemon =
    mutableListOf<Pokemon>(rattfratz, evoli, relaxo, endivie, geckarbor, tuska, glumanda, panflam, fynx, schiggy,
                           plinfa, karnimani, pikachu, elekid, voltobal, rettan, nidoran, smogon)