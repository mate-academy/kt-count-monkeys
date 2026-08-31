package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
  if (count == 0) return IntArray(0)
    var resultArray = IntArray(count)
    for (i in 1..count) {
        resultArray[i - 1] = i
    }
    return resultArray
}
