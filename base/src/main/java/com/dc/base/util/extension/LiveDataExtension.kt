/*

Copy right here
 */
package com.dc.base.util.extension

import androidx.lifecycle.MutableLiveData


fun <T> MutableLiveData<T>.emitValue(value: T) {
    this.value = value
}

fun <T> MutableLiveData<T>.emitValuePost(value: T) {
    this.postValue(value)
}
