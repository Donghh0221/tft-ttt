
typealias ChampionSet = List<Champion>
class ChampionDeck {
    private val championPoll: Map<ChampionCost, MutableList<Champion>> = mapOf(
        ChampionCost.ONE to mutableListOf(),
        ChampionCost.TWO to mutableListOf(),
        ChampionCost.THREE to mutableListOf(),
        ChampionCost.FOUR to mutableListOf(),
        ChampionCost.FIVE to mutableListOf(),
    )

    fun reroll(playerLevel: Long, preSet: ChampionSet?): ChampionSet {
        return listOf(
            Champion.Cassiopeia,
            Champion.ChoGath,
            Champion.Graves,
            Champion.Illaoi,
            Champion.Illaoi,
        )
    }

    fun returnDeadPlayerChampionSet(deadPlayerChampionSet: ChampionSet) {
        return Unit
    }

    fun listAllChampionsByCost(cost: ChampionCost): ChampionSet {
        return listOf()
    }

    fun countRemainChampionsByCost(cost: ChampionCost): Long {
        return 0
    }
}

enum class ChampionCost {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
}

enum class Champion(val cost: ChampionCost, name: String) {
    Cassiopeia(ChampionCost.ONE, "카시오페아"),
    ChoGath(ChampionCost.ONE, "초가스"),
    Graves(ChampionCost.ONE, "그레이브즈"),
    Illaoi(ChampionCost.ONE, "일라오이"),
}