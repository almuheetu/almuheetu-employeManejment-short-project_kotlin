
fun main() {
    val employees = ArrayList<Employ>()


    val marketingEmployeesDefault = Marketing(name = "Karim", age = 30, location = "Dhaka")
    employees.add(marketingEmployeesDefault)

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

    val salesEmployeesThree = Sales(name = "Mahfuz", age = 22, baseSalary = 21000)

    employees.add(salesEmployeesThree)


    val marketingEmployees = ArrayList<Marketing>()
    val accountantEmployees = ArrayList<Accountant>()
    val managerEmployees = ArrayList<Manager>()
    val salesEmployees = ArrayList<Sales>()


    for (employee in employees) {
        if (employee is Marketing) {
            marketingEmployees.add(employee)
        } else if (employee is Accountant) {
            accountantEmployees.add(employee)
        } else if (employee is Manager) {
            managerEmployees.add(employee)
        } else if (employee is Sales) {
            salesEmployees.add(employee)
        }
    }


    println("Total Emoployees : ${employees.size}")

    println("Marketing : ${marketingEmployees.count()}")
    marketingEmployees.forEach {
        val mdBonusForMarketer = 2000
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        val baseSalary = it.salary()
        val bonusSalary = it.calculateBonus()
        println("Bonus Salary: $bonusSalary")

        println("Bonus from MD: $mdBonusForMarketer")

        val totalLeave = it.leaveCalculator()
        println("Total Leave: $totalLeave")

        val totalSalary = baseSalary + bonusSalary + it.bonusFromMd()
        println("Total Salary: $totalSalary")


    }

    println()
    println("Accountant : ${accountantEmployees.count()}")
    accountantEmployees.forEach {
        val mdBonusForAccountant = 3000
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        val baseSalary = it.salary()
        val bonusSalary = it.calculateBonus()
        println("Bonus Salary: $bonusSalary")

        val mdBonus = mdBonusForAccountant
        println("Bonus from MD: $mdBonus")

        val totalLeave = it.leaveCalculator()
        println("Total Leave: $totalLeave")

        val totalSalary = baseSalary + bonusSalary + it.bonusFromMd(bonusFromMd = 3000)
        println("Total Salary: $totalSalary")


    }

    println()
    println("Manager : ${managerEmployees.count()}")
    managerEmployees.forEach {
        val mdBonusForManager = 4000
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        val baseSalary = it.salary()
        val bonusSalary = it.calculateBonus()
        println("Bonus Salary: $bonusSalary")

        val mdBonus = mdBonusForManager
        println("Bonus from MD: $mdBonus")

        val totalLeave = it.leaveCalculator()
        println("Total Leave: $totalLeave")

        val totalSalary = baseSalary + bonusSalary + it.bonusFromMd(mdBonusForManager)
        println("Total Salary: $totalSalary")


    }

    println()
    println("Sales : ${salesEmployees.count()}")
    salesEmployees.forEach {
        val mdBonusForSaler= 4000
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        val baseSalary = it.salary()
        val bonusSalary = it.calculateBonus()
        println("Bonus Salary: $bonusSalary")

        val mdBonus = mdBonusForSaler
        println("Bonus from MD: $mdBonus")

        val totalLeave = it.leaveCalculator()
        println("Total Leave: $totalLeave")

        val totalSalary = baseSalary + bonusSalary + it.bonusFromMd(mdBonusForSaler)
        println("Total Salary: $totalSalary")
    }


//    for (employee in employees) {
//        val baseSalary = employee.salary()
//        println("Base Salary: $baseSalary")
//
//        val bonusSalary = (employee as EmployBonus).calculateBonus(baseSalary)
//        println("Bonus Salary: $bonusSalary")
//
//        val mdBonus = BonusfromMd(employee).bonus()
//        println("Bonus from MD: $mdBonus")
//
//        val totalLeave = (employee as EmployLeave).leaveCalculator()
//        println("Total Leave: $totalLeave")
//
//        val totalSalary = baseSalary + bonusSalary + mdBonus
//        println("Total Salary: $totalSalary")
//    }
//    for (employee in employees) {
//
////        val marketingEmploy = marketingCount
////        println("marketingEmploy : $marketingEmploy")
//
////        val employName = employee.name
////        println("Name : $employName")
//
////        val employAge = employee.age
////        println("Age : $employAge")
//
////        val employLocation = employee.location
////        println("Location : $employLocation")
//
//        val baseSalary = employee.salary()
//
//        println("BaseSalary : ${baseSalary}")
//
//        val bonusSalary = (employee as EmployBonus).calculateBonus(baseSalary)
//        println("BonusSalary : $bonusSalary")
//
//        val mdBonus = BonusfromMd(employee).bonus()
//        println("BonusfromMd : $mdBonus")
//
//        val totalLeave = (employee as EmployLeave).leaveCalculator()
//        println("TotalLeave : $totalLeave")
//
//        val totalSalary = baseSalary + bonusSalary + mdBonus
//        println("TotalSalary : $totalSalary")
//
//    }


}