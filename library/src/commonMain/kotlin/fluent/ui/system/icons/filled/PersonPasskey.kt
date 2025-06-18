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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.PersonPasskey: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonPasskey",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 16.663f)
            curveTo(16.961f, 16.17f, 16.204f, 15.18f, 16.035f, 14f)
            curveTo(16.012f, 13.837f, 16f, 13.67f, 16f, 13.5f)
            curveTo(16f, 11.567f, 17.567f, 10f, 19.5f, 10f)
            curveTo(21.433f, 10f, 23f, 11.567f, 23f, 13.5f)
            curveTo(23f, 15.085f, 21.946f, 16.425f, 20.5f, 16.855f)
            verticalLineTo(17f)
            lineTo(21.646f, 18.146f)
            curveTo(21.842f, 18.342f, 21.842f, 18.658f, 21.646f, 18.854f)
            lineTo(20.5f, 20f)
            lineTo(21.661f, 21.161f)
            curveTo(21.851f, 21.351f, 21.857f, 21.656f, 21.676f, 21.853f)
            lineTo(19.853f, 23.837f)
            curveTo(19.66f, 24.047f, 19.332f, 24.053f, 19.131f, 23.852f)
            lineTo(18.146f, 22.868f)
            curveTo(18.053f, 22.774f, 18f, 22.647f, 18f, 22.514f)
            verticalLineTo(16.663f)
            close()
            moveTo(20.5f, 13f)
            curveTo(20.5f, 12.448f, 20.052f, 12f, 19.5f, 12f)
            curveTo(18.948f, 12f, 18.5f, 12.448f, 18.5f, 13f)
            curveTo(18.5f, 13.552f, 18.948f, 14f, 19.5f, 14f)
            curveTo(20.052f, 14f, 20.5f, 13.552f, 20.5f, 13f)
            close()
            moveTo(17f, 17.242f)
            verticalLineTo(20.932f)
            curveTo(15.641f, 21.646f, 13.969f, 22.001f, 12f, 22.001f)
            curveTo(8.579f, 22.001f, 6.056f, 20.929f, 4.514f, 18.765f)
            curveTo(4.182f, 18.299f, 4.004f, 17.741f, 4.004f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
            horizontalLineTo(15.028f)
            curveTo(15.177f, 15.352f, 15.926f, 16.523f, 17f, 17.242f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPasskeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonPasskey, contentDescription = null)
    }
}
