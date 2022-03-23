class StraightResult : Result {
    override fun isScored(dices: Dices): Boolean {
        val values = dices.getLockedDices()
        var flagDuplicate = false
        values.sort()
        val isEqual = values.all { values[0] == it }
        if(!isEqual){
            for (i in 0..values.size){
                if(i+1 == values.size){
                    break
                }else{
                    if(values[i] == values[i+1] && !flagDuplicate){
                        flagDuplicate = true
                        continue
                    }else
                    if(values[i] + 1 != values[i+1]) {
                        return false
                    }else
                        continue
                }
            }
            return true
        }
        return false
    }
}