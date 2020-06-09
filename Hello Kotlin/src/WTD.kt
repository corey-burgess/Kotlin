fun main (args: Array<String>) {
    print("What is your mood?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday (mood: String, weather: String = "Sunny", temperature: Int = 24): String {

    fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
    fun isSadRainy(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
    fun isHot(temperature: Int) = temperature > 35

        return when {
        isHappySunny(mood, weather) -> "Go for a walk"
        isSadRainy(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}