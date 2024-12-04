package org.example

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}

interface IterableCollection<T> {
    fun createIterator(): Iterator<T>
}

class EmployeeCollection : IterableCollection<Employee> {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    override fun createIterator(): Iterator<Employee> {
        return EmployeeIterator(employees)
    }
}

class EmployeeIterator(private val employees: List<Employee>) : Iterator<Employee> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < employees.size
    }

    override fun next(): Employee {
        if (!hasNext()) throw NoSuchElementException()
        return employees[index++]
    }
}

data class Employee(val id: Int, val name: String, val position: String)