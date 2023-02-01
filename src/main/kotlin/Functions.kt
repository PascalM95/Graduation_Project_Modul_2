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