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
 * TranslateOff Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent turning off translation needs.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_translate_off_24_regular.svg)
 * 
 * @return The [ImageVector] for the TranslateOff icon.
 */
public val FluentIcons.Regular.TranslateOff: ImageVector
    get() {
        if (_translateOff != null) {
            return _translateOff!!
        }
        _translateOff = Builder(name = "TranslateOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4.481f, 5.542f)
                curveTo(3.976f, 5.694f, 3.598f, 5.879f, 3.385f, 5.997f)
                curveTo(3.022f, 6.197f, 2.891f, 6.653f, 3.091f, 7.016f)
                curveTo(3.291f, 7.378f, 3.747f, 7.51f, 4.11f, 7.31f)
                curveTo(4.356f, 7.174f, 4.944f, 6.896f, 5.748f, 6.809f)
                lineTo(7.744f, 8.805f)
                curveTo(6.651f, 8.651f, 5.254f, 8.659f, 3.948f, 9.284f)
                curveTo(2.362f, 10.044f, 1.817f, 11.601f, 2.046f, 12.981f)
                curveTo(2.27f, 14.338f, 3.262f, 15.648f, 4.846f, 15.933f)
                curveTo(6.276f, 16.19f, 7.651f, 15.677f, 8.603f, 15.172f)
                curveTo(8.742f, 15.098f, 8.874f, 15.023f, 8.998f, 14.949f)
                verticalLineTo(15.25f)
                curveTo(8.998f, 15.664f, 9.334f, 16.0f, 9.748f, 16.0f)
                curveTo(10.163f, 16.0f, 10.498f, 15.664f, 10.498f, 15.25f)
                lineTo(10.498f, 11.559f)
                lineTo(12.796f, 13.857f)
                curveTo(12.444f, 14.223f, 12.163f, 14.613f, 11.954f, 15.012f)
                curveTo(11.34f, 16.177f, 11.293f, 17.568f, 12.159f, 18.454f)
                curveTo(12.731f, 19.039f, 13.567f, 19.095f, 14.288f, 18.94f)
                curveTo(14.694f, 18.853f, 15.114f, 18.691f, 15.528f, 18.466f)
                curveTo(15.535f, 18.481f, 15.54f, 18.497f, 15.546f, 18.512f)
                curveTo(15.691f, 18.9f, 16.123f, 19.097f, 16.511f, 18.952f)
                curveTo(16.886f, 18.812f, 17.083f, 18.403f, 16.964f, 18.025f)
                lineTo(17.838f, 18.899f)
                curveTo(17.74f, 19.084f, 17.72f, 19.309f, 17.801f, 19.519f)
                curveTo(17.95f, 19.906f, 18.384f, 20.098f, 18.77f, 19.95f)
                curveTo(18.799f, 19.939f, 18.827f, 19.928f, 18.855f, 19.917f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(14.542f, 15.603f)
                curveTo(14.549f, 15.645f, 14.556f, 15.686f, 14.564f, 15.727f)
                curveTo(14.658f, 16.246f, 14.8f, 16.701f, 14.95f, 17.1f)
                curveTo(14.645f, 17.271f, 14.318f, 17.399f, 13.973f, 17.473f)
                curveTo(13.488f, 17.577f, 13.286f, 17.462f, 13.231f, 17.405f)
                curveTo(12.992f, 17.161f, 12.837f, 16.553f, 13.281f, 15.71f)
                curveTo(13.418f, 15.45f, 13.608f, 15.181f, 13.857f, 14.918f)
                lineTo(14.542f, 15.603f)
                close()
                moveTo(20.247f, 16.869f)
                curveTo(20.226f, 16.912f, 20.204f, 16.955f, 20.18f, 16.998f)
                lineTo(21.268f, 18.086f)
                curveTo(21.394f, 17.905f, 21.503f, 17.716f, 21.597f, 17.523f)
                curveTo(22.091f, 16.503f, 22.115f, 15.379f, 21.751f, 14.395f)
                curveTo(21.338f, 13.279f, 20.451f, 12.385f, 19.247f, 11.972f)
                curveTo(19.249f, 11.898f, 19.249f, 11.824f, 19.249f, 11.75f)
                curveTo(19.249f, 11.336f, 18.914f, 11.0f, 18.499f, 11.0f)
                curveTo(18.094f, 11.0f, 17.764f, 11.321f, 17.75f, 11.723f)
                curveTo(17.225f, 11.719f, 16.665f, 11.794f, 16.078f, 11.961f)
                curveTo(16.141f, 11.505f, 16.225f, 11.007f, 16.335f, 10.461f)
                curveTo(17.519f, 10.372f, 18.698f, 10.208f, 19.671f, 9.98f)
                curveTo(20.074f, 9.885f, 20.324f, 9.482f, 20.229f, 9.078f)
                curveTo(20.135f, 8.675f, 19.731f, 8.425f, 19.328f, 8.52f)
                curveTo(18.56f, 8.7f, 17.638f, 8.838f, 16.69f, 8.926f)
                curveTo(16.776f, 8.596f, 16.871f, 8.255f, 16.961f, 7.986f)
                curveTo(17.091f, 7.593f, 16.878f, 7.169f, 16.485f, 7.038f)
                curveTo(16.092f, 6.908f, 15.667f, 7.12f, 15.537f, 7.514f)
                curveTo(15.389f, 7.959f, 15.233f, 8.553f, 15.117f, 9.026f)
                curveTo(14.381f, 9.051f, 13.672f, 9.044f, 13.05f, 9.002f)
                curveTo(12.808f, 8.985f, 12.585f, 9.085f, 12.436f, 9.254f)
                lineTo(13.715f, 10.533f)
                curveTo(14.061f, 10.542f, 14.422f, 10.543f, 14.792f, 10.535f)
                curveTo(14.732f, 10.856f, 14.68f, 11.161f, 14.636f, 11.454f)
                lineTo(16.564f, 13.382f)
                curveTo(16.932f, 13.283f, 17.276f, 13.232f, 17.595f, 13.222f)
                curveTo(17.53f, 13.522f, 17.438f, 13.831f, 17.321f, 14.139f)
                lineTo(18.465f, 15.283f)
                curveTo(18.723f, 14.746f, 18.93f, 14.156f, 19.066f, 13.517f)
                curveTo(19.704f, 13.829f, 20.135f, 14.352f, 20.344f, 14.916f)
                curveTo(20.572f, 15.53f, 20.557f, 16.229f, 20.247f, 16.869f)
                close()
                moveTo(7.808f, 10.334f)
                curveTo(8.291f, 10.42f, 8.706f, 10.54f, 8.998f, 10.638f)
                verticalLineTo(13.144f)
                curveTo(8.966f, 13.169f, 8.931f, 13.195f, 8.893f, 13.223f)
                curveTo(8.653f, 13.399f, 8.309f, 13.629f, 7.9f, 13.847f)
                curveTo(7.059f, 14.293f, 6.05f, 14.625f, 5.112f, 14.457f)
                curveTo(4.267f, 14.305f, 3.667f, 13.591f, 3.526f, 12.736f)
                curveTo(3.388f, 11.906f, 3.705f, 11.064f, 4.596f, 10.637f)
                curveTo(5.633f, 10.14f, 6.822f, 10.159f, 7.808f, 10.334f)
                close()
            }
        }
        .build()
        return _translateOff!!
    }

@Suppress("ObjectPropertyName")
private var _translateOff: ImageVector? = null

@Preview
@Composable
private fun TranslateOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TranslateOff, contentDescription = "TranslateOff Icon")
    }
}

