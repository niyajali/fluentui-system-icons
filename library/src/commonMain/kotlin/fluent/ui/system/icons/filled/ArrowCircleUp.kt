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

public val FluentIcons.Filled.ArrowCircleUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.001f, 12f)
            curveTo(22.001f, 6.477f, 17.524f, 2f, 12.001f, 2f)
            curveTo(6.478f, 2f, 2.001f, 6.477f, 2.001f, 12f)
            curveTo(2.001f, 17.523f, 6.478f, 22f, 12.001f, 22f)
            curveTo(17.524f, 22f, 22.001f, 17.523f, 22.001f, 12f)
            close()
            moveTo(7.47f, 12.28f)
            curveTo(7.204f, 12.014f, 7.18f, 11.597f, 7.398f, 11.304f)
            lineTo(7.47f, 11.219f)
            lineTo(11.471f, 7.219f)
            curveTo(11.737f, 6.952f, 12.154f, 6.928f, 12.448f, 7.146f)
            lineTo(12.532f, 7.219f)
            lineTo(16.532f, 11.22f)
            curveTo(16.825f, 11.513f, 16.825f, 11.988f, 16.532f, 12.281f)
            curveTo(16.265f, 12.547f, 15.849f, 12.571f, 15.555f, 12.353f)
            lineTo(15.471f, 12.281f)
            lineTo(12.75f, 9.559f)
            lineTo(12.751f, 16.25f)
            curveTo(12.751f, 16.63f, 12.469f, 16.944f, 12.102f, 16.994f)
            lineTo(12.001f, 17f)
            curveTo(11.621f, 17f, 11.307f, 16.718f, 11.257f, 16.352f)
            lineTo(11.251f, 16.25f)
            lineTo(11.25f, 9.561f)
            lineTo(8.531f, 12.28f)
            curveTo(8.265f, 12.546f, 7.848f, 12.571f, 7.554f, 12.353f)
            lineTo(7.47f, 12.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCircleUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCircleUp, contentDescription = null)
    }
}
