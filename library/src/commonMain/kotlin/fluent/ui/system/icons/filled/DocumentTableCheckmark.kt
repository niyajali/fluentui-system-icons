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

public val FluentIcons.Filled.DocumentTableCheckmark: ImageVector
    get() {
        if (_DocumentTableCheckmark != null) {
            return _DocumentTableCheckmark!!
        }
        _DocumentTableCheckmark = ImageVector.Builder(
            name = "Filled.DocumentTableCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.5f, 17.25f)
                verticalLineTo(16f)
                horizontalLineTo(12.826f)
                curveTo(12.94f, 16.482f, 13f, 16.984f, 13f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(15.388f, 17.5f, 15.5f, 17.388f, 15.5f, 17.25f)
                close()
                moveTo(15.5f, 14.5f)
                horizontalLineTo(12.268f)
                curveTo(12.053f, 14.088f, 11.795f, 13.701f, 11.5f, 13.346f)
                verticalLineTo(13f)
                horizontalLineTo(15.25f)
                curveTo(15.388f, 13f, 15.5f, 13.112f, 15.5f, 13.25f)
                verticalLineTo(14.5f)
                close()
                moveTo(6.5f, 11f)
                curveTo(7.388f, 11f, 8.234f, 11.178f, 9.004f, 11.5f)
                horizontalLineTo(15.25f)
                curveTo(16.216f, 11.5f, 17f, 12.283f, 17f, 13.25f)
                verticalLineTo(17.25f)
                curveTo(17f, 18.216f, 16.216f, 19f, 15.25f, 19f)
                horizontalLineTo(12.826f)
                curveTo(12.555f, 20.147f, 11.98f, 21.177f, 11.19f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(11.498f)
                curveTo(4.77f, 11.177f, 5.614f, 11f, 6.5f, 11f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(9.854f, 15.146f)
                curveTo(9.658f, 14.951f, 9.342f, 14.951f, 9.146f, 15.146f)
                lineTo(5.5f, 18.793f)
                lineTo(3.854f, 17.146f)
                curveTo(3.658f, 16.951f, 3.342f, 16.951f, 3.146f, 17.146f)
                curveTo(2.951f, 17.342f, 2.951f, 17.658f, 3.146f, 17.854f)
                lineTo(5.146f, 19.854f)
                curveTo(5.342f, 20.049f, 5.658f, 20.049f, 5.854f, 19.854f)
                lineTo(9.854f, 15.854f)
                curveTo(10.049f, 15.658f, 10.049f, 15.342f, 9.854f, 15.146f)
                close()
            }
        }.build()

        return _DocumentTableCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentTableCheckmark: ImageVector? = null

@Preview
@Composable
private fun DocumentTableCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentTableCheckmark, contentDescription = null)
    }
}
