class Accountant(name: String, age: Int, location: String? = null, val baseSalary: Int = 15000) :
    Employ(name, age, location), EmployBonus, EmployLeave {

    override fun salary(): Int = baseSalary

    override fun calculateBonus(): Int {
        return this.bonusCalculation(baseSalary)
    }

    override fun leaveCalculator(): Int {
        return 15
    }
}
