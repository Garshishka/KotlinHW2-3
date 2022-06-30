import kotlin.math.roundToInt

fun main() {
    val isMeloman = true
    val amount = 100001_00
    var amountAfterDiscount = amount

    if(amount> 10_000_00)
        amountAfterDiscount = (amount*0.95).roundToInt() // 10000>X -5%
    else if (amount > 1_000_00)
        amountAfterDiscount = amount-100_00             //1000>X>10000 -100

    if(isMeloman)
        amountAfterDiscount = (amountAfterDiscount*0.99).roundToInt() // -1%

    println("Выбрано товаров на $amount коп., к оплате $amountAfterDiscount коп.")
}