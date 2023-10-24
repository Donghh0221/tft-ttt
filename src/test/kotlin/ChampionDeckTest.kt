import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.assertTrue

class ChampionDeckTest {
    @Test
    fun `한 세트의 사이즈는 5장이어야한다`() {
        val sut = ChampionDeck()

        val result = sut.reroll(1, null)

        assertEquals("뽑은 세트의 사이즈는 5여야한다.", 5, result.size)
    }

    @Test
    fun `1렙에는 1코스트 챔피언만 나와야한다`() {
        val sut = ChampionDeck()

        val result = sut.reroll(1, null)

        assertTrue { result.all { it.cost == ChampionCost.ONE } }
    }

    @Test
    fun `리롤을 한 후, 플레이어 상점에 있는 챔피언은 빠져야한다`() {
        val sut = ChampionDeck()
        val preCount = sut.listAllChampionsByCost(ChampionCost.ONE).size

        val result = sut.reroll(1, null)
        assertTrue { result.all { it.cost == ChampionCost.ONE } }

        val afterCount = sut.listAllChampionsByCost(ChampionCost.ONE).size
        assertTrue { preCount - afterCount == 5 }
    }
}