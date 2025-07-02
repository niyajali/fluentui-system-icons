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
 * GaugeAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: gauge, add
 * - Source: ic_fluent_gauge_add_20_filled.svg
 * 
 * @return The [ImageVector] for the GaugeAdd icon.
 */
public val FluentIcons.Filled.GaugeAdd: ImageVector
    get() {
        if (_gaugeAdd != null) {
            return _gaugeAdd!!
        }
        _gaugeAdd = Builder(name = "GaugeAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveTo(14.418f, 18.0f, 18.0f, 14.418f, 18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                curveTo(5.582f, 2.0f, 2.0f, 5.582f, 2.0f, 10.0f)
                curveTo(2.0f, 10.085f, 2.001f, 10.17f, 2.004f, 10.254f)
                curveTo(2.596f, 9.766f, 3.292f, 9.399f, 4.054f, 9.192f)
                curveTo(4.224f, 7.936f, 4.792f, 6.723f, 5.757f, 5.757f)
                curveTo(7.495f, 4.02f, 10.032f, 3.572f, 12.182f, 4.409f)
                curveTo(12.439f, 4.509f, 12.566f, 4.799f, 12.466f, 5.057f)
                curveTo(12.366f, 5.314f, 12.076f, 5.441f, 11.818f, 5.341f)
                curveTo(10.025f, 4.642f, 7.911f, 5.018f, 6.464f, 6.464f)
                curveTo(5.74f, 7.189f, 5.284f, 8.08f, 5.098f, 9.014f)
                curveTo(5.23f, 9.005f, 5.365f, 9.0f, 5.5f, 9.0f)
                curveTo(6.681f, 9.0f, 7.775f, 9.372f, 8.671f, 10.005f)
                curveTo(8.73f, 9.835f, 8.822f, 9.673f, 8.946f, 9.527f)
                curveTo(9.018f, 9.443f, 9.149f, 9.323f, 9.289f, 9.199f)
                curveTo(9.44f, 9.067f, 9.632f, 8.903f, 9.85f, 8.72f)
                curveTo(10.285f, 8.356f, 10.831f, 7.91f, 11.363f, 7.479f)
                curveTo(11.896f, 7.048f, 12.418f, 6.63f, 12.806f, 6.32f)
                lineTo(13.08f, 6.101f)
                lineTo(13.45f, 5.808f)
                curveTo(13.637f, 5.659f, 13.903f, 5.664f, 14.085f, 5.819f)
                curveTo(14.267f, 5.974f, 14.313f, 6.237f, 14.196f, 6.445f)
                lineTo(14.085f, 6.641f)
                curveTo(14.015f, 6.766f, 13.913f, 6.945f, 13.79f, 7.161f)
                curveTo(13.676f, 7.362f, 13.543f, 7.595f, 13.4f, 7.847f)
                lineTo(13.169f, 8.249f)
                lineTo(12.872f, 8.767f)
                curveTo(12.732f, 9.01f, 12.589f, 9.255f, 12.45f, 9.494f)
                curveTo(12.25f, 9.839f, 12.055f, 10.169f, 11.883f, 10.457f)
                curveTo(11.737f, 10.7f, 11.605f, 10.916f, 11.498f, 11.085f)
                curveTo(11.462f, 11.142f, 11.426f, 11.198f, 11.391f, 11.25f)
                curveTo(11.366f, 11.288f, 11.341f, 11.325f, 11.317f, 11.358f)
                curveTo(11.285f, 11.404f, 11.254f, 11.444f, 11.228f, 11.475f)
                curveTo(11.001f, 11.74f, 10.703f, 11.907f, 10.385f, 11.971f)
                curveTo(10.778f, 12.728f, 11.0f, 13.588f, 11.0f, 14.5f)
                curveTo(11.0f, 15.828f, 10.53f, 17.046f, 9.746f, 17.996f)
                curveTo(9.83f, 17.999f, 9.915f, 18.0f, 10.0f, 18.0f)
                close()
                moveTo(15.591f, 7.818f)
                curveTo(16.428f, 9.968f, 15.98f, 12.505f, 14.243f, 14.243f)
                curveTo(14.047f, 14.438f, 13.731f, 14.438f, 13.535f, 14.243f)
                curveTo(13.34f, 14.047f, 13.34f, 13.731f, 13.535f, 13.535f)
                curveTo(14.982f, 12.089f, 15.358f, 9.975f, 14.659f, 8.182f)
                curveTo(14.559f, 7.924f, 14.686f, 7.634f, 14.943f, 7.534f)
                curveTo(15.201f, 7.434f, 15.491f, 7.561f, 15.591f, 7.818f)
                close()
                moveTo(8.0f, 18.242f)
                curveTo(7.26f, 18.736f, 6.39f, 19.0f, 5.5f, 19.0f)
                curveTo(4.307f, 19.0f, 3.162f, 18.526f, 2.318f, 17.682f)
                curveTo(1.474f, 16.838f, 1.0f, 15.693f, 1.0f, 14.5f)
                curveTo(1.0f, 13.61f, 1.264f, 12.74f, 1.758f, 12.0f)
                curveTo(2.253f, 11.26f, 2.956f, 10.683f, 3.778f, 10.342f)
                curveTo(4.6f, 10.002f, 5.505f, 9.913f, 6.378f, 10.087f)
                curveTo(7.251f, 10.26f, 8.053f, 10.689f, 8.682f, 11.318f)
                curveTo(9.311f, 11.947f, 9.74f, 12.749f, 9.914f, 13.622f)
                curveTo(10.087f, 14.495f, 9.998f, 15.4f, 9.657f, 16.222f)
                curveTo(9.317f, 17.044f, 8.74f, 17.747f, 8.0f, 18.242f)
                close()
                moveTo(5.854f, 12.146f)
                curveTo(5.76f, 12.053f, 5.633f, 12.0f, 5.5f, 12.0f)
                curveTo(5.367f, 12.0f, 5.24f, 12.053f, 5.146f, 12.146f)
                curveTo(5.053f, 12.24f, 5.0f, 12.367f, 5.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 14.0f, 3.24f, 14.053f, 3.146f, 14.146f)
                curveTo(3.053f, 14.24f, 3.0f, 14.367f, 3.0f, 14.5f)
                curveTo(3.0f, 14.633f, 3.053f, 14.76f, 3.146f, 14.854f)
                curveTo(3.24f, 14.947f, 3.367f, 15.0f, 3.5f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 16.633f, 5.053f, 16.76f, 5.146f, 16.854f)
                curveTo(5.24f, 16.947f, 5.367f, 17.0f, 5.5f, 17.0f)
                curveTo(5.633f, 17.0f, 5.76f, 16.947f, 5.854f, 16.854f)
                curveTo(5.947f, 16.76f, 6.0f, 16.633f, 6.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                curveTo(7.633f, 15.0f, 7.76f, 14.947f, 7.854f, 14.854f)
                curveTo(7.947f, 14.76f, 8.0f, 14.633f, 8.0f, 14.5f)
                curveTo(8.0f, 14.367f, 7.947f, 14.24f, 7.854f, 14.146f)
                curveTo(7.76f, 14.053f, 7.633f, 14.0f, 7.5f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.5f)
                curveTo(6.0f, 12.367f, 5.947f, 12.24f, 5.854f, 12.146f)
                close()
            }
        }
        .build()
        return _gaugeAdd!!
    }

@Suppress("ObjectPropertyName")
private var _gaugeAdd: ImageVector? = null

@Preview
@Composable
private fun GaugeAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GaugeAdd, contentDescription = null)
    }
}

