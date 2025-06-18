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

public val FluentUi.Regular.ShieldTask: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShieldTask",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.757f, 9.303f)
            curveTo(17.062f, 9.023f, 17.083f, 8.549f, 16.803f, 8.243f)
            curveTo(16.523f, 7.938f, 16.049f, 7.917f, 15.743f, 8.197f)
            lineTo(10.273f, 13.212f)
            lineTo(8.28f, 11.22f)
            curveTo(7.987f, 10.927f, 7.513f, 10.927f, 7.22f, 11.22f)
            curveTo(6.927f, 11.513f, 6.927f, 11.987f, 7.22f, 12.28f)
            lineTo(9.72f, 14.78f)
            curveTo(10.004f, 15.064f, 10.461f, 15.074f, 10.757f, 14.803f)
            lineTo(16.757f, 9.303f)
            close()
            moveTo(20.25f, 5f)
            curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
            curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
            curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            verticalLineTo(11f)
            curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
            curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
            curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
            verticalLineTo(5.75f)
            curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
            close()
            moveTo(4.5f, 6.478f)
            curveTo(7.077f, 6.326f, 9.581f, 5.388f, 12f, 3.678f)
            curveTo(14.419f, 5.388f, 16.923f, 6.326f, 19.5f, 6.478f)
            verticalLineTo(11f)
            curveTo(19.5f, 15.256f, 17.047f, 18.379f, 12f, 20.442f)
            curveTo(6.953f, 18.379f, 4.5f, 15.256f, 4.5f, 11f)
            verticalLineTo(6.478f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldTaskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShieldTask, contentDescription = null)
    }
}
