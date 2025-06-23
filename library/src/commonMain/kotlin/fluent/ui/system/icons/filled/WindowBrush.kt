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

public val FluentIcons.Filled.WindowBrush: ImageVector
    get() {
        if (_WindowBrush != null) {
            return _WindowBrush!!
        }
        _WindowBrush = ImageVector.Builder(
            name = "Filled.WindowBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(9.018f)
                curveTo(9.006f, 20.918f, 9f, 20.835f, 9f, 20.75f)
                curveTo(9f, 20.26f, 9.201f, 19.818f, 9.525f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.379f)
                curveTo(19.858f, 12.14f, 20.288f, 12f, 20.75f, 12f)
                curveTo(20.834f, 12f, 20.918f, 12.005f, 21f, 12.014f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(21.634f, 15.134f)
                curveTo(22.122f, 14.646f, 22.122f, 13.854f, 21.634f, 13.366f)
                curveTo(21.146f, 12.878f, 20.354f, 12.878f, 19.866f, 13.366f)
                lineTo(16.991f, 16.241f)
                curveTo(15.814f, 15.755f, 14.409f, 15.991f, 13.452f, 16.947f)
                curveTo(13.094f, 17.305f, 12.901f, 17.674f, 12.762f, 18f)
                curveTo(12.703f, 18.141f, 12.66f, 18.252f, 12.622f, 18.35f)
                curveTo(12.562f, 18.506f, 12.515f, 18.628f, 12.434f, 18.779f)
                curveTo(12.25f, 19.12f, 11.893f, 19.574f, 10.513f, 20.034f)
                curveTo(10.269f, 20.115f, 10.084f, 20.315f, 10.022f, 20.564f)
                curveTo(9.96f, 20.813f, 10.03f, 21.077f, 10.207f, 21.263f)
                curveTo(11.186f, 22.292f, 12.62f, 22.878f, 14.042f, 22.963f)
                curveTo(15.467f, 23.048f, 16.973f, 22.635f, 18.05f, 21.542f)
                curveTo(19.004f, 20.586f, 19.239f, 19.186f, 18.757f, 18.011f)
                lineTo(21.634f, 15.134f)
                close()
                moveTo(14.513f, 18.008f)
                curveTo(15.196f, 17.325f, 16.304f, 17.325f, 16.987f, 18.008f)
                curveTo(17.671f, 18.691f, 17.671f, 19.799f, 16.987f, 20.483f)
                lineTo(16.983f, 20.487f)
                curveTo(16.275f, 21.207f, 15.228f, 21.531f, 14.132f, 21.466f)
                curveTo(13.457f, 21.425f, 12.798f, 21.238f, 12.232f, 20.934f)
                curveTo(13.021f, 20.51f, 13.464f, 20.03f, 13.755f, 19.489f)
                curveTo(13.878f, 19.26f, 13.984f, 18.988f, 14.064f, 18.784f)
                curveTo(14.094f, 18.707f, 14.12f, 18.64f, 14.143f, 18.588f)
                curveTo(14.24f, 18.359f, 14.341f, 18.18f, 14.513f, 18.008f)
                close()
            }
        }.build()

        return _WindowBrush!!
    }

@Suppress("ObjectPropertyName")
private var _WindowBrush: ImageVector? = null

@Preview
@Composable
private fun WindowBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowBrush, contentDescription = null)
    }
}
