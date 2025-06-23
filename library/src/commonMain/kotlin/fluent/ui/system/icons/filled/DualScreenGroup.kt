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

public val FluentIcons.Filled.DualScreenGroup: ImageVector
    get() {
        if (_DualScreenGroup != null) {
            return _DualScreenGroup!!
        }
        _DualScreenGroup = ImageVector.Builder(
            name = "Filled.DualScreenGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.253f, 4.004f)
                curveTo(21.219f, 4.004f, 22.003f, 4.788f, 22.003f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(22.003f, 19.216f, 21.219f, 20f, 20.253f, 20f)
                horizontalLineTo(13.005f)
                curveTo(12.919f, 20f, 12.833f, 19.993f, 12.75f, 19.981f)
                lineTo(12.75f, 4.023f)
                curveTo(12.833f, 4.011f, 12.919f, 4.004f, 13.005f, 4.004f)
                horizontalLineTo(20.253f)
                close()
                moveTo(11.005f, 4.002f)
                curveTo(11.089f, 4.002f, 11.171f, 4.008f, 11.251f, 4.019f)
                lineTo(11.251f, 19.98f)
                curveTo(11.17f, 19.991f, 11.089f, 19.997f, 11.005f, 19.997f)
                horizontalLineTo(3.758f)
                curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
                horizontalLineTo(11.005f)
                close()
            }
        }.build()

        return _DualScreenGroup!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenGroup: ImageVector? = null

@Preview
@Composable
private fun DualScreenGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenGroup, contentDescription = null)
    }
}
