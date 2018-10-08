package tyepaliasing

import java.util.Currency

fun casuallyGreet(person: String): String {
    return "Hello $person!"
}
fun formallyGreet(person: String, honorific: String): String {
    return "Greetings $honorific $person."
}

//typealias Person = String
//typealias Honorific = String
















/**
 * Credit: Dave Leeds - https://typealias.com/guides/all-about-type-aliases/
 */
fun exchangeMoney(money: Pair<Long, Currency>, desiredCurrency: Currency, exchangeRate: (Currency, Currency) -> Long): Pair<Long, Currency> {
    val multiplier = exchangeRate(money.second, desiredCurrency)
    return money.first.times(multiplier) to desiredCurrency
}