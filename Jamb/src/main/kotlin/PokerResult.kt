class PokerResult : Result {
    override fun isScored(dices: Dices): Boolean {
        val isEqual = dices.getLockedDices().all { dices.getLockedDices()[0] == it }
        return isEqual && dices.getLockedDices().size == 4
    }
}