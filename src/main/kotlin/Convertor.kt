package org.example

/*
  @author Vlad
  @project   RomanToArabic
  @class  Convertor
  @version  1.0.0 
  @since 2/16/2024 - 10.22
*/

object Convertor {

    private val romanPattern = "^(?=[MDCLXVI])M{0,3}(C[MD]|D?C{0,4})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$".toRegex()

    private val romanToArabic: Map<String, Int> = mapOf(
        "I" to 1, "IV" to 4, "V" to 5, "IX" to 9, "X" to 10,
        "XL" to 40, "L" to 50, "XC" to 90, "C" to 100,
        "CD" to 400, "D" to 500, "CM" to 900, "M" to 1000
    )

    fun String.toArabic(): Int? {
        if (!matchesRomanPattern(this)) {
            return null
        }

        var result = 0
        var previousValue = 0

        this.forEachIndexed { index, char ->
            val currentValue = romanToArabic[char.toString()] ?: throw IllegalArgumentException("Invalid Roman numeral")

            if (index > 0 && currentValue > previousValue) {
                result += currentValue - (previousValue * 2)
            } else {
                result += currentValue
            }

            previousValue = currentValue
        }

        if (result > 4000) throw IllegalArgumentException("Roman numeral exceeds 4000")

        return result
    }

    fun matchesRomanPattern(romanNumber: String): Boolean {
        return romanPattern.matches(romanNumber)
    }
}