// "Replace with 'NewClass(12)'" "true"

@Deprecated("Use NewClass", replaceWith = ReplaceWith("NewClass"))
class OldClass @Deprecated("Use NewClass(12)", level = DeprecationLevel.ERROR, replaceWith = ReplaceWith("NewClass(12)")) constructor()

@Deprecated("Use New", replaceWith = ReplaceWith("New"))
typealias Old = OldClass

class NewClass(p: Int = 12)
typealias New = NewClass

fun foo() = <caret>Old()
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.k2.codeinsight.fixes.replaceWith.DeprecatedSymbolUsageFix
/* IGNORE_K2 */