import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class ChampionDeckTest {
    @Test
    fun `기본 뽑기 기능 테스트`() {
        val sut = ChampionDeck()

        val result = sut.draw(1)

        assertEquals("뽑은 세트의 사이즈는 5여야한다.", 5, result.size)
        result.forEach {
            assert(it.cost == ChampionCost.ONE)
        }
    }
}