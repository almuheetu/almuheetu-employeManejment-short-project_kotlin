class Sales(name: String, age: Int, location: String? = null, private val baseSalary: Int) :
    Employ(name, age, location), EmployBonus, EmployLeave {

    override fun salary(): Int = baseSalary

    override fun calculateBonus(salary: Int): Int {
        return if (salary in 10000..20000) {
            1000
        } else if (salary in 20001..50000) {
            2000
        } else if (salary in 50001..80000) {
            3000
        } else {
            0
        }
    }

    override fun leaveCalculator(): Int {
        return 18
    }
}
