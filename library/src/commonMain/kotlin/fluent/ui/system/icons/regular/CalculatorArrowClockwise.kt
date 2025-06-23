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

public val FluentIcons.Regular.CalculatorArrowClockwise: ImageVector
    get() {
        if (_CalculatorArrowClockwise != null) {
            return _CalculatorArrowClockwise!!
        }
        _CalculatorArrowClockwise = ImageVector.Builder(
            name = "Regular.CalculatorArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 7f)
                curveTo(7f, 5.895f, 7.895f, 5f, 9f, 5f)
                horizontalLineTo(15f)
                curveTo(16.105f, 5f, 17f, 5.895f, 17f, 7f)
                verticalLineTo(8f)
                curveTo(17f, 9.105f, 16.105f, 10f, 15f, 10f)
                horizontalLineTo(9f)
                curveTo(7.895f, 10f, 7f, 9.105f, 7f, 8f)
                verticalLineTo(7f)
                close()
                moveTo(9f, 6.5f)
                curveTo(8.724f, 6.5f, 8.5f, 6.724f, 8.5f, 7f)
                verticalLineTo(8f)
                curveTo(8.5f, 8.276f, 8.724f, 8.5f, 9f, 8.5f)
                horizontalLineTo(15f)
                curveTo(15.276f, 8.5f, 15.5f, 8.276f, 15.5f, 8f)
                verticalLineTo(7f)
                curveTo(15.5f, 6.724f, 15.276f, 6.5f, 15f, 6.5f)
                horizontalLineTo(9f)
                close()
                moveTo(8.25f, 14.5f)
                curveTo(8.94f, 14.5f, 9.5f, 13.94f, 9.5f, 13.25f)
                curveTo(9.5f, 12.56f, 8.94f, 12f, 8.25f, 12f)
                curveTo(7.56f, 12f, 7f, 12.56f, 7f, 13.25f)
                curveTo(7f, 13.94f, 7.56f, 14.5f, 8.25f, 14.5f)
                close()
                moveTo(9.5f, 17.25f)
                curveTo(9.5f, 17.94f, 8.94f, 18.5f, 8.25f, 18.5f)
                curveTo(7.56f, 18.5f, 7f, 17.94f, 7f, 17.25f)
                curveTo(7f, 16.56f, 7.56f, 16f, 8.25f, 16f)
                curveTo(8.94f, 16f, 9.5f, 16.56f, 9.5f, 17.25f)
                close()
                moveTo(7.25f, 22f)
                horizontalLineTo(12.101f)
                curveTo(11.649f, 21.556f, 11.256f, 21.052f, 10.936f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(17.716f, 3.5f, 18.5f, 4.284f, 18.5f, 5.25f)
                verticalLineTo(10.161f)
                curveTo(18.939f, 10.257f, 19.364f, 10.395f, 19.768f, 10.569f)
                curveTo(19.802f, 10.514f, 19.84f, 10.462f, 19.88f, 10.411f)
                curveTo(19.918f, 10.364f, 19.958f, 10.318f, 20f, 10.275f)
                verticalLineTo(5.25f)
                curveTo(20f, 3.455f, 18.545f, 2f, 16.75f, 2f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
                close()
                moveTo(21.25f, 15f)
                curveTo(21.664f, 15f, 22f, 14.664f, 22f, 14.25f)
                verticalLineTo(11.5f)
                curveTo(22f, 11.086f, 21.664f, 10.75f, 21.25f, 10.75f)
                curveTo(21.012f, 10.75f, 20.8f, 10.861f, 20.663f, 11.033f)
                curveTo(20.561f, 11.162f, 20.5f, 11.324f, 20.5f, 11.5f)
                verticalLineTo(12.126f)
                curveTo(19.515f, 11.418f, 18.305f, 11f, 17f, 11f)
                curveTo(13.686f, 11f, 11f, 13.686f, 11f, 17f)
                curveTo(11f, 20.314f, 13.686f, 23f, 17f, 23f)
                curveTo(20.314f, 23f, 23f, 20.314f, 23f, 17f)
                curveTo(23f, 16.586f, 22.664f, 16.25f, 22.25f, 16.25f)
                curveTo(21.836f, 16.25f, 21.5f, 16.586f, 21.5f, 17f)
                curveTo(21.5f, 19.485f, 19.485f, 21.5f, 17f, 21.5f)
                curveTo(14.515f, 21.5f, 12.5f, 19.485f, 12.5f, 17f)
                curveTo(12.5f, 14.515f, 14.515f, 12.5f, 17f, 12.5f)
                curveTo(18.065f, 12.5f, 19.042f, 12.869f, 19.812f, 13.487f)
                curveTo(19.815f, 13.489f, 19.817f, 13.491f, 19.82f, 13.493f)
                curveTo(19.823f, 13.495f, 19.826f, 13.498f, 19.829f, 13.5f)
                horizontalLineTo(18.5f)
                curveTo(18.086f, 13.5f, 17.75f, 13.836f, 17.75f, 14.25f)
                curveTo(17.75f, 14.664f, 18.086f, 15f, 18.5f, 15f)
                horizontalLineTo(21.25f)
                close()
            }
        }.build()

        return _CalculatorArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _CalculatorArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun CalculatorArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalculatorArrowClockwise, contentDescription = null)
    }
}
