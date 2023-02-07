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

    fun chooseAttack (): Attack {
        println("\nWähle eine Attacke aus:\n1 - ${this.attack1.name} ${this.attack1.damage}\n2 - ${this.attack2.name} ${this.attack2.damage}\n3 - ${this.attack3.name} ${this.attack3.damage}\n4 - ${this.attack4.name} ${this.attack4.damage}\n")
        try {
            var input = readln().toInt()
            return when (input) {
                1 -> {
                    println("${this.name} setzt ${this.attack1.name} ein.")
                    this.attack1
                }
                2 -> {
                    println("${this.name} setzt ${this.attack2.name} ein.")
                    this.attack2
                }
                3 -> {
                    println("${this.name} setzt ${this.attack3.name} ein.")
                    this.attack3
                }
                4 -> {
                    println("${this.name} setzt ${this.attack4.name} ein.")
                    this.attack4
                }
                else -> {
                    println("Falsche Eingabe! Versuche es nochmal.")
                    chooseAttack()
                }
            }
        } catch (ex: NumberFormatException) {
            println("Falsche Eingabe! Gib eine ganze Zahl zwischen 1 und 4 ein.")
        }
        return this.chooseAttack()
    }

    fun death (): Boolean {
        return this.kp <= 0
    }

}