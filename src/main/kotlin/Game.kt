class Game(
    var player1: Player,
    var player2: Player,
    var pokemonsPlayer1: MutableList<Pokemon>,
    var pokemonsPlayer2: MutableList<Pokemon>
) {
    fun pokemonForFight(player: Player, pokemons: MutableList<Pokemon>): Pokemon {
        var chosenPokemon: Pokemon? = null
        while (chosenPokemon == null) {
            if (player.cpu) {
                chosenPokemon = pokemons.random()
                println("${player.name} setzt ${chosenPokemon.name} ein.")
            } else {
                println("${player.name}, welches Pokémon willst du in den Ring schicken?\n")
                var i = 1
                for (pokemon in pokemons) {
                    println("$i - ${pokemon.name} ${pokemon.kp} KP")
                    i++
                }
                try {
                    var input = readln().toInt()
                    println("${pokemons[input-1].name} du bist dran!\n")
                            chosenPokemon = pokemons[input-1]
                } catch (ex: Exception) {
                    println("Gib eine Zahl von 1 bis 4 ein!")
                }
            }
        }
        return chosenPokemon
    }
}