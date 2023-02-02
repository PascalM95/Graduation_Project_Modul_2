fun introduction () {
    var names = players()
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
    var name = listOf("Dieter", "Jens", "Klaus", "Hans-Georg", "Jan-Friedrich", "Reinfried", "Hans", "Sepp")
    return Player(name.random())
}

fun players (): List<String> {
    println("Spieler 1: Gib bitte deinen Namen ein:")
    var player1 = playerName()
    println("${player1.name}, willst du gegen einen anderen Spieler oder gegen den Computer spielen?\n1 - Spieler\n2 - Computer")
    var pvp = listOf<String>()

    do {
        var rightInput = true
        try {
            var input = readln().toInt()
            when (input) {
                1 -> {
                    println("Spieler 2: Gib bitte deinen Namen ein:")
                    var player2 = playerName()
                    println("${player1.name}, du kämpfst gegen ${player2.name}. Let's go!")
                    rightInput = false
                    pvp = listOf(player1.name, player2.name)
                }

                2 -> {
                    var computer = cpu()
                    println("${player1.name}, du kämpfst gegen ${computer.name}. Let's go!")
                    rightInput = false
                    pvp = listOf(player1.name, computer.name)
                }
            }
        } catch (ex: NumberFormatException) {
            println("Falsche Eingabe! Gib eine 1 oder eine 2 ein.")
        }
    } while (rightInput)

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

