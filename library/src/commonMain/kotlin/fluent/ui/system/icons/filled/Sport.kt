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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Sport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sport",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.162f, 4.898f)
            curveTo(20.568f, 5.388f, 20.917f, 5.927f, 21.198f, 6.504f)
            curveTo(20.742f, 7.392f, 19.817f, 8f, 18.75f, 8f)
            curveTo(18.263f, 8f, 17.806f, 7.873f, 17.409f, 7.652f)
            lineTo(20.162f, 4.898f)
            close()
            moveTo(19.102f, 3.838f)
            lineTo(16.348f, 6.591f)
            curveTo(16.126f, 6.194f, 16f, 5.737f, 16f, 5.25f)
            curveTo(16f, 4.183f, 16.608f, 3.258f, 17.496f, 2.802f)
            curveTo(18.073f, 3.083f, 18.612f, 3.432f, 19.102f, 3.838f)
            close()
            moveTo(22f, 10f)
            curveTo(22f, 9.385f, 21.931f, 8.786f, 21.799f, 8.211f)
            curveTo(21.027f, 9.006f, 19.946f, 9.5f, 18.75f, 9.5f)
            curveTo(17.847f, 9.5f, 17.01f, 9.219f, 16.322f, 8.739f)
            lineTo(15.561f, 9.5f)
            lineTo(20.593f, 14.532f)
            curveTo(21.48f, 13.244f, 22f, 11.683f, 22f, 10f)
            close()
            moveTo(14.5f, 5.25f)
            curveTo(14.5f, 4.054f, 14.994f, 2.973f, 15.789f, 2.201f)
            curveTo(15.214f, 2.069f, 14.615f, 2f, 14f, 2f)
            curveTo(12.317f, 2f, 10.756f, 2.52f, 9.467f, 3.407f)
            lineTo(14.5f, 8.439f)
            lineTo(15.261f, 7.678f)
            curveTo(14.781f, 6.99f, 14.5f, 6.153f, 14.5f, 5.25f)
            close()
            moveTo(14.5f, 10.561f)
            lineTo(19.626f, 15.687f)
            curveTo(18.636f, 16.667f, 17.391f, 17.39f, 16f, 17.748f)
            curveTo(15.999f, 15.326f, 15.116f, 13.111f, 13.654f, 11.406f)
            lineTo(14.5f, 10.561f)
            close()
            moveTo(12.594f, 10.346f)
            curveTo(10.889f, 8.884f, 8.674f, 8f, 6.252f, 8f)
            curveTo(6.61f, 6.609f, 7.333f, 5.364f, 8.313f, 4.374f)
            lineTo(13.439f, 9.5f)
            lineTo(12.594f, 10.346f)
            close()
            moveTo(4.25f, 9f)
            curveTo(3.007f, 9f, 2f, 10.007f, 2f, 11.25f)
            verticalLineTo(13.25f)
            curveTo(2f, 18.083f, 5.918f, 22f, 10.75f, 22f)
            horizontalLineTo(12.75f)
            curveTo(13.993f, 22f, 15f, 20.993f, 15f, 19.75f)
            verticalLineTo(17.75f)
            curveTo(15f, 12.917f, 11.083f, 9f, 6.25f, 9f)
            horizontalLineTo(4.25f)
            close()
            moveTo(6.72f, 13.72f)
            curveTo(7.013f, 13.427f, 7.487f, 13.427f, 7.78f, 13.72f)
            lineTo(10.28f, 16.22f)
            curveTo(10.573f, 16.513f, 10.573f, 16.987f, 10.28f, 17.28f)
            curveTo(9.987f, 17.573f, 9.513f, 17.573f, 9.22f, 17.28f)
            lineTo(6.72f, 14.78f)
            curveTo(6.427f, 14.487f, 6.427f, 14.013f, 6.72f, 13.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Sport, contentDescription = null)
    }
}
