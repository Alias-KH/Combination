fun main(args: Array<String>) {
    val array: MutableList<String> = mutableListOf("A", "B", "C", "D", "E", "F") //元の数
    val choose = 3 //選ぶ数
    val ans = Combination<String>().callCombination(array, choose)
    println(ans)
    println(ans.size)
}