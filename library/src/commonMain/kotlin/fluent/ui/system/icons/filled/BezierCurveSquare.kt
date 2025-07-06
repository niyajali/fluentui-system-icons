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
 * BezierCurveSquare Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to jump into curve editor.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_bezier_curve_square_20_filled.svg)
 * 
 * @return The [ImageVector] for the BezierCurveSquare icon.
 */
public val FluentIcons.Filled.BezierCurveSquare: ImageVector
    get() {
        if (_bezierCurveSquare != null) {
            return _bezierCurveSquare!!
        }
        _bezierCurveSquare = Builder(name = "BezierCurveSquare", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(4.393f, 13.0f, 5.265f, 12.598f, 5.862f, 12.041f)
                curveTo(6.476f, 11.468f, 6.849f, 10.686f, 7.154f, 9.832f)
                curveTo(7.259f, 9.539f, 7.35f, 9.253f, 7.442f, 8.965f)
                curveTo(7.486f, 8.83f, 7.529f, 8.695f, 7.574f, 8.559f)
                curveTo(7.71f, 8.146f, 7.856f, 7.733f, 8.037f, 7.37f)
                curveTo(8.219f, 7.007f, 8.451f, 6.662f, 8.775f, 6.407f)
                curveTo(9.111f, 6.144f, 9.518f, 6.0f, 10.0f, 6.0f)
                curveTo(10.482f, 6.0f, 10.889f, 6.144f, 11.224f, 6.407f)
                curveTo(11.549f, 6.662f, 11.781f, 7.007f, 11.963f, 7.37f)
                curveTo(12.144f, 7.733f, 12.29f, 8.146f, 12.426f, 8.559f)
                curveTo(12.471f, 8.695f, 12.514f, 8.83f, 12.557f, 8.965f)
                curveTo(12.649f, 9.253f, 12.741f, 9.539f, 12.846f, 9.832f)
                curveTo(13.151f, 10.686f, 13.524f, 11.468f, 14.138f, 12.041f)
                curveTo(14.735f, 12.598f, 15.607f, 13.0f, 17.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.895f, 16.105f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.0f, 14.0f)
                curveTo(15.393f, 14.0f, 14.265f, 13.527f, 13.456f, 12.772f)
                curveTo(12.663f, 12.032f, 12.224f, 11.064f, 11.904f, 10.168f)
                curveTo(11.794f, 9.86f, 11.693f, 9.546f, 11.599f, 9.251f)
                curveTo(11.557f, 9.12f, 11.516f, 8.992f, 11.476f, 8.871f)
                curveTo(11.342f, 8.464f, 11.215f, 8.111f, 11.068f, 7.817f)
                curveTo(10.922f, 7.524f, 10.771f, 7.322f, 10.608f, 7.194f)
                curveTo(10.455f, 7.075f, 10.268f, 7.0f, 10.0f, 7.0f)
                curveTo(9.732f, 7.0f, 9.545f, 7.075f, 9.392f, 7.194f)
                curveTo(9.229f, 7.322f, 9.078f, 7.524f, 8.932f, 7.817f)
                curveTo(8.785f, 8.111f, 8.658f, 8.464f, 8.524f, 8.871f)
                curveTo(8.484f, 8.992f, 8.443f, 9.12f, 8.401f, 9.251f)
                curveTo(8.307f, 9.546f, 8.206f, 9.86f, 8.096f, 10.168f)
                curveTo(7.776f, 11.064f, 7.337f, 12.032f, 6.544f, 12.772f)
                curveTo(5.735f, 13.527f, 4.607f, 14.0f, 3.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.105f, 3.895f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 17.0f, 17.0f, 16.105f, 17.0f, 15.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _bezierCurveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _bezierCurveSquare: ImageVector? = null

@Preview
@Composable
private fun BezierCurveSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BezierCurveSquare, contentDescription = "BezierCurveSquare Icon")
    }
}

