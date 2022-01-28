class Combination<T> {

    fun callCombination(elementList: MutableList<T>, selected: Int): MutableList<MutableList<T>> {
        val elementListList: MutableList<MutableList<T>> = mutableListOf()
        elementList.forEach {
            elementListList.add(mutableListOf(it))
        }
        return combination(elementListList, selected)
    }

    private fun combination(elementListList: MutableList<MutableList<T>>, selected: Int): MutableList<MutableList<T>> {
        val combinationListList: MutableList<MutableList<T>> = mutableListOf()
        return if (1 < selected) {
            elementListList.withIndex().forEach { elementList ->
                combination(
                    elementListList.subList(elementList.index + 1, elementListList.size),
                    selected - 1
                ).forEach {
                    combinationListList.add((elementList.value + it) as MutableList<T>)
                }
            }
            combinationListList
        } else {
            elementListList
        }
    }
}