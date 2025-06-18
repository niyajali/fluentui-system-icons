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

public val FluentIcons.Regular.HomePerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomePerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.45f, 2.532f)
            curveTo(12.613f, 1.825f, 11.387f, 1.825f, 10.55f, 2.532f)
            lineTo(3.8f, 8.224f)
            curveTo(3.293f, 8.652f, 3f, 9.281f, 3f, 9.944f)
            verticalLineTo(19.254f)
            curveTo(3f, 20.22f, 3.783f, 21.004f, 4.75f, 21.004f)
            horizontalLineTo(8.25f)
            curveTo(9.217f, 21.004f, 10f, 20.22f, 10f, 19.254f)
            lineTo(10f, 14.247f)
            curveTo(10f, 14.109f, 10.112f, 13.997f, 10.25f, 13.997f)
            horizontalLineTo(13.75f)
            curveTo(13.888f, 13.997f, 14f, 14.109f, 14f, 14.247f)
            lineTo(14f, 17.64f)
            curveTo(14.415f, 17.295f, 14.932f, 17.069f, 15.5f, 17.013f)
            lineTo(15.5f, 16.304f)
            curveTo(15.183f, 15.777f, 15f, 15.16f, 15f, 14.5f)
            curveTo(15f, 14.074f, 15.076f, 13.667f, 15.215f, 13.289f)
            curveTo(14.903f, 12.812f, 14.363f, 12.497f, 13.75f, 12.497f)
            horizontalLineTo(10.25f)
            curveTo(9.283f, 12.497f, 8.5f, 13.28f, 8.5f, 14.247f)
            lineTo(8.5f, 19.254f)
            curveTo(8.5f, 19.392f, 8.388f, 19.504f, 8.25f, 19.504f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 19.504f, 4.5f, 19.392f, 4.5f, 19.254f)
            lineTo(4.5f, 9.944f)
            curveTo(4.5f, 9.723f, 4.598f, 9.513f, 4.767f, 9.371f)
            lineTo(11.517f, 3.679f)
            curveTo(11.796f, 3.443f, 12.204f, 3.443f, 12.483f, 3.679f)
            lineTo(19.233f, 9.371f)
            curveTo(19.403f, 9.513f, 19.5f, 9.723f, 19.5f, 9.944f)
            verticalLineTo(11.145f)
            curveTo(20.076f, 11.316f, 20.59f, 11.632f, 21f, 12.05f)
            verticalLineTo(9.944f)
            curveTo(21f, 9.281f, 20.707f, 8.652f, 20.201f, 8.224f)
            lineTo(13.45f, 2.532f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HomePerson, contentDescription = null)
    }
}
