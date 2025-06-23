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

public val FluentIcons.Filled.TextEffects: ImageVector
    get() {
        if (_TextEffects != null) {
            return _TextEffects!!
        }
        _TextEffects = ImageVector.Builder(
            name = "Filled.TextEffects",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.758f, 3.818f)
                curveTo(14.285f, 2.715f, 13.201f, 2f, 12.001f, 2f)
                curveTo(10.801f, 2f, 9.716f, 2.715f, 9.243f, 3.818f)
                lineTo(4.984f, 13.757f)
                curveTo(4.965f, 13.798f, 4.947f, 13.84f, 4.93f, 13.882f)
                lineTo(3.243f, 17.818f)
                curveTo(2.591f, 19.341f, 3.296f, 21.105f, 4.819f, 21.757f)
                curveTo(6.342f, 22.41f, 8.106f, 21.705f, 8.758f, 20.182f)
                lineTo(9.693f, 18f)
                horizontalLineTo(14.308f)
                lineTo(15.243f, 20.182f)
                curveTo(15.896f, 21.705f, 17.66f, 22.41f, 19.183f, 21.757f)
                curveTo(20.705f, 21.105f, 21.411f, 19.341f, 20.758f, 17.818f)
                lineTo(19.071f, 13.882f)
                curveTo(19.054f, 13.84f, 19.037f, 13.798f, 19.018f, 13.757f)
                lineTo(14.758f, 3.818f)
                close()
                moveTo(12.92f, 4.606f)
                lineTo(17.197f, 14.586f)
                curveTo(17.203f, 14.599f, 17.209f, 14.613f, 17.215f, 14.627f)
                lineTo(18.92f, 18.606f)
                curveTo(19.138f, 19.114f, 18.902f, 19.702f, 18.395f, 19.919f)
                curveTo(17.887f, 20.137f, 17.299f, 19.902f, 17.082f, 19.394f)
                lineTo(15.627f, 16f)
                horizontalLineTo(8.374f)
                lineTo(6.92f, 19.394f)
                curveTo(6.702f, 19.902f, 6.114f, 20.137f, 5.607f, 19.919f)
                curveTo(5.099f, 19.702f, 4.864f, 19.114f, 5.082f, 18.606f)
                lineTo(6.787f, 14.627f)
                curveTo(6.792f, 14.613f, 6.798f, 14.599f, 6.805f, 14.586f)
                lineTo(11.082f, 4.606f)
                curveTo(11.239f, 4.238f, 11.601f, 4f, 12.001f, 4f)
                curveTo(12.401f, 4f, 12.762f, 4.238f, 12.92f, 4.606f)
                close()
                moveTo(14.77f, 14f)
                horizontalLineTo(9.232f)
                lineTo(12.001f, 7.539f)
                lineTo(14.77f, 14f)
                close()
            }
        }.build()

        return _TextEffects!!
    }

@Suppress("ObjectPropertyName")
private var _TextEffects: ImageVector? = null

@Preview
@Composable
private fun TextEffectsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextEffects, contentDescription = null)
    }
}
