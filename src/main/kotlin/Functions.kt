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
            "                                `'                            '-._|")
}

fun gameOn () {
    var names = players()
    var pokemons = choosePokemon(names[0])
    println("\nHerzlich Willkommen meine Damen und Herren in der großartigen Arena von Unterschnaxling.")
    println("Heute stehen sich im Finale der Pokémon-Weltmeisterschaft die beiden Meister-Trainer ${names[0]} und ${names[1]} gegenüber.")
    println("Let's get ready to Rumble!!!\n")
}

fun playerName (): Player {
    val getName = readln()
    var name = Player(getName)
    return name
}

fun cpu(): Player {
    var name = listOf("Dieter", "Jens", "Klaus", "Hans-Georg", "Jan-Friedrich", "Reinfried", "Hans", "Sepp", "Gunther", "Günther", "Sybille", "Kassandra")
    return Player(name.random())
}

fun players (): List<String> {
    println("Spieler 1: Gib bitte deinen Namen ein:")
    var player1 = playerName()
    println("${player1.name}, willst du gegen einen anderen Spieler oder gegen den Computer spielen?\n1 - Spieler\n2 - Computer")
    var pvp = listOf<String>()

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
                    pvp = listOf(player1.name, player2.name)
                }

                2 -> {
                    var computer = cpu()
                    println("${player1.name}, du kämpfst gegen ${computer.name}. Let's go!")
                    rightInput = true
                    pvp = listOf(player1.name, computer.name)
                }
            }
        } catch (ex: NumberFormatException) {
            println("Falsche Eingabe! Gib eine 1 oder eine 2 ein.")
        }
    } while (!rightInput)

    return pvp
}

fun choosePokemon (name1: String) {
    var pokemonOfPlayer1 = mutableListOf<Pokemon>()


    println("\nNun müsst ihr eure Mitstreiter wählen. Ihr könnt aus diesen Pokémon aussuchen:\n")
    var i = 1
    for (pokemon in listOfPokemon) {
        println("$i - ${pokemon.name}   KP: ${pokemon.kp}")
        Thread.sleep(100)
        i++
    }

    println("\n$name1, du fängst an zu wählen.")
    var j = 1
    while (j < 5) {
        println("Wähle dein $j. Pokémon:")
        var input = readln().toInt()-1
        pokemonOfPlayer1.add(listOfPokemon[input])
        j++
    }
    listOfPokemon.removeAll(pokemonOfPlayer1)
    println("$name1, du hast ${pokemonOfPlayer1[0].name}, ${pokemonOfPlayer1[1].name}, ${pokemonOfPlayer1[2].name} und ${pokemonOfPlayer1[3].name} gewählt.\n")




}













fun damage (pokemon1: Pokemon, pokemon2: Pokemon): Double {
    var z = (0..15).random().toDouble()
    val damage = ((pokemon1.lvl * 0.4 + 2.0) * pokemon1.att * (pokemon1.kp / (50.0 * pokemon2.def)) * 1.5 + 2.0) * volltreffer() * (z / 100.0) * 2
    return damage
}
fun volltreffer (): Double {
    val vollTreffer = listOf(true, false)
    return if (vollTreffer.random()) {
        2.0
    } else {
        1.0
    }
}

