package converter

fun main() {
    print("Enter a number and a measure of length: ")
    Switcher().switch()
}

class KilometersConverter(value: Double = 1000.0, information: List<String>, unit: String = "kilometers") : AnyConvertations(value, information,
    unit
) {}
class MetersConverter(value: Double = 1.0, information: List<String>, unit: String = "meters") : AnyConvertations(value, information,
    unit
) {}
class CentimetersConverter(value: Double = 0.01, information: List<String>) : AnyConvertations(value, information) {}
class MillimetersConverter(value: Double = 0.001, information: List<String>) : AnyConvertations(value, information) {}
class MilesConverter(value: Double = 1609.35, information: List<String>) : AnyConvertations(value, information) {}
class YardsConverter(value: Double = 0.9144, information: List<String>) : AnyConvertations(value, information) {}
class FeetConverter(value: Double = 0.3048, information: List<String>) : AnyConvertations(value, information) {}
class InchesConverter(value: Double = 0.0254, information: List<String>) : AnyConvertations(value, information) {}

class Switcher() {
    private val information = readln().split(" ").toList()
    private val parameter = information[1].lowercase()
    fun switch() {

        when (parameter) {
            "km", "kilometer", "kilometers" -> KilometersConverter(information).converter()
            "m", "meter", "meters" -> MetersConverter(information).converter()
            "cm", "centimeter", "centimeters" -> CentimetersConverter(information).converter()
            "mm", "millimeter", "millimeters" -> MillimetersConverter(information).converter()
            "mi", "mile", "miles" -> MilesConverter(information).converter()
            "yd", "yard", "yards" -> YardsConverter(information).converter()
            "ft", "foot", "feet" -> FeetConverter(information).converter()
            "in", "inch", "inches" -> InchesConverter(information).converter()
            else -> print("Wrong input")
        }
    }

}

abstract class AnyConvertations(
    private val value: Double,
    private val information: List<String>,
    private val unit: String
) : Convert {
    override fun converter() = information[0].toDouble() * value
    override fun toString(): String {
        val x = converter()
        val t = information[0].toDouble()
        val z: String = if (information[0].toInt() == 1) unit.dropLast(1) else unit
        val m: String = if (converter() == 1.0) "meter" else "meters"
        return "$t $z is $x $m"

    }
}

interface Convert {
    fun converter(): Double
}