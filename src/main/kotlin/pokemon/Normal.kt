package pokemon

import Attack

class Normal (name: String,
              kp: Int,
              att: Int,
              def: Int,
              lvl: Int,
              attacks: List<Attack>,
              type: String = "pokemon.Normal"): Pokemon(name, kp, att, def, lvl, attacks, type)