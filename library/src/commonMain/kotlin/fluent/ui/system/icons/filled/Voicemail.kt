/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Voicemail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Voicemail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.749f, 4f)
            curveTo(20.992f, 4f, 21.999f, 5.007f, 21.999f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(21.999f, 18.997f, 20.992f, 20.005f, 19.749f, 20.005f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.749f)
            close()
            moveTo(15.748f, 9f)
            horizontalLineTo(8f)
            lineTo(7.824f, 9.005f)
            curveTo(6.249f, 9.096f, 5f, 10.402f, 5f, 12f)
            curveTo(5f, 13.657f, 6.343f, 15f, 8f, 15f)
            curveTo(9.657f, 15f, 11f, 13.657f, 11f, 12f)
            curveTo(11f, 11.532f, 10.893f, 11.089f, 10.701f, 10.694f)
            lineTo(10.599f, 10.5f)
            horizontalLineTo(13.401f)
            curveTo(13.146f, 10.941f, 13f, 11.454f, 13f, 12f)
            curveTo(13f, 13.657f, 14.343f, 15f, 16f, 15f)
            curveTo(17.657f, 15f, 19f, 13.657f, 19f, 12f)
            curveTo(19f, 10.402f, 17.751f, 9.096f, 16.176f, 9.005f)
            lineTo(16f, 9f)
            lineTo(15.83f, 9.004f)
            lineTo(15.748f, 9f)
            close()
            moveTo(8f, 10.5f)
            curveTo(8.828f, 10.5f, 9.5f, 11.172f, 9.5f, 12f)
            curveTo(9.5f, 12.828f, 8.828f, 13.5f, 8f, 13.5f)
            curveTo(7.172f, 13.5f, 6.5f, 12.828f, 6.5f, 12f)
            curveTo(6.5f, 11.172f, 7.172f, 10.5f, 8f, 10.5f)
            close()
            moveTo(16f, 10.5f)
            curveTo(16.828f, 10.5f, 17.5f, 11.172f, 17.5f, 12f)
            curveTo(17.5f, 12.828f, 16.828f, 13.5f, 16f, 13.5f)
            curveTo(15.172f, 13.5f, 14.5f, 12.828f, 14.5f, 12f)
            curveTo(14.5f, 11.172f, 15.172f, 10.5f, 16f, 10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VoicemailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Voicemail, contentDescription = null)
    }
}
