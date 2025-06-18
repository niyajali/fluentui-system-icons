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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.207f, 2.291f)
            lineTo(19.207f, 6.286f)
            curveTo(19.568f, 6.647f, 19.596f, 7.214f, 19.291f, 7.606f)
            lineTo(19.208f, 7.7f)
            lineTo(15.208f, 11.706f)
            curveTo(14.818f, 12.097f, 14.185f, 12.097f, 13.794f, 11.707f)
            curveTo(13.433f, 11.346f, 13.405f, 10.779f, 13.71f, 10.387f)
            lineTo(13.793f, 10.292f)
            lineTo(16.084f, 7.999f)
            lineTo(5.5f, 7.999f)
            curveTo(4.987f, 7.999f, 4.564f, 7.613f, 4.507f, 7.116f)
            lineTo(4.5f, 6.999f)
            curveTo(4.5f, 6.486f, 4.886f, 6.064f, 5.383f, 6.006f)
            lineTo(5.5f, 5.999f)
            lineTo(16.091f, 5.999f)
            lineTo(13.794f, 3.706f)
            curveTo(13.433f, 3.345f, 13.405f, 2.778f, 13.71f, 2.386f)
            lineTo(13.793f, 2.291f)
            curveTo(14.153f, 1.931f, 14.721f, 1.903f, 15.113f, 2.207f)
            lineTo(15.207f, 2.291f)
            lineTo(19.207f, 6.286f)
            lineTo(15.207f, 2.291f)
            close()
            moveTo(19.491f, 16.882f)
            lineTo(19.497f, 16.999f)
            curveTo(19.497f, 17.512f, 19.111f, 17.935f, 18.614f, 17.992f)
            lineTo(18.497f, 17.999f)
            lineTo(7.914f, 17.999f)
            lineTo(10.208f, 20.292f)
            curveTo(10.568f, 20.652f, 10.596f, 21.219f, 10.291f, 21.612f)
            lineTo(10.208f, 21.706f)
            curveTo(9.848f, 22.066f, 9.281f, 22.094f, 8.888f, 21.79f)
            lineTo(8.794f, 21.706f)
            lineTo(4.794f, 17.71f)
            curveTo(4.433f, 17.35f, 4.405f, 16.783f, 4.71f, 16.39f)
            lineTo(4.793f, 16.296f)
            lineTo(8.793f, 12.292f)
            curveTo(9.184f, 11.902f, 9.817f, 11.901f, 10.208f, 12.292f)
            curveTo(10.568f, 12.652f, 10.596f, 13.219f, 10.291f, 13.612f)
            lineTo(10.208f, 13.706f)
            lineTo(7.918f, 15.999f)
            lineTo(18.497f, 15.999f)
            curveTo(19.01f, 15.999f, 19.433f, 16.385f, 19.491f, 16.882f)
            lineTo(19.497f, 16.999f)
            lineTo(19.491f, 16.882f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSwap, contentDescription = null)
    }
}
