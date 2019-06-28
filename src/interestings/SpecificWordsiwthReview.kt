package interestings

fun main() {
    val keywords = readLine()!!.split(" ").toSet()
    val numberOfCases = readLine()!!.toInt()

    // read review
    val hotelCount: MutableMap<Int, Int> = mutableMapOf()

    for (i in 0 until numberOfCases) {
        val id = readLine()!!.toInt()
        if (!hotelCount.containsKey(id)) {
            hotelCount.put(id, 0)
        }
        val reviews = readLine()!!.split(" ").toMutableList()
        for (index in 0 until reviews.size) {
            reviews[index] = reviews[index].replace("[$!,.]", "").toLowerCase()
            if (keywords.contains(reviews[index])) {
                hotelCount.put(id, hotelCount.getValue(id) + 1)
            }
        }
    }


    val sorted = hotelCount.toList().sortedBy { (_, value) -> value }.toMap()

    for (entry in sorted) {
        print("key: " + entry.key)
        println(" Value: " + entry.value)
    }
}