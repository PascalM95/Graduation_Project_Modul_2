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
    println("\nHerzlich Willkommen meine Damen und Herren in der großartigen Arena von Unterschnaxling.")
    println("Heute stehen sich im Finale der Pokémon-Weltmeisterschaft die beiden Meister-Trainer ${names[0].name} und ${names[1].name} gegenüber.")
    println("Let's get ready to Rumble!!!\n")
}

fun playerName (): Player {
    val getName = readln()
    var name = Player(getName, false)
    return name
}

fun cpu(): Player {
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
                    var player2 = cpu()
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

