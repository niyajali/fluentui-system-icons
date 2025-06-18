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

public val FluentUi.Regular.SwipeUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 18.003f)
            curveTo(12.38f, 18.003f, 12.693f, 17.721f, 12.743f, 17.356f)
            lineTo(12.75f, 17.254f)
            verticalLineTo(4.56f)
            lineTo(14.97f, 6.776f)
            curveTo(15.236f, 7.042f, 15.653f, 7.067f, 15.946f, 6.849f)
            lineTo(16.03f, 6.776f)
            curveTo(16.297f, 6.51f, 16.321f, 6.094f, 16.103f, 5.801f)
            lineTo(16.03f, 5.717f)
            lineTo(12.53f, 2.219f)
            curveTo(12.264f, 1.953f, 11.847f, 1.929f, 11.554f, 2.147f)
            lineTo(11.47f, 2.219f)
            lineTo(7.97f, 5.717f)
            curveTo(7.677f, 6.009f, 7.677f, 6.484f, 7.97f, 6.776f)
            curveTo(8.236f, 7.042f, 8.653f, 7.067f, 8.946f, 6.849f)
            lineTo(9.03f, 6.776f)
            lineTo(11.25f, 4.56f)
            verticalLineTo(17.254f)
            curveTo(11.25f, 17.668f, 11.586f, 18.003f, 12f, 18.003f)
            close()
            moveTo(12f, 22f)
            curveTo(14.761f, 22f, 17f, 19.763f, 17f, 17.004f)
            curveTo(17f, 14.861f, 15.649f, 13.032f, 13.751f, 12.323f)
            lineTo(13.751f, 13.975f)
            curveTo(14.797f, 14.58f, 15.5f, 15.71f, 15.5f, 17.004f)
            curveTo(15.5f, 18.936f, 13.933f, 20.501f, 12f, 20.501f)
            curveTo(10.067f, 20.501f, 8.5f, 18.936f, 8.5f, 17.004f)
            curveTo(8.5f, 15.71f, 9.204f, 14.58f, 10.25f, 13.975f)
            lineTo(10.25f, 12.323f)
            curveTo(8.352f, 13.032f, 7f, 14.86f, 7f, 17.004f)
            curveTo(7f, 19.763f, 9.239f, 22f, 12f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SwipeUp, contentDescription = null)
    }
}
