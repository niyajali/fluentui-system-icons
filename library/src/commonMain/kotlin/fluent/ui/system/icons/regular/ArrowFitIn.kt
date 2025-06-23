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

public val FluentIcons.Regular.ArrowFitIn: ImageVector
    get() {
        if (_ArrowFitIn != null) {
            return _ArrowFitIn!!
        }
        _ArrowFitIn = ImageVector.Builder(
            name = "Regular.ArrowFitIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.238f, 7.452f)
                curveTo(5.935f, 7.734f, 5.919f, 8.209f, 6.202f, 8.512f)
                lineTo(8.524f, 11f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
                curveTo(2f, 12.164f, 2.336f, 12.5f, 2.75f, 12.5f)
                horizontalLineTo(8.524f)
                lineTo(6.202f, 14.988f)
                curveTo(5.919f, 15.291f, 5.935f, 15.766f, 6.238f, 16.048f)
                curveTo(6.541f, 16.331f, 7.016f, 16.315f, 7.298f, 16.012f)
                lineTo(10.798f, 12.262f)
                curveTo(11.067f, 11.974f, 11.067f, 11.526f, 10.798f, 11.238f)
                lineTo(7.298f, 7.488f)
                curveTo(7.016f, 7.185f, 6.541f, 7.169f, 6.238f, 7.452f)
                close()
                moveTo(17.762f, 7.452f)
                curveTo(18.065f, 7.734f, 18.081f, 8.209f, 17.798f, 8.512f)
                lineTo(15.476f, 11f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11f, 22f, 11.336f, 22f, 11.75f)
                curveTo(22f, 12.164f, 21.664f, 12.5f, 21.25f, 12.5f)
                horizontalLineTo(15.476f)
                lineTo(17.798f, 14.988f)
                curveTo(18.081f, 15.291f, 18.065f, 15.766f, 17.762f, 16.048f)
                curveTo(17.459f, 16.331f, 16.984f, 16.315f, 16.702f, 16.012f)
                lineTo(13.202f, 12.262f)
                curveTo(12.933f, 11.974f, 12.933f, 11.526f, 13.202f, 11.238f)
                lineTo(16.702f, 7.488f)
                curveTo(16.984f, 7.185f, 17.459f, 7.169f, 17.762f, 7.452f)
                close()
            }
        }.build()

        return _ArrowFitIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFitIn: ImageVector? = null

@Preview
@Composable
private fun ArrowFitInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowFitIn, contentDescription = null)
    }
}
