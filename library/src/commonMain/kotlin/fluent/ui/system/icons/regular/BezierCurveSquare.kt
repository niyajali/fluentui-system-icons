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
 * BezierCurveSquare icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: bezier, curve, square
 * - Source: ic_fluent_bezier_curve_square_20_regular.svg
 * 
 * @return The [ImageVector] for the BezierCurveSquare icon.
 */
public val FluentIcons.Regular.BezierCurveSquare: ImageVector
    get() {
        if (_bezierCurveSquare != null) {
            return _bezierCurveSquare!!
        }
        _bezierCurveSquare = Builder(name = "BezierCurveSquare", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.105f, 3.895f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 17.0f, 17.0f, 16.105f, 17.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.895f, 16.105f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(16.0f, 12.92f)
                curveTo(15.165f, 12.777f, 14.577f, 12.451f, 14.138f, 12.041f)
                curveTo(13.524f, 11.468f, 13.151f, 10.686f, 12.846f, 9.832f)
                curveTo(12.741f, 9.539f, 12.649f, 9.252f, 12.557f, 8.965f)
                curveTo(12.514f, 8.83f, 12.471f, 8.695f, 12.426f, 8.559f)
                curveTo(12.29f, 8.146f, 12.144f, 7.733f, 11.963f, 7.37f)
                curveTo(11.781f, 7.007f, 11.549f, 6.662f, 11.224f, 6.407f)
                curveTo(10.889f, 6.144f, 10.482f, 6.0f, 10.0f, 6.0f)
                curveTo(9.518f, 6.0f, 9.111f, 6.144f, 8.775f, 6.407f)
                curveTo(8.451f, 6.662f, 8.219f, 7.007f, 8.037f, 7.37f)
                curveTo(7.856f, 7.733f, 7.71f, 8.146f, 7.574f, 8.559f)
                curveTo(7.529f, 8.695f, 7.486f, 8.83f, 7.442f, 8.965f)
                curveTo(7.35f, 9.252f, 7.259f, 9.539f, 7.154f, 9.832f)
                curveTo(6.849f, 10.686f, 6.476f, 11.468f, 5.862f, 12.041f)
                curveTo(5.423f, 12.451f, 4.835f, 12.777f, 4.0f, 12.92f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 4.0f, 16.0f, 4.448f, 16.0f, 5.0f)
                verticalLineTo(12.92f)
                close()
                moveTo(4.0f, 13.932f)
                curveTo(5.092f, 13.776f, 5.915f, 13.359f, 6.544f, 12.772f)
                curveTo(7.337f, 12.032f, 7.776f, 11.064f, 8.096f, 10.168f)
                curveTo(8.206f, 9.86f, 8.307f, 9.546f, 8.401f, 9.251f)
                curveTo(8.443f, 9.12f, 8.484f, 8.992f, 8.524f, 8.871f)
                curveTo(8.658f, 8.464f, 8.785f, 8.11f, 8.932f, 7.817f)
                curveTo(9.078f, 7.524f, 9.229f, 7.322f, 9.392f, 7.194f)
                curveTo(9.545f, 7.075f, 9.732f, 7.0f, 10.0f, 7.0f)
                curveTo(10.268f, 7.0f, 10.455f, 7.075f, 10.608f, 7.194f)
                curveTo(10.771f, 7.322f, 10.922f, 7.524f, 11.068f, 7.817f)
                curveTo(11.215f, 8.11f, 11.342f, 8.464f, 11.476f, 8.871f)
                curveTo(11.516f, 8.992f, 11.557f, 9.12f, 11.599f, 9.251f)
                curveTo(11.693f, 9.546f, 11.794f, 9.86f, 11.904f, 10.168f)
                curveTo(12.224f, 11.064f, 12.663f, 12.032f, 13.456f, 12.772f)
                curveTo(14.085f, 13.359f, 14.908f, 13.776f, 16.0f, 13.932f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 15.552f, 15.552f, 16.0f, 15.0f, 16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 16.0f, 4.0f, 15.552f, 4.0f, 15.0f)
                verticalLineTo(13.932f)
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
        Image(imageVector = FluentIcons.Regular.BezierCurveSquare, contentDescription = null)
    }
}

