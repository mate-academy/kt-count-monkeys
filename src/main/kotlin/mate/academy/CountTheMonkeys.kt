package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val resultArray = IntArray(count);
    for (i in 1..count) {
        resultArray[i - 1] = i
    }
    return resultArray
}
