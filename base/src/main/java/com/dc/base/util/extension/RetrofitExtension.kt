/*

Copy right here
 */
package com.dc.base.util.extension


import com.dc.base.util.helper.RetrofitUtils
import okhttp3.RequestBody
import java.io.File

fun String.toRequestBody(): RequestBody {
    return RetrofitUtils.getStringBody(this)
}

fun File?.toImageBody(): RequestBody {
    return RetrofitUtils.getImageBody(this)
}
