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

public val FluentIcons.Regular.ClipboardBrush: ImageVector
    get() {
        if (_ClipboardBrush != null) {
            return _ClipboardBrush!!
        }
        _ClipboardBrush = ImageVector.Builder(
            name = "Regular.ClipboardBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.379f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(9.017f)
                curveTo(8.943f, 21.026f, 9.111f, 21.562f, 9.482f, 21.952f)
                curveTo(9.497f, 21.968f, 9.513f, 21.984f, 9.528f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(8.014f)
                curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(12.128f)
                curveTo(19.693f, 12.236f, 19.405f, 12.413f, 19.159f, 12.659f)
                lineTo(18.5f, 13.318f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
                horizontalLineTo(15.621f)
                curveTo(15.217f, 6.103f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.783f, 6.103f, 8.379f, 5.5f)
                close()
                moveTo(9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                close()
                moveTo(21.634f, 13.366f)
                curveTo(22.122f, 13.854f, 22.122f, 14.646f, 21.634f, 15.134f)
                lineTo(18.757f, 18.011f)
                curveTo(19.239f, 19.186f, 19.004f, 20.586f, 18.05f, 21.542f)
                curveTo(16.973f, 22.635f, 15.467f, 23.048f, 14.042f, 22.963f)
                curveTo(12.62f, 22.878f, 11.186f, 22.292f, 10.207f, 21.263f)
                curveTo(10.03f, 21.077f, 9.96f, 20.813f, 10.022f, 20.564f)
                curveTo(10.084f, 20.315f, 10.269f, 20.115f, 10.513f, 20.034f)
                curveTo(11.893f, 19.574f, 12.25f, 19.12f, 12.434f, 18.779f)
                curveTo(12.515f, 18.628f, 12.562f, 18.506f, 12.622f, 18.35f)
                curveTo(12.66f, 18.252f, 12.703f, 18.141f, 12.762f, 18f)
                curveTo(12.901f, 17.674f, 13.094f, 17.305f, 13.452f, 16.947f)
                curveTo(14.409f, 15.991f, 15.814f, 15.755f, 16.991f, 16.241f)
                lineTo(19.866f, 13.366f)
                curveTo(20.354f, 12.878f, 21.146f, 12.878f, 21.634f, 13.366f)
                close()
                moveTo(16.987f, 18.008f)
                curveTo(16.304f, 17.325f, 15.196f, 17.325f, 14.513f, 18.008f)
                curveTo(14.341f, 18.18f, 14.24f, 18.359f, 14.143f, 18.588f)
                curveTo(14.12f, 18.64f, 14.094f, 18.707f, 14.064f, 18.784f)
                curveTo(13.984f, 18.988f, 13.878f, 19.26f, 13.755f, 19.489f)
                curveTo(13.464f, 20.03f, 13.021f, 20.51f, 12.232f, 20.934f)
                curveTo(12.798f, 21.238f, 13.457f, 21.425f, 14.132f, 21.466f)
                curveTo(15.228f, 21.531f, 16.275f, 21.207f, 16.983f, 20.487f)
                lineTo(16.987f, 20.483f)
                curveTo(17.671f, 19.799f, 17.671f, 18.691f, 16.987f, 18.008f)
                close()
            }
        }.build()

        return _ClipboardBrush!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardBrush: ImageVector? = null

@Preview
@Composable
private fun ClipboardBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardBrush, contentDescription = null)
    }
}
