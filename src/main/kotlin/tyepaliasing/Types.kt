package tyepaliasing

import java.util.Currency

fun causallyGreet(person: Person): String {
    return "Hello $person!"
}
fun formallyGreet(person: Person, honorific: Honorific): String {
    return "Greetings $honorific $person."
}

typealias Person = String
typealias Honorific = String
















/**
 * Credit: Dave Leeds - https://typealias.com/guides/all-about-type-aliases/
 */
fun exchangeMoney(money: Pair<Long, Currency>, desiredCurrency: Currency, exchangeRate: (Currency, Currency) -> Long): Pair<Long, Currency> {
    val multiplier = exchangeRate(money.second, desiredCurrency)
    return money.first.times(multiplier) to desiredCurrency
}

typealias ExchangeRate = (from: Currency, to: Currency) -> Multiplier
typealias Multiplier = Long

fun typeAliasedExchangeMoney(money: Pair<Long, Currency>, desiredCurrency: Currency, exchangeRate: ExchangeRate): Pair<Long, Currency> {
    val multiplier = exchangeRate(money.second, desiredCurrency)
    return money.first.times(multiplier) to desiredCurrency
}
