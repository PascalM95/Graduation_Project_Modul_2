fun main () {
    var pokemon1 = mutableListOf(relaxo, glumanda, pikachu, evoli)
    var pokemon2 = mutableListOf(schiggy, rattfratz, smogon, panflam)
    var player1 = Player("Pascal", false)
    var player2 = Player("Sepp", true)

//    pokemon1.chooseAttack(pokemon1)
    battle(player1, player2, pokemon1, pokemon2)

}