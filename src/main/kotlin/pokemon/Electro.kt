package pokemon

import Attack

class Electro (name: String,
               kp: Int,
               att: Int,
               def: Int,
               lvl: Int,
               attacks: List<Attack>,
               type: String = "Elektro"): Pokemon(name, kp, att, def, lvl, attacks, type)