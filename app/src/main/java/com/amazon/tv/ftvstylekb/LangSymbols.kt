package com.amazon.tv.ftvstylekb

/**
 * Created by semitop7 on 10.03.16.
 */
object LangSymbols {
    const val ABV = "აბგ"
    const val ABC = "abc"
    const val AA = "аА"
    const val BUTTON_SYMB = "#$%"
    const val SPACE = "space"
    const val DELETE = "delete"
    const val CLEAR = "clear"
    const val BACK = "back"
    private const val LEFT = "◀"
    private const val RIGHT = "▶"
    const val NEXT = "next"

    @JvmField
    val KEY_RU_ABV = arrayOf(
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
        "ა", "ბ", "გ", "დ", "ე", "ვ", "ზ ძ", "თ ტ", "ი", "კ",
        "ლ", "მ", "ნ", "ო", "პ", "ჟ ჯ", "რ ღ", "ს შ", "უ", "ფ",
        "ქ", "ყ", "ხ",  "ც ჩ", "წ ჭ", "ჰ", ".,", ": ;", "/ \\", "@",
            ABC, AA, BUTTON_SYMB, SPACE, DELETE, CLEAR,
            BACK, LEFT, RIGHT, NEXT)

    @JvmField
    val KEY_RU_YCU = arrayOf(
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
        "ქ", "წ ჭ", "ე", "რ", "თ ტ", "ყ", "უ", "ი", "ო", "პ",
        "ა", "ს შ", "დ", "ფ", "გ", "ჰ", "ჟ ჯ", "კ", "ლ", ": ;",
        "~", "ზ ძ", "ხ", "ც ჩ", "ვ", "ბ", "ნ", "მ", "?", ". ,",
            ABC, AA, BUTTON_SYMB, SPACE, DELETE, CLEAR,
            BACK, LEFT, RIGHT, NEXT)

    @JvmField
    val KEY_EN_ABC = arrayOf(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z", ".,", ": ;", "/ \\", "@",
            ABV, AA, BUTTON_SYMB, SPACE, DELETE, CLEAR,
            BACK, LEFT, RIGHT, NEXT)

    @JvmField
    val KEY_EN_QWE = arrayOf(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            "q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
            "a", "s", "d", "f", "g", "h", "j", "k", "l", "/ \\",
            "z", "x", "c", "v", "b", "n", "m", ".,", ": ;", "@",
            ABV, AA, BUTTON_SYMB, SPACE, DELETE, CLEAR,
            BACK, LEFT, RIGHT, NEXT)

    @JvmField
    val SYMBOLS = arrayOf(
            "~", "`", "•", "™", "©", "°", "¢", "®", "«", "»",
            "&", "*", "\"", "'", "=", "_", "(", ")", "[", "]",
            ":", ";", "^", "/", "|", "\\", "{", "}", "<", ">",
            "+", "-", "#", "$", "%", "?", "¿", "¡", "£", "€")
}
