fun main() {
    val employees = ArrayList<Employ>()

    employees.add(Marketing(name = "Karim", age = 30, location = "Dhaka", baseSalary = 15000))
    employees.add(Accountant(name = "Rahim", age = 25, location = "Chittagong", baseSalary = 30000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Sales(name = "Rafiq", age = 28, location = "Barisal", baseSalary = 22000))

    var marketingCount = 0
    var accountantCount = 0
    var managerCount = 0
    var salesCount = 0


    for (employee in employees) {
        if (employee is Marketing) {
            marketingCount++
        } else if (employee is Accountant) {
            accountantCount++
        } else if (employee is Manager) {
            managerCount++
        } else if (employee is Sales) {
            salesCount++
        }
    }

    println("Total employees: ${employees.size}")
    println("Marketing employees: $marketingCount")
    println("Accountant employees: $accountantCount")
    println("Manager employees: $managerCount")
    println("Sales employees: $salesCount")

    for (employee in employees) {
        val baseSalary = employee.salary()
        val bonus = (employee as? EmployBonus)?.calculateBonus(baseSalary) ?: 0
        val totalLeave = (employee as? EmployLeave)?.leaveCalculator() ?: 0
        val totalSalary = baseSalary + bonus
        println(
            """
            |Name: ${employee.name}
            |Age: ${employee.age}
            |Location: ${employee.location ?: "N/A"}
            |Salary: $baseSalary
            |Bonus: $bonus
            |Total Leave: $totalLeave
            |Total Salary: $totalSalary
            """.trimMargin()
        )
    }
}