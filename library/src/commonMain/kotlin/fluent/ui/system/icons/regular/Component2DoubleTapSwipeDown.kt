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

public val FluentUi.Regular.Component2DoubleTapSwipeDown: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Component2DoubleTapSwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            curveTo(12.38f, 8f, 12.693f, 8.282f, 12.743f, 8.648f)
            lineTo(12.75f, 8.75f)
            verticalLineTo(19.455f)
            lineTo(14.97f, 17.236f)
            curveTo(15.236f, 16.97f, 15.653f, 16.946f, 15.946f, 17.164f)
            lineTo(16.03f, 17.236f)
            curveTo(16.297f, 17.503f, 16.321f, 17.919f, 16.103f, 18.213f)
            lineTo(16.03f, 18.297f)
            lineTo(12.53f, 21.797f)
            curveTo(12.264f, 22.063f, 11.847f, 22.088f, 11.554f, 21.87f)
            lineTo(11.47f, 21.797f)
            lineTo(7.97f, 18.297f)
            curveTo(7.677f, 18.004f, 7.677f, 17.529f, 7.97f, 17.236f)
            curveTo(8.236f, 16.97f, 8.653f, 16.946f, 8.946f, 17.164f)
            lineTo(9.03f, 17.236f)
            lineTo(11.25f, 19.455f)
            verticalLineTo(8.75f)
            curveTo(11.25f, 8.336f, 11.586f, 8f, 12f, 8f)
            close()
            moveTo(12f, 2f)
            curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
            curveTo(19f, 12.261f, 16.77f, 15.002f, 13.751f, 15.779f)
            lineTo(13.751f, 14.215f)
            curveTo(15.93f, 13.484f, 17.5f, 11.425f, 17.5f, 9f)
            curveTo(17.5f, 5.962f, 15.038f, 3.5f, 12f, 3.5f)
            curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
            curveTo(6.5f, 11.426f, 8.071f, 13.485f, 10.25f, 14.216f)
            lineTo(10.25f, 15.78f)
            curveTo(7.231f, 15.002f, 5f, 12.262f, 5f, 9f)
            curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
            close()
            moveTo(12f, 4.5f)
            curveTo(14.485f, 4.5f, 16.5f, 6.515f, 16.5f, 9f)
            curveTo(16.5f, 10.864f, 15.366f, 12.464f, 13.751f, 13.147f)
            lineTo(13.75f, 11.437f)
            curveTo(14.507f, 10.892f, 15f, 10.004f, 15f, 9f)
            curveTo(15f, 7.343f, 13.657f, 6f, 12f, 6f)
            curveTo(10.343f, 6f, 9f, 7.343f, 9f, 9f)
            curveTo(9f, 10.004f, 9.493f, 10.893f, 10.251f, 11.438f)
            lineTo(10.25f, 13.147f)
            curveTo(8.634f, 12.464f, 7.5f, 10.865f, 7.5f, 9f)
            curveTo(7.5f, 6.515f, 9.515f, 4.5f, 12f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Component2DoubleTapSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Component2DoubleTapSwipeDown, contentDescription = null)
    }
}
