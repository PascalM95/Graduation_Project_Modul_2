import Pokemon.Pokemon
import kotlin.math.roundToInt

fun damage (pokemon1: Pokemon, pokemon2: Pokemon, attack: Attack): Int {
    var z = 100 - ((0..15).random().toDouble())
    var damage = ((pokemon1.lvl * 0.4 + 2.0) * attack.damage.toDouble() * (pokemon1.kp.toDouble() / (50.0 * pokemon2.def.toDouble())) + 2.0) * volltreffer() * (z / 100.0)

    if (attack.type == "Pflanze" && (pokemon2.type == "Pflanze" || pokemon2.type == "Wasser" || pokemon2.type == "Elektro")) {
        damage *= 0.5
        println("🌱 Das war nicht sehr effektiv! 🌱")
    }
    if (attack.type == "Pflanze" && (pokemon2.type == "Feuer" || pokemon2.type == "Gift")) {
        damage *= 2
        println("🌱🌱🌱 Das war sehr effektiv! 🌱🌱🌱")
    }
    if (attack.type == "Feuer" && (pokemon2.type == "Pflanze" || pokemon2.type == "Feuer")) {
        damage *= 0.5
        println("🔥 Das war nicht sehr effektiv! 🔥")
    }
    if (attack.type == "Feuer" && (pokemon2.type == "Wasser")) {
        damage *= 2
        println("🔥🔥🔥 Das war sehr effektiv! 🔥🔥🔥")
    }
    if (attack.type == "Wasser" && (pokemon2.type == "Feuer" || pokemon2.type == "Wasser")) {
        damage *= 0.5
        println("🌊 Das war nicht sehr effektiv! 🌊")
    }
    if (attack.type == "Wasser" && (pokemon2.type == "Pflanze" || pokemon2.type == "Elektro")) {
        damage *= 2
        println("🌊🌊🌊 Das war sehr effektiv! 🌊🌊🌊")
    }
    if (attack.type == "Elektro" && pokemon2.type == "Elektro") {
        damage *= 0.5
        println("⚡️ Das war nicht sehr effektiv! ⚡️")
    }
    if (attack.type == "Gift" && (pokemon2.type == "Pflanze" || pokemon2.type == "Gift")) {
        damage *= 0.5
        println("☣️ Das war nicht sehr effektiv! ☣️")
    }
    if (attack.type == "Boden" && pokemon2.type == "Elektro") {
        damage *= 0
        println("Diese Attacke ist wirkungslos!")
    }
    if (attack.type == "Boden" && pokemon2.type == "Gift") {
        damage *= 0.5
        println("🪨 Das war nicht sehr effektiv! 🪨")
    }
    if (attack.type == "Boden" && (pokemon2.type == "Pflanze" || pokemon2.type == "Wasser")) {
        damage *= 2
        println("🪨🪨🪨 Das war sehr effektiv! 🪨🪨🪨")
    }
    if (attack.type == "Eis" && pokemon2.type == "Feuer") {
        damage *= 2
        println("❄️❄️❄️ Das war nicht sehr effektiv! ❄️❄️❄️")
    }
    if (attack.type == "Geist" && pokemon2.type == "Pokemon.Normal") {
        damage *= 0
        println("Diese Attacke ist wirkungslos!")
    }
    if (attack.type == "Geist" && pokemon2.type == "Gift") {
        damage *= 0.5
        println("👻 Das war nicht sehr effektiv! 👻")
    }
    if (attack.type == "Drache" && (pokemon2.type == "Pflanze" || pokemon2.type == "Feuer" || pokemon2.type == "Wasser" || pokemon2.type == "Elektro")) {
        damage *= 0.5
        println("🐲 Das war nicht sehr effektiv! 🐲")
    }
    if (attack.type == "Stahl" && pokemon2.type == "Gift") {
        damage *= 0
        println("Diese Attacke ist wirkungslos!")
    }
    if (attack.type == "Stahl" && (pokemon2.type == "Pokemon.Normal" || pokemon2.type == "Pflanze")) {
        damage *= 0.5
        println("⚓️ Das war nicht sehr effektiv! ⚓️")
    }
    if (attack.type == "Stahl" && pokemon2.type == "Feuer") {
        damage *= 2
        println("⚓️⚓️⚓️ Das war sehr effektiv! ⚓️⚓️⚓️")
    }
    if (attack.type == "Gestein" && (pokemon2.type == "Pokemon.Normal" || pokemon2.type == "Feuer")) {
        damage *= 0.5
        println("🪨 Das war nicht sehr effektiv! 🪨")
    }
    if (attack.type == "Gestein" && (pokemon2.type == "Pflanze" || pokemon2.type == "Wasser")) {
        damage *= 2
        println("🪨🪨🪨 Das war sehr effektiv! 🪨🪨🪨")
    }
    if (attack.type == "Flug" && pokemon2.type == "Pflanze") {
        damage *= 0.5
        println("✈️ Das war nicht sehr effektiv! ✈️")
    }
    if (attack.type == "Flug" && pokemon2.type == "Elektrik") {
        damage *= 2
        println("✈️✈️✈️ Das war sehr effektiv! ✈️✈️✈️")
    }
    return damage.roundToInt()
}

fun volltreffer (): Double {
    val vollTreffer = listOf(false, true, false, false, false, false)
    return if (vollTreffer.random()) {
        2.0
    } else {
        1.0
    }
}