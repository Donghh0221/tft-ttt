
typealias ChampionSet = List<Champion>
class ChampionDeck {
    fun draw(playerLevel: Long): ChampionSet {
        return listOf()
    }
}


class Champion(val cost: ChampionCost)

enum class ChampionCost(val cost: Long) {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
}