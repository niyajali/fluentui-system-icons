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

public val FluentIcons.Regular.IosArrowRtl: ImageVector
    get() {
        if (_IosArrowRtl != null) {
            return _IosArrowRtl!!
        }
        _IosArrowRtl = ImageVector.Builder(
            name = "Regular.IosArrowRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.704f, 12f)
                lineTo(11.212f, 3.273f)
                curveTo(10.924f, 2.976f, 10.93f, 2.501f, 11.227f, 2.212f)
                curveTo(11.524f, 1.924f, 11.999f, 1.93f, 12.288f, 2.227f)
                lineTo(21.288f, 11.477f)
                curveTo(21.571f, 11.768f, 21.571f, 12.232f, 21.288f, 12.523f)
                lineTo(12.288f, 21.773f)
                curveTo(11.999f, 22.07f, 11.524f, 22.076f, 11.227f, 21.788f)
                curveTo(10.93f, 21.499f, 10.924f, 21.024f, 11.212f, 20.727f)
                lineTo(19.704f, 12f)
                close()
            }
        }.build()

        return _IosArrowRtl!!
    }

@Suppress("ObjectPropertyName")
private var _IosArrowRtl: ImageVector? = null

@Preview
@Composable
private fun IosArrowRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.IosArrowRtl, contentDescription = null)
    }
}
