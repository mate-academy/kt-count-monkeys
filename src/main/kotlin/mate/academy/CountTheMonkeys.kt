package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    return if (count == 0) intArrayOf() else (1..count).toList().toIntArray()
}
