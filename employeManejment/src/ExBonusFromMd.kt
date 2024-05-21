/*
class BonusFromMd {
    fun bonus(): Int {
        return 2000
    }
}
*/
fun Employ.bonusFromMd(bonusFromMd:Int = 2000):Int{
    return bonusFromMd
}

/*
fun Employ.bonusFromMd():Int{
    this.salary().bonusFromMd(this.salary(), mdOffer = 5000)
   return this.salary() + 2000
}

fun Int.bonusFromMd(salary:Int, mdOffer:Int = 2000):Int{
    return  salary + mdOffer
}*/
