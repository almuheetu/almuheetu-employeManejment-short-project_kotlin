fun main() {
    val employees = ArrayList<Employ>()



    val marketingEmployeesOne = Marketing(name = "Karim", age = 30, location = "Dhaka", baseSalary = 15000)
    employees.add(marketingEmployeesOne)

    val marketingEmployeesTwo = Marketing(name = "Rahim", age = 31, location = "Rajshahi", baseSalary = 15000)
    employees.add(marketingEmployeesTwo)

    val marketingEmployeesThree = Marketing(name = "jarin", age = 30, location = "Dhaka", baseSalary = 15000)
    employees.add(marketingEmployeesThree)


    val accountingEmployeesOne = Accountant(name = "Shihab", age = 30, location = "Rajshahi", baseSalary = 15000)
    employees.add(accountingEmployeesOne)

    val accountingEmployeesTwo = Accountant(name = "Saikat", age = 30, location = "Dhaka", baseSalary = 15000)
    employees.add(accountingEmployeesTwo)

    val accountingEmployeesThree = Accountant(name = "Leon", age = 34, location = "Mohadevpur", baseSalary = 15000)
    employees.add(accountingEmployeesThree)


    val managerEmployeesOne = Manager(name = "Samir", age = 60, location = "feny", baseSalary = 50000)
    employees.add(managerEmployeesOne)

    val managerEmployeesTwo = Manager(name = "samiya", age = 20, location = "Sylhet", baseSalary = 60000)
    employees.add(managerEmployeesTwo)

    val managerEmployeesThree = Manager(name = "Nusrat", age = 22, location = "Rajshahi", baseSalary = 70000)
    employees.add(managerEmployeesThree)


    val salesEmployeesOne = Sales(name = "Rabbi", age = 22, location = "Rajshahi", baseSalary = 22000)
    employees.add(salesEmployeesOne)

    val salesEmployeesTwo = Sales(name = "Sakib", age = 24, location = "Dhaka", baseSalary = 25000)
    employees.add(salesEmployeesTwo)

    val salesEmployeesThree = Sales(name = "Mahfuz", age = 22, location = "Rajshahi", baseSalary = 21000)
    employees.add(salesEmployeesThree)


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

    println("Total emoployees : ${employees.size}")
    println("Marketing : $marketingCount")
    println("Accountant : $accountantCount")
    println("Manager : $managerCount")
    println("Sales : $salesCount")

    for (employee in employees) {

//        val marketingEmploy = marketingCount
//        println("marketingEmploy : $marketingEmploy")

        val employName = employee.name
        println("Name : $employName")

        val employAge = employee.age
        println("Age : $employAge")

        val employLocation = employee.location
        println("Location : $employLocation")

        val baseSalary = employee.salary()
        println("BaseSalary : $baseSalary")

        val bonusSalary = (employee as EmployBonus).calculateBonus(baseSalary)
        println("BonusSalary : $bonusSalary")

        val mdBonus = BonusfromMd(employee).bonus()
        println("BonusfromMd : $mdBonus")

        val totalLeave = (employee as EmployLeave).leaveCalculator()
        println("TotalLeave : $totalLeave")

        val totalSalary = baseSalary + bonusSalary + mdBonus
        println("TotalSalary : $totalSalary")

    }


}