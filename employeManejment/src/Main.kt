fun main() {
    val employees = ArrayList<Employ>()



    val marketingEmployees =Marketing(name = "Karim", age = 30, location = "Dhaka", baseSalary = 15000)
    employees.add(marketingEmployees)


    employees.add(Marketing(name = "Rahim", age = 31, location = "Rajshahi", baseSalary = 15000))
    employees.add(Marketing(name = "jarin", age = 32, location = "feny", baseSalary = 15000))
    employees.add(Marketing(name = "harim", age = 33, location = "citagong", baseSalary = 15000))

    employees.add(Accountant(name = "Shihab", age = 25, location = "Sylhet", baseSalary = 30000))
    employees.add(Accountant(name = "Saikat", age = 45, location = "Chittagong", baseSalary = 30000))
    employees.add(Accountant(name = "Leon", age = 55, location = "Sylhet", baseSalary = 30000))
    employees.add(Accountant(name = "Shafi", age = 55, location = "Chittagong", baseSalary = 30000))

    employees.add(Manager(name = "Samir", age = 60, location = "feny", baseSalary = 55000))
    employees.add(Manager(name = "samiya", age = 20, location = "Sylhet", baseSalary = 51000))
    employees.add(Manager(name = "jannat", age = 50, location = "citagong", baseSalary = 45000))
    employees.add(Manager(name = "Rabeya", age = 90, location = "feny", baseSalary = 54000))
    employees.add(Manager(name = "Nusrat", age = 24, location = "Rajshahi", baseSalary = 69000))

    employees.add(Sales(name = "Rabbi", age = 29, location = "Feni", baseSalary = 22000))
    employees.add(Sales(name = "Apple", age = 27, location = "naogaon", baseSalary = 22000))
    employees.add(Sales(name = "Sazzad", age = 38, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Mahfuz", age = 48, location = "Chittagong", baseSalary = 22000))
    employees.add(Sales(name = "Sakib", age = 53, location = "kulna", baseSalary = 22000))

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

for (employee in employees){

    val employName = employee.name
    println("Name : $employName")

    val employAge = employee.age
    println("Age : $employAge")

    val employLocation = employee.location
    println("Location : $employLocation")

    val baseSalary = employee.salary()
    println("Base salary : $baseSalary")

    val bonusSalary = (employee as EmployBonus).calculateBonus(baseSalary)
    println("BonusSalary : $bonusSalary")

    val mdBonus = BonusfromMd(employee).bonus()
    println("BonusfromMd : $mdBonus")


}


}