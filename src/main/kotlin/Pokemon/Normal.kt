package Pokemon

import Attack

class Normal (name: String,
              kp: Int,
              att: Int,
              def: Int,
              lvl: Int,
              attacks: List<Attack>,
              type: String = "Pokemon.Normal"): Pokemon(name, kp, att, def, lvl, attacks, type) {

              }