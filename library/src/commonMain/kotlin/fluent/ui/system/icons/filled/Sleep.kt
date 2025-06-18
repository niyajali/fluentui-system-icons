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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Sleep: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sleep",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.378f, 3.026f)
            curveTo(14.78f, 3.101f, 16.149f, 3.504f, 17.391f, 4.221f)
            curveTo(21.698f, 6.707f, 23.173f, 12.214f, 20.687f, 16.52f)
            curveTo(18.2f, 20.827f, 12.694f, 22.302f, 8.387f, 19.816f)
            curveTo(7.214f, 19.139f, 6.227f, 18.223f, 5.475f, 17.131f)
            curveTo(5.224f, 16.766f, 5.386f, 16.261f, 5.804f, 16.112f)
            curveTo(9.195f, 14.898f, 11.012f, 13.491f, 12.066f, 11.479f)
            curveTo(13.176f, 9.361f, 13.462f, 7.041f, 12.686f, 3.86f)
            curveTo(12.579f, 3.42f, 12.926f, 3.002f, 13.378f, 3.026f)
            close()
            moveTo(10.994f, 3.653f)
            lineTo(11f, 3.751f)
            verticalLineTo(9f)
            curveTo(11f, 10.104f, 10.105f, 11f, 9f, 11f)
            curveTo(7.895f, 11f, 7f, 10.104f, 7f, 9f)
            curveTo(7f, 7.895f, 7.895f, 7f, 9f, 7f)
            curveTo(9.173f, 7f, 9.341f, 7.022f, 9.501f, 7.063f)
            lineTo(9.5f, 4.764f)
            lineTo(6f, 5.828f)
            verticalLineTo(10f)
            curveTo(6f, 11.104f, 5.105f, 12f, 4f, 12f)
            curveTo(2.895f, 12f, 2f, 11.104f, 2f, 10f)
            curveTo(2f, 8.895f, 2.895f, 8f, 4f, 8f)
            curveTo(4.173f, 8f, 4.341f, 8.022f, 4.501f, 8.063f)
            lineTo(4.5f, 5.273f)
            curveTo(4.5f, 4.979f, 4.671f, 4.716f, 4.93f, 4.594f)
            lineTo(5.032f, 4.555f)
            lineTo(10.032f, 3.034f)
            curveTo(10.481f, 2.897f, 10.935f, 3.202f, 10.994f, 3.653f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SleepPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Sleep, contentDescription = null)
    }
}
