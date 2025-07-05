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
 * ThumbLikeDislike Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general approval/disapproval scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_thumb_like_dislike_24_regular.svg)
 * 
 * @return The [ImageVector] for the ThumbLikeDislike icon.
 */
public val FluentIcons.Regular.ThumbLikeDislike: ImageVector
    get() {
        if (_thumbLikeDislike != null) {
            return _thumbLikeDislike!!
        }
        _thumbLikeDislike = Builder(name = "ThumbLikeDislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.04f, 3.177f)
                curveTo(6.305f, 2.561f, 7.104f, 1.772f, 8.22f, 2.062f)
                curveTo(8.92f, 2.243f, 9.424f, 2.663f, 9.709f, 3.239f)
                curveTo(9.957f, 3.742f, 10.0f, 4.29f, 10.008f, 4.706f)
                curveTo(10.017f, 5.103f, 9.953f, 5.534f, 9.871f, 5.92f)
                horizontalLineTo(10.065f)
                curveTo(11.623f, 5.92f, 12.887f, 7.352f, 12.397f, 8.911f)
                lineTo(11.248f, 12.565f)
                curveTo(10.782f, 14.047f, 9.148f, 14.815f, 7.67f, 14.381f)
                lineTo(3.158f, 13.058f)
                curveTo(2.457f, 12.853f, 1.874f, 12.35f, 1.601f, 11.671f)
                lineTo(1.163f, 10.583f)
                curveTo(0.724f, 9.493f, 1.203f, 8.297f, 2.218f, 7.738f)
                lineTo(3.76f, 6.888f)
                curveTo(3.768f, 6.883f, 3.778f, 6.875f, 3.79f, 6.865f)
                curveTo(3.841f, 6.825f, 3.933f, 6.747f, 4.053f, 6.62f)
                curveTo(4.292f, 6.369f, 4.649f, 5.92f, 5.015f, 5.192f)
                curveTo(5.193f, 4.839f, 5.342f, 4.562f, 5.474f, 4.318f)
                lineTo(5.475f, 4.316f)
                curveTo(5.687f, 3.921f, 5.852f, 3.615f, 6.04f, 3.177f)
                close()
                moveTo(4.49f, 8.199f)
                lineTo(2.942f, 9.052f)
                curveTo(2.547f, 9.269f, 2.418f, 9.683f, 2.554f, 10.023f)
                lineTo(2.992f, 11.111f)
                curveTo(3.084f, 11.338f, 3.292f, 11.534f, 3.58f, 11.619f)
                lineTo(8.092f, 12.942f)
                curveTo(8.862f, 13.168f, 9.619f, 12.744f, 9.817f, 12.115f)
                lineTo(10.966f, 8.461f)
                curveTo(11.109f, 8.005f, 10.756f, 7.42f, 10.065f, 7.42f)
                horizontalLineTo(8.898f)
                curveTo(8.66f, 7.42f, 8.436f, 7.306f, 8.294f, 7.114f)
                curveTo(8.153f, 6.922f, 8.111f, 6.674f, 8.182f, 6.447f)
                curveTo(8.234f, 6.28f, 8.287f, 6.095f, 8.335f, 5.905f)
                curveTo(8.441f, 5.482f, 8.515f, 5.055f, 8.509f, 4.737f)
                curveTo(8.501f, 4.371f, 8.46f, 4.098f, 8.364f, 3.903f)
                curveTo(8.279f, 3.732f, 8.137f, 3.59f, 7.843f, 3.514f)
                curveTo(7.75f, 3.49f, 7.679f, 3.506f, 7.608f, 3.551f)
                curveTo(7.521f, 3.605f, 7.45f, 3.695f, 7.418f, 3.77f)
                curveTo(7.202f, 4.272f, 7.011f, 4.627f, 6.799f, 5.021f)
                lineTo(6.795f, 5.027f)
                curveTo(6.663f, 5.272f, 6.523f, 5.533f, 6.355f, 5.866f)
                curveTo(5.923f, 6.725f, 5.481f, 7.294f, 5.141f, 7.653f)
                curveTo(4.97f, 7.832f, 4.826f, 7.958f, 4.721f, 8.042f)
                curveTo(4.669f, 8.083f, 4.626f, 8.114f, 4.595f, 8.135f)
                lineTo(4.589f, 8.139f)
                lineTo(4.575f, 8.148f)
                lineTo(4.563f, 8.157f)
                lineTo(4.555f, 8.162f)
                lineTo(4.554f, 8.163f)
                curveTo(4.533f, 8.176f, 4.512f, 8.188f, 4.49f, 8.199f)
                close()
                moveTo(17.96f, 20.823f)
                curveTo(17.695f, 21.439f, 16.896f, 22.228f, 15.78f, 21.938f)
                curveTo(15.08f, 21.757f, 14.576f, 21.337f, 14.291f, 20.761f)
                curveTo(14.043f, 20.258f, 14.0f, 19.71f, 13.992f, 19.294f)
                curveTo(13.983f, 18.897f, 14.047f, 18.466f, 14.129f, 18.08f)
                horizontalLineTo(13.935f)
                curveTo(12.377f, 18.08f, 11.113f, 16.648f, 11.603f, 15.089f)
                lineTo(12.752f, 11.435f)
                curveTo(13.218f, 9.953f, 14.852f, 9.185f, 16.33f, 9.619f)
                lineTo(20.842f, 10.942f)
                curveTo(21.543f, 11.147f, 22.126f, 11.65f, 22.399f, 12.329f)
                lineTo(22.837f, 13.417f)
                curveTo(23.276f, 14.507f, 22.797f, 15.703f, 21.782f, 16.262f)
                lineTo(20.24f, 17.112f)
                curveTo(20.232f, 17.117f, 20.222f, 17.125f, 20.21f, 17.135f)
                curveTo(20.159f, 17.175f, 20.067f, 17.253f, 19.947f, 17.38f)
                curveTo(19.708f, 17.631f, 19.351f, 18.08f, 18.985f, 18.808f)
                curveTo(18.807f, 19.161f, 18.658f, 19.438f, 18.526f, 19.682f)
                lineTo(18.525f, 19.684f)
                curveTo(18.313f, 20.079f, 18.148f, 20.385f, 17.96f, 20.823f)
                close()
                moveTo(19.51f, 15.801f)
                lineTo(21.058f, 14.948f)
                curveTo(21.453f, 14.731f, 21.582f, 14.317f, 21.445f, 13.977f)
                lineTo(21.007f, 12.889f)
                curveTo(20.916f, 12.662f, 20.708f, 12.466f, 20.42f, 12.381f)
                lineTo(15.908f, 11.058f)
                curveTo(15.138f, 10.832f, 14.381f, 11.256f, 14.183f, 11.885f)
                lineTo(13.034f, 15.539f)
                curveTo(12.891f, 15.995f, 13.244f, 16.58f, 13.935f, 16.58f)
                horizontalLineTo(15.102f)
                curveTo(15.34f, 16.58f, 15.564f, 16.694f, 15.706f, 16.886f)
                curveTo(15.847f, 17.078f, 15.889f, 17.326f, 15.818f, 17.553f)
                curveTo(15.766f, 17.72f, 15.713f, 17.905f, 15.665f, 18.095f)
                curveTo(15.559f, 18.518f, 15.485f, 18.945f, 15.491f, 19.263f)
                curveTo(15.499f, 19.629f, 15.54f, 19.902f, 15.636f, 20.097f)
                curveTo(15.721f, 20.268f, 15.863f, 20.41f, 16.157f, 20.486f)
                curveTo(16.25f, 20.51f, 16.321f, 20.494f, 16.392f, 20.449f)
                curveTo(16.479f, 20.395f, 16.55f, 20.305f, 16.582f, 20.23f)
                curveTo(16.798f, 19.728f, 16.989f, 19.373f, 17.201f, 18.979f)
                lineTo(17.205f, 18.973f)
                curveTo(17.337f, 18.728f, 17.477f, 18.467f, 17.645f, 18.134f)
                curveTo(18.077f, 17.275f, 18.519f, 16.706f, 18.859f, 16.347f)
                curveTo(19.029f, 16.168f, 19.174f, 16.042f, 19.279f, 15.958f)
                curveTo(19.331f, 15.917f, 19.374f, 15.886f, 19.405f, 15.865f)
                lineTo(19.411f, 15.861f)
                lineTo(19.425f, 15.852f)
                lineTo(19.437f, 15.843f)
                lineTo(19.445f, 15.839f)
                lineTo(19.446f, 15.837f)
                curveTo(19.467f, 15.824f, 19.488f, 15.812f, 19.51f, 15.801f)
                close()
            }
        }
        .build()
        return _thumbLikeDislike!!
    }

@Suppress("ObjectPropertyName")
private var _thumbLikeDislike: ImageVector? = null

@Preview
@Composable
private fun ThumbLikeDislikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ThumbLikeDislike, contentDescription = "ThumbLikeDislike Icon")
    }
}

