class Marketing(name: String, age: Int, location: String? = null, private val baseSalary: Int = 10000) :
    Employ(name, age, location), EmployBonus, EmployLeave {


    override fun salary(): Int {
        return  baseSalary
    }

    override fun calculateBonus(): Int {
         return this.bonusCalculation(baseSalary)
    }

    override fun leaveCalculator(): Int {
        return 10
    }
}