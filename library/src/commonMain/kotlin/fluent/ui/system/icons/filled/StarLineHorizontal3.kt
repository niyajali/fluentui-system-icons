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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.StarLineHorizontal3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarLineHorizontal3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.788f, 3.102f)
            curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
            lineTo(14.896f, 6.527f)
            curveTo(13.821f, 6.697f, 13f, 7.627f, 13f, 8.75f)
            curveTo(13f, 9.62f, 13.495f, 10.376f, 14.218f, 10.75f)
            curveTo(13.495f, 11.124f, 13f, 11.879f, 13f, 12.75f)
            curveTo(13f, 13.62f, 13.495f, 14.376f, 14.218f, 14.75f)
            curveTo(13.495f, 15.124f, 13f, 15.879f, 13f, 16.75f)
            curveTo(13f, 17.257f, 13.168f, 17.725f, 13.451f, 18.101f)
            lineTo(7.283f, 21.342f)
            curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
            lineTo(6.224f, 14.668f)
            lineTo(2.409f, 10.949f)
            curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
            lineTo(8.43f, 7.88f)
            lineTo(10.788f, 3.102f)
            close()
            moveTo(14.5f, 16.75f)
            curveTo(14.5f, 16.335f, 14.836f, 16f, 15.25f, 16f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 16f, 22f, 16.335f, 22f, 16.75f)
            curveTo(22f, 17.164f, 21.664f, 17.5f, 21.25f, 17.5f)
            horizontalLineTo(15.25f)
            curveTo(15.097f, 17.5f, 14.954f, 17.454f, 14.835f, 17.374f)
            curveTo(14.633f, 17.24f, 14.5f, 17.01f, 14.5f, 16.75f)
            close()
            moveTo(14.5f, 12.75f)
            curveTo(14.5f, 12.335f, 14.836f, 12f, 15.25f, 12f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 12f, 22f, 12.335f, 22f, 12.75f)
            curveTo(22f, 13.164f, 21.664f, 13.5f, 21.25f, 13.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 13.5f, 14.5f, 13.164f, 14.5f, 12.75f)
            close()
            moveTo(14.5f, 8.75f)
            curveTo(14.5f, 8.335f, 14.836f, 8f, 15.25f, 8f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 8f, 22f, 8.335f, 22f, 8.75f)
            curveTo(22f, 9.164f, 21.664f, 9.5f, 21.25f, 9.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 9.5f, 14.5f, 9.164f, 14.5f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarLineHorizontal3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarLineHorizontal3, contentDescription = null)
    }
}
