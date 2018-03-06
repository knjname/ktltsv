package ktltsv

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KtLtsvKtTest {

    @Test
    fun `ltsv test`() {
        assertEquals("k1:v1\tk2:v2", ltsv(listOf("k1" to "v1", "k2" to "v2")))
    }
}
