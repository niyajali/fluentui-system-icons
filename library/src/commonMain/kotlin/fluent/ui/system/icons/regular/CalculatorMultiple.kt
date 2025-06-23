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

public val FluentIcons.Regular.CalculatorMultiple: ImageVector
    get() {
        if (_CalculatorMultiple != null) {
            return _CalculatorMultiple!!
        }
        _CalculatorMultiple = ImageVector.Builder(
            name = "Regular.CalculatorMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 5f)
                curveTo(6.784f, 5f, 6f, 5.784f, 6f, 6.75f)
                verticalLineTo(7.75f)
                curveTo(6f, 8.717f, 6.784f, 9.5f, 7.75f, 9.5f)
                horizontalLineTo(13.25f)
                curveTo(14.217f, 9.5f, 15f, 8.717f, 15f, 7.75f)
                verticalLineTo(6.75f)
                curveTo(15f, 5.784f, 14.217f, 5f, 13.25f, 5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.5f, 6.75f)
                curveTo(7.5f, 6.612f, 7.612f, 6.5f, 7.75f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(13.388f, 6.5f, 13.5f, 6.612f, 13.5f, 6.75f)
                verticalLineTo(7.75f)
                curveTo(13.5f, 7.888f, 13.388f, 8f, 13.25f, 8f)
                horizontalLineTo(7.75f)
                curveTo(7.612f, 8f, 7.5f, 7.888f, 7.5f, 7.75f)
                verticalLineTo(6.75f)
                close()
                moveTo(10.5f, 10.75f)
                curveTo(9.81f, 10.75f, 9.25f, 11.31f, 9.25f, 12f)
                curveTo(9.25f, 12.69f, 9.81f, 13.25f, 10.5f, 13.25f)
                curveTo(11.19f, 13.25f, 11.75f, 12.69f, 11.75f, 12f)
                curveTo(11.75f, 11.31f, 11.19f, 10.75f, 10.5f, 10.75f)
                close()
                moveTo(9.25f, 15.5f)
                curveTo(9.25f, 14.81f, 9.81f, 14.25f, 10.5f, 14.25f)
                curveTo(11.19f, 14.25f, 11.75f, 14.81f, 11.75f, 15.5f)
                curveTo(11.75f, 16.19f, 11.19f, 16.75f, 10.5f, 16.75f)
                curveTo(9.81f, 16.75f, 9.25f, 16.19f, 9.25f, 15.5f)
                close()
                moveTo(7f, 10.75f)
                curveTo(6.31f, 10.75f, 5.75f, 11.31f, 5.75f, 12f)
                curveTo(5.75f, 12.69f, 6.31f, 13.25f, 7f, 13.25f)
                curveTo(7.69f, 13.25f, 8.25f, 12.69f, 8.25f, 12f)
                curveTo(8.25f, 11.31f, 7.69f, 10.75f, 7f, 10.75f)
                close()
                moveTo(5.75f, 15.5f)
                curveTo(5.75f, 14.81f, 6.31f, 14.25f, 7f, 14.25f)
                curveTo(7.69f, 14.25f, 8.25f, 14.81f, 8.25f, 15.5f)
                curveTo(8.25f, 16.19f, 7.69f, 16.75f, 7f, 16.75f)
                curveTo(6.31f, 16.75f, 5.75f, 16.19f, 5.75f, 15.5f)
                close()
                moveTo(14f, 10.75f)
                curveTo(13.31f, 10.75f, 12.75f, 11.31f, 12.75f, 12f)
                curveTo(12.75f, 12.69f, 13.31f, 13.25f, 14f, 13.25f)
                curveTo(14.69f, 13.25f, 15.25f, 12.69f, 15.25f, 12f)
                curveTo(15.25f, 11.31f, 14.69f, 10.75f, 14f, 10.75f)
                close()
                moveTo(12.75f, 15.5f)
                curveTo(12.75f, 14.81f, 13.31f, 14.25f, 14f, 14.25f)
                curveTo(14.69f, 14.25f, 15.25f, 14.81f, 15.25f, 15.5f)
                curveTo(15.25f, 16.19f, 14.69f, 16.75f, 14f, 16.75f)
                curveTo(13.31f, 16.75f, 12.75f, 16.19f, 12.75f, 15.5f)
                close()
                moveTo(6.137f, 2f)
                curveTo(4.405f, 2f, 3f, 3.405f, 3f, 5.137f)
                verticalLineTo(16.363f)
                curveTo(3f, 18.096f, 4.405f, 19.5f, 6.137f, 19.5f)
                horizontalLineTo(14.863f)
                curveTo(16.596f, 19.5f, 18f, 18.096f, 18f, 16.363f)
                verticalLineTo(5.137f)
                curveTo(18f, 3.405f, 16.596f, 2f, 14.863f, 2f)
                horizontalLineTo(6.137f)
                close()
                moveTo(4.5f, 5.137f)
                curveTo(4.5f, 4.233f, 5.233f, 3.5f, 6.137f, 3.5f)
                horizontalLineTo(14.863f)
                curveTo(15.767f, 3.5f, 16.5f, 4.233f, 16.5f, 5.137f)
                verticalLineTo(16.363f)
                curveTo(16.5f, 17.267f, 15.767f, 18f, 14.863f, 18f)
                horizontalLineTo(6.137f)
                curveTo(5.233f, 18f, 4.5f, 17.267f, 4.5f, 16.363f)
                verticalLineTo(5.137f)
                close()
                moveTo(5.801f, 20.487f)
                curveTo(6.253f, 21.384f, 7.183f, 22f, 8.258f, 22f)
                horizontalLineTo(15.25f)
                curveTo(18.149f, 22f, 20.5f, 19.65f, 20.5f, 16.75f)
                lineTo(20.5f, 7.25f)
                curveTo(20.5f, 6.176f, 19.884f, 5.245f, 18.986f, 4.793f)
                curveTo(18.995f, 4.906f, 19f, 5.021f, 19f, 5.137f)
                verticalLineTo(7.236f)
                lineTo(19f, 7.25f)
                lineTo(19f, 16.363f)
                lineTo(19f, 16.386f)
                lineTo(19f, 16.75f)
                curveTo(19f, 18.821f, 17.321f, 20.5f, 15.25f, 20.5f)
                horizontalLineTo(14.875f)
                lineTo(14.863f, 20.5f)
                horizontalLineTo(6.137f)
                curveTo(6.024f, 20.5f, 5.912f, 20.496f, 5.801f, 20.487f)
                close()
            }
        }.build()

        return _CalculatorMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CalculatorMultiple: ImageVector? = null

@Preview
@Composable
private fun CalculatorMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalculatorMultiple, contentDescription = null)
    }
}
