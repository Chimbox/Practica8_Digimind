package felix.alfonso.digimind_00000204270

import java.io.Serializable

class Cart : Serializable{
    var reminders = ArrayList<Reminder>()

    fun add(r:Reminder): Boolean {
        return reminders.add(r)
    }
}