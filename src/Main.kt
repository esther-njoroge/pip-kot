fun main(){
    val disaster = DisasterRecovery()
    disaster.addSituation("Nairobi", "Flood")
    disaster.addSituation("Marsabit", "Drought")
    println(disaster.attendSituation("Nairobi")) // Output: [Flood]
    println(disaster.attendSituation("Marsabit")) // Output: [Earthquake]


}


class DisasterRecovery{
    private val situations = mutableMapOf<String, MutableList<String>>()
    fun addSituation(location: String, situation: String) {
        if (!situations.containsKey(location)) {
            situations[location] = mutableListOf()
        }
        situations[location]?.add(situation)
    }
    fun attendSituation(location: String): List<String>? {
        return situations[location]
    }
}


