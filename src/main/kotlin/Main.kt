fun main() {
    print(rob(intArrayOf(2, 7, 9, 3, 1)))
}

fun rob(nums: IntArray): Int {
    if (nums.isEmpty())
        return 0
    if (nums.size == 1)
        return nums[0]
    val robArray = IntArray(nums.size) { 0 }
    robArray[0] = nums[0]
    robArray[1] = maxOf(nums[0], nums[1])
    for (i in 2 until nums.size) {
        robArray[i] = maxOf(robArray[i - 1], robArray[i - 2] + nums[i])
    }
    return robArray[nums.size - 1]
}