class Player (val name: String, val cpu: Boolean) {
    var pokemonOfPlayer = mutableListOf<Pokemon>()

    fun choosePokemon (player: Player) {
        println("\n${player.name}, nun musst du deine Mitstreiter wählen. Du kannst aus diesen Pokémon aussuchen:\n")
        var i = 1
        for (pokemon in listOfPokemon) {
            println("$i - ${pokemon.name}   KP: ${pokemon.kp}")
            Thread.sleep(100)
            i++
        }

        if (!player.cpu) {
            var j = 0
            while (j < 4) {
                println("$name, wähle dein ${j + 1}. Pokémon:")
                var input = readln().toInt() - 1
                pokemonOfPlayer.add(listOfPokemon[input])
                j++
            }
            listOfPokemon.removeAll(pokemonOfPlayer)
            println("$name, du hast ${pokemonOfPlayer[0].name}, ${pokemonOfPlayer[1].name}, ${pokemonOfPlayer[2].name} und ${pokemonOfPlayer[3].name} gewählt.\n")
        }
        if (player.cpu) {
            var j = 0
            while (j < 4) {
                pokemonOfPlayer.add(listOfPokemon.random())
                j++
            }
            listOfPokemon.removeAll(pokemonOfPlayer)
            println("$name, du hast ${pokemonOfPlayer[0].name}, ${pokemonOfPlayer[1].name}, ${pokemonOfPlayer[2].name} und ${pokemonOfPlayer[3].name} gewählt.\n")
        }
    }
}