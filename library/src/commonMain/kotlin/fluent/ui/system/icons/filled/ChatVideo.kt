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

public val FluentIcons.Filled.ChatVideo: ImageVector
    get() {
        if (_ChatVideo != null) {
            return _ChatVideo!!
        }
        _ChatVideo = ImageVector.Builder(
            name = "Filled.ChatVideo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 13.643f, 2.397f, 15.229f, 3.145f, 16.65f)
                lineTo(2.029f, 20.939f)
                curveTo(1.992f, 21.079f, 1.992f, 21.227f, 2.029f, 21.367f)
                curveTo(2.147f, 21.821f, 2.611f, 22.094f, 3.065f, 21.975f)
                lineTo(7.356f, 20.858f)
                curveTo(8.775f, 21.604f, 10.36f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                close()
                moveTo(12f, 8f)
                curveTo(13.105f, 8f, 14f, 8.895f, 14f, 10f)
                verticalLineTo(14f)
                curveTo(14f, 15.105f, 13.105f, 16f, 12f, 16f)
                horizontalLineTo(9f)
                curveTo(7.895f, 16f, 7f, 15.105f, 7f, 14f)
                verticalLineTo(10f)
                curveTo(7f, 8.895f, 7.895f, 8f, 9f, 8f)
                horizontalLineTo(12f)
                close()
                moveTo(15f, 13.162f)
                verticalLineTo(10.838f)
                lineTo(16.734f, 9.196f)
                curveTo(17.212f, 8.744f, 18f, 9.083f, 18f, 9.741f)
                verticalLineTo(14.259f)
                curveTo(18f, 14.917f, 17.212f, 15.256f, 16.734f, 14.804f)
                lineTo(15f, 13.162f)
                close()
            }
        }.build()

        return _ChatVideo!!
    }

@Suppress("ObjectPropertyName")
private var _ChatVideo: ImageVector? = null

@Preview
@Composable
private fun ChatVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatVideo, contentDescription = null)
    }
}
