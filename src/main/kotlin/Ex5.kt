package example1

/**
 * String templates

 * Triple-quoted strings are not only useful for multiline strings but also for creating
 * regex patterns as you don't need to escape a backslash with a backslash.
 */

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\ $month \d{4}"""