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

public val FluentIcons.Filled.SaveArrowRight: ImageVector
    get() {
        if (_SaveArrowRight != null) {
            return _SaveArrowRight!!
        }
        _SaveArrowRight = ImageVector.Builder(
            name = "Filled.SaveArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 3f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                curveTo(6f, 13.757f, 7.007f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(13.063f)
                curveTo(14.224f, 11.664f, 15.785f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                verticalLineTo(8.286f)
                curveTo(21f, 7.424f, 20.658f, 6.597f, 20.048f, 5.987f)
                lineTo(18.013f, 3.952f)
                curveTo(17.411f, 3.351f, 16.599f, 3.009f, 15.75f, 3f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 8.743f, 14.743f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(9f)
                curveTo(7.757f, 9.75f, 6.75f, 8.743f, 6.75f, 7.5f)
                verticalLineTo(3f)
                close()
                moveTo(8.25f, 14.25f)
                horizontalLineTo(11.87f)
                curveTo(11.316f, 15.206f, 11f, 16.316f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                curveTo(7.5f, 14.586f, 7.836f, 14.25f, 8.25f, 14.25f)
                close()
                moveTo(14.25f, 3f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.914f, 13.914f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9f)
                curveTo(8.586f, 8.25f, 8.25f, 7.914f, 8.25f, 7.5f)
                verticalLineTo(3f)
                horizontalLineTo(14.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 19.646f)
                curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
                curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
                curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
                lineTo(19.293f, 17f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _SaveArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _SaveArrowRight: ImageVector? = null

@Preview
@Composable
private fun SaveArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SaveArrowRight, contentDescription = null)
    }
}
