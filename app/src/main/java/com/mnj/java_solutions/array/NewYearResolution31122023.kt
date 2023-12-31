package com.mnj.java_solutions.array

/**
 *
 * As the clock struck midnight on New Year's Eve, Geek bid farewell to the wasted moments of 2023, realizing the untapped potential of GFG's Problem of the Day.

His 2024 resolution: Solve POTD every day.

Eager to earn coins for GFG Merchandise, Geek faces new rules:

Earning Coin: Geek can accumulate coins[i] by solving the POTD on the ith day, where 1 <= coins[i] <= 2024 and the sum of coins <= 2024.
Merchandise Eligibility: To purchase merchandise, the coins earned must be divisible by 20 or 24, or precisely equal to 2024.
Geek's resolutions often fades over time. Realistically, he can only commit to active participation for N (where N ≤ 366) days. Given the value of N and number of coins associated with each POTD, can Geek strategically solve some (or all) POTDs to become eligible for redeeming merchandise?

Example 1:

Input:
N = 8
coins = [5, 8, 9, 10, 14, 2, 3, 5]

Output: 1

Explanation:
Geek can fulfill the criteria in many ways.
One such way is to solve POTD on 4th and 5th day.
Another way is to solve POTD on 1st, 4th and 8th day.
Example 2:

Input:
N = 5
coins = [1, 2, 3, 4, 5]

Output: 0

Explanation: There is no way Geek can become eligible.

 **/

//solution : If we can get sum divisible by 20 or 24 or sum == 2024 return true else false
class NewYearResolution31122023 {

    fun isPossible(N: Int, coins: IntArray?): Boolean {
        return solution(0, 0, coins!!)
    }

    private fun solution(index: Int, sum: Int, coins: IntArray): Boolean {
        if (sum > 0 && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024)) {
            return true
        }
        return if (index >= coins.size) false else solution(
            index + 1,
            sum + coins[index],
            coins
        ) || solution(index + 1, sum, coins)
    }
}