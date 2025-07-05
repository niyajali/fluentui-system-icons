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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * SquareEraser Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, visual studio
 * - Description: Used to clear cell outputs.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_square_eraser_20_filled.svg)
 * 
 * @return The [ImageVector] for the SquareEraser icon.
 */
public val FluentIcons.Filled.SquareEraser: ImageVector
    get() {
        if (_squareEraser != null) {
            return _squareEraser!!
        }
        _squareEraser = Builder(name = "SquareEraser", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.733f, 13.637f)
                lineTo(13.633f, 8.737f)
                curveTo(14.072f, 8.292f, 14.663f, 8.03f, 15.288f, 8.002f)
                curveTo(15.912f, 7.975f, 16.524f, 8.185f, 17.0f, 8.589f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 5.204f, 16.684f, 4.441f, 16.121f, 3.879f)
                curveTo(15.559f, 3.316f, 14.796f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.204f, 3.0f, 4.441f, 3.316f, 3.879f, 3.879f)
                curveTo(3.316f, 4.441f, 3.0f, 5.204f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.796f, 3.316f, 15.559f, 3.879f, 16.121f)
                curveTo(4.441f, 16.684f, 5.204f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(8.591f)
                curveTo(8.192f, 16.522f, 7.985f, 15.913f, 8.011f, 15.291f)
                curveTo(8.037f, 14.669f, 8.295f, 14.079f, 8.733f, 13.637f)
                close()
                moveTo(16.469f, 9.439f)
                lineTo(18.564f, 11.534f)
                curveTo(18.703f, 11.673f, 18.814f, 11.839f, 18.889f, 12.021f)
                curveTo(18.965f, 12.203f, 19.004f, 12.398f, 19.004f, 12.595f)
                curveTo(19.004f, 12.792f, 18.965f, 12.987f, 18.889f, 13.169f)
                curveTo(18.814f, 13.351f, 18.703f, 13.517f, 18.564f, 13.656f)
                lineTo(14.964f, 17.256f)
                lineTo(10.748f, 13.039f)
                lineTo(14.348f, 9.439f)
                curveTo(14.487f, 9.3f, 14.653f, 9.189f, 14.835f, 9.114f)
                curveTo(15.017f, 9.038f, 15.212f, 8.999f, 15.409f, 8.999f)
                curveTo(15.606f, 8.999f, 15.801f, 9.038f, 15.983f, 9.114f)
                curveTo(16.165f, 9.189f, 16.33f, 9.3f, 16.469f, 9.439f)
                close()
                moveTo(14.257f, 17.962f)
                lineTo(10.041f, 13.745f)
                lineTo(9.441f, 14.345f)
                curveTo(9.302f, 14.484f, 9.191f, 14.65f, 9.116f, 14.832f)
                curveTo(9.04f, 15.014f, 9.001f, 15.209f, 9.001f, 15.406f)
                curveTo(9.001f, 15.603f, 9.04f, 15.798f, 9.116f, 15.98f)
                curveTo(9.191f, 16.162f, 9.302f, 16.328f, 9.441f, 16.467f)
                lineTo(11.541f, 18.562f)
                curveTo(11.687f, 18.708f, 11.862f, 18.822f, 12.054f, 18.897f)
                curveTo(12.246f, 18.973f, 12.452f, 19.008f, 12.658f, 19.0f)
                horizontalLineTo(16.75f)
                curveTo(16.883f, 19.0f, 17.01f, 18.947f, 17.104f, 18.854f)
                curveTo(17.197f, 18.76f, 17.25f, 18.633f, 17.25f, 18.5f)
                curveTo(17.25f, 18.367f, 17.197f, 18.24f, 17.104f, 18.146f)
                curveTo(17.01f, 18.053f, 16.883f, 18.0f, 16.75f, 18.0f)
                horizontalLineTo(14.219f)
                lineTo(14.257f, 17.962f)
                close()
            }
        }
        .build()
        return _squareEraser!!
    }

@Suppress("ObjectPropertyName")
private var _squareEraser: ImageVector? = null

@Preview
@Composable
private fun SquareEraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareEraser, contentDescription = "SquareEraser Icon")
    }
}

