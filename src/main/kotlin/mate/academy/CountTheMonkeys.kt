package mate.academy

const val START_NUMBER = 1

fun countTheMonkeys(count: Int): IntArray {
    return IntArray(count) {i -> i + START_NUMBER}
}
