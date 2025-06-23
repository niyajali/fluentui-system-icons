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

public val FluentIcons.Filled.PhoneArrowRight: ImageVector
    get() {
        if (_PhoneArrowRight != null) {
            return _PhoneArrowRight!!
        }
        _PhoneArrowRight = ImageVector.Builder(
            name = "Filled.PhoneArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
                lineTo(16.001f, 10.019f)
                curveTo(12.644f, 10.274f, 10f, 13.078f, 10f, 16.5f)
                curveTo(10f, 17.017f, 10.06f, 17.519f, 10.174f, 18.001f)
                lineTo(8.75f, 18f)
                curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
                curveTo(8f, 19.13f, 8.282f, 19.444f, 8.648f, 19.493f)
                lineTo(8.75f, 19.5f)
                lineTo(10.733f, 19.501f)
                curveTo(11.266f, 20.524f, 12.064f, 21.388f, 13.036f, 22.001f)
                lineTo(6.25f, 22f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.5f, 11f)
                curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
                curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
                curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
                curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
                close()
                moveTo(16.716f, 13.589f)
                lineTo(16.646f, 13.646f)
                lineTo(16.589f, 13.716f)
                curveTo(16.471f, 13.886f, 16.471f, 14.114f, 16.589f, 14.284f)
                lineTo(16.646f, 14.354f)
                lineTo(18.292f, 15.999f)
                lineTo(13.494f, 16f)
                lineTo(13.404f, 16.008f)
                curveTo(13.2f, 16.045f, 13.039f, 16.206f, 13.002f, 16.41f)
                lineTo(12.994f, 16.5f)
                lineTo(13.002f, 16.59f)
                curveTo(13.039f, 16.794f, 13.2f, 16.955f, 13.404f, 16.992f)
                lineTo(13.494f, 17f)
                lineTo(18.294f, 16.999f)
                lineTo(16.646f, 18.646f)
                lineTo(16.589f, 18.716f)
                curveTo(16.454f, 18.911f, 16.473f, 19.18f, 16.646f, 19.354f)
                curveTo(16.82f, 19.527f, 17.089f, 19.546f, 17.284f, 19.411f)
                lineTo(17.354f, 19.354f)
                lineTo(19.883f, 16.821f)
                lineTo(19.92f, 16.771f)
                lineTo(19.962f, 16.691f)
                lineTo(19.988f, 16.608f)
                lineTo(19.998f, 16.544f)
                verticalLineTo(16.456f)
                lineTo(19.988f, 16.392f)
                lineTo(19.962f, 16.309f)
                lineTo(19.92f, 16.229f)
                lineTo(19.883f, 16.179f)
                lineTo(17.354f, 13.646f)
                lineTo(17.284f, 13.589f)
                curveTo(17.138f, 13.487f, 16.95f, 13.473f, 16.792f, 13.545f)
                lineTo(16.716f, 13.589f)
                close()
            }
        }.build()

        return _PhoneArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneArrowRight: ImageVector? = null

@Preview
@Composable
private fun PhoneArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneArrowRight, contentDescription = null)
    }
}
