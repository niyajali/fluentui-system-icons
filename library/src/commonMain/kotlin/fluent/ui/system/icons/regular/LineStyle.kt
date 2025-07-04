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

public val FluentIcons.Regular.LineStyle: ImageVector
    get() {
        if (_LineStyle != null) {
            return _LineStyle!!
        }
        _LineStyle = ImageVector.Builder(
            name = "Regular.LineStyle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 5f)
                curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
                curveTo(2f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 6.5f, 7f, 6.164f, 7f, 5.75f)
                curveTo(7f, 5.336f, 6.664f, 5f, 6.25f, 5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(10.25f, 5f)
                curveTo(9.836f, 5f, 9.5f, 5.336f, 9.5f, 5.75f)
                curveTo(9.5f, 6.164f, 9.836f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 6.5f, 14.5f, 6.164f, 14.5f, 5.75f)
                curveTo(14.5f, 5.336f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(17.75f, 5f)
                curveTo(17.336f, 5f, 17f, 5.336f, 17f, 5.75f)
                curveTo(17f, 6.164f, 17.336f, 6.5f, 17.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
                curveTo(22f, 5.336f, 21.664f, 5f, 21.25f, 5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(21.252f, 11.503f)
                horizontalLineTo(2.752f)
                lineTo(2.651f, 11.51f)
                curveTo(2.285f, 11.559f, 2.002f, 11.873f, 2.002f, 12.253f)
                curveTo(2.002f, 12.667f, 2.338f, 13.003f, 2.752f, 13.003f)
                horizontalLineTo(21.252f)
                lineTo(21.354f, 12.996f)
                curveTo(21.72f, 12.946f, 22.002f, 12.633f, 22.002f, 12.253f)
                curveTo(22.002f, 11.839f, 21.667f, 11.503f, 21.252f, 11.503f)
                close()
                moveTo(3.25f, 17f)
                curveTo(2.56f, 17f, 2f, 17.56f, 2f, 18.25f)
                curveTo(2f, 18.94f, 2.56f, 19.5f, 3.25f, 19.5f)
                horizontalLineTo(20.75f)
                curveTo(21.44f, 19.5f, 22f, 18.94f, 22f, 18.25f)
                curveTo(22f, 17.56f, 21.44f, 17f, 20.75f, 17f)
                horizontalLineTo(3.25f)
                close()
            }
        }.build()

        return _LineStyle!!
    }

@Suppress("ObjectPropertyName")
private var _LineStyle: ImageVector? = null

@Preview
@Composable
private fun LineStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineStyle, contentDescription = null)
    }
}
