fun main () {
    var pokemon1 = mutableListOf(relaxo, glumanda, pikachu, evoli)
    var pokemon2 = mutableListOf(schiggy, rattfratz, smogon, panflam)
    var player1 = Player("Pascal", false)
    var player2 = Player("Sepp", true)

    do {
        attack(player1, pokemon1[1], pokemon2[0])
        if (pokemon2[0].death()) {
            break
        }
        attack(player2, pokemon2[0], pokemon1[1])
        if (pokemon1[1].death()) {
            break
        }
    } while (!(pokemon2[0].death()) || !(pokemon1[0].death()))





}