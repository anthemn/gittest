package org.example

open class GameObject(private val id: Int, private var name: String = "defaultName") {
    protected var x = 0
    protected var y = 0

    fun getId(): Int{
        return id
    }
    fun getName(): String{
        return name
    }
    fun getX(): Int{
        return x
    }
    fun getY(): Int{
        return y
    }
}

open class Unit(private val unitId: Int, private var unitName: String = "defaulName"): GameObject(unitId, unitName){
    private var isAlive = true
    private var hp: Float = 100F

    fun isAlive(): Boolean{
        return isAlive
    }
    fun getHp(): Float{
        return hp
    }
    fun receiveDamage(damage: Float){
        if (damage >= hp){
            hp = 0F
            isAlive = false
        } else {
            hp -= damage
        }
    }

}

class Archer(private val archerId: Int, private var archerName: String = "defaulName"): Unit(archerId, archerName), Attacker, Moveable{
    private var baseDamage = 40F

    override fun attack(unit: Unit) {
        unit.receiveDamage(baseDamage)
    }

    override fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}

open class Building(private val buildingId: Int, private var buildingName: String = "defaultName", private var builtStatus: Boolean = false): GameObject(buildingId, buildingName){
    fun isBuilt(): Boolean{
        return builtStatus
    }
}

class Fort(private val fortId: Int, private var fortName: String = "defaultName", private var fortBuildStatus: Boolean = false): Building(fortId, fortName, fortBuildStatus), Attacker{
    private val baseDamage = 70F

    override fun attack(unit: Unit) {
        unit.receiveDamage(baseDamage)
    }
}

class MobileHouse(private val mobileId: Int, private var mobileName: String = "defaultName", private var mobileBuildStatus: Boolean = false): Building(mobileId, mobileName, mobileBuildStatus), Moveable{
    private val baseDamage = 70F

    override fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}

interface Attacker {
    fun attack(unit: Unit)
}

interface Moveable{
    fun move(x: Int, y: Int)
}

