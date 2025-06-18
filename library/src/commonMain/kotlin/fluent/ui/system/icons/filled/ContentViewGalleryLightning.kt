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

public val FluentUi.Filled.ContentViewGalleryLightning: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ContentViewGalleryLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                horizontalLineTo(14.5f)
                verticalLineTo(12.84f)
                lineTo(12.14f, 17.862f)
                curveTo(11.672f, 18.857f, 12.398f, 20f, 13.497f, 20f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(16.317f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(8.5f)
                horizontalLineTo(16f)
                verticalLineTo(11.034f)
                curveTo(16.103f, 11.012f, 16.209f, 11f, 16.317f, 11f)
                close()
                moveTo(16f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
                moveTo(6f, 13.75f)
                curveTo(6f, 14.164f, 6.336f, 14.5f, 6.75f, 14.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 14.5f, 12f, 14.164f, 12f, 13.75f)
                curveTo(12f, 13.336f, 11.664f, 13f, 11.25f, 13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
                close()
                moveTo(7.25f, 6.5f)
                curveTo(6.56f, 6.5f, 6f, 7.06f, 6f, 7.75f)
                verticalLineTo(10.25f)
                curveTo(6f, 10.94f, 6.56f, 11.5f, 7.25f, 11.5f)
                horizontalLineTo(10.75f)
                curveTo(11.44f, 11.5f, 12f, 10.94f, 12f, 10.25f)
                verticalLineTo(7.75f)
                curveTo(12f, 7.06f, 11.44f, 6.5f, 10.75f, 6.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(7.5f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                horizontalLineTo(7.5f)
                close()
                moveTo(6f, 16.75f)
                curveTo(6f, 17.164f, 6.336f, 17.5f, 6.75f, 17.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 17.5f, 12f, 17.164f, 12f, 16.75f)
                curveTo(12f, 16.336f, 11.664f, 16f, 11.25f, 16f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 16f, 6f, 16.336f, 6f, 16.75f)
                close()
                moveTo(16.317f, 12f)
                horizontalLineTo(21.145f)
                curveTo(21.527f, 12f, 21.768f, 12.412f, 21.581f, 12.745f)
                lineTo(19.75f, 16f)
                horizontalLineTo(21.246f)
                curveTo(21.891f, 16f, 22.235f, 16.759f, 21.81f, 17.244f)
                lineTo(16.986f, 22.752f)
                curveTo(16.482f, 23.328f, 15.544f, 22.837f, 15.729f, 22.094f)
                lineTo(16.5f, 19f)
                horizontalLineTo(13.497f)
                curveTo(13.131f, 19f, 12.889f, 18.619f, 13.045f, 18.287f)
                lineTo(15.865f, 12.287f)
                curveTo(15.947f, 12.112f, 16.124f, 12f, 16.317f, 12f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ContentViewGalleryLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ContentViewGalleryLightning, contentDescription = null)
    }
}
