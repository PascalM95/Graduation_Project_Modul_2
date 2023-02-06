fun logo () {
    println("                                  ,'\\\n" +
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
            "                                `'                            '-._|\n\n")
}

fun gameOn () {
    var names = players()
    names[0].choosePokemon(names[0])
    names[1].choosePokemon(names[1])
    println("\n\nHerzlich Willkommen meine Damen und Herren in der großartigen Arena von Unterschnaxling.")
    println("Heute stehen sich im Finale der Pokémon-Weltmeisterschaft die beiden Meister-Trainer ${names[0].name} und ${names[1].name} gegenüber.")
    println("Let's get ready to Rumble!!!\n")
    Thread.sleep(2000)
    gameRound(names[0], names[1], names[0].pokemonOfPlayer, names[1].pokemonOfPlayer)
}

fun playerName (): Player {
    val getName = readln()
    var name = Player(getName, false)
    return name
}

fun computer(): Player {
    var name = listOf("Dieter", "Jens", "Klaus", "Hans-Georg", "Jan-Friedrich", "Reinfried", "Hans", "Sepp", "Gunther", "Günther", "Sybille", "Kassandra")
    return Player(name.random(), true)
}

fun players (): List<Player> {
    println("Spieler 1: Gib bitte deinen Namen ein:")
    var player1 = playerName()
    println("${player1.name}, willst du gegen einen anderen Spieler oder gegen den Computer spielen?\n1 - Spieler\n2 - Computer")
    var pvp = listOf<Player>()

    do {
        var rightInput = false
        try {
            var input = readln().toInt()
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

fun gameRound (name1: Player, name2: Player, pokemons1: MutableList<Pokemon>, pokemons2: MutableList<Pokemon>) {
    var i = 1
    println("\nRunde $i:\n\n")
    println("${name1.name}, welches Pokémon willst du zuerst in den Ring schicken?\n1 - ${pokemons1[0].name}\n2 - ${pokemons1[1].name}\n3 - ${pokemons1[2].name}\n4 - ${pokemons1[3].name}")
    var input = readln().toInt()
    when (input) {
        1 -> println("${pokemons1[0].name} du bist dran!")
        2 -> println("${pokemons1[1].name} du bist dran!")
        3 -> println("${pokemons1[2].name} du bist dran!")
        4 -> println("${pokemons1[3].name} du bist dran!")
        else -> println("Falsche Eingabe! Versuche es noch einmal.")
    }
}
fun death (pokemon: Pokemon): Boolean {
   return if (pokemon.kp <= 0) {
        println("${pokemon.name} wurde besiegt!")
       true
    } else {
        false
    }
}




