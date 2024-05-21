fun Employ.bonusCalculation(baseSalary: Int) : Int{
    return if (baseSalary in 10000..20000) {
        1000
    } else if (baseSalary in 20001..50000) {
        2000
    } else if (baseSalary in 50001..80000) {
        3000
    } else {
        0
    }
}