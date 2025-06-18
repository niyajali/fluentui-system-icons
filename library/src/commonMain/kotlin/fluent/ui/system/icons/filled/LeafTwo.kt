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

public val FluentIcons.Filled.LeafTwo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafTwo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.707f, 2f)
            curveTo(2.766f, 2f, 2.002f, 2.763f, 2.002f, 3.705f)
            verticalLineTo(8f)
            curveTo(2.002f, 10.974f, 4.166f, 13.442f, 7.005f, 13.917f)
            curveTo(7.021f, 12.267f, 7.536f, 10.736f, 8.408f, 9.469f)
            lineTo(6.22f, 7.28f)
            curveTo(5.927f, 6.987f, 5.927f, 6.513f, 6.22f, 6.22f)
            curveTo(6.513f, 5.927f, 6.987f, 5.927f, 7.28f, 6.22f)
            lineTo(9.374f, 8.313f)
            curveTo(10.526f, 7.171f, 12.024f, 6.378f, 13.696f, 6.103f)
            curveTo(12.902f, 3.719f, 10.653f, 2f, 8.002f, 2f)
            horizontalLineTo(3.707f)
            close()
            moveTo(9.554f, 18.387f)
            lineTo(7.22f, 20.719f)
            curveTo(6.927f, 21.012f, 6.927f, 21.487f, 7.22f, 21.78f)
            curveTo(7.512f, 22.073f, 7.987f, 22.073f, 8.28f, 21.78f)
            lineTo(10.615f, 19.447f)
            curveTo(11.815f, 20.415f, 13.342f, 20.995f, 15.004f, 20.995f)
            curveTo(18.87f, 20.995f, 22.003f, 17.861f, 22.003f, 13.996f)
            verticalLineTo(8.748f)
            curveTo(22.003f, 7.781f, 21.22f, 6.998f, 20.253f, 6.998f)
            horizontalLineTo(15.004f)
            curveTo(11.139f, 6.998f, 8.006f, 10.131f, 8.006f, 13.996f)
            curveTo(8.006f, 15.659f, 8.585f, 17.186f, 9.554f, 18.387f)
            close()
            moveTo(15.78f, 14.285f)
            lineTo(11.685f, 18.38f)
            curveTo(11.285f, 18.077f, 10.927f, 17.72f, 10.624f, 17.32f)
            lineTo(14.719f, 13.224f)
            curveTo(15.012f, 12.931f, 15.487f, 12.931f, 15.78f, 13.224f)
            curveTo(16.073f, 13.517f, 16.073f, 13.992f, 15.78f, 14.285f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LeafTwoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LeafTwo, contentDescription = null)
    }
}
