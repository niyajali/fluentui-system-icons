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

public val FluentUi.Filled.TextHeader2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 5f)
            curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
            verticalLineTo(18f)
            curveTo(12f, 18.552f, 11.552f, 19f, 11f, 19f)
            curveTo(10.448f, 19f, 10f, 18.552f, 10f, 18f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineTo(18f)
            curveTo(4f, 18.552f, 3.552f, 19f, 3f, 19f)
            curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
            verticalLineTo(6f)
            curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
            curveTo(3.552f, 5f, 4f, 5.448f, 4f, 6f)
            verticalLineTo(11f)
            horizontalLineTo(10f)
            verticalLineTo(6f)
            curveTo(10f, 5.448f, 10.448f, 5f, 11f, 5f)
            close()
            moveTo(17.75f, 4.5f)
            curveTo(20.097f, 4.5f, 22f, 6.403f, 22f, 8.75f)
            lineTo(21.993f, 8.983f)
            curveTo(21.929f, 10.135f, 21.398f, 11.053f, 20.734f, 11.806f)
            curveTo(20.05f, 12.582f, 19.149f, 13.264f, 18.369f, 13.879f)
            curveTo(17.044f, 14.924f, 16.025f, 15.827f, 15.654f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
            curveTo(22f, 18.552f, 21.552f, 19f, 21f, 19f)
            horizontalLineTo(14.5f)
            curveTo(13.948f, 19f, 13.5f, 18.552f, 13.5f, 18f)
            curveTo(13.5f, 15.203f, 15.558f, 13.549f, 17.131f, 12.309f)
            curveTo(17.976f, 11.642f, 18.7f, 11.09f, 19.234f, 10.483f)
            curveTo(19.682f, 9.976f, 19.933f, 9.499f, 19.988f, 8.977f)
            lineTo(20f, 8.75f)
            curveTo(20f, 7.507f, 18.993f, 6.5f, 17.75f, 6.5f)
            curveTo(16.688f, 6.5f, 15.795f, 7.237f, 15.561f, 8.229f)
            curveTo(15.434f, 8.767f, 14.895f, 9.1f, 14.357f, 8.974f)
            curveTo(13.82f, 8.847f, 13.487f, 8.308f, 13.613f, 7.771f)
            lineTo(13.659f, 7.596f)
            curveTo(14.162f, 5.81f, 15.802f, 4.5f, 17.75f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader2, contentDescription = null)
    }
}
