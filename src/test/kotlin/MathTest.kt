import org.junit.Assert
import org.junit.Test

class MathTest {

    @Test
    fun addTest() {
        val expected = 3  //預期結果
        val actual = Math().add(1, 2) //呼叫被測試的方法
        Assert.assertEquals(expected, actual) //驗證預期與結果
    }

    @Test
    fun testNumber1LessNumber2_minimumShouldBeNumber1() {
        //number1比number2小的案例
        val expected = Math().minimum(1,3)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testNumber2LessNumber1_minimumShouldBeNumber2() {
        //number2比number1小的案例
        val expected = Math().minimum(3,1)
        val actual = 1
        Assert.assertEquals(expected, actual)
    }
}