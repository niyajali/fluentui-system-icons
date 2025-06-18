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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Wallpaper: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallpaper",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(10f)
            curveTo(10.552f, 3f, 11f, 3.448f, 11f, 4f)
            curveTo(11f, 4.552f, 10.552f, 5f, 10f, 5f)
            horizontalLineTo(6.25f)
            curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
            verticalLineTo(10f)
            curveTo(5f, 10.552f, 4.552f, 11f, 4f, 11f)
            curveTo(3.448f, 11f, 3f, 10.552f, 3f, 10f)
            verticalLineTo(6.25f)
            close()
            moveTo(13f, 4f)
            curveTo(13f, 3.448f, 13.448f, 3f, 14f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(10f)
            curveTo(21f, 10.552f, 20.552f, 11f, 20f, 11f)
            curveTo(19.448f, 11f, 19f, 10.552f, 19f, 10f)
            verticalLineTo(6.25f)
            curveTo(19f, 5.56f, 18.44f, 5f, 17.75f, 5f)
            horizontalLineTo(14f)
            curveTo(13.448f, 5f, 13f, 4.552f, 13f, 4f)
            close()
            moveTo(4f, 13f)
            curveTo(4.552f, 13f, 5f, 13.448f, 5f, 14f)
            verticalLineTo(17.586f)
            lineTo(9.525f, 13.061f)
            curveTo(10.892f, 11.694f, 13.108f, 11.694f, 14.475f, 13.061f)
            lineTo(19f, 17.586f)
            verticalLineTo(14f)
            curveTo(19f, 13.448f, 19.448f, 13f, 20f, 13f)
            curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(14f)
            curveTo(13.448f, 21f, 13f, 20.552f, 13f, 20f)
            curveTo(13f, 19.448f, 13.448f, 19f, 14f, 19f)
            horizontalLineTo(17.586f)
            lineTo(13.061f, 14.475f)
            curveTo(12.475f, 13.889f, 11.525f, 13.889f, 10.939f, 14.475f)
            lineTo(6.414f, 19f)
            horizontalLineTo(10f)
            curveTo(10.552f, 19f, 11f, 19.448f, 11f, 20f)
            curveTo(11f, 20.552f, 10.552f, 21f, 10f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(14f)
            curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
            close()
            moveTo(17.5f, 8.75f)
            curveTo(17.5f, 9.993f, 16.493f, 11f, 15.25f, 11f)
            curveTo(14.007f, 11f, 13f, 9.993f, 13f, 8.75f)
            curveTo(13f, 7.507f, 14.007f, 6.5f, 15.25f, 6.5f)
            curveTo(16.493f, 6.5f, 17.5f, 7.507f, 17.5f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WallpaperPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Wallpaper, contentDescription = null)
    }
}
