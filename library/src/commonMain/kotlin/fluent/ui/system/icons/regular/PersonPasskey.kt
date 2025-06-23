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
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.PersonPasskey: ImageVector
    get() {
        if (_PersonPasskey != null) {
            return _PersonPasskey!!
        }
        _PersonPasskey = ImageVector.Builder(
            name = "Regular.PersonPasskey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 16.663f)
                curveTo(17.447f, 16.401f, 16.974f, 15.998f, 16.627f, 15.5f)
                curveTo(16.322f, 15.062f, 16.114f, 14.552f, 16.035f, 14f)
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
                moveTo(12f, 22.001f)
                curveTo(13.969f, 22.001f, 15.64f, 21.647f, 17f, 20.932f)
                verticalLineTo(19.173f)
                curveTo(15.776f, 20.055f, 14.119f, 20.501f, 12f, 20.501f)
                curveTo(9.262f, 20.501f, 7.296f, 19.755f, 6.043f, 18.288f)
                curveTo(5.695f, 17.88f, 5.504f, 17.362f, 5.504f, 16.826f)
                verticalLineTo(16.249f)
                curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
                horizontalLineTo(15.468f)
                curveTo(15.239f, 15.039f, 15.087f, 14.534f, 15.028f, 14f)
                horizontalLineTo(6.253f)
                curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
                verticalLineTo(16.826f)
                curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.262f)
                curveTo(6.468f, 21.096f, 8.854f, 22.001f, 12f, 22.001f)
                close()
                moveTo(12f, 2.005f)
                curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
                curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
                curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
                curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
                close()
                moveTo(12f, 3.505f)
                curveTo(10.067f, 3.505f, 8.5f, 5.072f, 8.5f, 7.005f)
                curveTo(8.5f, 8.938f, 10.067f, 10.505f, 12f, 10.505f)
                curveTo(13.933f, 10.505f, 15.5f, 8.938f, 15.5f, 7.005f)
                curveTo(15.5f, 5.072f, 13.933f, 3.505f, 12f, 3.505f)
                close()
            }
        }.build()

        return _PersonPasskey!!
    }

@Suppress("ObjectPropertyName")
private var _PersonPasskey: ImageVector? = null

@Preview
@Composable
private fun PersonPasskeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonPasskey, contentDescription = null)
    }
}
