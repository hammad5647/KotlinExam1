fun main() {
    var name: String
    var mobile: Long

//    print("Enter Your Name : ")
//    name = readln()
//    print("Enter Mobile Number : ")
//    mobile = readln().toLong()

    var productName = emptyArray<String>()
    var productPrice = emptyArray<Int>()
    var productQuantity = emptyArray<Int>()

    println("Enter Total Number of Poduct : ")
    var n = readln().toInt()

    for (i in 1..n) {
        print("Enter Product Name $i : ")
        var prodName = readln()

        print("Enter $prodName Price : ")
        var proPrice = readln().toInt()

        print("Enter $prodName Quantity : ")
        var proQuantity = readln().toInt()

        productName += prodName
        productPrice += proPrice
        productQuantity+= proQuantity
    }
    println("================================================")
    println("Product Name\t Product Price \t Product Quantity")
    println("------------------------------------------------")

    var discount = 0
        var sum = 0
    var netPay = 0

    for (i in 1..n) {

        print("${productName[i]}\t\t${productPrice[i]}\t\t${productQuantity[i]}")

        if (productQuantity[i]==1)
        {
            sum+=productPrice[i]
        }
        else
        {
            netPay = productPrice[i]*productQuantity[i]
            sum+=netPay
        }
    }
    println("-------------------------------------------------")
    println("                                   Total : $sum  ")

    if (sum>=5000)
    {
        discount = sum*30/100
        print("                     Discount : $discount (30%)")
    }
    else if (sum<=2000 && sum>=4999)
    {
        discount = sum*20/100
        print("                     Discount : $discount (20%)")
    }
    else if (sum <= 1000 && sum >= 1999) {
        discount = sum * 10 / 100
        print("                     Discount : $discount (10%)")
    }
    else if (sum <= 500 && sum >= 999) {
        discount = sum * 2 / 100
        print("                      Discount : $discount (2%)")
    }
    println("=================================================")
    println("                      Net Pay : ${sum-discount}/-")
}