package Recursion

import Recursion.Tower_of_Hanoi
import java.util.*
import kotlin.jvm.JvmStatic

object Tower_of_Hanoi {
    fun twh(n: Int, src: String, helper: String, dest: String) {
        if (n == 1) {
            println("transfer disk $n from $src to $dest")
            return
        }
        twh(n - 1, src, dest, helper)
        println("transfer disk $n from $src to $dest")
        twh(n - 1, helper, src, dest)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        while (true) {
            println("Enter no. of disks ->")
            val n = sc.nextInt()
            twh(n, "s", "H", "d")
        }
    }
}