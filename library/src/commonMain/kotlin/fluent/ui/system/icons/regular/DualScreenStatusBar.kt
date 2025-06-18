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

public val FluentUi.Regular.DualScreenStatusBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenStatusBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.748f, 4.002f)
            lineTo(12.747f, 4.004f)
            lineTo(20.245f, 4.004f)
            curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
            horizontalLineTo(11.248f)
            lineTo(11.247f, 19.997f)
            lineTo(3.75f, 19.997f)
            curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(12.748f)
            close()
            moveTo(20.245f, 5.504f)
            horizontalLineTo(12.748f)
            verticalLineTo(18.5f)
            horizontalLineTo(20.245f)
            curveTo(20.383f, 18.5f, 20.495f, 18.388f, 20.495f, 18.25f)
            verticalLineTo(5.754f)
            curveTo(20.495f, 5.616f, 20.383f, 5.504f, 20.245f, 5.504f)
            close()
            moveTo(11.248f, 5.502f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 5.502f, 3.5f, 5.614f, 3.5f, 5.752f)
            verticalLineTo(18.247f)
            curveTo(3.5f, 18.385f, 3.612f, 18.497f, 3.75f, 18.497f)
            horizontalLineTo(11.248f)
            verticalLineTo(5.502f)
            close()
            moveTo(18.75f, 6.501f)
            curveTo(19.164f, 6.501f, 19.5f, 6.837f, 19.5f, 7.251f)
            curveTo(19.5f, 7.665f, 19.164f, 8.001f, 18.75f, 8.001f)
            horizontalLineTo(14.248f)
            curveTo(13.834f, 8.001f, 13.498f, 7.665f, 13.498f, 7.251f)
            curveTo(13.498f, 6.837f, 13.834f, 6.501f, 14.248f, 6.501f)
            horizontalLineTo(18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenStatusBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DualScreenStatusBar, contentDescription = null)
    }
}
