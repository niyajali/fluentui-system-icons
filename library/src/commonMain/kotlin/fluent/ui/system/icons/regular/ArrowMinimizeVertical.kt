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

public val FluentIcons.Regular.ArrowMinimizeVertical: ImageVector
    get() {
        if (_ArrowMinimizeVertical != null) {
            return _ArrowMinimizeVertical!!
        }
        _ArrowMinimizeVertical = ImageVector.Builder(
            name = "Regular.ArrowMinimizeVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.75f, 2f)
                curveTo(12.164f, 2f, 12.5f, 2.336f, 12.5f, 2.75f)
                verticalLineTo(6.939f)
                lineTo(13.72f, 5.72f)
                curveTo(14.013f, 5.427f, 14.487f, 5.427f, 14.78f, 5.72f)
                curveTo(15.073f, 6.013f, 15.073f, 6.487f, 14.78f, 6.78f)
                lineTo(12.28f, 9.28f)
                curveTo(11.987f, 9.573f, 11.513f, 9.573f, 11.22f, 9.28f)
                lineTo(8.72f, 6.78f)
                curveTo(8.427f, 6.487f, 8.427f, 6.013f, 8.72f, 5.72f)
                curveTo(9.013f, 5.427f, 9.487f, 5.427f, 9.78f, 5.72f)
                lineTo(11f, 6.939f)
                verticalLineTo(2.75f)
                curveTo(11f, 2.336f, 11.336f, 2f, 11.75f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 11.75f)
                curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
                horizontalLineTo(19.25f)
                curveTo(19.664f, 11f, 20f, 11.336f, 20f, 11.75f)
                curveTo(20f, 12.164f, 19.664f, 12.5f, 19.25f, 12.5f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 12.5f, 4f, 12.164f, 4f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.72f, 17.78f)
                curveTo(14.013f, 18.073f, 14.487f, 18.073f, 14.78f, 17.78f)
                curveTo(15.073f, 17.487f, 15.073f, 17.013f, 14.78f, 16.72f)
                lineTo(12.28f, 14.22f)
                curveTo(11.987f, 13.927f, 11.513f, 13.927f, 11.22f, 14.22f)
                lineTo(8.72f, 16.72f)
                curveTo(8.427f, 17.013f, 8.427f, 17.487f, 8.72f, 17.78f)
                curveTo(9.013f, 18.073f, 9.487f, 18.073f, 9.78f, 17.78f)
                lineTo(11f, 16.561f)
                lineTo(11f, 21.25f)
                curveTo(11f, 21.664f, 11.336f, 22f, 11.75f, 22f)
                curveTo(12.164f, 22f, 12.5f, 21.664f, 12.5f, 21.25f)
                verticalLineTo(16.561f)
                lineTo(13.72f, 17.78f)
                close()
            }
        }.build()

        return _ArrowMinimizeVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMinimizeVertical: ImageVector? = null

@Preview
@Composable
private fun ArrowMinimizeVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowMinimizeVertical, contentDescription = null)
    }
}
