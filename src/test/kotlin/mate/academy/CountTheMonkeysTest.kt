package mate.academy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountTheMonkeysTest {

    @Test
    fun countTheMonkeys_PositiveCount_ReturnsArrayFromOneToCount() {
        // given
        val count = 5

        // when
        val result = countTheMonkeys(count)

        // then
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun countTheMonkeys_ZeroCount_ReturnsEmptyArray() {
        // given
        val count = 0

        // when
        val result = countTheMonkeys(count)

        // then
        assertArrayEquals(intArrayOf(), result)
    }

    @Test
    fun countTheMonkeys_LargeCount_ReturnsCorrectArray() {
        // given
        val count = 10

        // when
        val result = countTheMonkeys(count)

        // then
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result)
    }
}
