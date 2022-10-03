class Employee(var name: String,
               private var position: String,
               private var salary: Boolean,
               private var payRate: Double,
               private var shift: Int ) {

    fun printAll() {
        println(name.toString() + "\n"  +
                "\nposition: " + position + "\nsalary: " + salary + "\npayRate: " +
                payRate + "\nshift: " + shift)
    }







}

