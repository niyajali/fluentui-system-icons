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

public val FluentIcons.Regular.Battery2: ImageVector
    get() {
        if (_Battery2 != null) {
            return _Battery2!!
        }
        _Battery2 = ImageVector.Builder(
            name = "Regular.Battery2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17f, 6f)
                curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                curveTo(21.182f, 10f, 21.353f, 10.049f, 21.5f, 10.134f)
                curveTo(21.799f, 10.307f, 22f, 10.63f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 13.37f, 21.799f, 13.693f, 21.5f, 13.866f)
                curveTo(21.353f, 13.951f, 21.182f, 14f, 21f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                curveTo(20f, 16.657f, 18.657f, 18f, 17f, 18f)
                horizontalLineTo(5f)
                curveTo(3.343f, 18f, 2f, 16.657f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 7.343f, 3.343f, 6f, 5f, 6f)
                horizontalLineTo(17f)
                close()
                moveTo(16.998f, 7.5f)
                horizontalLineTo(5f)
                curveTo(4.22f, 7.5f, 3.579f, 8.095f, 3.507f, 8.856f)
                lineTo(3.5f, 9f)
                verticalLineTo(15f)
                curveTo(3.5f, 15.78f, 4.095f, 16.42f, 4.855f, 16.493f)
                lineTo(5f, 16.5f)
                horizontalLineTo(16.998f)
                curveTo(17.778f, 16.5f, 18.419f, 15.905f, 18.491f, 15.144f)
                lineTo(18.498f, 15f)
                verticalLineTo(9f)
                curveTo(18.498f, 8.22f, 17.903f, 7.58f, 17.143f, 7.507f)
                lineTo(16.998f, 7.5f)
                close()
                moveTo(6f, 9.003f)
                lineTo(8f, 9f)
                curveTo(8.513f, 9f, 8.935f, 9.386f, 8.993f, 9.883f)
                lineTo(9f, 10f)
                verticalLineTo(14f)
                curveTo(9f, 14.513f, 8.614f, 14.936f, 8.117f, 14.993f)
                lineTo(8f, 15f)
                lineTo(6f, 15.003f)
                curveTo(5.487f, 15.003f, 5.064f, 14.617f, 5.007f, 14.12f)
                lineTo(5f, 14.003f)
                verticalLineTo(10.003f)
                curveTo(5f, 9.49f, 5.386f, 9.068f, 5.883f, 9.01f)
                lineTo(6f, 9.003f)
                lineTo(8f, 9f)
                lineTo(6f, 9.003f)
                close()
            }
        }.build()

        return _Battery2!!
    }

@Suppress("ObjectPropertyName")
private var _Battery2: ImageVector? = null

@Preview
@Composable
private fun Battery2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Battery2, contentDescription = null)
    }
}
