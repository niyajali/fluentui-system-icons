/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PhoneArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            lineTo(16.001f, 10.019f)
            curveTo(15.481f, 10.058f, 14.979f, 10.159f, 14.501f, 10.313f)
            lineTo(14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            lineTo(11.377f, 20.501f)
            curveTo(11.839f, 21.091f, 12.4f, 21.6f, 13.036f, 22.001f)
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
            moveTo(10.077f, 17.502f)
            curveTo(10.158f, 18.025f, 10.301f, 18.527f, 10.498f, 19.001f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            lineTo(10.077f, 17.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneArrowRight, contentDescription = null)
    }
}
