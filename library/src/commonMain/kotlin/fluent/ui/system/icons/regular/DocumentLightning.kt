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

public val FluentIcons.Regular.DocumentLightning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentLightning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(11.034f)
            curveTo(4.103f, 11.012f, 4.209f, 11f, 4.317f, 11f)
            horizontalLineTo(5.5f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(8.288f)
            lineTo(6.974f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(13.586f, 2.586f)
            curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(17.379f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(4.621f)
            lineTo(17.379f, 8.5f)
            close()
            moveTo(4.318f, 12f)
            horizontalLineTo(9.145f)
            curveTo(9.528f, 12f, 9.769f, 12.412f, 9.581f, 12.745f)
            lineTo(7.75f, 16f)
            horizontalLineTo(9.246f)
            curveTo(9.891f, 16f, 10.235f, 16.759f, 9.811f, 17.244f)
            lineTo(4.987f, 22.752f)
            curveTo(4.482f, 23.328f, 3.544f, 22.837f, 3.729f, 22.094f)
            lineTo(4.5f, 19f)
            horizontalLineTo(1.498f)
            curveTo(1.131f, 19f, 0.889f, 18.619f, 1.045f, 18.287f)
            lineTo(3.865f, 12.287f)
            curveTo(3.948f, 12.112f, 4.124f, 12f, 4.318f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentLightning, contentDescription = null)
    }
}
