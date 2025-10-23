package mate.academy
private const val EVEN_REMAINDER = 0
private const val EVEN_REMAIN = 1
// Реалізуйте функцію `countTheMonkeys()` так, щоб вона повертала IntArray
// з елементами від `1` до `count`.
fun countTheMonkeys(count: Int): IntArray {
    return if (count <= EVEN_REMAINDER ) {
        intArrayOf()
    } else {
        (EVEN_REMAIN..count).toList().toIntArray()
    }
}
