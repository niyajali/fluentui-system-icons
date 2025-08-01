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

public val FluentIcons.Regular.AddSubtractCircle: ImageVector
    get() {
        if (_AddSubtractCircle != null) {
            return _AddSubtractCircle!!
        }
        _AddSubtractCircle = ImageVector.Builder(
            name = "Regular.AddSubtractCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 15.25f)
                curveTo(13f, 14.836f, 13.336f, 14.5f, 13.75f, 14.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 14.5f, 18f, 14.836f, 18f, 15.25f)
                curveTo(18f, 15.664f, 17.664f, 16f, 17.25f, 16f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 16f, 13f, 15.664f, 13f, 15.25f)
                close()
                moveTo(9.5f, 6.75f)
                curveTo(9.5f, 6.336f, 9.164f, 6f, 8.75f, 6f)
                curveTo(8.336f, 6f, 8f, 6.336f, 8f, 6.75f)
                verticalLineTo(8f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
                curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(8f)
                verticalLineTo(10.75f)
                curveTo(8f, 11.164f, 8.336f, 11.5f, 8.75f, 11.5f)
                curveTo(9.164f, 11.5f, 9.5f, 11.164f, 9.5f, 10.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 9.5f, 11.5f, 9.164f, 11.5f, 8.75f)
                curveTo(11.5f, 8.336f, 11.164f, 8f, 10.75f, 8f)
                horizontalLineTo(9.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                close()
                moveTo(12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 9.923f, 19.755f, 8.02f, 18.517f, 6.543f)
                lineTo(6.543f, 18.517f)
                curveTo(8.02f, 19.755f, 9.923f, 20.5f, 12f, 20.5f)
                close()
                moveTo(5.483f, 17.457f)
                lineTo(17.457f, 5.483f)
                curveTo(15.98f, 4.245f, 14.077f, 3.5f, 12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 14.077f, 4.245f, 15.98f, 5.483f, 17.457f)
                close()
            }
        }.build()

        return _AddSubtractCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AddSubtractCircle: ImageVector? = null

@Preview
@Composable
private fun AddSubtractCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AddSubtractCircle, contentDescription = null)
    }
}
