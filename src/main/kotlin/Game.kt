class Game (var player1: Player,
            var player2: Player,
            var pokemonsPlayer1: MutableList<Pokemon>,
            var pokemonsPlayer2: MutableList<Pokemon>) {
    fun pokemonForFight (player: Player, pokemons: MutableList<Pokemon>): Pokemon {
        var chosenPokemon: Pokemon? = null
        if (player.cpu) {
            var chosenPokemon = pokemons.random()
            println("${player.name} setzt ${chosenPokemon.name} ein.")
        } else {
            println("${player.name}, welches Pokémon willst du in den Ring schicken?\n1 - ${pokemons[0].name}\n2 - ${pokemons[1].name}\n3 - ${pokemons[2].name}\n4 - ${pokemons[3].name}")
            try {
                var input = readln().toInt()
                when (input) {
                    1 -> {
                        println("${pokemons[0].name} du bist dran!\n")
                        chosenPokemon = pokemons[0]
                    }
                    2 -> {
                        println("${pokemons[1].name} du bist dran!\n")
                        chosenPokemon = pokemons[1]
                    }
                    3 -> {
                        println("${pokemons[2].name} du bist dran!\n")
                        chosenPokemon = pokemons[2]
                    }
                    4 -> {
                        println("${pokemons[3].name} du bist dran!\n")
                        chosenPokemon = pokemons[3]
                    }
                    else -> println("Falsche Eingabe! Versuche es noch einmal.")
                }
            } catch (ex: NumberFormatException) {
                println("Gib eine Zahl von 1 bis 4 ein!")
            }
        }
        return chosenPokemon!!
    }

}