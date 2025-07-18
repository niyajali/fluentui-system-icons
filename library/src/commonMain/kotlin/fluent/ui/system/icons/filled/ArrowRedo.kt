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

public val FluentIcons.Filled.ArrowRedo: ImageVector
    get() {
        if (_ArrowRedo != null) {
            return _ArrowRedo!!
        }
        _ArrowRedo = ImageVector.Builder(
            name = "Filled.ArrowRedo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 7.586f)
                lineTo(14.359f, 3.951f)
                curveTo(11.758f, 1.35f, 7.54f, 1.35f, 4.939f, 3.951f)
                curveTo(2.338f, 6.552f, 2.338f, 10.769f, 4.939f, 13.371f)
                lineTo(13.278f, 21.708f)
                curveTo(13.668f, 22.098f, 14.301f, 22.098f, 14.692f, 21.708f)
                curveTo(15.082f, 21.317f, 15.082f, 20.684f, 14.692f, 20.293f)
                lineTo(6.353f, 11.957f)
                curveTo(4.533f, 10.136f, 4.533f, 7.185f, 6.353f, 5.365f)
                curveTo(8.117f, 3.602f, 10.941f, 3.547f, 12.771f, 5.2f)
                lineTo(12.945f, 5.366f)
                lineTo(16.585f, 8.999f)
                lineTo(12f, 9f)
                curveTo(11.487f, 9f, 11.065f, 9.386f, 11.007f, 9.883f)
                lineTo(11f, 10f)
                curveTo(11f, 10.512f, 11.386f, 10.935f, 11.884f, 10.993f)
                lineTo(12f, 11f)
                horizontalLineTo(19f)
                curveTo(19.513f, 11f, 19.936f, 10.613f, 19.993f, 10.116f)
                lineTo(20f, 10f)
                verticalLineTo(3.002f)
                curveTo(20f, 2.45f, 19.552f, 2.002f, 19f, 2.002f)
                curveTo(18.487f, 2.002f, 18.065f, 2.388f, 18.007f, 2.886f)
                lineTo(18f, 3.002f)
                verticalLineTo(7.586f)
                lineTo(14.359f, 3.951f)
                lineTo(18f, 7.586f)
                close()
            }
        }.build()

        return _ArrowRedo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRedo: ImageVector? = null

@Preview
@Composable
private fun ArrowRedoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowRedo, contentDescription = null)
    }
}
