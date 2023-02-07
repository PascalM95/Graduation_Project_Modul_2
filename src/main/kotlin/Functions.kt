fun logo() {
    println(
        "                                  ,'\\\n" +
                "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
                "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
                "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
                " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
                "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
                "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
                "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
                "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
                "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
                "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
                "                                `'                            '-._|\n\n"
    )
}

fun gameOn() {
    var names = players()
    val player1 = names[0]
    val player2 = names[1]
    val pokemonPlayer1 = player1.choosePokemon()
    val pokemonPlayer2 = player2.choosePokemon()
    println("\n\nHerzlich Willkommen meine Damen und Herren in der großartigen Arena von Unterschnaxling.")
    println("Heute stehen sich im Finale der Pokémon-Weltmeisterschaft die beiden Meister-Trainer ${names[0].name} und ${names[1].name} gegenüber.")
    println("Let's get ready to Rumble!!!\n")
    Thread.sleep(2000)
    val round1 = Game(player1, player2, pokemonPlayer1, pokemonPlayer2)
    val firstPokemonPlayer = round1.pokemonForFight(player1, pokemonPlayer1)
    val firstPokemonOpponent = round1.pokemonForFight(player2, pokemonPlayer2)
    attack(player1, firstPokemonPlayer, firstPokemonOpponent)
    attack(player2, firstPokemonOpponent, firstPokemonPlayer)
    attack(player1, firstPokemonPlayer, firstPokemonOpponent)
    attack(player2, firstPokemonOpponent, firstPokemonPlayer)
    attack(player1, firstPokemonPlayer, firstPokemonOpponent)
    attack(player2, firstPokemonOpponent, firstPokemonPlayer)


}

fun playerName(): Player {
    val getName = readln()
    var name = Player(getName, false)
    return name
}

fun computer(): Player {
    var name = listOf(
        "Dieter",
        "Jens",
        "Klaus",
        "Hans-Georg",
        "Jan-Friedrich",
        "Reinfried",
        "Hans",
        "Sepp",
        "Gunther",
        "Günther",
        "Sybille",
        "Kassandra"
    )
    return Player(name.random(), true)
}

fun players(): List<Player> {
    println("Spieler 1: Gib bitte deinen Namen ein:")
    var player1 = playerName()
    println("${player1.name}, willst du gegen einen anderen Spieler oder gegen den Computer spielen?\n1 - Spieler\n2 - Computer")
    var pvp = listOf<Player>()

    do {
        var rightInput = false
        try {
            var input = readln().toInt()
            Thread.sleep(1000)
            when (input) {
                1 -> {
                    println("Spieler 2: Gib bitte deinen Namen ein:")
                    var player2 = playerName()
                    println("${player1.name}, du kämpfst gegen ${player2.name}. Let's go!")
                    rightInput = true
                    pvp = listOf(player1, player2)
                }

                2 -> {
                    var player2 = computer()
                    println("${player1.name}, du kämpfst gegen ${player2.name}. Let's go!")
                    Thread.sleep(500)
                    rightInput = true
                    pvp = listOf(player1, player2)
                }
            }
        } catch (ex: NumberFormatException) {
            println("Falsche Eingabe! Gib eine 1 oder eine 2 ein.")
        }
    } while (!rightInput)

    return pvp
}

fun attack(player: Player, pokemon1: Pokemon, pokemon2: Pokemon): Pokemon {
    var attack = pokemon1.chooseAttack(player)
    var damage = damage(pokemon1, pokemon2, attack)
    pokemon2.kp -= damage
    if (pokemon2.death()) {
        pokemon2.kp = 0
        println("${pokemon2.name} hat noch ${pokemon2.kp}KP verbleibend.")
        println("${pokemon2.name} wurde besiegt!")
    } else {
        println("${pokemon2.name} hat noch ${pokemon2.kp}KP verbleibend.")
    }

    return pokemon2
}

