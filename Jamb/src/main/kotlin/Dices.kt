class Dices(
    private var unlockedDices: MutableList<Dice> = mutableListOf(),
    private var lockedDices: MutableList<Dice> = mutableListOf()
)
{
    fun addDices(dice: Dice): Unit{
        unlockedDices.add(dice)
    }

    fun lockDices(index: Int): Unit{
            lockedDices.add(unlockedDices[index])
            unlockedDices.removeAt(index)
    }

    fun lockRestDices(): Unit {
        for (dice in unlockedDices) {
            if (unlockedDices.isEmpty()) {
                break;
            } else {
                lockedDices.add(dice)
            }
        }
    }

    fun clearUnlockedDices(): Unit{
        unlockedDices.clear()
    }

    fun getUnlockedDices(): MutableList<Int>{
        val dicesValue: MutableList<Int> = mutableListOf()
        for (dice in unlockedDices){
            dicesValue.add(dice.getValue())
        }
        return dicesValue
    }

    fun getLockedDices(): MutableList<Int>{
        val dicesValue: MutableList<Int> = mutableListOf()
        for (dice in lockedDices){
            dicesValue.add(dice.getValue())
        }
        return dicesValue
    }
}