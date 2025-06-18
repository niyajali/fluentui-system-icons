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

public val FluentIcons.Filled.BowlChopsticks: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BowlChopsticks",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.376f, 2.1f)
            curveTo(5.735f, 1.893f, 6.193f, 2.017f, 6.4f, 2.376f)
            lineTo(11.365f, 11f)
            horizontalLineTo(13.635f)
            lineTo(9.1f, 3.124f)
            curveTo(8.893f, 2.765f, 9.017f, 2.307f, 9.376f, 2.1f)
            curveTo(9.735f, 1.893f, 10.193f, 2.017f, 10.4f, 2.376f)
            lineTo(15.365f, 11f)
            horizontalLineTo(21.298f)
            curveTo(21.686f, 11f, 22f, 11.314f, 22f, 11.702f)
            verticalLineTo(12f)
            curveTo(22f, 13.045f, 21.84f, 14.053f, 21.542f, 15f)
            horizontalLineTo(2.458f)
            curveTo(2.16f, 14.053f, 2f, 13.045f, 2f, 12f)
            verticalLineTo(11.702f)
            curveTo(2f, 11.314f, 2.314f, 11f, 2.702f, 11f)
            horizontalLineTo(9.635f)
            lineTo(5.1f, 3.124f)
            curveTo(4.893f, 2.765f, 5.017f, 2.307f, 5.376f, 2.1f)
            close()
            moveTo(3.067f, 16.5f)
            curveTo(4.714f, 19.763f, 8.096f, 22f, 12f, 22f)
            curveTo(15.904f, 22f, 19.286f, 19.763f, 20.933f, 16.5f)
            horizontalLineTo(3.067f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BowlChopsticksPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BowlChopsticks, contentDescription = null)
    }
}
