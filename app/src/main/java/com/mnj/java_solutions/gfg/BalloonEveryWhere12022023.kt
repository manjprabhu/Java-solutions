package com.mnj.java_solutions.gfg

/***
 *
 * ob is very fond of balloons. Once he visited an amusement park with his mother.
 * The mother told Bob that she would buy him a balloon only if he answer her problem right.
 * She gave Bob a string S [contains only lowercase characters] and
 * asked him to use the characters of string to form as many instances of the word "balloon" as possible.
 * Return the maximum number of instances that can be formed.
 *
 * Input:
 * S: nlaebolko
 * Output: 1
 * Explanation:
 * Here, the number of occurence of 'b' = 1
 * of occurence of 'a' = 1
 * of occurence of 'l' = 2
 * of occurence of 'o' = 2
 * of occurence of 'n' = 1
 * So, we can form 1 "balloon" using the letters. */
class BalloonEveryWhere12022023 {
    fun maxInstance() {
        val str = "nlaebolko"
        val map = HashMap<Char, Int>()
        var result = Int.MAX_VALUE
        for (i in 0 until str.length) {
            val ch = str[i]
            if (ch == 'a' || ch == 'b' || ch == 'l' || ch == 'o' || ch == 'n') map[ch] =
                map.getOrDefault(ch, 0) + 1
        }
        map['l'] = map['l']!! / 2
        map['o'] = map['o']!! / 2
        for (x in map.keys) {
            result = Math.min(result, map[x]!!)
        }
        println("==>> Number of balloons :$result")
    }
}
