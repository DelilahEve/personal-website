package network

import debug
import kotlinx.browser.window
import kotlinx.coroutines.await
import org.w3c.fetch.CORS
import org.w3c.fetch.RequestInit
import org.w3c.fetch.RequestMode
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.js.Promise

object NetworkHelper {

    /**
     * Generic api url call function
     *
     * @param url REST api url to fetch from
     *
     * @return object of type [T] from api
     */
    private suspend inline fun <reified T> fetch(url: String): T {
        val response = window.fetch(url, RequestInit(mode = RequestMode.CORS))
            .await()
            .json()
            .await()
        if (debug) console.log(response)
        return response as T
    }

    /**
     * KotlinJS Coroutine/Promise helper
     */
    fun <T> async(block: suspend () -> T): Promise<T> = Promise { resolve, reject ->
        block.startCoroutine(object : Continuation<T> {
            override val context: CoroutineContext get() = EmptyCoroutineContext
            override fun resumeWith(result: Result<T>) {
                try {
                    resolve(result.getOrThrow())
                } catch (e: Exception) {
                    reject(e)
                }
            }
        })
    }

}