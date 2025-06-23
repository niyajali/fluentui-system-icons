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

public val FluentIcons.Filled.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) {
            return _Lightbulb!!
        }
        _Lightbulb = ImageVector.Builder(
            name = "Filled.Lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.538f, 18.999f)
                lineTo(15.247f, 20.257f)
                curveTo(15.024f, 21.221f, 14.201f, 21.918f, 13.229f, 21.993f)
                lineTo(13.055f, 22f)
                horizontalLineTo(10.944f)
                curveTo(9.954f, 22f, 9.089f, 21.355f, 8.797f, 20.423f)
                lineTo(8.751f, 20.256f)
                lineTo(8.461f, 18.999f)
                horizontalLineTo(15.538f)
                close()
                moveTo(12f, 2.001f)
                curveTo(16.004f, 2.001f, 19.25f, 5.247f, 19.25f, 9.251f)
                curveTo(19.25f, 11.387f, 18.314f, 13.344f, 16.485f, 15.092f)
                curveTo(16.449f, 15.125f, 16.425f, 15.169f, 16.414f, 15.216f)
                lineTo(15.886f, 17.499f)
                horizontalLineTo(8.114f)
                lineTo(7.588f, 15.216f)
                curveTo(7.577f, 15.169f, 7.552f, 15.125f, 7.517f, 15.092f)
                curveTo(5.686f, 13.344f, 4.75f, 11.387f, 4.75f, 9.251f)
                curveTo(4.75f, 5.247f, 7.996f, 2.001f, 12f, 2.001f)
                close()
            }
        }.build()

        return _Lightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb: ImageVector? = null

@Preview
@Composable
private fun LightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Lightbulb, contentDescription = null)
    }
}
