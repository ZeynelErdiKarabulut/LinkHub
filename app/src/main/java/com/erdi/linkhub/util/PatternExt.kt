package com.erdi.linkhub.util

import java.util.regex.Pattern

fun Pattern.isPatternMatches(string: String): Boolean {
    return matcher(string).matches()
}