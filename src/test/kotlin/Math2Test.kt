import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class Math2Test {

    @Test
    fun addTest() {
        val math = Math2()
        val expected = 3 //預期結果
        math.add(1, 2) //呼叫被測試方法
        val actual = math.result //驗證物件屬性

        Assert.assertEquals(expected, actual)
    }
}