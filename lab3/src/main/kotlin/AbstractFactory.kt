package org.example

interface Hero {
    fun attack()
}

interface Weapon {
    fun use()
}
// Герой Эльфов
class ElfHero : Hero {
    override fun attack() {
        println("Elf attacks")
    }
}

class OrcHero : Hero {
    override fun attack() {
        println("Orc attacks")
    }
}

class ElfWeapon : Weapon {
    override fun use() {
        println("Use elf`s bow")
    }
}

class OrcWeapon : Weapon {
    override fun use() {
        println("Use orc`s axe")
    }
}

interface GameFactory {
    fun createHero(): Hero
    fun createWeapon(): Weapon
}

class ElfFactory : GameFactory {
    override fun createHero(): Hero {
        return ElfHero()
    }

    override fun createWeapon(): Weapon {
        return ElfWeapon()
    }
}

class OrcFactory : GameFactory {
    override fun createHero(): Hero {
        return OrcHero()
    }

    override fun createWeapon(): Weapon {
        return OrcWeapon()
    }
}

fun setupGame(factory: GameFactory) {
    val hero = factory.createHero()
    val weapon = factory.createWeapon()

    hero.attack()
    weapon.use()
}
