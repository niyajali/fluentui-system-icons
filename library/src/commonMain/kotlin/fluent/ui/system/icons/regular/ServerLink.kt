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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ServerLink: ImageVector
    get() {
        if (_ServerLink != null) {
            return _ServerLink!!
        }
        _ServerLink = ImageVector.Builder(
            name = "Regular.ServerLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.25f, 6f)
                curveTo(8.836f, 6f, 8.5f, 6.336f, 8.5f, 6.75f)
                curveTo(8.5f, 7.164f, 8.836f, 7.5f, 9.25f, 7.5f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 7.5f, 15.5f, 7.164f, 15.5f, 6.75f)
                curveTo(15.5f, 6.336f, 15.164f, 6f, 14.75f, 6f)
                horizontalLineTo(9.25f)
                close()
                moveTo(8.5f, 17.75f)
                curveTo(8.5f, 17.336f, 8.836f, 17f, 9.25f, 17f)
                horizontalLineTo(11.333f)
                curveTo(11.147f, 17.468f, 11.034f, 17.973f, 11.007f, 18.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 18.5f, 8.5f, 18.164f, 8.5f, 17.75f)
                close()
                moveTo(12.286f, 15.5f)
                curveTo(12.997f, 14.742f, 13.955f, 14.218f, 15.03f, 14.054f)
                curveTo(14.944f, 14.019f, 14.849f, 14f, 14.75f, 14f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 14f, 8.5f, 14.336f, 8.5f, 14.75f)
                curveTo(8.5f, 15.164f, 8.836f, 15.5f, 9.25f, 15.5f)
                horizontalLineTo(12.286f)
                close()
                moveTo(16.5f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                curveTo(18f, 3.343f, 16.657f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.343f, 2f, 6f, 3.343f, 6f, 5f)
                verticalLineTo(19f)
                curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
                horizontalLineTo(12.286f)
                curveTo(11.88f, 21.568f, 11.555f, 21.06f, 11.333f, 20.5f)
                horizontalLineTo(9f)
                curveTo(8.172f, 20.5f, 7.5f, 19.828f, 7.5f, 19f)
                verticalLineTo(5f)
                curveTo(7.5f, 4.172f, 8.172f, 3.5f, 9f, 3.5f)
                horizontalLineTo(15f)
                curveTo(15.828f, 3.5f, 16.5f, 4.172f, 16.5f, 5f)
                close()
                moveTo(23f, 18.75f)
                curveTo(23f, 16.679f, 21.321f, 15f, 19.25f, 15f)
                lineTo(19.148f, 15.007f)
                curveTo(18.782f, 15.057f, 18.5f, 15.37f, 18.5f, 15.75f)
                curveTo(18.5f, 16.164f, 18.836f, 16.5f, 19.25f, 16.5f)
                lineTo(19.404f, 16.505f)
                curveTo(20.575f, 16.584f, 21.5f, 17.559f, 21.5f, 18.75f)
                curveTo(21.5f, 19.993f, 20.493f, 21f, 19.25f, 21f)
                lineTo(19.247f, 21.005f)
                lineTo(19.145f, 21.012f)
                curveTo(18.779f, 21.063f, 18.498f, 21.378f, 18.5f, 21.758f)
                curveTo(18.502f, 22.172f, 18.839f, 22.507f, 19.253f, 22.505f)
                verticalLineTo(22.5f)
                lineTo(19.452f, 22.495f)
                curveTo(21.428f, 22.391f, 23f, 20.754f, 23f, 18.75f)
                close()
                moveTo(16.5f, 15.75f)
                curveTo(16.5f, 15.336f, 16.164f, 15f, 15.75f, 15f)
                lineTo(15.551f, 15.005f)
                curveTo(13.572f, 15.109f, 12f, 16.746f, 12f, 18.75f)
                curveTo(12f, 20.821f, 13.679f, 22.5f, 15.75f, 22.5f)
                lineTo(15.852f, 22.493f)
                curveTo(16.218f, 22.444f, 16.5f, 22.13f, 16.5f, 21.75f)
                curveTo(16.5f, 21.336f, 16.164f, 21f, 15.75f, 21f)
                lineTo(15.596f, 20.995f)
                curveTo(14.425f, 20.916f, 13.5f, 19.941f, 13.5f, 18.75f)
                curveTo(13.5f, 17.507f, 14.507f, 16.5f, 15.75f, 16.5f)
                lineTo(15.852f, 16.493f)
                curveTo(16.218f, 16.444f, 16.5f, 16.13f, 16.5f, 15.75f)
                close()
                moveTo(20f, 18.75f)
                curveTo(20f, 18.336f, 19.664f, 18f, 19.25f, 18f)
                horizontalLineTo(15.75f)
                lineTo(15.648f, 18.007f)
                curveTo(15.282f, 18.056f, 15f, 18.37f, 15f, 18.75f)
                curveTo(15f, 19.164f, 15.336f, 19.5f, 15.75f, 19.5f)
                horizontalLineTo(19.25f)
                lineTo(19.352f, 19.493f)
                curveTo(19.718f, 19.444f, 20f, 19.13f, 20f, 18.75f)
                close()
            }
        }.build()

        return _ServerLink!!
    }

@Suppress("ObjectPropertyName")
private var _ServerLink: ImageVector? = null

@Preview
@Composable
private fun ServerLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ServerLink, contentDescription = null)
    }
}
