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
 * SquareEraser icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: square, eraser
 * - Source: ic_fluent_square_eraser_20_regular.svg
 * 
 * @return The [ImageVector] for the SquareEraser icon.
 */
public val FluentIcons.Regular.SquareEraser: ImageVector
    get() {
        if (_squareEraser != null) {
            return _squareEraser!!
        }
        _squareEraser = Builder(name = "SquareEraser", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.081f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(5.47f, 16.0f, 4.961f, 15.789f, 4.586f, 15.414f)
                curveTo(4.211f, 15.039f, 4.0f, 14.53f, 4.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 5.47f, 4.211f, 4.961f, 4.586f, 4.586f)
                curveTo(4.961f, 4.211f, 5.47f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(14.53f, 4.0f, 15.039f, 4.211f, 15.414f, 4.586f)
                curveTo(15.789f, 4.961f, 16.0f, 5.47f, 16.0f, 6.0f)
                verticalLineTo(8.079f)
                curveTo(16.368f, 8.17f, 16.71f, 8.344f, 17.0f, 8.589f)
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
                curveTo(8.347f, 16.71f, 8.172f, 16.368f, 8.081f, 16.0f)
                close()
                moveTo(9.439f, 16.466f)
                curveTo(9.3f, 16.327f, 9.189f, 16.161f, 9.114f, 15.979f)
                curveTo(9.038f, 15.797f, 8.999f, 15.602f, 8.999f, 15.405f)
                curveTo(8.999f, 15.208f, 9.038f, 15.013f, 9.114f, 14.831f)
                curveTo(9.189f, 14.649f, 9.3f, 14.483f, 9.439f, 14.344f)
                lineTo(14.339f, 9.444f)
                curveTo(14.478f, 9.305f, 14.644f, 9.194f, 14.826f, 9.119f)
                curveTo(15.008f, 9.043f, 15.203f, 9.004f, 15.4f, 9.004f)
                curveTo(15.597f, 9.004f, 15.792f, 9.043f, 15.974f, 9.119f)
                curveTo(16.156f, 9.194f, 16.322f, 9.305f, 16.461f, 9.444f)
                lineTo(18.556f, 11.544f)
                curveTo(18.695f, 11.683f, 18.806f, 11.849f, 18.881f, 12.031f)
                curveTo(18.957f, 12.213f, 18.996f, 12.408f, 18.996f, 12.605f)
                curveTo(18.996f, 12.802f, 18.957f, 12.997f, 18.881f, 13.179f)
                curveTo(18.806f, 13.361f, 18.695f, 13.527f, 18.556f, 13.666f)
                lineTo(14.216f, 18.0f)
                horizontalLineTo(16.747f)
                curveTo(16.88f, 18.0f, 17.007f, 18.053f, 17.101f, 18.146f)
                curveTo(17.194f, 18.24f, 17.247f, 18.367f, 17.247f, 18.5f)
                curveTo(17.247f, 18.633f, 17.194f, 18.76f, 17.101f, 18.854f)
                curveTo(17.007f, 18.947f, 16.88f, 19.0f, 16.747f, 19.0f)
                horizontalLineTo(12.655f)
                curveTo(12.448f, 19.008f, 12.242f, 18.974f, 12.049f, 18.898f)
                curveTo(11.856f, 18.823f, 11.681f, 18.708f, 11.534f, 18.562f)
                lineTo(9.439f, 16.466f)
                close()
                moveTo(15.051f, 10.147f)
                lineTo(11.451f, 13.747f)
                lineTo(14.251f, 16.547f)
                lineTo(17.851f, 12.947f)
                curveTo(17.898f, 12.901f, 17.934f, 12.845f, 17.96f, 12.785f)
                curveTo(17.985f, 12.724f, 17.998f, 12.659f, 17.998f, 12.593f)
                curveTo(17.998f, 12.527f, 17.985f, 12.462f, 17.96f, 12.401f)
                curveTo(17.934f, 12.341f, 17.898f, 12.285f, 17.851f, 12.239f)
                lineTo(15.756f, 10.144f)
                curveTo(15.662f, 10.051f, 15.535f, 10.0f, 15.403f, 10.0f)
                curveTo(15.271f, 10.001f, 15.144f, 10.054f, 15.051f, 10.147f)
                close()
                moveTo(13.551f, 17.255f)
                lineTo(10.751f, 14.455f)
                lineTo(10.151f, 15.055f)
                curveTo(10.104f, 15.101f, 10.068f, 15.157f, 10.042f, 15.217f)
                curveTo(10.017f, 15.278f, 10.004f, 15.343f, 10.004f, 15.409f)
                curveTo(10.004f, 15.475f, 10.017f, 15.54f, 10.042f, 15.601f)
                curveTo(10.068f, 15.661f, 10.104f, 15.717f, 10.151f, 15.763f)
                lineTo(12.246f, 17.858f)
                curveTo(12.292f, 17.905f, 12.348f, 17.941f, 12.408f, 17.967f)
                curveTo(12.469f, 17.992f, 12.534f, 18.005f, 12.6f, 18.005f)
                curveTo(12.666f, 18.005f, 12.731f, 17.992f, 12.792f, 17.967f)
                curveTo(12.852f, 17.941f, 12.908f, 17.905f, 12.954f, 17.858f)
                lineTo(13.551f, 17.255f)
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
        Image(imageVector = FluentIcons.Regular.SquareEraser, contentDescription = null)
    }
}

