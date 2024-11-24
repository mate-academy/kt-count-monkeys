package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
  if (count == 0) {
      return IntArray(0)
  } else {
      val list = mutableListOf<Int>()
      for (i in 1..count) {
          list.add(i)
      }
      return list.toIntArray()
  }
}
