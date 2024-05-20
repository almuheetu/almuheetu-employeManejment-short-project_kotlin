@file:Suppress("NAME_SHADOWING")

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

    val salesEmployeesThree = Sales(name = "Mahfuz", age = 22, baseSalary = 21000)
    employees.add(salesEmployeesThree)


    var marketingCount = 0
    var accountantCount = 0
    var managerCount = 0
    var salesCount = 0

    val marketingEmployees1 = ArrayList<Employ>()
    val accountantEmployees1 = ArrayList<Employ>()
    val managerEmployees1 = ArrayList<Employ>()
    val salesEmployees1 = ArrayList<Employ>()

    for (employee in employees) {
        if (employee is Marketing) {
            marketingCount++
            marketingEmployees1.add(employee)
        } else if (employee is Accountant) {
            accountantCount++
            accountantEmployees1.add(employee)
        } else if (employee is Manager) {
            managerCount++
            managerEmployees1.add(employee)
        } else if (employee is Sales) {
            salesCount++
            salesEmployees1.add(employee)
        }
    }

    println("Total Emoployees : ${employees.size}")

    println("Marketing : $marketingCount")
    marketingEmployees1.forEach {

        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        for (marketingEmployees1 in employees ){
        val baseSalary = marketingEmployees1.salary()
            val bonusSalary = (marketingEmployees1 as EmployBonus).calculateBonus(baseSalary)
            println("Bonus Salary: $bonusSalary")

            val mdBonus = BonusfromMd(marketingEmployees1).bonus()
            println("Bonus from MD: $mdBonus")

            val totalLeave = (marketingEmployees1 as EmployLeave).leaveCalculator()
            println("Total Leave: $totalLeave")

            val totalSalary = baseSalary + bonusSalary + mdBonus
            println("Total Salary: $totalSalary")
            break
        }
    }

    println()
    println("Accountant : $accountantCount")
    accountantEmployees1.forEach{
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")

        for (accountantEmployees1 in employees ){
            val baseSalary = accountantEmployees1.salary()
            val bonusSalary = (accountantEmployees1 as EmployBonus).calculateBonus(baseSalary)
            println("Bonus Salary: $bonusSalary")

            val mdBonus = BonusfromMd(accountantEmployees1).bonus()
            println("Bonus from MD: $mdBonus")

            val totalLeave = (accountantEmployees1 as EmployLeave).leaveCalculator()
            println("Total Leave: $totalLeave")

            val totalSalary = baseSalary + bonusSalary + mdBonus
            println("Total Salary: $totalSalary")
            break
        }
    }

    println()
    println("Manager : $managerCount")
    managerEmployees1.forEach{
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")
        for (managerEmployees1 in employees ){
            val baseSalary = managerEmployees1.salary()
            val bonusSalary = (managerEmployees1 as EmployBonus).calculateBonus(baseSalary)
            println("Bonus Salary: $bonusSalary")

            val mdBonus = BonusfromMd(managerEmployees1).bonus()
            println("Bonus from MD: $mdBonus")

            val totalLeave = (managerEmployees1 as EmployLeave).leaveCalculator()
            println("Total Leave: $totalLeave")

            val totalSalary = baseSalary + bonusSalary + mdBonus
            println("Total Salary: $totalSalary")
            break
        }
    }

    println()
    println("Sales : $salesCount")
    salesEmployees1.forEach{
        println("Name : ${it.name}, Age : ${it.age}, Location : ${it.location}, baseSalary : ${it.salary()}")
        for (salesEmployees1 in employees ){
            val baseSalary = salesEmployees1.salary()
            val bonusSalary = (salesEmployees1 as EmployBonus).calculateBonus(baseSalary)
            println("Bonus Salary: $bonusSalary")

            val mdBonus = BonusfromMd(salesEmployees1).bonus()
            println("Bonus from MD: $mdBonus")

            val totalLeave = (salesEmployees1 as EmployLeave).leaveCalculator()
            println("Total Leave: $totalLeave")

            val totalSalary = baseSalary + bonusSalary + mdBonus
            println("Total Salary: $totalSalary")
            break
        }
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