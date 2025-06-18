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
package fluent.ui.system.icons.light

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

public val FluentUi.Light.Attach: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Attach",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.077f, 4.217f)
            lineTo(2.146f, 19.147f)
            curveTo(1.951f, 19.343f, 1.951f, 19.659f, 2.146f, 19.855f)
            curveTo(2.342f, 20.05f, 2.658f, 20.05f, 2.854f, 19.855f)
            lineTo(17.784f, 4.925f)
            curveTo(20.35f, 2.358f, 24.51f, 2.358f, 27.076f, 4.925f)
            curveTo(29.643f, 7.491f, 29.643f, 11.651f, 27.076f, 14.217f)
            lineTo(13.287f, 28.006f)
            curveTo(11.964f, 29.329f, 9.818f, 29.329f, 8.494f, 28.006f)
            curveTo(7.171f, 26.682f, 7.171f, 24.536f, 8.494f, 23.213f)
            lineTo(20.354f, 11.354f)
            curveTo(20.549f, 11.158f, 20.549f, 10.842f, 20.354f, 10.646f)
            curveTo(20.158f, 10.451f, 19.842f, 10.451f, 19.646f, 10.646f)
            lineTo(7.787f, 22.506f)
            curveTo(6.073f, 24.22f, 6.073f, 26.999f, 7.787f, 28.713f)
            curveTo(9.501f, 30.427f, 12.28f, 30.427f, 13.994f, 28.713f)
            lineTo(27.783f, 14.925f)
            curveTo(30.74f, 11.968f, 30.74f, 7.174f, 27.784f, 4.217f)
            curveTo(24.827f, 1.261f, 20.033f, 1.261f, 17.077f, 4.217f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AttachPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Attach, contentDescription = null)
    }
}
