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
    employees.add(Manager(name = "samiya", age = 40, location = "Sylhet", baseSalary = 51000))
    employees.add(Manager(name = "jannat", age = 40, location = "Sylhet", baseSalary = 45000))
    employees.add(Manager(name = "Rabeya", age = 40, location = "Sylhet", baseSalary = 54000))
    employees.add(Manager(name = "Basori", age = 40, location = "Sylhet", baseSalary = 69000))

    employees.add(Sales(name = "Rabbi", age = 28, location = "Feni", baseSalary = 22000))
    employees.add(Sales(name = "Apple", age = 28, location = "naogaon", baseSalary = 22000))
    employees.add(Sales(name = "Sazzad", age = 28, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Mahfuz", age = 28, location = "Barisal", baseSalary = 22000))
    employees.add(Sales(name = "Sakib", age = 28, location = "kulna", baseSalary = 22000))

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
    println("Maneger : $managerCount")
    println("Sales : $salesCount")

for (employee in employees){

    val employName = employee.name
    println("Name : $employName")

    val employAge = employee.age
    println("Age : $employAge")


    val baseSalary = employee.salary()
    println("Base salary : $baseSalary")
}


}