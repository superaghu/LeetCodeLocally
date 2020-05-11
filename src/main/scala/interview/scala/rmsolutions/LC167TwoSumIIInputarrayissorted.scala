package interview.scala.rmsolutions

/** [[https://leetcode.com/problems/two-sum-ii-input-array-is-sorted]] */
class LC167TwoSumIIInputarrayissorted {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    var low: Int = 0
    var high: Int = numbers.length - 1

    while (low < high) {
      val total = numbers.apply(low) + numbers.apply(high)
      if (total == target) {
        return Array(low + 1, high + 1)
      }
      if (total < target) {
        low = low + 1
      } else {
        high = high - 1
      }
    }

    null
  }
}