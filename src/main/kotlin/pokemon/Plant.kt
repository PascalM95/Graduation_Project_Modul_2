package pokemon

import Attack

class Plant (name: String,
             kp: Int,
             att: Int,
             def: Int,
             lvl: Int,
             attacks: List<Attack>,
             type: String = "Pflanze"): Pokemon(name, kp, att, def, lvl, attacks, type)