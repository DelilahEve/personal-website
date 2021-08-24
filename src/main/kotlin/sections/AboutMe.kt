package sections

import CommonStyles
import cdnUrl
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.b
import styled.css
import styled.styledA
import styled.styledDiv
import styled.styledH1
import styled.styledImg
import styled.styledP

class AboutMe : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledImg {
                css {
                    +CommonStyles.inline
                    +CommonStyles.floatLeft
                }
                attrs {
                    src = "${cdnUrl}/headshot.png"
                    alt = "Headshot"
                    width = "200px"
                    height = "200px"
                }
            }
            styledDiv {
                css {
                    +CommonStyles.inline
                    +CommonStyles.floatLeft
                    +CommonStyles.smallIndent
                }
                styledH1 {
                    css {
                        +CommonStyles.whiteText
                        +CommonStyles.fontSize(28)
                    }
                    +"Delilah Carriere / @DelilahEve"
                }
                styledP {
                    css {
                        +CommonStyles.whiteText
                        +CommonStyles.fontSize(18)
                    }
                    +"Kotlin fullstack developer"
                }
                styledP {
                    css {
                        +CommonStyles.whiteText
                        +CommonStyles.maxWidth(500)
                        +CommonStyles.fontSize(16)
                    }
                    b {
                        +"Expert with all things Kotlin;"
                    }
                    +"""
                         Self taught for over 13 years,  
                        I have experience in 9 different languages with a proficiency for Java and Kotlin.
                        
                        If you're interested in my skill, I've placed some of my proudest achievements 
                        below. Scroll down to see!
                    """.trimIndent()
                }
            }
        }
        styledDiv {
            css {
                +CommonStyles.largePadding
                +CommonStyles.centerText
            }
            styledA {
                css {
                    +CommonStyles.linkStyle
                    +CommonStyles.horizontalCenter
                }
                attrs {
                    href = "https://github.com/delilaheve"
                    target = "_blank"
                }
                styledImg {
                    attrs {
                        src = "${cdnUrl}/github.png"
                        alt = "Github Octocat"
                        width = "136px"
                        height = "136px"
                    }
                }
                styledP {
                    css {
                        +CommonStyles.whiteText
                        +CommonStyles.centerText
                        +CommonStyles.fontSize(14)
                    }
                    +"GitHub/DelilahEve"
                }
            }
        }
    }
}
