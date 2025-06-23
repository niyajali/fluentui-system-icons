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

public val FluentIcons.Filled.LightbulbCheckmark: ImageVector
    get() {
        if (_LightbulbCheckmark != null) {
            return _LightbulbCheckmark!!
        }
        _LightbulbCheckmark = ImageVector.Builder(
            name = "Filled.LightbulbCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
                curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
                curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
                close()
                moveTo(20.854f, 4.146f)
                curveTo(20.658f, 3.951f, 20.342f, 3.951f, 20.146f, 4.146f)
                lineTo(16.5f, 7.793f)
                lineTo(14.854f, 6.146f)
                curveTo(14.658f, 5.951f, 14.342f, 5.951f, 14.146f, 6.146f)
                curveTo(13.951f, 6.342f, 13.951f, 6.658f, 14.146f, 6.854f)
                lineTo(16.146f, 8.854f)
                curveTo(16.342f, 9.049f, 16.658f, 9.049f, 16.854f, 8.854f)
                lineTo(20.854f, 4.854f)
                curveTo(21.049f, 4.658f, 21.049f, 4.342f, 20.854f, 4.146f)
                close()
                moveTo(17.5f, 13f)
                curveTo(17.74f, 13f, 17.977f, 12.987f, 18.211f, 12.962f)
                curveTo(17.772f, 13.702f, 17.196f, 14.413f, 16.485f, 15.092f)
                curveTo(16.449f, 15.126f, 16.425f, 15.169f, 16.414f, 15.217f)
                lineTo(15.886f, 17.5f)
                horizontalLineTo(8.114f)
                lineTo(7.588f, 15.217f)
                curveTo(7.577f, 15.169f, 7.552f, 15.126f, 7.517f, 15.092f)
                curveTo(5.686f, 13.345f, 4.75f, 11.388f, 4.75f, 9.251f)
                curveTo(4.75f, 5.247f, 7.996f, 2.001f, 12f, 2.001f)
                curveTo(12.26f, 2.001f, 12.517f, 2.015f, 12.77f, 2.042f)
                curveTo(11.672f, 3.206f, 11f, 4.774f, 11f, 6.5f)
                curveTo(11f, 10.09f, 13.91f, 13f, 17.5f, 13f)
                close()
                moveTo(15.538f, 19f)
                lineTo(15.247f, 20.258f)
                curveTo(15.024f, 21.221f, 14.201f, 21.919f, 13.229f, 21.993f)
                lineTo(13.055f, 22f)
                horizontalLineTo(10.944f)
                curveTo(9.954f, 22f, 9.089f, 21.355f, 8.797f, 20.424f)
                lineTo(8.751f, 20.256f)
                lineTo(8.461f, 19f)
                horizontalLineTo(15.538f)
                close()
            }
        }.build()

        return _LightbulbCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCheckmark: ImageVector? = null

@Preview
@Composable
private fun LightbulbCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LightbulbCheckmark, contentDescription = null)
    }
}
