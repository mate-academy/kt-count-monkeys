package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) return intArrayOf()
    val intArray = IntArray(count)
    for (i in 0 until count) intArray[i] = i + 1
    return intArray
}
