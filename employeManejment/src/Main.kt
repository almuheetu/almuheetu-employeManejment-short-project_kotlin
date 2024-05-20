fun main() {
    val employees = ArrayList<Employ>()



    employees.add(Marketing(name = "Karim", age = 30, location = "Dhaka", baseSalary = 15000))
    employees.add(Marketing(name = "Rahim", age = 30, location = "Rajshahi", baseSalary = 15000))
    employees.add(Marketing(name = "jarin", age = 30, location = "feny", baseSalary = 15000))
    employees.add(Marketing(name = "harim", age = 30, location = "citagong", baseSalary = 15000))
    employees.add(Accountant(name = "Rahim", age = 25, location = "Chittagong", baseSalary = 30000))
    employees.add(Accountant(name = "Rahim", age = 25, location = "Chittagong", baseSalary = 30000))
    employees.add(Accountant(name = "Rahim", age = 25, location = "Chittagong", baseSalary = 30000))
    employees.add(Accountant(name = "Rahim", age = 25, location = "Chittagong", baseSalary = 30000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Manager(name = "Samir", age = 40, location = "Sylhet", baseSalary = 55000))
    employees.add(Sales(name = "Rafiq", age = 28, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Rafiq", age = 28, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Rafiq", age = 28, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Rafiq", age = 28, location = "Barisal", baseSalary = 22000))
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

  println("Total emoployee ${employees.size}")
    println("Marketing $marketingCount")


}