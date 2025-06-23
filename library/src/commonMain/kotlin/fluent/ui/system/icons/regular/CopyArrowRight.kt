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

public val FluentIcons.Regular.CopyArrowRight: ImageVector
    get() {
        if (_CopyArrowRight != null) {
            return _CopyArrowRight!!
        }
        _CopyArrowRight = ImageVector.Builder(
            name = "Regular.CopyArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(5.503f, 4.627f)
                lineTo(5.5f, 6.75f)
                verticalLineTo(17.254f)
                curveTo(5.5f, 19.049f, 6.955f, 20.504f, 8.75f, 20.504f)
                lineTo(11.735f, 20.505f)
                curveTo(12.023f, 21.056f, 12.387f, 21.561f, 12.814f, 22.005f)
                lineTo(8.75f, 22.004f)
                curveTo(6.127f, 22.004f, 4f, 19.878f, 4f, 17.254f)
                verticalLineTo(6.75f)
                curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
                close()
                moveTo(18.284f, 14.589f)
                curveTo(18.114f, 14.47f, 17.886f, 14.47f, 17.716f, 14.589f)
                lineTo(17.646f, 14.646f)
                lineTo(17.589f, 14.716f)
                curveTo(17.471f, 14.886f, 17.471f, 15.114f, 17.589f, 15.284f)
                lineTo(17.646f, 15.354f)
                lineTo(19.292f, 16.999f)
                lineTo(14.494f, 17f)
                lineTo(14.404f, 17.008f)
                curveTo(14.2f, 17.045f, 14.039f, 17.206f, 14.002f, 17.41f)
                lineTo(13.994f, 17.5f)
                lineTo(14.002f, 17.59f)
                curveTo(14.039f, 17.794f, 14.2f, 17.955f, 14.404f, 17.992f)
                lineTo(14.494f, 18f)
                lineTo(19.294f, 17.999f)
                lineTo(17.646f, 19.646f)
                lineTo(17.589f, 19.716f)
                curveTo(17.454f, 19.911f, 17.473f, 20.18f, 17.646f, 20.354f)
                curveTo(17.82f, 20.527f, 18.089f, 20.546f, 18.284f, 20.411f)
                lineTo(18.354f, 20.354f)
                lineTo(20.883f, 17.821f)
                lineTo(20.92f, 17.771f)
                lineTo(20.962f, 17.691f)
                lineTo(20.988f, 17.608f)
                lineTo(20.998f, 17.544f)
                verticalLineTo(17.456f)
                lineTo(20.988f, 17.392f)
                lineTo(20.977f, 17.349f)
                lineTo(20.944f, 17.271f)
                lineTo(20.92f, 17.229f)
                lineTo(20.883f, 17.179f)
                lineTo(18.354f, 14.646f)
                lineTo(18.284f, 14.589f)
                close()
                moveTo(17.75f, 2f)
                curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
                lineTo(20.001f, 11.498f)
                curveTo(19.527f, 11.301f, 19.024f, 11.157f, 18.501f, 11.077f)
                lineTo(18.5f, 4.25f)
                curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 3.5f, 8f, 3.836f, 8f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(8f, 17.664f, 8.336f, 18f, 8.75f, 18f)
                lineTo(11.019f, 18f)
                curveTo(11.059f, 18.52f, 11.159f, 19.022f, 11.314f, 19.5f)
                lineTo(8.75f, 19.5f)
                curveTo(7.507f, 19.5f, 6.5f, 18.493f, 6.5f, 17.25f)
                verticalLineTo(4.25f)
                curveTo(6.5f, 3.007f, 7.507f, 2f, 8.75f, 2f)
                horizontalLineTo(17.75f)
                close()
            }
        }.build()

        return _CopyArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CopyArrowRight: ImageVector? = null

@Preview
@Composable
private fun CopyArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CopyArrowRight, contentDescription = null)
    }
}
