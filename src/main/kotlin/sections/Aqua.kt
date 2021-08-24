package sections

import CommonStyles
import cdnUrl
import kotlinx.html.IframeSandbox
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.b
import react.dom.iframe
import styled.css
import styled.styledA
import styled.styledDiv
import styled.styledH1
import styled.styledH2
import styled.styledImg
import styled.styledP

@JsExport
class Aqua : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledImg {
                css {
                    +CommonStyles.floatLeft
                    +CommonStyles.inline
                }
                attrs {
                    attrs {
                        src = "${cdnUrl}/aqua.png"
                        alt = "OvD logo"
                        width = "200px"
                        height = "200px"
                    }
                }
            }
            styledDiv {
                css {
                    +CommonStyles.smallPadding
                    +CommonStyles.floatLeft
                    +CommonStyles.inline
                }
                styledH2 {
                    css {
                        +CommonStyles.blackText
                        +CommonStyles.fontSize(24)
                    }
                    +"Aqua - Discord bot"
                }
            }
        }
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledP {
                css {
                    +CommonStyles.floatLeft
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.blackText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +"""
                    Aqua is my Discord bot. I've been tinkering with her for 3+ years, beginning with a fork of another 
                    bot she was originally built in Python. When she outgrew my modifying I migrated to Java, doing a 
                    complete re-write of her code. Not long after I fell in love with Kotlin and quickly converted Aqua 
                    with me.
                """.trimIndent()
            }
            styledP {
                css {
                    +CommonStyles.floatLeft
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.blackText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +"""
                    Aqua now sports 50 unique commands, with 10 background services operating on Kotlin's coroutines. 
                    Some of her functions are simple, an 8ball, rolling dice, or doing a Google search, and some are 
                    more complex, such as her Overseer service which interacts with my previously mentioned Overseer 
                    Api to provide output for all players including a live display of server statuses, interactive chat 
                    that allows people in our discord server to interact with players in-game, and a variety of admin 
                    tools.
                """.trimIndent()
            }
        }
        styledDiv {
            css {
                +CommonStyles.horizontalCenter
                +CommonStyles.smallPadding
            }
            styledP {
                css {
                    +CommonStyles.blackText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.centerText
                    +CommonStyles.horizontalCenter
                    +CommonStyles.largePadding
                    +CommonStyles.maxWidth(650)
                }
                +"""
                    If you would like to see Aqua in action I invite you to join her official Discord server. It's a 
                    bit quiet for now, but I'm in the process of releasing her as a publicly invitable bot! 
                """.trimIndent()
            }
        }
        styledDiv {
            css {
                +CommonStyles.horizontalCenter
                +CommonStyles.smallPadding
                +CommonStyles.centerText
            }
            styledA {
                css {
                    +CommonStyles.linkStyle
                }
                attrs {
                    href = "https://discord.gg/gMjBpRZuDD"
                    target = "_blank"
                }
                styledImg {
                    attrs {
                        src = "${cdnUrl}/discord.png"
                        alt = "Discord"
                        height = "120px"
                    }
                }
            }
        }
    }
}
