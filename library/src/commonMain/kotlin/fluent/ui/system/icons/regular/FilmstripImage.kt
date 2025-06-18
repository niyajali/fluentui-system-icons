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

public val FluentIcons.Regular.FilmstripImage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FilmstripImage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(14.75f)
            curveTo(16.545f, 2f, 18f, 3.455f, 18f, 5.25f)
            verticalLineTo(8f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.25f)
            curveTo(16.5f, 4.284f, 15.717f, 3.5f, 14.75f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(12.75f)
            curveTo(3.5f, 13.717f, 4.284f, 14.5f, 5.25f, 14.5f)
            horizontalLineTo(8f)
            verticalLineTo(16f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 16f, 2f, 14.545f, 2f, 12.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(19f, 13.25f)
            curveTo(19f, 13.94f, 18.44f, 14.5f, 17.75f, 14.5f)
            curveTo(17.06f, 14.5f, 16.5f, 13.94f, 16.5f, 13.25f)
            curveTo(16.5f, 12.56f, 17.06f, 12f, 17.75f, 12f)
            curveTo(18.44f, 12f, 19f, 12.56f, 19f, 13.25f)
            close()
            moveTo(9f, 12.25f)
            curveTo(9f, 10.455f, 10.455f, 9f, 12.25f, 9f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 9f, 22f, 10.455f, 22f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(12.25f)
            curveTo(10.455f, 22f, 9f, 20.545f, 9f, 18.75f)
            verticalLineTo(12.25f)
            close()
            moveTo(12.25f, 10.5f)
            curveTo(11.283f, 10.5f, 10.5f, 11.283f, 10.5f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(10.5f, 18.939f, 10.53f, 19.122f, 10.586f, 19.292f)
            lineTo(13.98f, 16.107f)
            curveTo(14.845f, 15.298f, 16.189f, 15.298f, 17.054f, 16.107f)
            lineTo(20.425f, 19.26f)
            curveTo(20.474f, 19.098f, 20.5f, 18.927f, 20.5f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(20.5f, 11.283f, 19.716f, 10.5f, 18.75f, 10.5f)
            horizontalLineTo(12.25f)
            close()
            moveTo(12.25f, 20.5f)
            horizontalLineTo(18.75f)
            curveTo(18.985f, 20.5f, 19.21f, 20.454f, 19.415f, 20.369f)
            lineTo(16.029f, 17.202f)
            curveTo(15.741f, 16.933f, 15.293f, 16.933f, 15.005f, 17.202f)
            lineTo(11.617f, 20.382f)
            curveTo(11.813f, 20.458f, 12.027f, 20.5f, 12.25f, 20.5f)
            close()
            moveTo(5.75f, 5f)
            curveTo(6.164f, 5f, 6.5f, 5.336f, 6.5f, 5.75f)
            verticalLineTo(6.25f)
            curveTo(6.5f, 6.664f, 6.164f, 7f, 5.75f, 7f)
            curveTo(5.336f, 7f, 5f, 6.664f, 5f, 6.25f)
            verticalLineTo(5.75f)
            curveTo(5f, 5.336f, 5.336f, 5f, 5.75f, 5f)
            close()
            moveTo(6.5f, 8.75f)
            curveTo(6.5f, 8.336f, 6.164f, 8f, 5.75f, 8f)
            curveTo(5.336f, 8f, 5f, 8.336f, 5f, 8.75f)
            verticalLineTo(9.25f)
            curveTo(5f, 9.664f, 5.336f, 10f, 5.75f, 10f)
            curveTo(6.164f, 10f, 6.5f, 9.664f, 6.5f, 9.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(14.25f, 5f)
            curveTo(14.664f, 5f, 15f, 5.336f, 15f, 5.75f)
            verticalLineTo(6.25f)
            curveTo(15f, 6.664f, 14.664f, 7f, 14.25f, 7f)
            curveTo(13.836f, 7f, 13.5f, 6.664f, 13.5f, 6.25f)
            verticalLineTo(5.75f)
            curveTo(13.5f, 5.336f, 13.836f, 5f, 14.25f, 5f)
            close()
            moveTo(6.5f, 11.75f)
            curveTo(6.5f, 11.336f, 6.164f, 11f, 5.75f, 11f)
            curveTo(5.336f, 11f, 5f, 11.336f, 5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5f, 12.664f, 5.336f, 13f, 5.75f, 13f)
            curveTo(6.164f, 13f, 6.5f, 12.664f, 6.5f, 12.25f)
            verticalLineTo(11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilmstripImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FilmstripImage, contentDescription = null)
    }
}
