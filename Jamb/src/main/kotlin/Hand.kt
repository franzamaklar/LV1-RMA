import kotlin.random.Random

class Hand(
    private var random: Random
){
    fun rollDice(): Dice {
            return Dice(random.nextInt(1, 6));
    }
}