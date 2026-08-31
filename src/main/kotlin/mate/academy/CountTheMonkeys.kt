package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val list = mutableListOf<Int>()
    for (c in 1..count) {
        list.add(c)
    }
    return list.toIntArray()
}
