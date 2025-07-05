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
 * PlayMultiple Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent playing all.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_play_multiple_16_regular.svg)
 * 
 * @return The [ImageVector] for the PlayMultiple icon.
 */
public val FluentIcons.Regular.PlayMultiple: ImageVector
    get() {
        if (_playMultiple != null) {
            return _playMultiple!!
        }
        _playMultiple = Builder(name = "PlayMultiple", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.439f, 12.561f)
                curveTo(4.721f, 12.842f, 5.102f, 13.0f, 5.5f, 13.0f)
                curveTo(5.758f, 12.998f, 6.01f, 12.931f, 6.235f, 12.805f)
                lineTo(14.235f, 8.305f)
                curveTo(14.466f, 8.174f, 14.658f, 7.984f, 14.792f, 7.755f)
                curveTo(14.926f, 7.526f, 14.996f, 7.265f, 14.996f, 6.999f)
                curveTo(14.996f, 6.734f, 14.926f, 6.473f, 14.792f, 6.244f)
                curveTo(14.658f, 6.014f, 14.466f, 5.825f, 14.235f, 5.694f)
                lineTo(6.225f, 1.188f)
                curveTo(5.996f, 1.068f, 5.74f, 1.008f, 5.481f, 1.014f)
                curveTo(5.223f, 1.02f, 4.97f, 1.093f, 4.747f, 1.224f)
                curveTo(4.524f, 1.356f, 4.339f, 1.542f, 4.208f, 1.765f)
                curveTo(4.077f, 1.988f, 4.006f, 2.241f, 4.0f, 2.5f)
                verticalLineTo(11.5f)
                curveTo(4.0f, 11.898f, 4.158f, 12.279f, 4.439f, 12.561f)
                close()
                moveTo(5.146f, 2.146f)
                curveTo(5.24f, 2.053f, 5.367f, 2.0f, 5.5f, 2.0f)
                curveTo(5.586f, 2.001f, 5.67f, 2.023f, 5.745f, 2.065f)
                lineTo(13.745f, 6.565f)
                curveTo(13.822f, 6.609f, 13.886f, 6.672f, 13.931f, 6.748f)
                curveTo(13.975f, 6.825f, 13.998f, 6.911f, 13.998f, 7.0f)
                curveTo(13.998f, 7.088f, 13.975f, 7.175f, 13.931f, 7.252f)
                curveTo(13.886f, 7.328f, 13.822f, 7.391f, 13.745f, 7.435f)
                lineTo(5.755f, 11.929f)
                curveTo(5.68f, 11.977f, 5.593f, 12.003f, 5.504f, 12.005f)
                curveTo(5.414f, 12.007f, 5.326f, 11.985f, 5.249f, 11.941f)
                curveTo(5.171f, 11.897f, 5.107f, 11.833f, 5.063f, 11.755f)
                curveTo(5.019f, 11.677f, 4.998f, 11.589f, 5.0f, 11.5f)
                verticalLineTo(2.5f)
                curveTo(5.0f, 2.367f, 5.053f, 2.24f, 5.146f, 2.146f)
                close()
                moveTo(11.76f, 10.84f)
                lineTo(12.98f, 10.16f)
                curveTo(12.992f, 10.243f, 12.999f, 10.326f, 13.0f, 10.41f)
                curveTo(13.0f, 10.676f, 12.929f, 10.937f, 12.796f, 11.167f)
                curveTo(12.662f, 11.397f, 12.471f, 11.588f, 12.24f, 11.72f)
                lineTo(7.16f, 14.58f)
                curveTo(6.648f, 14.851f, 6.079f, 14.995f, 5.5f, 15.0f)
                curveTo(5.192f, 15.002f, 4.885f, 14.958f, 4.59f, 14.87f)
                curveTo(3.983f, 14.715f, 3.432f, 14.393f, 3.0f, 13.94f)
                curveTo(2.358f, 13.29f, 1.999f, 12.413f, 2.0f, 11.5f)
                verticalLineTo(5.91f)
                curveTo(2.003f, 5.603f, 2.1f, 5.305f, 2.279f, 5.056f)
                curveTo(2.458f, 4.807f, 2.71f, 4.62f, 3.0f, 4.52f)
                verticalLineTo(11.5f)
                curveTo(3.004f, 11.932f, 3.12f, 12.356f, 3.336f, 12.731f)
                curveTo(3.552f, 13.105f, 3.861f, 13.417f, 4.233f, 13.637f)
                curveTo(4.605f, 13.858f, 5.027f, 13.978f, 5.46f, 13.987f)
                curveTo(5.892f, 13.997f, 6.319f, 13.894f, 6.7f, 13.69f)
                lineTo(11.75f, 10.85f)
                curveTo(11.753f, 10.85f, 11.755f, 10.849f, 11.757f, 10.847f)
                curveTo(11.759f, 10.845f, 11.76f, 10.843f, 11.76f, 10.84f)
                close()
            }
        }
        .build()
        return _playMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _playMultiple: ImageVector? = null

@Preview
@Composable
private fun PlayMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlayMultiple, contentDescription = "PlayMultiple Icon")
    }
}

