package pokemon

import Attack

class Poison (name: String,
              kp: Int,
              att: Int,
              def: Int,
              lvl: Int,
              attacks: List<Attack>,
              type: String = "Gift"): Pokemon(name, kp, att, def, lvl, attacks, type)