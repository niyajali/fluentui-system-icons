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

public val FluentIcons.Regular.CommentLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 5.75f)
            curveTo(23f, 3.679f, 21.321f, 2f, 19.25f, 2f)
            lineTo(19.148f, 2.007f)
            curveTo(18.782f, 2.057f, 18.5f, 2.37f, 18.5f, 2.75f)
            curveTo(18.5f, 3.164f, 18.836f, 3.5f, 19.25f, 3.5f)
            lineTo(19.404f, 3.505f)
            curveTo(20.575f, 3.584f, 21.5f, 4.559f, 21.5f, 5.75f)
            curveTo(21.5f, 6.993f, 20.493f, 8f, 19.25f, 8f)
            lineTo(19.247f, 8.005f)
            lineTo(19.145f, 8.012f)
            curveTo(18.779f, 8.063f, 18.498f, 8.378f, 18.5f, 8.758f)
            curveTo(18.502f, 9.172f, 18.839f, 9.506f, 19.253f, 9.505f)
            verticalLineTo(9.5f)
            lineTo(19.452f, 9.495f)
            curveTo(21.428f, 9.391f, 23f, 7.754f, 23f, 5.75f)
            close()
            moveTo(16.5f, 2.75f)
            curveTo(16.5f, 2.336f, 16.164f, 2f, 15.75f, 2f)
            lineTo(15.551f, 2.005f)
            curveTo(13.572f, 2.109f, 12f, 3.746f, 12f, 5.75f)
            curveTo(12f, 7.821f, 13.679f, 9.5f, 15.75f, 9.5f)
            lineTo(15.852f, 9.493f)
            curveTo(16.218f, 9.443f, 16.5f, 9.13f, 16.5f, 8.75f)
            curveTo(16.5f, 8.336f, 16.164f, 8f, 15.75f, 8f)
            lineTo(15.596f, 7.995f)
            curveTo(14.425f, 7.916f, 13.5f, 6.941f, 13.5f, 5.75f)
            curveTo(13.5f, 4.507f, 14.507f, 3.5f, 15.75f, 3.5f)
            lineTo(15.852f, 3.493f)
            curveTo(16.218f, 3.443f, 16.5f, 3.13f, 16.5f, 2.75f)
            close()
            moveTo(20f, 5.75f)
            curveTo(20f, 5.336f, 19.664f, 5f, 19.25f, 5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 5.007f)
            curveTo(15.282f, 5.057f, 15f, 5.37f, 15f, 5.75f)
            curveTo(15f, 6.164f, 15.336f, 6.5f, 15.75f, 6.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 6.493f)
            curveTo(19.718f, 6.443f, 20f, 6.13f, 20f, 5.75f)
            close()
            moveTo(5.25f, 3f)
            horizontalLineTo(11.877f)
            curveTo(11.558f, 3.448f, 11.314f, 3.955f, 11.166f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
            horizontalLineTo(7.499f)
            lineTo(7.5f, 20.251f)
            lineTo(12.514f, 16.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
            verticalLineTo(10.334f)
            curveTo(21.045f, 10.186f, 21.552f, 9.942f, 22f, 9.623f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(13.012f)
            lineTo(7.999f, 21.751f)
            curveTo(7.446f, 22.164f, 6.662f, 22.051f, 6.249f, 21.498f)
            curveTo(6.087f, 21.282f, 6f, 21.02f, 6f, 20.75f)
            lineTo(5.999f, 18f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentLink, contentDescription = null)
    }
}
