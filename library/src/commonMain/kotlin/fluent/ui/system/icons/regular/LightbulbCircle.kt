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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.LightbulbCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LightbulbCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
            moveTo(12f, 5.202f)
            curveTo(14.761f, 5.202f, 17f, 7.44f, 17f, 10.202f)
            curveTo(17f, 11.738f, 16.302f, 13.161f, 15.11f, 14.117f)
            lineTo(15.142f, 14.089f)
            lineTo(14.377f, 17.456f)
            curveTo(14.223f, 18.124f, 13.693f, 18.632f, 12.998f, 18.767f)
            lineTo(12.847f, 18.79f)
            lineTo(12.691f, 18.798f)
            horizontalLineTo(11.309f)
            curveTo(10.575f, 18.798f, 9.923f, 18.335f, 9.665f, 17.606f)
            lineTo(9.622f, 17.454f)
            lineTo(8.856f, 14.088f)
            lineTo(8.701f, 13.959f)
            curveTo(7.769f, 13.141f, 7.166f, 11.998f, 7.029f, 10.729f)
            lineTo(7.008f, 10.473f)
            lineTo(7f, 10.202f)
            curveTo(7f, 7.44f, 9.239f, 5.202f, 12f, 5.202f)
            close()
            moveTo(13.17f, 16f)
            horizontalLineTo(10.828f)
            lineTo(11.073f, 17.078f)
            lineTo(11.092f, 17.145f)
            curveTo(11.124f, 17.236f, 11.211f, 17.298f, 11.309f, 17.298f)
            lineTo(12.648f, 17.299f)
            lineTo(12.718f, 17.296f)
            curveTo(12.814f, 17.285f, 12.894f, 17.215f, 12.915f, 17.122f)
            lineTo(13.17f, 16f)
            close()
            moveTo(12f, 6.702f)
            curveTo(10.067f, 6.702f, 8.5f, 8.269f, 8.5f, 10.18f)
            lineTo(8.506f, 10.408f)
            curveTo(8.568f, 11.472f, 9.109f, 12.437f, 9.965f, 13.049f)
            curveTo(10.114f, 13.156f, 10.219f, 13.314f, 10.259f, 13.493f)
            lineTo(10.488f, 14.502f)
            lineTo(10.529f, 14.5f)
            horizontalLineTo(13.471f)
            lineTo(13.51f, 14.502f)
            lineTo(13.74f, 13.494f)
            curveTo(13.771f, 13.356f, 13.84f, 13.231f, 13.939f, 13.131f)
            lineTo(14.018f, 13.062f)
            lineTo(14.188f, 12.934f)
            curveTo(15.012f, 12.273f, 15.5f, 11.278f, 15.5f, 10.202f)
            curveTo(15.5f, 8.269f, 13.933f, 6.702f, 12f, 6.702f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LightbulbCircle, contentDescription = null)
    }
}
