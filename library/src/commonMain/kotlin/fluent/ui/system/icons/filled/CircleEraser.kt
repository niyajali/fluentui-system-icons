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
 * CircleEraser icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: circle, eraser
 * - Source: ic_fluent_circle_eraser_20_filled.svg
 * 
 * @return The [ImageVector] for the CircleEraser icon.
 */
public val FluentIcons.Filled.CircleEraser: ImageVector
    get() {
        if (_circleEraser != null) {
            return _circleEraser!!
        }
        _circleEraser = Builder(name = "CircleEraser", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.731f, 17.174f)
                curveTo(8.499f, 16.942f, 8.315f, 16.666f, 8.189f, 16.363f)
                curveTo(8.063f, 16.059f, 7.999f, 15.734f, 7.999f, 15.406f)
                curveTo(7.999f, 15.077f, 8.063f, 14.752f, 8.189f, 14.449f)
                curveTo(8.315f, 14.146f, 8.499f, 13.87f, 8.731f, 13.638f)
                lineTo(13.631f, 8.738f)
                curveTo(13.863f, 8.506f, 14.139f, 8.321f, 14.442f, 8.196f)
                curveTo(14.745f, 8.07f, 15.071f, 8.005f, 15.399f, 8.005f)
                curveTo(15.727f, 8.005f, 16.052f, 8.07f, 16.356f, 8.196f)
                curveTo(16.659f, 8.321f, 16.935f, 8.506f, 17.167f, 8.738f)
                lineTo(17.967f, 9.538f)
                curveTo(17.878f, 7.998f, 17.347f, 6.517f, 16.435f, 5.273f)
                curveTo(15.524f, 4.029f, 14.272f, 3.075f, 12.831f, 2.526f)
                curveTo(11.39f, 1.977f, 9.821f, 1.856f, 8.313f, 2.179f)
                curveTo(6.805f, 2.501f, 5.422f, 3.253f, 4.332f, 4.344f)
                curveTo(3.241f, 5.434f, 2.49f, 6.817f, 2.167f, 8.325f)
                curveTo(1.845f, 9.833f, 1.965f, 11.402f, 2.514f, 12.843f)
                curveTo(3.063f, 14.284f, 4.017f, 15.536f, 5.261f, 16.447f)
                curveTo(6.505f, 17.358f, 7.986f, 17.89f, 9.526f, 17.979f)
                lineTo(8.731f, 17.174f)
                close()
                moveTo(16.468f, 9.44f)
                lineTo(18.563f, 11.54f)
                curveTo(18.702f, 11.679f, 18.813f, 11.844f, 18.888f, 12.026f)
                curveTo(18.964f, 12.209f, 19.003f, 12.404f, 19.003f, 12.601f)
                curveTo(19.003f, 12.798f, 18.964f, 12.993f, 18.888f, 13.175f)
                curveTo(18.813f, 13.357f, 18.702f, 13.523f, 18.563f, 13.662f)
                lineTo(14.963f, 17.262f)
                lineTo(10.747f, 13.045f)
                lineTo(14.347f, 9.445f)
                curveTo(14.486f, 9.305f, 14.652f, 9.195f, 14.834f, 9.119f)
                curveTo(15.016f, 9.044f, 15.211f, 9.005f, 15.408f, 9.005f)
                curveTo(15.605f, 9.005f, 15.8f, 9.044f, 15.982f, 9.119f)
                curveTo(16.164f, 9.195f, 16.33f, 9.305f, 16.469f, 9.445f)
                lineTo(16.468f, 9.44f)
                close()
                moveTo(14.256f, 17.963f)
                lineTo(10.04f, 13.746f)
                lineTo(9.44f, 14.346f)
                curveTo(9.301f, 14.485f, 9.19f, 14.651f, 9.115f, 14.833f)
                curveTo(9.039f, 15.015f, 9.0f, 15.21f, 9.0f, 15.407f)
                curveTo(9.0f, 15.604f, 9.039f, 15.799f, 9.115f, 15.981f)
                curveTo(9.19f, 16.163f, 9.301f, 16.329f, 9.44f, 16.468f)
                lineTo(11.54f, 18.563f)
                curveTo(11.686f, 18.709f, 11.861f, 18.823f, 12.053f, 18.898f)
                curveTo(12.245f, 18.974f, 12.451f, 19.008f, 12.657f, 19.001f)
                horizontalLineTo(16.749f)
                curveTo(16.882f, 19.001f, 17.009f, 18.948f, 17.103f, 18.854f)
                curveTo(17.196f, 18.76f, 17.249f, 18.633f, 17.249f, 18.501f)
                curveTo(17.249f, 18.368f, 17.196f, 18.241f, 17.103f, 18.147f)
                curveTo(17.009f, 18.053f, 16.882f, 18.001f, 16.749f, 18.001f)
                horizontalLineTo(14.218f)
                lineTo(14.256f, 17.963f)
                close()
            }
        }
        .build()
        return _circleEraser!!
    }

@Suppress("ObjectPropertyName")
private var _circleEraser: ImageVector? = null

@Preview
@Composable
private fun CircleEraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CircleEraser, contentDescription = null)
    }
}

