import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window
import react.RBuilder
import react.dom.div
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch
import sections.AboutMe
import sections.Aqua
import sections.Bidvine
import sections.Overseer
import sections.ThisSite
import styled.css
import styled.styledDiv

const val cdnPort = 7226
const val cdnHost = "ovd.app"
const val cdnUrl = "https://$cdnHost:$cdnPort/public/delilaheve"

fun main() {
    window.onload = {
        val root = document.getElementById("root")
        render(root) { app() }
    }
}

/**
 * App router
 */
@Suppress("unchecked_cast")
fun RBuilder.app() {
    div {
        /*
         * About me section
         *
         * includes links to Github and Resume
         */
        styledDiv {
            css {
                +CommonStyles.blackBackground
            }
            styledDiv {
                css {
                    +CommonStyles.headerSize
                    +CommonStyles.horizontalCenter
                }
                child(AboutMe::class) {}
            }
        }

        /*
         * Detailing my time at Bidvine
         */
        styledDiv {
            css {
                +CommonStyles.whiteBackground
            }
            styledDiv {
                css {
                    +CommonStyles.horizontalCenter
                }
                child(Bidvine::class) {}
            }
        }

        /*
         * Detailing my passion project Overseer
         */
        styledDiv {
            css {
                +CommonStyles.blackBackground
            }
            styledDiv {
                css {
                    +CommonStyles.horizontalCenter
                }
                child(Overseer::class) {}
            }
        }

        /*
         * Detailing my discord bot Aqua
         */
        styledDiv {
            css {
                +CommonStyles.whiteBackground
            }
            styledDiv {
                css {
                    +CommonStyles.horizontalCenter
                }
                child(Aqua::class) {}
            }
        }

        /*
         * Detailing this website :o
         */
        styledDiv {
            css {
                +CommonStyles.blackBackground
            }
            styledDiv {
                css {
                    +CommonStyles.horizontalCenter
                }
                child(ThisSite::class) {}
            }
        }
    }
}
