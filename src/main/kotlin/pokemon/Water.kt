package pokemon

import Attack

class Water (name: String,
             kp: Int,
             att: Int,
             def: Int,
             lvl: Int,
             attacks: List<Attack>,
             type: String = "Wasser"): Pokemon(name, kp, att, def, lvl, attacks, type)