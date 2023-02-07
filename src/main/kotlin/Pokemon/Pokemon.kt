package Pokemon
import Attack
import Player

open class Pokemon(
    val name: String,
    var kp: Int,
    var att: Int,
    var def: Int,
    var lvl: Int,
    var attacks : List<Attack>,
    val type: String) {

    fun chooseAttack (player: Player): Attack {
        var chosenAttack: Attack? = null
        while (chosenAttack == null) {
            if (player.cpu) {
                chosenAttack = this.attacks.random()
                println("${this.name} setzt ${chosenAttack.name} ein.\n")
            } else {
                println("\nWähle eine Attacke aus:")
                var i = 1
                for (attack in attacks) {
                    println("$i - ${attack.name}")
                    i++
                }
                try {
                    var input = readln().toInt()
                    println("${this.name} setzt ${attacks[input-1].name} ein.\n")
                    chosenAttack = attacks[input-1]
                } catch (ex: Exception) {
                    println("Gib eine Zahl von 1 bis 4 ein!")
                }
            }
        }
        return chosenAttack
    }

    fun death (): Boolean {
        return this.kp <= 0
    }
}