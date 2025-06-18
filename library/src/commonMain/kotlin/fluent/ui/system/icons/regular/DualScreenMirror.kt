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

public val FluentUi.Regular.DualScreenMirror: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenMirror",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.172f, 9.415f)
            curveTo(17.045f, 9.161f, 16.785f, 9.001f, 16.501f, 9.001f)
            curveTo(16.217f, 9.001f, 15.957f, 9.161f, 15.83f, 9.415f)
            lineTo(13.58f, 13.915f)
            curveTo(13.464f, 14.148f, 13.476f, 14.424f, 13.613f, 14.645f)
            curveTo(13.749f, 14.866f, 13.991f, 15.001f, 14.251f, 15.001f)
            horizontalLineTo(18.751f)
            curveTo(19.011f, 15.001f, 19.252f, 14.866f, 19.389f, 14.645f)
            curveTo(19.525f, 14.424f, 19.538f, 14.148f, 19.422f, 13.915f)
            lineTo(17.172f, 9.415f)
            close()
            moveTo(15.464f, 13.501f)
            lineTo(16.501f, 11.428f)
            lineTo(17.537f, 13.501f)
            horizontalLineTo(15.464f)
            close()
            moveTo(7.501f, 9.001f)
            curveTo(7.785f, 9.001f, 8.045f, 9.161f, 8.172f, 9.415f)
            lineTo(10.422f, 13.915f)
            curveTo(10.538f, 14.148f, 10.525f, 14.424f, 10.389f, 14.645f)
            curveTo(10.252f, 14.866f, 10.011f, 15.001f, 9.751f, 15.001f)
            horizontalLineTo(5.251f)
            curveTo(4.991f, 15.001f, 4.749f, 14.866f, 4.613f, 14.645f)
            curveTo(4.476f, 14.424f, 4.464f, 14.148f, 4.58f, 13.915f)
            lineTo(6.83f, 9.415f)
            curveTo(6.957f, 9.161f, 7.217f, 9.001f, 7.501f, 9.001f)
            close()
            moveTo(7.501f, 11.428f)
            lineTo(6.464f, 13.501f)
            horizontalLineTo(8.537f)
            lineTo(7.501f, 11.428f)
            close()
            moveTo(12.755f, 4.002f)
            lineTo(12.755f, 4.004f)
            lineTo(20.253f, 4.004f)
            curveTo(21.219f, 4.004f, 22.003f, 4.788f, 22.003f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(22.003f, 19.216f, 21.219f, 20f, 20.253f, 20f)
            horizontalLineTo(11.255f)
            lineTo(11.255f, 19.997f)
            lineTo(3.758f, 19.997f)
            curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
            horizontalLineTo(12.755f)
            close()
            moveTo(20.253f, 5.504f)
            horizontalLineTo(12.755f)
            verticalLineTo(18.5f)
            horizontalLineTo(20.253f)
            curveTo(20.391f, 18.5f, 20.503f, 18.388f, 20.503f, 18.25f)
            verticalLineTo(5.754f)
            curveTo(20.503f, 5.616f, 20.391f, 5.504f, 20.253f, 5.504f)
            close()
            moveTo(11.255f, 5.502f)
            horizontalLineTo(3.758f)
            curveTo(3.62f, 5.502f, 3.508f, 5.614f, 3.508f, 5.752f)
            verticalLineTo(18.247f)
            curveTo(3.508f, 18.385f, 3.62f, 18.497f, 3.758f, 18.497f)
            horizontalLineTo(11.255f)
            verticalLineTo(5.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenMirrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DualScreenMirror, contentDescription = null)
    }
}
