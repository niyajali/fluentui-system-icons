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

public val FluentIcons.Filled.StickerAdd: ImageVector
    get() {
        if (_StickerAdd != null) {
            return _StickerAdd!!
        }
        _StickerAdd = ImageVector.Builder(
            name = "Filled.StickerAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(17.5f, 13.999f)
                lineTo(17.41f, 14.007f)
                curveTo(17.206f, 14.044f, 17.045f, 14.205f, 17.008f, 14.409f)
                lineTo(17f, 14.499f)
                lineTo(17f, 16.999f)
                lineTo(14.498f, 17f)
                lineTo(14.408f, 17.008f)
                curveTo(14.204f, 17.045f, 14.043f, 17.206f, 14.006f, 17.41f)
                lineTo(13.998f, 17.5f)
                lineTo(14.006f, 17.59f)
                curveTo(14.043f, 17.794f, 14.204f, 17.955f, 14.408f, 17.992f)
                lineTo(14.498f, 18f)
                lineTo(17.001f, 17.999f)
                lineTo(17.001f, 20.503f)
                lineTo(17.009f, 20.593f)
                curveTo(17.046f, 20.798f, 17.207f, 20.958f, 17.411f, 20.995f)
                lineTo(17.501f, 21.003f)
                lineTo(17.591f, 20.995f)
                curveTo(17.795f, 20.958f, 17.956f, 20.798f, 17.993f, 20.593f)
                lineTo(18.001f, 20.503f)
                lineTo(18.001f, 17.999f)
                lineTo(20.505f, 18f)
                lineTo(20.594f, 17.992f)
                curveTo(20.799f, 17.955f, 20.959f, 17.794f, 20.997f, 17.59f)
                lineTo(21.005f, 17.5f)
                lineTo(20.997f, 17.41f)
                curveTo(20.959f, 17.206f, 20.799f, 17.045f, 20.594f, 17.008f)
                lineTo(20.505f, 17f)
                lineTo(18f, 16.999f)
                lineTo(18f, 14.499f)
                lineTo(17.992f, 14.409f)
                curveTo(17.955f, 14.205f, 17.794f, 14.044f, 17.59f, 14.007f)
                lineTo(17.5f, 13.999f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                lineTo(21.001f, 12.023f)
                curveTo(19.991f, 11.375f, 18.789f, 11f, 17.5f, 11f)
                curveTo(14.802f, 11f, 12.487f, 12.644f, 11.504f, 14.985f)
                curveTo(10.657f, 14.908f, 9.885f, 14.626f, 9.177f, 14.136f)
                curveTo(8.836f, 13.9f, 8.369f, 13.985f, 8.133f, 14.326f)
                curveTo(7.897f, 14.667f, 7.983f, 15.134f, 8.323f, 15.369f)
                curveTo(9.166f, 15.953f, 10.09f, 16.313f, 11.085f, 16.448f)
                curveTo(11.029f, 16.791f, 11f, 17.142f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.991f, 12.023f, 21.001f)
                lineTo(6.25f, 21f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(9f, 7.751f)
                curveTo(8.31f, 7.751f, 7.751f, 8.31f, 7.751f, 9f)
                curveTo(7.751f, 9.69f, 8.31f, 10.25f, 9f, 10.25f)
                curveTo(9.69f, 10.25f, 10.25f, 9.69f, 10.25f, 9f)
                curveTo(10.25f, 8.31f, 9.69f, 7.751f, 9f, 7.751f)
                close()
                moveTo(15f, 7.751f)
                curveTo(14.311f, 7.751f, 13.751f, 8.31f, 13.751f, 9f)
                curveTo(13.751f, 9.69f, 14.311f, 10.25f, 15f, 10.25f)
                curveTo(15.69f, 10.25f, 16.25f, 9.69f, 16.25f, 9f)
                curveTo(16.25f, 8.31f, 15.69f, 7.751f, 15f, 7.751f)
                close()
            }
        }.build()

        return _StickerAdd!!
    }

@Suppress("ObjectPropertyName")
private var _StickerAdd: ImageVector? = null

@Preview
@Composable
private fun StickerAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StickerAdd, contentDescription = null)
    }
}
