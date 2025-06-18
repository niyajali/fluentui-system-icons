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

public val FluentUi.Filled.Braces: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Braces",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 6f)
            curveTo(4f, 4.343f, 5.343f, 3f, 7f, 3f)
            curveTo(7.552f, 3f, 8f, 3.448f, 8f, 4f)
            curveTo(8f, 4.552f, 7.552f, 5f, 7f, 5f)
            curveTo(6.448f, 5f, 6f, 5.448f, 6f, 6f)
            verticalLineTo(9.938f)
            curveTo(6f, 10.727f, 5.693f, 11.457f, 5.18f, 12f)
            curveTo(5.693f, 12.543f, 6f, 13.273f, 6f, 14.062f)
            verticalLineTo(18f)
            curveTo(6f, 18.552f, 6.448f, 19f, 7f, 19f)
            curveTo(7.552f, 19f, 8f, 19.448f, 8f, 20f)
            curveTo(8f, 20.552f, 7.552f, 21f, 7f, 21f)
            curveTo(5.343f, 21f, 4f, 19.657f, 4f, 18f)
            verticalLineTo(14.062f)
            curveTo(4f, 13.603f, 3.688f, 13.203f, 3.243f, 13.091f)
            lineTo(2.757f, 12.97f)
            curveTo(2.312f, 12.859f, 2f, 12.459f, 2f, 12f)
            curveTo(2f, 11.541f, 2.312f, 11.141f, 2.757f, 11.03f)
            lineTo(3.243f, 10.909f)
            curveTo(3.688f, 10.797f, 4f, 10.397f, 4f, 9.938f)
            verticalLineTo(6f)
            close()
            moveTo(20f, 6f)
            curveTo(20f, 4.343f, 18.657f, 3f, 17f, 3f)
            curveTo(16.448f, 3f, 16f, 3.448f, 16f, 4f)
            curveTo(16f, 4.552f, 16.448f, 5f, 17f, 5f)
            curveTo(17.552f, 5f, 18f, 5.448f, 18f, 6f)
            verticalLineTo(9.938f)
            curveTo(18f, 10.727f, 18.307f, 11.457f, 18.82f, 12f)
            curveTo(18.307f, 12.543f, 18f, 13.273f, 18f, 14.062f)
            verticalLineTo(18f)
            curveTo(18f, 18.552f, 17.552f, 19f, 17f, 19f)
            curveTo(16.448f, 19f, 16f, 19.448f, 16f, 20f)
            curveTo(16f, 20.552f, 16.448f, 21f, 17f, 21f)
            curveTo(18.657f, 21f, 20f, 19.657f, 20f, 18f)
            verticalLineTo(14.062f)
            curveTo(20f, 13.603f, 20.312f, 13.203f, 20.757f, 13.091f)
            lineTo(21.243f, 12.97f)
            curveTo(21.688f, 12.859f, 22f, 12.459f, 22f, 12f)
            curveTo(22f, 11.541f, 21.688f, 11.141f, 21.243f, 11.03f)
            lineTo(20.757f, 10.909f)
            curveTo(20.312f, 10.797f, 20f, 10.397f, 20f, 9.938f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BracesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Braces, contentDescription = null)
    }
}
