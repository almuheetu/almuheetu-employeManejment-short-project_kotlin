class Manager(name: String, age: Int, location: String? = null, private val baseSalary: Int = 55000) :
    Employ(name, age, location), EmployBonus, EmployLeave {

    override fun salary(): Int = baseSalary

    override fun calculateBonus(): Int {
        return this.bonusCalculation(baseSalary)
    }

    override fun leaveCalculator(): Int {
        return 20
    }
}