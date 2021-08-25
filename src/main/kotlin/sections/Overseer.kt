package sections

import CommonStyles
import cdnUrl
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import styled.css
import styled.styledA
import styled.styledDiv
import styled.styledH2
import styled.styledImg
import styled.styledP
import styled.styledVideo

@JsExport
class Overseer : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledImg {
                css {
                    +CommonStyles.floatLeft
                }
                attrs {
                    attrs {
                        src = "${cdnUrl}/ovd.png"
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
                styledP {
                    css {
                        +CommonStyles.whiteText
                        +CommonStyles.fontSize(16)
                        +CommonStyles.maxWidth(650)
                    }
                    +"OvD (Overseer's Domain) is my passion project. I host a collection of "
                    styledA {
                        css {
                            +CommonStyles.linkStyle
                            +CommonStyles.purpleText
                        }
                        attrs {
                            href = "https://store.steampowered.com/app/346110/ARK_Survival_Evolved/"
                            target = "_blank"
                        }
                        +"Ark: Survival Evolved"
                    }
                    // Leading space here is due to the link above
                    +"""
                          servers that are semi-private (players must whitelist themselves in my discord server). 
                         The Overseer api and app combination allow me to easily maintain and manage my servers.
                    """.trimIndent()
                }
            }
        }
        subSection(
            "Overseer Api",
            """
                The Overseer Api handles any and all day-to-day operation of my servers which includes changing 
                configs on weekends, keeping track of 8 servers across 2 machines, notifying admins of player  
                activity, automatically updating the servers in a controlled manner so as to not overload the system, 
                and daily reboots to keep game bugs at bay!
            """.trimIndent(),
            """
                The api was built in Kotlin using Ktor, JWT based authentication, Serialization, and heavy use of 
                Kotlin's coroutines. The code for these projects is not publicly available, however, if you're 
                interested in hiring me I'm willing to show.
            """.trimIndent(),
            """
                The app was built in Kotlin using MVVM, Kotlin Coroutines, Retrofit2, and Material Design. It serves 
                as the primary method for managing my Ark servers. 
            """.trimIndent()
        )
    }

    private fun RBuilder.subSection(
        title: String,
        text1: String,
        text2: String,
        text3: String,
        isAlt: Boolean = false
    ) = div {
        val floatSide = if (!isAlt) CommonStyles.floatLeft else CommonStyles.floatRight
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledH2 {
                css {
                    +CommonStyles.whiteText
                    +CommonStyles.fontSize(24)
                    +floatSide
                }
                +title
            }
        }
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.floatWrap
            }
            styledDiv {
                css {
                    +CommonStyles.smallPadding
                    +floatSide
                    +CommonStyles.inline
                }
                styledVideo {
                    attrs {
                        set("muted", "true")
                        src = "https://i.imgur.com/gm7Tp0k.mp4"
                        autoPlay = true
                        loop = true
                        width = "235px"
                    }

                }
            }
            styledP {
                css {
                    +floatSide
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.whiteText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +text1
            }
            styledP {
                css {
                    +floatSide
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.whiteText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +text2
            }
            styledP {
                css {
                    +floatSide
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.whiteText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +text3
            }
        }
    }

}
