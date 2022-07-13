/*

Copy right here
 */
package com.dc.base.util.extension

import android.view.View


fun View.setVisible(visible: Boolean) {
    visibility = if (visible) View.VISIBLE else View.GONE
}
