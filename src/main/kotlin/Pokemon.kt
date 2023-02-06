open class Pokemon(
    val name: String,
    var kp: Int,
    var att: Int,
    var def: Int,
    var lvl: Int,
    var attack1: Attack,
    var attack2: Attack,
    var attack3: Attack,
    var attack4: Attack,
    val type: String) {

    fun chooseAttack (pokemon: Pokemon): Attack {
        println("\nWähle eine Attacke aus:\n1 - ${pokemon.attack1.name} ${pokemon.attack1.damage}\n2 - ${pokemon.attack2.name} ${pokemon.attack2.damage}\n3 - ${pokemon.attack3.name} ${pokemon.attack3.damage}\n4 - ${pokemon.attack4.name} ${pokemon.attack4.damage}\n")
        try {
            var input = readln().toInt()
            return when (input) {
                1 -> {
                    println("${pokemon.name} setzt ${pokemon.attack1.name} ein.")
                    pokemon.attack1
                }
                2 -> {
                    println("${pokemon.name} setzt ${pokemon.attack2.name} ein.")
                    pokemon.attack2
                }
                3 -> {
                    println("${pokemon.name} setzt ${pokemon.attack3.name} ein.")
                    pokemon.attack3
                }
                4 -> {
                    println("${pokemon.name} setzt ${pokemon.attack4.name} ein.")
                    pokemon.attack4
                }
                else -> {
                    println("Falsche Eingabe! Versuche es nochmal.")
                    chooseAttack(pokemon)
                }
            }
        } catch (ex: NumberFormatException) {
            println("Falsche Eingabe! Gib eine ganze Zahl zwischen 1 und 4 ein.")
        }

//        var input = readln().toInt()
//        return when (input) {
//            1 -> {
//                println("${pokemon.name} setzt ${pokemon.attack1.name} ein.")
//                pokemon.attack1
//            }
//
//            2 -> {
//                println("${pokemon.name} setzt ${pokemon.attack2.name} ein.")
//                pokemon.attack2
//            }
//
//            3 -> {
//                println("${pokemon.name} setzt ${pokemon.attack3.name} ein.")
//                pokemon.attack3
//            }
//
//            4 -> {
//                println("${pokemon.name} setzt ${pokemon.attack4.name} ein.")
//                pokemon.attack4
//            }
//
//            else -> {
//                println("Falsche Eingabe! Versuche es nochmal.")
//                chooseAttack(pokemon)
//            }
//        }
        return pokemon.chooseAttack(pokemon)
    }
}