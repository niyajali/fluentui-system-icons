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

public val FluentUi.Regular.ArrowExpand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExpand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.596f, 15.35f)
            curveTo(7.888f, 15.057f, 8.363f, 15.057f, 8.656f, 15.35f)
            curveTo(8.949f, 15.643f, 8.949f, 16.117f, 8.656f, 16.41f)
            lineTo(5.561f, 19.504f)
            horizontalLineTo(7.75f)
            curveTo(8.13f, 19.504f, 8.443f, 19.786f, 8.493f, 20.152f)
            lineTo(8.5f, 20.254f)
            curveTo(8.5f, 20.668f, 8.164f, 21.004f, 7.75f, 21.004f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21.004f, 3f, 20.668f, 3f, 20.254f)
            verticalLineTo(16.254f)
            curveTo(3f, 15.84f, 3.336f, 15.504f, 3.75f, 15.504f)
            curveTo(4.164f, 15.504f, 4.5f, 15.84f, 4.5f, 16.254f)
            verticalLineTo(18.443f)
            lineTo(7.596f, 15.35f)
            close()
            moveTo(16.255f, 21.004f)
            curveTo(15.841f, 21.004f, 15.505f, 20.668f, 15.505f, 20.254f)
            curveTo(15.505f, 19.84f, 15.841f, 19.504f, 16.255f, 19.504f)
            horizontalLineTo(18.441f)
            lineTo(15.349f, 16.41f)
            curveTo(15.083f, 16.144f, 15.059f, 15.727f, 15.277f, 15.434f)
            lineTo(15.35f, 15.349f)
            curveTo(15.643f, 15.057f, 16.118f, 15.057f, 16.41f, 15.35f)
            lineTo(19.505f, 18.446f)
            verticalLineTo(16.254f)
            curveTo(19.505f, 15.875f, 19.787f, 15.561f, 20.153f, 15.511f)
            lineTo(20.255f, 15.504f)
            curveTo(20.669f, 15.504f, 21.005f, 15.84f, 21.005f, 16.254f)
            verticalLineTo(20.254f)
            curveTo(21.005f, 20.668f, 20.669f, 21.004f, 20.255f, 21.004f)
            horizontalLineTo(16.255f)
            close()
            moveTo(7.75f, 3f)
            curveTo(8.164f, 3f, 8.5f, 3.336f, 8.5f, 3.75f)
            curveTo(8.5f, 4.164f, 8.164f, 4.5f, 7.75f, 4.5f)
            horizontalLineTo(5.563f)
            lineTo(8.656f, 7.595f)
            curveTo(8.922f, 7.861f, 8.946f, 8.278f, 8.728f, 8.571f)
            lineTo(8.655f, 8.656f)
            curveTo(8.362f, 8.948f, 7.887f, 8.948f, 7.594f, 8.655f)
            lineTo(4.5f, 5.558f)
            verticalLineTo(7.75f)
            curveTo(4.5f, 8.13f, 4.218f, 8.443f, 3.852f, 8.493f)
            lineTo(3.75f, 8.5f)
            curveTo(3.336f, 8.5f, 3f, 8.164f, 3f, 7.75f)
            verticalLineTo(3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineTo(7.75f)
            close()
            moveTo(20.255f, 3f)
            curveTo(20.669f, 3f, 21.005f, 3.336f, 21.005f, 3.75f)
            verticalLineTo(7.75f)
            curveTo(21.005f, 8.164f, 20.669f, 8.5f, 20.255f, 8.5f)
            curveTo(19.841f, 8.5f, 19.505f, 8.164f, 19.505f, 7.75f)
            verticalLineTo(5.559f)
            lineTo(16.41f, 8.655f)
            curveTo(16.144f, 8.922f, 15.728f, 8.946f, 15.434f, 8.728f)
            lineTo(15.35f, 8.655f)
            curveTo(15.057f, 8.363f, 15.057f, 7.888f, 15.35f, 7.595f)
            lineTo(18.442f, 4.5f)
            horizontalLineTo(16.255f)
            curveTo(15.875f, 4.5f, 15.561f, 4.218f, 15.512f, 3.852f)
            lineTo(15.505f, 3.75f)
            curveTo(15.505f, 3.336f, 15.841f, 3f, 16.255f, 3f)
            horizontalLineTo(20.255f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowExpand, contentDescription = null)
    }
}
