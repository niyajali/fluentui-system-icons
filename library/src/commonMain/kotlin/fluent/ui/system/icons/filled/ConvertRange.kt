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

public val FluentIcons.Filled.ConvertRange: ImageVector
    get() {
        if (_ConvertRange != null) {
            return _ConvertRange!!
        }
        _ConvertRange = ImageVector.Builder(
            name = "Filled.ConvertRange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
                verticalLineTo(7.75f)
                curveTo(4f, 8.993f, 5.007f, 10f, 6.25f, 10f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 10f, 18f, 8.993f, 18f, 7.75f)
                verticalLineTo(5.25f)
                curveTo(18f, 4.007f, 16.993f, 3f, 15.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.353f, 16.445f)
                lineTo(17.28f, 16.529f)
                curveTo(17.014f, 16.796f, 16.597f, 16.82f, 16.304f, 16.602f)
                lineTo(16.22f, 16.529f)
                lineTo(14.22f, 14.529f)
                curveTo(13.953f, 14.263f, 13.929f, 13.847f, 14.147f, 13.553f)
                lineTo(14.22f, 13.469f)
                lineTo(16.22f, 11.469f)
                curveTo(16.513f, 11.176f, 16.987f, 11.176f, 17.28f, 11.469f)
                curveTo(17.547f, 11.735f, 17.571f, 12.152f, 17.353f, 12.445f)
                lineTo(17.28f, 12.529f)
                lineTo(16.561f, 13.25f)
                lineTo(18.061f, 13.25f)
                curveTo(18.708f, 13.25f, 19.24f, 12.758f, 19.304f, 12.128f)
                lineTo(19.311f, 12f)
                verticalLineTo(9.75f)
                curveTo(19.311f, 9.336f, 19.646f, 9f, 20.061f, 9f)
                curveTo(20.44f, 9f, 20.754f, 9.282f, 20.804f, 9.648f)
                lineTo(20.811f, 9.75f)
                verticalLineTo(12f)
                curveTo(20.811f, 13.462f, 19.669f, 14.658f, 18.228f, 14.745f)
                lineTo(18.061f, 14.75f)
                lineTo(16.562f, 14.75f)
                lineTo(17.28f, 15.469f)
                curveTo(17.547f, 15.735f, 17.571f, 16.152f, 17.353f, 16.445f)
                close()
                moveTo(14.274f, 12f)
                lineTo(13.487f, 12.788f)
                lineTo(13.366f, 12.927f)
                lineTo(13.344f, 12.957f)
                curveTo(12.835f, 13.643f, 12.891f, 14.615f, 13.512f, 15.236f)
                lineTo(15.538f, 17.262f)
                lineTo(15.678f, 17.383f)
                lineTo(15.708f, 17.405f)
                curveTo(16.394f, 17.914f, 17.365f, 17.858f, 17.987f, 17.236f)
                lineTo(18f, 17.224f)
                verticalLineTo(19.25f)
                curveTo(18f, 20.493f, 16.993f, 21.5f, 15.75f, 21.5f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 21.5f, 4f, 20.493f, 4f, 19.25f)
                verticalLineTo(14.25f)
                curveTo(4f, 13.007f, 5.007f, 12f, 6.25f, 12f)
                horizontalLineTo(14.274f)
                close()
                moveTo(8f, 16.75f)
                curveTo(8f, 17.164f, 8.313f, 17.5f, 8.7f, 17.5f)
                horizontalLineTo(13.3f)
                curveTo(13.687f, 17.5f, 14f, 17.164f, 14f, 16.75f)
                curveTo(14f, 16.336f, 13.687f, 16f, 13.3f, 16f)
                horizontalLineTo(8.7f)
                curveTo(8.313f, 16f, 8f, 16.336f, 8f, 16.75f)
                close()
            }
        }.build()

        return _ConvertRange!!
    }

@Suppress("ObjectPropertyName")
private var _ConvertRange: ImageVector? = null

@Preview
@Composable
private fun ConvertRangePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ConvertRange, contentDescription = null)
    }
}
