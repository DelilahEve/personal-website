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

@JsExport
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
        styledDiv {
            css {
                +CommonStyles.largePadding
                +CommonStyles.centerText
            }
            styledA {
                css {
                    +CommonStyles.linkStyle
                }
                attrs {
                    href = "https://docs.google.com/document/d/1ZOKGfnO8ZHjMA5K834r9iQ2npZV5a5a7/edit?usp=sharing&ouid=106415526270354877045&rtpof=true&sd=true"
                    target = "_blank"
                }
                styledDiv {
                    css {
                        +CommonStyles.purpleBackground
                        +CommonStyles.tinyPadding
                        +CommonStyles.roundedCorners
                        +CommonStyles.horizontalCenter
                        +CommonStyles.maxWidth(220)
                        hover {
                            +CommonStyles.lightPurpleBackground
                        }
                    }
                    styledP {
                        css {
                            +CommonStyles.whiteText
                            +CommonStyles.centerText
                            +CommonStyles.fontSize(18)
                        }
                        +"See my resume"
                    }
                }
            }
        }
    }
}
