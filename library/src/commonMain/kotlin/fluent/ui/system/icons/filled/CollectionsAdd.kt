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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.CollectionsAdd: ImageVector
    get() {
        if (_CollectionsAdd != null) {
            return _CollectionsAdd!!
        }
        _CollectionsAdd = ImageVector.Builder(
            name = "Filled.CollectionsAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.777f, 2.451f)
                curveTo(15.599f, 2.895f, 16.254f, 3.643f, 16.561f, 4.59f)
                lineTo(17.076f, 6.5f)
                horizontalLineTo(11.25f)
                lineTo(11.052f, 6.505f)
                lineTo(11.038f, 6.506f)
                curveTo(9.065f, 6.616f, 7.5f, 8.25f, 7.5f, 10.25f)
                lineTo(7.5f, 17.75f)
                lineTo(7.505f, 17.948f)
                lineTo(7.506f, 17.962f)
                curveTo(7.52f, 18.211f, 7.558f, 18.453f, 7.618f, 18.687f)
                curveTo(7.013f, 18.675f, 6.429f, 18.516f, 5.911f, 18.236f)
                curveTo(5.089f, 17.792f, 4.434f, 17.044f, 4.126f, 16.097f)
                lineTo(2.129f, 8.663f)
                curveTo(1.871f, 7.7f, 2.012f, 6.724f, 2.451f, 5.911f)
                curveTo(2.895f, 5.089f, 3.643f, 4.434f, 4.59f, 4.126f)
                lineTo(12.025f, 2.129f)
                curveTo(12.988f, 1.871f, 13.964f, 2.012f, 14.777f, 2.451f)
                close()
                moveTo(11.257f, 7.5f)
                lineTo(11.087f, 7.505f)
                curveTo(9.644f, 7.589f, 8.5f, 8.786f, 8.5f, 10.25f)
                verticalLineTo(17.743f)
                lineTo(8.505f, 17.913f)
                curveTo(8.589f, 19.356f, 9.786f, 20.5f, 11.25f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(11.264f, 19.603f, 11f, 18.582f, 11f, 17.5f)
                curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
                curveTo(19.008f, 11f, 20.397f, 11.514f, 21.5f, 12.376f)
                verticalLineTo(10.257f)
                lineTo(21.495f, 10.087f)
                curveTo(21.411f, 8.644f, 20.214f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(11.257f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17.41f, 14.007f)
                lineTo(17.5f, 13.999f)
                lineTo(17.59f, 14.007f)
                curveTo(17.794f, 14.044f, 17.955f, 14.205f, 17.992f, 14.409f)
                lineTo(18f, 14.499f)
                lineTo(18f, 16.999f)
                lineTo(20.505f, 17f)
                lineTo(20.594f, 17.008f)
                curveTo(20.799f, 17.045f, 20.959f, 17.206f, 20.997f, 17.41f)
                lineTo(21.005f, 17.5f)
                lineTo(20.997f, 17.59f)
                curveTo(20.959f, 17.794f, 20.799f, 17.955f, 20.594f, 17.992f)
                lineTo(20.505f, 18f)
                lineTo(18.001f, 17.999f)
                lineTo(18.001f, 20.503f)
                lineTo(17.993f, 20.593f)
                curveTo(17.956f, 20.798f, 17.795f, 20.958f, 17.591f, 20.995f)
                lineTo(17.501f, 21.003f)
                lineTo(17.411f, 20.995f)
                curveTo(17.207f, 20.958f, 17.046f, 20.798f, 17.009f, 20.593f)
                lineTo(17.001f, 20.503f)
                lineTo(17.001f, 17.999f)
                lineTo(14.498f, 18f)
                lineTo(14.408f, 17.992f)
                curveTo(14.204f, 17.955f, 14.043f, 17.794f, 14.006f, 17.59f)
                lineTo(13.998f, 17.5f)
                lineTo(14.006f, 17.41f)
                curveTo(14.043f, 17.206f, 14.204f, 17.045f, 14.408f, 17.008f)
                lineTo(14.498f, 17f)
                lineTo(17f, 16.999f)
                lineTo(17f, 14.499f)
                lineTo(17.008f, 14.409f)
                curveTo(17.045f, 14.205f, 17.206f, 14.044f, 17.41f, 14.007f)
                close()
            }
        }.build()

        return _CollectionsAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CollectionsAdd: ImageVector? = null

@Preview
@Composable
private fun CollectionsAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CollectionsAdd, contentDescription = null)
    }
}
