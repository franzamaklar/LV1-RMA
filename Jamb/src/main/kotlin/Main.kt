import kotlin.random.Random

fun main(args: Array<String>) {
    val dices = Dices()
    val random: Random = Random
    val hand = Hand(random)
    var rollingSize = 6
    var sizeOfLockedDices: String?

    for(rollNumber in 1..3) {
        if (rollingSize == 0) {
            break
        } else {
            for (j in 1..rollingSize) {
                dices.addDices(hand.rollDice())
            }
            println(dices.getUnlockedDices())

            println("Odaberite broj kockica koje zelite zakljucati:")
            sizeOfLockedDices = readLine()

            if(rollNumber == 3 && sizeOfLockedDices == "0"){
                dices.lockRestDices()
            }

            if (sizeOfLockedDices != null && sizeOfLockedDices != "0") {
                var sizeLock: Int = sizeOfLockedDices.toInt()
                rollingSize -= sizeLock

                while (sizeLock != 0) {
                    println(dices.getUnlockedDices())
                    println("Odaberi broj kockice u redoslijedu: ")
                    val indexOfDice: String? = readLine()
                    if (indexOfDice != null) {
                        if(indexOfDice.toInt() <= dices.getUnlockedDices().size) {
                            dices.lockDices(indexOfDice.toInt() - 1)
                        }else{
                            println("Neispravan unos, gubite jednu kockicu!")
                            break
                        }
                        sizeLock--
                    }
                }
            }
            dices.clearUnlockedDices()
        }
    }

    println("Pohranjene kockice: ")
    println(dices.getLockedDices())
    val yahtzeeResult = YahtzeeResult()
    val pokerResult = PokerResult()
    val straightResult = StraightResult()
    var flag = false
    if(yahtzeeResult.isScored(dices)){
        println("Dobili ste Jamb!")
        flag = true
    }
    if(pokerResult.isScored(dices)){
        println("Dobili ste Poker!")
        flag = true
    }
    if(straightResult.isScored(dices)){
        println("Dobili ste Skalu!")
        flag = true
    }
    if(!flag)
        println("Nazalost nema dobitka. Pokusajte ponovno!")
}