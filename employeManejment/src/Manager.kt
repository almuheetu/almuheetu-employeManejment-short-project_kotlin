class Manager(name: String, age: Int, location: String? = null, private val baseSalary: Int) :
    Employ(name, age, location), EmployBonus, EmployLeave {

    override fun salary(): Int = baseSalary

    override fun calculateBonus(salary: Int): Int {
        return if (10000 <= 20000) {
           return 1000
        } else if (20001 <= 50000) {
           return 2000
        } else if (50001 <= 80000) {
          return  3000
        } else {
            0
        }
    }

    override fun leaveCalculator(): Int {
        return 25
    }
}