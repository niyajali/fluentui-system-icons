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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowMinimize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMinimize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.778f, 2.222f)
            curveTo(22.044f, 2.488f, 22.068f, 2.904f, 21.85f, 3.198f)
            lineTo(21.778f, 3.282f)
            lineTo(15.555f, 9.506f)
            lineTo(21.248f, 9.507f)
            curveTo(21.627f, 9.507f, 21.941f, 9.789f, 21.991f, 10.155f)
            lineTo(21.998f, 10.257f)
            curveTo(21.998f, 10.637f, 21.715f, 10.95f, 21.349f, 11f)
            lineTo(21.248f, 11.007f)
            lineTo(13.697f, 11.005f)
            lineTo(13.682f, 11.003f)
            curveTo(13.614f, 10.998f, 13.549f, 10.983f, 13.487f, 10.961f)
            lineTo(13.389f, 10.915f)
            curveTo(13.184f, 10.805f, 13.037f, 10.602f, 13.003f, 10.362f)
            lineTo(12.996f, 10.257f)
            verticalLineTo(2.753f)
            curveTo(12.996f, 2.339f, 13.332f, 2.003f, 13.746f, 2.003f)
            curveTo(14.126f, 2.003f, 14.44f, 2.285f, 14.489f, 2.651f)
            lineTo(14.496f, 2.753f)
            lineTo(14.496f, 8.444f)
            lineTo(20.718f, 2.222f)
            curveTo(21.01f, 1.929f, 21.485f, 1.929f, 21.778f, 2.222f)
            close()
            moveTo(11.002f, 13.754f)
            verticalLineTo(21.258f)
            curveTo(11.002f, 21.672f, 10.667f, 22.008f, 10.252f, 22.008f)
            curveTo(9.873f, 22.008f, 9.559f, 21.726f, 9.509f, 21.36f)
            lineTo(9.502f, 21.258f)
            lineTo(9.502f, 15.563f)
            lineTo(3.28f, 21.779f)
            curveTo(2.988f, 22.072f, 2.513f, 22.072f, 2.22f, 21.779f)
            curveTo(1.953f, 21.513f, 1.929f, 21.096f, 2.147f, 20.802f)
            lineTo(2.22f, 20.718f)
            lineTo(8.44f, 14.504f)
            lineTo(2.751f, 14.504f)
            curveTo(2.371f, 14.504f, 2.057f, 14.222f, 2.008f, 13.856f)
            lineTo(2.001f, 13.754f)
            curveTo(2.001f, 13.34f, 2.337f, 13.004f, 2.751f, 13.004f)
            lineTo(10.305f, 13.006f)
            lineTo(10.379f, 13.015f)
            lineTo(10.476f, 13.038f)
            lineTo(10.529f, 13.057f)
            lineTo(10.615f, 13.098f)
            lineTo(10.704f, 13.155f)
            curveTo(10.76f, 13.197f, 10.809f, 13.247f, 10.852f, 13.303f)
            lineTo(10.918f, 13.409f)
            lineTo(10.959f, 13.502f)
            lineTo(10.981f, 13.573f)
            lineTo(10.992f, 13.628f)
            lineTo(10.998f, 13.686f)
            lineTo(10.999f, 13.677f)
            lineTo(11.002f, 13.754f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowMinimize, contentDescription = null)
    }
}
