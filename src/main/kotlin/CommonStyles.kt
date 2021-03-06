import kotlinx.css.*
import kotlinx.css.Display.inlineBlock
import kotlinx.css.Overflow.auto
import kotlinx.css.TextAlign.center
import kotlinx.css.properties.TextDecoration
import styled.StyleSheet

object CommonStyles : StyleSheet("CommonStyles", isStatic = false) {

    /**
     * Style
     */
    val whiteText by css {
        color = Color("#bdc1c6")
    }

    val blackText by css {
        color = Color.black
    }

    val purpleText by css {
        color = Color("#c96ef7")
    }

    val whiteBackground by css {
        backgroundColor = Color.white
    }

    val blackBackground by css  {
        backgroundColor = Color("#202124")
    }

    val purpleBackground by css {
        backgroundColor = Color("#9d0de4")
    }

    val lightPurpleBackground by css {
        backgroundColor = Color("#c96ef7")
    }

    val linkStyle by css {
        textDecoration = TextDecoration.none
    }

    val roundedCorners by css {
        borderRadius = LinearDimension("8px")
    }

    // Dynamic font size
    fun fontSize(size: Int): RuleSet {
        val result by css {
            fontSize = LinearDimension("${size}pt")
        }
        return result
    }

    /**
     * Spacing
     */
    val sectionPadding by css {
        paddingBottom = LinearDimension("2.5%")
        paddingTop = LinearDimension("2.5%")
    }

    val  tinyPadding by css {
        padding = "16px"
    }

    val smallPadding by css {
        paddingLeft = LinearDimension("12px")
        paddingRight = LinearDimension("12px")
        paddingTop = LinearDimension("36px")
        paddingBottom = LinearDimension("36px")
    }

    val largePadding by css {
        padding = "56px"
    }

    val smallIndent by css {
        paddingLeft = LinearDimension("36px")
    }

    val largeIndent by css {
        paddingLeft = LinearDimension("36px")
        paddingRight = LinearDimension("36px")
    }

    val horizontalCenter by css {
        maxWidth = LinearDimension("1248px")
        margin = "auto"
    }

    // Dynamic max width style
    fun maxWidth(width: Int): RuleSet {
        val result by css {
            maxWidth = LinearDimension("${width}px")
        }
        return result
    }

    /**
     * Alignment
     */
    val inline by css {
        display = inlineBlock
    }

    val floatLeft by css {
        float = Float.left
    }

    val floatRight by css {
        float = Float.right
    }

    val floatWrap by css {
        overflow = auto
    }

    val centerText by css {
        textAlign = center
    }

} 
