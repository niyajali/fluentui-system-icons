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

public val FluentUi.Filled.FolderLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.25f, 5.189f)
            lineTo(8.659f, 7.78f)
            curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
            horizontalLineTo(2f)
            close()
            moveTo(2f, 9.5f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(11.877f)
            curveTo(11.325f, 20.224f, 11f, 19.275f, 11f, 18.25f)
            curveTo(11f, 15.627f, 13.127f, 13.5f, 15.75f, 13.5f)
            horizontalLineTo(19.25f)
            curveTo(20.275f, 13.5f, 21.224f, 13.825f, 22f, 14.377f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(13.061f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(23f, 18.25f)
            curveTo(23f, 16.179f, 21.321f, 14.5f, 19.25f, 14.5f)
            lineTo(19.148f, 14.507f)
            curveTo(18.782f, 14.557f, 18.5f, 14.87f, 18.5f, 15.25f)
            curveTo(18.5f, 15.664f, 18.836f, 16f, 19.25f, 16f)
            lineTo(19.404f, 16.005f)
            curveTo(20.575f, 16.084f, 21.5f, 17.059f, 21.5f, 18.25f)
            curveTo(21.5f, 19.493f, 20.493f, 20.5f, 19.25f, 20.5f)
            lineTo(19.247f, 20.505f)
            lineTo(19.145f, 20.512f)
            curveTo(18.779f, 20.563f, 18.498f, 20.878f, 18.5f, 21.258f)
            curveTo(18.502f, 21.672f, 18.839f, 22.007f, 19.253f, 22.005f)
            verticalLineTo(22f)
            lineTo(19.452f, 21.995f)
            curveTo(21.428f, 21.891f, 23f, 20.254f, 23f, 18.25f)
            close()
            moveTo(16.5f, 15.25f)
            curveTo(16.5f, 14.836f, 16.164f, 14.5f, 15.75f, 14.5f)
            lineTo(15.551f, 14.505f)
            curveTo(13.572f, 14.609f, 12f, 16.246f, 12f, 18.25f)
            curveTo(12f, 20.321f, 13.679f, 22f, 15.75f, 22f)
            lineTo(15.852f, 21.993f)
            curveTo(16.218f, 21.944f, 16.5f, 21.63f, 16.5f, 21.25f)
            curveTo(16.5f, 20.836f, 16.164f, 20.5f, 15.75f, 20.5f)
            lineTo(15.596f, 20.495f)
            curveTo(14.425f, 20.416f, 13.5f, 19.441f, 13.5f, 18.25f)
            curveTo(13.5f, 17.007f, 14.507f, 16f, 15.75f, 16f)
            lineTo(15.852f, 15.993f)
            curveTo(16.218f, 15.943f, 16.5f, 15.63f, 16.5f, 15.25f)
            close()
            moveTo(20f, 18.25f)
            curveTo(20f, 17.836f, 19.664f, 17.5f, 19.25f, 17.5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 17.507f)
            curveTo(15.282f, 17.556f, 15f, 17.87f, 15f, 18.25f)
            curveTo(15f, 18.664f, 15.336f, 19f, 15.75f, 19f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 18.993f)
            curveTo(19.718f, 18.944f, 20f, 18.63f, 20f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderLink, contentDescription = null)
    }
}
