package interestings

fun main() {
    val sumToFind = 66
    val array = arrayOf(10, 18, 11, 21, 28, 31, 38, 40, 55, 60, 62)

    val num2Index = mutableMapOf<Int, Int>()

    for (i in 0 until array.size)
        num2Index.put(array[i], i)

    for (i in 0 until array.size) {
        if (num2Index.containsKey(sumToFind - array[i]) && num2Index.get(sumToFind - array[i]) != i)
            println(1)
    }
    println(0)
}