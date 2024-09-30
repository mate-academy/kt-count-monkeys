package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val mutableList = mutableListOf<Int>()
    for (i in 1..count) {
        mutableList.add(i)
    }
    return mutableList.toIntArray()
}
