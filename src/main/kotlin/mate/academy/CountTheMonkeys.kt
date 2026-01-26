package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    var ar = mutableListOf<Int>()
    for (i in 1..count) {
        ar.add(i)
    }
    return ar.toIntArray()
}
