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

public val FluentIcons.Regular.PhoneUpdateCheckmark: ImageVector
    get() {
        if (_PhoneUpdateCheckmark != null) {
            return _PhoneUpdateCheckmark!!
        }
        _PhoneUpdateCheckmark = ImageVector.Builder(
            name = "Regular.PhoneUpdateCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.25f, 22f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 21.556f, 12.019f, 21.051f, 11.732f, 20.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 20.5f, 7.5f, 20.164f, 7.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(7.5f, 3.836f, 7.836f, 3.5f, 8.25f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 3.5f, 16.5f, 3.836f, 16.5f, 4.25f)
                verticalLineTo(11.076f)
                curveTo(16.826f, 11.026f, 17.16f, 11f, 17.5f, 11f)
                curveTo(17.668f, 11f, 17.835f, 11.006f, 18f, 11.019f)
                verticalLineTo(4.25f)
                curveTo(18f, 3.007f, 16.993f, 2f, 15.75f, 2f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(6f, 20.993f, 7.007f, 22f, 8.25f, 22f)
                close()
                moveTo(11.25f, 15.709f)
                curveTo(11.536f, 14.707f, 12.057f, 13.804f, 12.75f, 13.063f)
                lineTo(12.749f, 9.508f)
                lineTo(13.711f, 10.469f)
                curveTo(13.978f, 10.736f, 14.394f, 10.76f, 14.688f, 10.542f)
                lineTo(14.772f, 10.469f)
                curveTo(15.038f, 10.203f, 15.063f, 9.786f, 14.845f, 9.493f)
                lineTo(14.772f, 9.409f)
                lineTo(12.53f, 7.167f)
                lineTo(12.492f, 7.131f)
                lineTo(12.43f, 7.082f)
                lineTo(12.363f, 7.041f)
                lineTo(12.303f, 7.011f)
                lineTo(12.202f, 6.975f)
                lineTo(12.139f, 6.96f)
                lineTo(12.047f, 6.949f)
                horizontalLineTo(11.953f)
                lineTo(11.861f, 6.96f)
                lineTo(11.765f, 6.985f)
                lineTo(11.653f, 7.032f)
                lineTo(11.577f, 7.078f)
                lineTo(11.47f, 7.167f)
                lineTo(9.228f, 9.409f)
                curveTo(8.935f, 9.701f, 8.935f, 10.176f, 9.228f, 10.469f)
                curveTo(9.494f, 10.736f, 9.911f, 10.76f, 10.205f, 10.542f)
                lineTo(10.289f, 10.469f)
                lineTo(11.249f, 9.508f)
                lineTo(11.25f, 15.709f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _PhoneUpdateCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneUpdateCheckmark: ImageVector? = null

@Preview
@Composable
private fun PhoneUpdateCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneUpdateCheckmark, contentDescription = null)
    }
}
