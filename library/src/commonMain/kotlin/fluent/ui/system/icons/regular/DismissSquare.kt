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

public val FluentIcons.Regular.DismissSquare: ImageVector
    get() {
        if (_DismissSquare != null) {
            return _DismissSquare!!
        }
        _DismissSquare = ImageVector.Builder(
            name = "Regular.DismissSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.22f, 8.22f)
                curveTo(8.513f, 7.927f, 8.987f, 7.927f, 9.28f, 8.22f)
                lineTo(12f, 10.939f)
                lineTo(14.72f, 8.22f)
                curveTo(15.013f, 7.927f, 15.487f, 7.927f, 15.78f, 8.22f)
                curveTo(16.073f, 8.513f, 16.073f, 8.987f, 15.78f, 9.28f)
                lineTo(13.061f, 12f)
                lineTo(15.78f, 14.72f)
                curveTo(16.073f, 15.013f, 16.073f, 15.487f, 15.78f, 15.78f)
                curveTo(15.487f, 16.073f, 15.013f, 16.073f, 14.72f, 15.78f)
                lineTo(12f, 13.061f)
                lineTo(9.28f, 15.78f)
                curveTo(8.987f, 16.073f, 8.513f, 16.073f, 8.22f, 15.78f)
                curveTo(7.927f, 15.487f, 7.927f, 15.013f, 8.22f, 14.72f)
                lineTo(10.939f, 12f)
                lineTo(8.22f, 9.28f)
                curveTo(7.927f, 8.987f, 7.927f, 8.513f, 8.22f, 8.22f)
                close()
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _DismissSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DismissSquare: ImageVector? = null

@Preview
@Composable
private fun DismissSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DismissSquare, contentDescription = null)
    }
}
