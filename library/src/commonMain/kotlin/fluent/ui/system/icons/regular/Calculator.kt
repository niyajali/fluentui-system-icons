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

public val FluentIcons.Regular.Calculator: ImageVector
    get() {
        if (_Calculator != null) {
            return _Calculator!!
        }
        _Calculator = ImageVector.Builder(
            name = "Regular.Calculator",
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
                moveTo(15.75f, 14.5f)
                curveTo(16.44f, 14.5f, 17f, 13.94f, 17f, 13.25f)
                curveTo(17f, 12.56f, 16.44f, 12f, 15.75f, 12f)
                curveTo(15.06f, 12f, 14.5f, 12.56f, 14.5f, 13.25f)
                curveTo(14.5f, 13.94f, 15.06f, 14.5f, 15.75f, 14.5f)
                close()
                moveTo(17f, 17.25f)
                curveTo(17f, 17.94f, 16.44f, 18.5f, 15.75f, 18.5f)
                curveTo(15.06f, 18.5f, 14.5f, 17.94f, 14.5f, 17.25f)
                curveTo(14.5f, 16.56f, 15.06f, 16f, 15.75f, 16f)
                curveTo(16.44f, 16f, 17f, 16.56f, 17f, 17.25f)
                close()
                moveTo(12f, 14.5f)
                curveTo(12.69f, 14.5f, 13.25f, 13.94f, 13.25f, 13.25f)
                curveTo(13.25f, 12.56f, 12.69f, 12f, 12f, 12f)
                curveTo(11.31f, 12f, 10.75f, 12.56f, 10.75f, 13.25f)
                curveTo(10.75f, 13.94f, 11.31f, 14.5f, 12f, 14.5f)
                close()
                moveTo(13.25f, 17.25f)
                curveTo(13.25f, 17.94f, 12.69f, 18.5f, 12f, 18.5f)
                curveTo(11.31f, 18.5f, 10.75f, 17.94f, 10.75f, 17.25f)
                curveTo(10.75f, 16.56f, 11.31f, 16f, 12f, 16f)
                curveTo(12.69f, 16f, 13.25f, 16.56f, 13.25f, 17.25f)
                close()
                moveTo(7.25f, 2f)
                curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 22f, 20f, 20.545f, 20f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(20f, 3.455f, 18.545f, 2f, 16.75f, 2f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.5f, 5.25f)
                curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(17.716f, 3.5f, 18.5f, 4.284f, 18.5f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.716f, 17.716f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _Calculator!!
    }

@Suppress("ObjectPropertyName")
private var _Calculator: ImageVector? = null

@Preview
@Composable
private fun CalculatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Calculator, contentDescription = null)
    }
}
