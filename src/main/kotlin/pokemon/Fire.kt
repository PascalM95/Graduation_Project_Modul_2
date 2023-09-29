package pokemon

import Attack

class Fire (name: String,
            kp: Int,
            att: Int,
            def: Int,
            lvl: Int,
            attacks: List<Attack>,
            type: String = "Feuer"): Pokemon(name, kp, att, def, lvl, attacks, type)