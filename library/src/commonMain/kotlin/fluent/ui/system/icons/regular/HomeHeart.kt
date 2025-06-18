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

public val FluentUi.Regular.HomeHeart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeHeart",
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
            verticalLineTo(11.261f)
            curveTo(20.515f, 11.086f, 20.007f, 10.999f, 19.5f, 11f)
            verticalLineTo(9.944f)
            curveTo(19.5f, 9.723f, 19.403f, 9.513f, 19.233f, 9.371f)
            lineTo(12.483f, 3.679f)
            curveTo(12.204f, 3.443f, 11.796f, 3.443f, 11.517f, 3.679f)
            lineTo(4.767f, 9.371f)
            curveTo(4.598f, 9.513f, 4.5f, 9.723f, 4.5f, 9.944f)
            lineTo(4.5f, 19.254f)
            curveTo(4.5f, 19.392f, 4.612f, 19.504f, 4.75f, 19.504f)
            horizontalLineTo(11.919f)
            lineTo(13.368f, 21.004f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 21.004f, 3f, 20.22f, 3f, 19.254f)
            verticalLineTo(9.944f)
            curveTo(3f, 9.281f, 3.293f, 8.652f, 3.8f, 8.224f)
            lineTo(10.55f, 2.532f)
            close()
            moveTo(21.977f, 18.173f)
            curveTo(23.341f, 16.761f, 23.341f, 14.471f, 21.977f, 13.059f)
            curveTo(21.828f, 12.905f, 21.668f, 12.767f, 21.501f, 12.646f)
            curveTo(20.139f, 11.664f, 18.251f, 11.801f, 17.036f, 13.059f)
            horizontalLineTo(16.964f)
            curveTo(15.892f, 11.949f, 14.296f, 11.712f, 13f, 12.346f)
            curveTo(12.375f, 12.652f, 11.85f, 13.149f, 11.5f, 13.75f)
            curveTo(10.69f, 15.14f, 10.864f, 16.973f, 12.023f, 18.173f)
            lineTo(16.465f, 22.771f)
            curveTo(16.761f, 23.076f, 17.239f, 23.076f, 17.535f, 22.771f)
            lineTo(21.977f, 18.173f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomeHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HomeHeart, contentDescription = null)
    }
}
