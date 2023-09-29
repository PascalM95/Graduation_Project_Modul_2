import pokemon.Pokemon
import pokemon.listOfPokemon

class Player (val name: String, val cpu: Boolean) {
    private var pokemonOfPlayer = mutableListOf<Pokemon>()

    fun choosePokemon (): MutableList<Pokemon> {
        Thread.sleep(500)
        println("\n${this.name}, nun musst du deine Mitstreiter wählen. Du kannst aus diesen Pokémon aussuchen:\n")
        Thread.sleep(500)
        var i = 1
        for (pokemon in listOfPokemon) {
            println("$i - ${pokemon.name}   KP: ${pokemon.kp}")
            Thread.sleep(300)
            i++
        }
        if (!this.cpu) {
            var j = 0
            while (j < 4) {
                println("\n${this.name}, wähle dein ${j + 1}. Pokémon:")
                val input = readln().toInt() - 1
                pokemonOfPlayer.add(listOfPokemon[input])
                j++
                Thread.sleep(200)
            }
            listOfPokemon.removeAll(pokemonOfPlayer)
            println("\n${this.name}, du hast ${pokemonOfPlayer[0].name}, ${pokemonOfPlayer[1].name}, ${pokemonOfPlayer[2].name} und ${pokemonOfPlayer[3].name} gewählt.\n")
            Thread.sleep(1000)
        }
        if (this.cpu) {
            var j = 0
            while (j < 4) {
                pokemonOfPlayer.add(listOfPokemon.random())
                listOfPokemon.removeAll(pokemonOfPlayer)
                j++
            }
            listOfPokemon.removeAll(pokemonOfPlayer)
            println("\n${this.name}, du hast ${pokemonOfPlayer[0].name}, ${pokemonOfPlayer[1].name}, ${pokemonOfPlayer[2].name} und ${pokemonOfPlayer[3].name} gewählt.\n")
            Thread.sleep(1000)
        }
        return pokemonOfPlayer
    }

    fun pokemonForFight(pokemons: MutableList<Pokemon>): Pokemon {
        var chosenPokemon: Pokemon? = null
        while (chosenPokemon == null) {
            if (this.cpu) {
                chosenPokemon = pokemons.random()
                println("${this.name} setzt ${chosenPokemon.name} ein.\n")
                Thread.sleep(800)
            } else {
                if (pokemons.size <= 3 ) {
                    println("${this.name}, welches Pokémon willst du als nächstes in den Ring schicken?\n")
                    Thread.sleep(300)
                } else {
                    println("${this.name}, welches Pokémon willst du als erstes in den Ring schicken?\n")
                    Thread.sleep(300)
                }
                var i = 1
                for (pokemon in pokemons) {
                    println("$i - ${pokemon.name} ${pokemon.kp} KP")
                    Thread.sleep(300)
                    i++
                }
                try {
                    val input = readln().toInt()
                    println("${pokemons[input-1].name} du bist dran!\n")
                    chosenPokemon = pokemons[input-1]
                    Thread.sleep(800)
                } catch (ex: Exception) {
                    println("Gib eine Zahl von 1 bis 4 ein!\n")
                }
            }
        }
        return chosenPokemon
    }
}