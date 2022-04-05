package libro

fun main(args: Array<String>) {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    val inebriation = 43

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else{
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in swful condition!"
    }

    val aura = auraColor(karma)
    val fire = castFireball(inebriation)

    val statusFormatString = "(HP: $healthPoints)(Aura: $aura) -> $name $healthStatus"

    println("(Aura: $aura) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus (Fire: $fire)")
    println(statusFormatString)
}

private fun auraColor(karma: Int): String =
    when (karma) {
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "GREEN"
        else -> "Not aura"
    }

private fun castFireball(inebriation: Int) : String {
    val fire = when (inebriation) {
        in 1..10 -> "TIPSY"
        in 11..20 -> "SLOSHED"
        in 21..30 -> "SOUSED"
        in 31..40 -> "STEWED"
        in 41..50 -> "TOASTED"
        else -> "Not Fire"
    }
    return fire
}

