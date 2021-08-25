package sections

import CommonStyles
import cdnUrl
import kotlinx.html.onCanPlay
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledH2
import styled.styledImg
import styled.styledLi
import styled.styledP
import styled.styledUl
import styled.styledVideo

@JsExport
class Bidvine : RComponent<RProps, RState>() {

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
                    src = "${cdnUrl}/bidvine.svg"
                    alt = "Bidvine"
                    width = "200px"
                    height = "200px"
                }
            }
            styledDiv {
                css {
                    +CommonStyles.smallPadding
                    +CommonStyles.largeIndent
                    +CommonStyles.floatLeft
                    +CommonStyles.inline
                }
                styledP {
                    css {
                        +CommonStyles.blackText
                        +CommonStyles.fontSize(16)
                        +CommonStyles.maxWidth(650)
                    }
                    +"""
                        During my time at Bidvine I had the opportunity to grow immensely as a developer, I got 
                        to experience, implement, and even invent with a wide range of modern technologies and 
                        techniques, helping transform their Android app from "meh" to "wow!".
                    """.trimIndent()
                }
                styledP {
                    css {
                        +CommonStyles.blackText
                        +CommonStyles.fontSize(16)
                        +CommonStyles.maxWidth(650)
                    }
                    +"""
                        Their app was originally written in Java with an MVP/clean architecture structure, and I 
                        was involved in the process of converting the entire app from Java to Kotlin, migrating 
                        from MVP to MVVM, and removing the obscene number of context leaks.
                    """.trimIndent()
                }
            }
        }
        subSection(
            "Request Details / Bidding form",
            "https://i.imgur.com/UiriRev.mp4",
            """
                Bidvine's bid form was originally composed of 2 views that separated the request details from the 
                bidding form itself. This was slow, clunky, and saw professionals jumping back and forth between 
                views, leaking context all over the place.
            """.trimIndent(),
            """
                During my time at Bidvine, rebuilding the bidding form was a top priority. During the process I 
                converted the form from Java to Kotlin and from MVP to MVVM. These improvements resulted in a 
                smoother, faster, more intuitive bidding experience, drastically reducing the time it took a 
                professional to send their bid. And nothing leaked.
            """.trimIndent()
        )
        subSection(
            "Company Profile",
            "https://i.imgur.com/VJ4MRgH.mp4",
            """
                Bidvine allowed professionals to build a very comprehensive professional profile. One of the larger 
                efforts I participated in was the overhaul of this view. The original appearance was plain and 
                applied Material Design inconsistently... and leaked memory terribly.
            """.trimIndent(),
            """
                Rebuilding company profiles required converting from Java to Kotlin and from MVP to MVVM,  
                removing memory leaks, and implementing the newer, more consistent (and appealing) appearance.
            """.trimIndent(),
            isAlt = true
        )
        subSection(
            "Services management",
            "https://i.imgur.com/GEDdxD7.mp4",
            """
                All kinds of services could be offered through Bidvine's platform, hundreds in fact. Rebuilding the 
                Services view was a relatively minor, but not insignificant, task. Doing so involved converting Java 
                to Kotlin, MVP to MVVM, and clearing out context leaks as usual.
            """.trimIndent(),
            """
                By clearing the tech debt in this Activity I was able to make quicker changes to the company's code,
                changing out the way the call-to-action buttons are added, and easily adding filtering and sorting.
            """.trimIndent()
        )
        styledDiv {
            css {
                +CommonStyles.smallPadding
                +CommonStyles.horizontalCenter
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
                    Sadly, not all of the improvements I was able to make to the app can be shown through neat videos, 
                    however, I can list a few here: 
                """.trimIndent()
            }
            styledUl {
                css {
                    +CommonStyles.horizontalCenter
                    +CommonStyles.maxWidth(500)
                }
                listOf(
                    """
                        Fixed a very long standing bug (8+ months without a fix) where opening the custom web view 
                        would crash the app. This turned out to be due to an invalid Context, and only happens under 
                        extremely niche circumstances.
                    """.trimIndent(),
                    """
                        Removed every memory leak that was occurring. All of them.
                    """.trimIndent(),
                    """
                        Contributed to the majority of the Java to Kotlin conversion bringing the app to 98% Kotlin, 
                        ~1% other, and less than 1% Java.
                    """.trimIndent(),
                    """
                        Improved photo selection app-wide; There were multiple points through the app where a 
                        professional might be prompted to add images and video, and the path to do so was not 
                        intuitive, nor was it simple. I simplified this flow by leveraging Android's Intent system 
                        to reduce the steps for users to follow, saving many many seconds for many people.
                    """.trimIndent()
                ).forEach { listItem(it) }
            }
        }
    }

    private fun RBuilder.subSection(
        title: String,
        video: String,
        text1: String,
        text2: String,
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
                    +CommonStyles.blackText
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
            styledVideo {
                css {
                    +floatSide
                    +CommonStyles.inline
                }
                attrs {
                    set("muted", "true")
                    src = video
                    autoBuffer = true
                    autoPlay = true
                    loop = true
                    width = "235px"
                    //onCanPlay = js("this.play()")
                }

            }
            styledP {
                css {
                    +floatSide
                    +CommonStyles.inline
                    +CommonStyles.smallPadding
                    +CommonStyles.largeIndent
                    +CommonStyles.blackText
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
                    +CommonStyles.largeIndent
                    +CommonStyles.blackText
                    +CommonStyles.fontSize(16)
                    +CommonStyles.maxWidth(500)
                }
                +text2
            }
        }
    }

    private fun RBuilder.listItem(text: String) = styledLi {
        css {
            +CommonStyles.blackText
            +CommonStyles.tinyPadding
            +CommonStyles.fontSize(16)
        }
        +text
    }
}
