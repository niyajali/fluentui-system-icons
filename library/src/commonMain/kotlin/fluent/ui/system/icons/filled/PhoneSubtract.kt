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

public val FluentIcons.Filled.PhoneSubtract: ImageVector
    get() {
        if (_PhoneSubtract != null) {
            return _PhoneSubtract!!
        }
        _PhoneSubtract = ImageVector.Builder(
            name = "Filled.PhoneSubtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
                lineTo(16f, 11.174f)
                curveTo(13.133f, 11.851f, 11f, 14.426f, 11f, 17.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 17.5f, 8f, 17.836f, 8f, 18.25f)
                curveTo(8f, 18.664f, 8.336f, 19f, 8.75f, 19f)
                lineTo(11.174f, 19.001f)
                curveTo(11.445f, 20.148f, 12.021f, 21.178f, 12.81f, 22.001f)
                lineTo(6.25f, 22f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(14.408f, 17.008f)
                curveTo(14.204f, 17.045f, 14.043f, 17.206f, 14.006f, 17.41f)
                lineTo(13.998f, 17.5f)
                lineTo(14.006f, 17.59f)
                curveTo(14.043f, 17.794f, 14.204f, 17.955f, 14.408f, 17.992f)
                lineTo(14.498f, 18f)
                horizontalLineTo(20.505f)
                lineTo(20.594f, 17.992f)
                curveTo(20.799f, 17.955f, 20.959f, 17.794f, 20.997f, 17.59f)
                lineTo(21.005f, 17.5f)
                lineTo(20.997f, 17.41f)
                curveTo(20.959f, 17.206f, 20.799f, 17.045f, 20.594f, 17.008f)
                lineTo(20.505f, 17f)
                horizontalLineTo(14.498f)
                lineTo(14.408f, 17.008f)
                close()
            }
        }.build()

        return _PhoneSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSubtract: ImageVector? = null

@Preview
@Composable
private fun PhoneSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneSubtract, contentDescription = null)
    }
}
