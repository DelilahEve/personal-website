package sections

import CommonStyles
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledA
import styled.styledDiv
import styled.styledP

@JsExport
class ThisSite : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
                +CommonStyles.horizontalCenter
                +CommonStyles.smallPadding
            }
            styledP {
                css {
                    +CommonStyles.whiteText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.centerText
                    +CommonStyles.horizontalCenter
                    +CommonStyles.largePadding
                    +CommonStyles.maxWidth(650)
                }
                +"""
                    Even this website is made in Kotlin! I've used KotlinJS + React to build this website, and the code 
                    is freely available on 
                """.trimIndent()
                styledA {
                    css {
                        +CommonStyles.linkStyle
                        +CommonStyles.purpleText
                    }
                    attrs {
                        href = "https://github.com/DelilahEve/personal-website"
                        target = "_blank"
                    }
                    +"my Github"
                }
                +"."
            }
        }
    }
}
