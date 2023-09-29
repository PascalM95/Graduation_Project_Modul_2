package pokemon
import Attack
import Player

open class Pokemon(
        val name: String,
        var kp: Int,
        var att: Int,
        var def: Int,
        var lvl: Int,
        private var attacks : List<Attack>,
        val type: String) {

    fun chooseAttack (player: Player): Attack {
        var chosenAttack: Attack? = null
        while (chosenAttack == null) {
            if (player.cpu) {
                chosenAttack = this.attacks.random()
                println("${this.name} setzt ${chosenAttack.name} ein.\n")
                Thread.sleep(500)
            } else {
                println("\n${player.name}, wähle eine Attacke aus:")
                var i = 1
                for (attack in attacks) {
                    println("$i - ${attack.name} ${attack.damage}")
                    i++
                }
                try {
                    val input = readln().toInt()
                    println("${this.name} setzt ${attacks[input-1].name} ein.\n")
                    chosenAttack = attacks[input-1]
                    Thread.sleep(500)
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