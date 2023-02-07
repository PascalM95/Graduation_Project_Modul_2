import Pokemon.Pokemon
fun gameOn() {
    logo()
    Thread.sleep(3000)
    var names = players()
    val player1 = names[0]
    val player2 = names[1]
    var pokemonPlayer1 = player1.choosePokemon()
    var pokemonPlayer2 = player2.choosePokemon()
    println("\n\nHerzlich Willkommen meine Damen und Herren in der großartigen Arena von Unterschnaxling.")
    println("Heute stehen sich im Finale der Pokémon-Weltmeisterschaft die beiden Meister-Trainer ${names[0].name} und ${names[1].name} gegenüber.")
    println("Let's get ready to Rumble!!!\n")
    Thread.sleep(2000)
    var pokemonPlayer = player1.pokemonForFight(pokemonPlayer1)
    var pokemonOpponent = player2.pokemonForFight(pokemonPlayer2)
    do {
        attack(player1, pokemonPlayer, pokemonOpponent)
        if (pokemonOpponent.death()) {
            pokemonPlayer2.remove(pokemonOpponent)
            if (pokemonPlayer2.size > 0) {
                pokemonOpponent = player2.pokemonForFight(pokemonPlayer2)
            } else {
                println("\nHerzlichen Glückwunsch, ${player1.name}! Du hast gewonnen!\nDu darfst jetzt mit Stolz den Titel \"Pokémon-Weltmeister\" tragen!")
                break
            }
        }
        attack(player2, pokemonOpponent, pokemonPlayer)
        if (pokemonPlayer.death()) {
            pokemonPlayer1.remove(pokemonPlayer)
            if (pokemonPlayer1.size > 0) {
                pokemonPlayer = player1.pokemonForFight(pokemonPlayer1)
            } else {
                println("\nHerzlichen Glückwunsch, ${player2.name}! Du hast gewonnen!\nDu darfst jetzt mit Stolz den Titel \"Pokémon-Weltmeister\" tragen!")
                break
            }
        }
    } while (!(pokemonPlayer.death()) || !(pokemonOpponent.death()))
}

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
    println("\nSpieler 1: Gib bitte deinen Namen ein:")
    var player1 = playerName()
    println("\n${player1.name}, willst du gegen einen anderen Spieler oder gegen den Computer spielen?\n1 - Spieler\n2 - Computer")
    var pvp = listOf<Player>()

    do {
        var rightInput = false
        try {
            var input = readln().toInt()
            when (input) {
                1 -> {
                    println("\nSpieler 2: Gib bitte deinen Namen ein:")
                    var player2 = playerName()
                    Thread.sleep(500)
                    println("\n${player1.name}, du kämpfst gegen ${player2.name}. Let's go!")
                    rightInput = true
                    pvp = listOf(player1, player2)
                }

                2 -> {
                    var player2 = computer()
                    println("\n${player1.name}, du kämpfst gegen ${player2.name}. Let's go!")
                    Thread.sleep(500)
                    rightInput = true
                    pvp = listOf(player1, player2)
                }
            }
        } catch (ex: NumberFormatException) {
            println("\nFalsche Eingabe! Gib eine 1 oder eine 2 ein.")
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
        println("${pokemon2.name} wurde besiegt!\n")
    } else {
        println("${pokemon2.name} hat noch ${pokemon2.kp}KP verbleibend.\n")
    }
    return pokemon2
}