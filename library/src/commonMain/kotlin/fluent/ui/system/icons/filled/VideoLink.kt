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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.VideoLink: ImageVector
    get() {
        if (_VideoLink != null) {
            return _VideoLink!!
        }
        _VideoLink = ImageVector.Builder(
            name = "Filled.VideoLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 7.25f)
                curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
                horizontalLineTo(12.75f)
                curveTo(14.545f, 4f, 16f, 5.455f, 16f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(16f, 16.481f, 14.647f, 17.896f, 12.94f, 17.994f)
                curveTo(12.578f, 15.73f, 10.616f, 14f, 8.25f, 14f)
                horizontalLineTo(4.75f)
                curveTo(4.132f, 14f, 3.542f, 14.118f, 3f, 14.333f)
                verticalLineTo(7.25f)
                close()
                moveTo(20.257f, 16.688f)
                lineTo(17f, 14.439f)
                verticalLineTo(7.562f)
                lineTo(20.257f, 5.313f)
                curveTo(21.418f, 4.511f, 23.002f, 5.342f, 23.002f, 6.753f)
                verticalLineTo(15.248f)
                curveTo(23.002f, 16.659f, 21.418f, 17.49f, 20.257f, 16.688f)
                close()
                moveTo(12f, 18.75f)
                curveTo(12f, 16.679f, 10.321f, 15f, 8.25f, 15f)
                lineTo(8.148f, 15.007f)
                curveTo(7.782f, 15.057f, 7.5f, 15.37f, 7.5f, 15.75f)
                curveTo(7.5f, 16.164f, 7.836f, 16.5f, 8.25f, 16.5f)
                lineTo(8.404f, 16.505f)
                curveTo(9.575f, 16.584f, 10.5f, 17.559f, 10.5f, 18.75f)
                curveTo(10.5f, 19.993f, 9.493f, 21f, 8.25f, 21f)
                lineTo(8.247f, 21.005f)
                lineTo(8.145f, 21.012f)
                curveTo(7.779f, 21.063f, 7.498f, 21.378f, 7.5f, 21.758f)
                curveTo(7.502f, 22.172f, 7.839f, 22.507f, 8.253f, 22.505f)
                verticalLineTo(22.5f)
                lineTo(8.452f, 22.495f)
                curveTo(10.428f, 22.391f, 12f, 20.754f, 12f, 18.75f)
                close()
                moveTo(5.5f, 15.75f)
                curveTo(5.5f, 15.336f, 5.164f, 15f, 4.75f, 15f)
                lineTo(4.551f, 15.005f)
                curveTo(2.572f, 15.109f, 1f, 16.746f, 1f, 18.75f)
                curveTo(1f, 20.821f, 2.679f, 22.5f, 4.75f, 22.5f)
                lineTo(4.852f, 22.493f)
                curveTo(5.218f, 22.444f, 5.5f, 22.13f, 5.5f, 21.75f)
                curveTo(5.5f, 21.336f, 5.164f, 21f, 4.75f, 21f)
                lineTo(4.596f, 20.995f)
                curveTo(3.425f, 20.916f, 2.5f, 19.941f, 2.5f, 18.75f)
                curveTo(2.5f, 17.507f, 3.507f, 16.5f, 4.75f, 16.5f)
                lineTo(4.852f, 16.493f)
                curveTo(5.218f, 16.444f, 5.5f, 16.13f, 5.5f, 15.75f)
                close()
                moveTo(9f, 18.75f)
                curveTo(9f, 18.336f, 8.664f, 18f, 8.25f, 18f)
                horizontalLineTo(4.75f)
                lineTo(4.648f, 18.007f)
                curveTo(4.282f, 18.056f, 4f, 18.37f, 4f, 18.75f)
                curveTo(4f, 19.164f, 4.336f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(8.25f)
                lineTo(8.352f, 19.493f)
                curveTo(8.718f, 19.444f, 9f, 19.13f, 9f, 18.75f)
                close()
            }
        }.build()

        return _VideoLink!!
    }

@Suppress("ObjectPropertyName")
private var _VideoLink: ImageVector? = null

@Preview
@Composable
private fun VideoLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoLink, contentDescription = null)
    }
}
