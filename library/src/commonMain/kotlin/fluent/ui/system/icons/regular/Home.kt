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

public val FluentUi.Regular.Home: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Home",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.55f, 2.532f)
            curveTo(11.387f, 1.825f, 12.613f, 1.825f, 13.45f, 2.532f)
            lineTo(20.201f, 8.224f)
            curveTo(20.707f, 8.652f, 21f, 9.281f, 21f, 9.944f)
            lineTo(21f, 19.254f)
            curveTo(21f, 20.22f, 20.216f, 21.004f, 19.25f, 21.004f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 21.004f, 14f, 20.22f, 14f, 19.254f)
            lineTo(14f, 14.247f)
            curveTo(14f, 14.109f, 13.888f, 13.997f, 13.75f, 13.997f)
            horizontalLineTo(10.25f)
            curveTo(10.112f, 13.997f, 10f, 14.109f, 10f, 14.247f)
            lineTo(10f, 19.254f)
            curveTo(10f, 20.22f, 9.217f, 21.004f, 8.25f, 21.004f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 21.004f, 3f, 20.22f, 3f, 19.254f)
            verticalLineTo(9.944f)
            curveTo(3f, 9.281f, 3.293f, 8.652f, 3.8f, 8.224f)
            lineTo(10.55f, 2.532f)
            close()
            moveTo(12.483f, 3.679f)
            curveTo(12.204f, 3.443f, 11.796f, 3.443f, 11.517f, 3.679f)
            lineTo(4.767f, 9.371f)
            curveTo(4.598f, 9.513f, 4.5f, 9.723f, 4.5f, 9.944f)
            lineTo(4.5f, 19.254f)
            curveTo(4.5f, 19.392f, 4.612f, 19.504f, 4.75f, 19.504f)
            horizontalLineTo(8.25f)
            curveTo(8.388f, 19.504f, 8.5f, 19.392f, 8.5f, 19.254f)
            lineTo(8.5f, 14.247f)
            curveTo(8.5f, 13.28f, 9.283f, 12.497f, 10.25f, 12.497f)
            horizontalLineTo(13.75f)
            curveTo(14.717f, 12.497f, 15.5f, 13.28f, 15.5f, 14.247f)
            lineTo(15.5f, 19.254f)
            curveTo(15.5f, 19.392f, 15.612f, 19.504f, 15.75f, 19.504f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 19.504f, 19.5f, 19.392f, 19.5f, 19.254f)
            lineTo(19.5f, 9.944f)
            curveTo(19.5f, 9.723f, 19.403f, 9.513f, 19.233f, 9.371f)
            lineTo(12.483f, 3.679f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Home, contentDescription = null)
    }
}
