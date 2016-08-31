// PSI_ELEMENT: org.jetbrains.kotlin.psi.KtNamedFunction
// OPTIONS: usages

class B(val n: Int) {
    operator fun <caret>invoke(i: Int){}
}

fun f() = B(1)

fun test() {
    f(1).invoke(2)
    f(2)(2)
}
