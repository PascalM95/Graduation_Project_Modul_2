fun main () {
    var pokemon1 = mutableListOf(relaxo, glumanda, pikachu, evoli)
    var pokemon2 = mutableListOf(schiggy, rattfratz, smogon, panflam)
    var player1 = Player("Pascal", false)
    var player2 = Player("Sepp", true)

//    pokemon1.chooseAttack(pokemon1)
//    var pokemon = pokemonForFight(player1, pokemon1)
//    println(pokemon.name)
    do (attack(pokemon1[0], pokemon2[0]))
        while (pokemon2[0].kp > 0)



}