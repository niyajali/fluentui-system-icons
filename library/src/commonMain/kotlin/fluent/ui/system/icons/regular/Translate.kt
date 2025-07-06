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
 * Translate Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general translation scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_translate_24_regular.svg)
 * 
 * @return The [ImageVector] for the Translate icon.
 */
public val FluentIcons.Regular.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.385f, 5.997f)
                curveTo(3.958f, 5.681f, 5.721f, 4.878f, 7.961f, 5.53f)
                lineTo(7.962f, 5.53f)
                curveTo(9.194f, 5.892f, 9.868f, 6.641f, 10.199f, 7.47f)
                curveTo(10.499f, 8.224f, 10.499f, 9.006f, 10.498f, 9.46f)
                lineTo(10.498f, 15.25f)
                curveTo(10.498f, 15.664f, 10.163f, 16.0f, 9.748f, 16.0f)
                curveTo(9.334f, 16.0f, 8.998f, 15.664f, 8.998f, 15.25f)
                verticalLineTo(14.949f)
                curveTo(8.874f, 15.023f, 8.742f, 15.098f, 8.603f, 15.172f)
                curveTo(7.651f, 15.677f, 6.276f, 16.19f, 4.846f, 15.933f)
                curveTo(3.262f, 15.648f, 2.27f, 14.338f, 2.046f, 12.981f)
                curveTo(1.817f, 11.601f, 2.362f, 10.044f, 3.948f, 9.284f)
                curveTo(5.388f, 8.595f, 6.938f, 8.656f, 8.07f, 8.857f)
                curveTo(8.412f, 8.918f, 8.723f, 8.993f, 8.993f, 9.068f)
                curveTo(8.98f, 8.717f, 8.938f, 8.358f, 8.805f, 8.026f)
                curveTo(8.639f, 7.609f, 8.314f, 7.197f, 7.541f, 6.97f)
                curveTo(5.846f, 6.477f, 4.515f, 7.087f, 4.11f, 7.31f)
                curveTo(3.747f, 7.51f, 3.291f, 7.379f, 3.091f, 7.016f)
                curveTo(2.891f, 6.653f, 3.022f, 6.197f, 3.385f, 5.997f)
                close()
                moveTo(7.808f, 10.334f)
                curveTo(6.822f, 10.159f, 5.633f, 10.14f, 4.596f, 10.637f)
                curveTo(3.705f, 11.064f, 3.388f, 11.906f, 3.526f, 12.737f)
                curveTo(3.667f, 13.591f, 4.267f, 14.305f, 5.112f, 14.457f)
                curveTo(6.05f, 14.626f, 7.059f, 14.293f, 7.9f, 13.847f)
                curveTo(8.309f, 13.63f, 8.653f, 13.399f, 8.893f, 13.223f)
                curveTo(8.931f, 13.195f, 8.966f, 13.169f, 8.998f, 13.144f)
                verticalLineTo(10.638f)
                curveTo(8.706f, 10.54f, 8.291f, 10.42f, 7.808f, 10.334f)
                close()
                moveTo(16.485f, 7.038f)
                curveTo(16.878f, 7.169f, 17.091f, 7.593f, 16.961f, 7.986f)
                curveTo(16.871f, 8.255f, 16.776f, 8.596f, 16.69f, 8.926f)
                curveTo(17.638f, 8.838f, 18.56f, 8.7f, 19.328f, 8.52f)
                curveTo(19.731f, 8.425f, 20.135f, 8.675f, 20.229f, 9.078f)
                curveTo(20.324f, 9.482f, 20.074f, 9.885f, 19.671f, 9.98f)
                curveTo(18.698f, 10.208f, 17.519f, 10.372f, 16.335f, 10.461f)
                curveTo(16.225f, 11.007f, 16.141f, 11.506f, 16.078f, 11.961f)
                curveTo(16.665f, 11.794f, 17.225f, 11.719f, 17.75f, 11.723f)
                curveTo(17.764f, 11.321f, 18.094f, 11.0f, 18.499f, 11.0f)
                curveTo(18.914f, 11.0f, 19.249f, 11.336f, 19.249f, 11.75f)
                curveTo(19.249f, 11.824f, 19.249f, 11.898f, 19.247f, 11.972f)
                curveTo(20.451f, 12.385f, 21.338f, 13.28f, 21.751f, 14.395f)
                curveTo(22.115f, 15.379f, 22.091f, 16.503f, 21.597f, 17.523f)
                curveTo(21.101f, 18.548f, 20.157f, 19.417f, 18.77f, 19.95f)
                curveTo(18.384f, 20.099f, 17.95f, 19.906f, 17.801f, 19.519f)
                curveTo(17.652f, 19.132f, 17.845f, 18.699f, 18.232f, 18.55f)
                curveTo(19.315f, 18.134f, 19.94f, 17.504f, 20.247f, 16.869f)
                curveTo(20.557f, 16.229f, 20.572f, 15.53f, 20.344f, 14.916f)
                curveTo(20.135f, 14.353f, 19.704f, 13.829f, 19.066f, 13.517f)
                curveTo(18.696f, 15.255f, 17.804f, 16.628f, 16.781f, 17.564f)
                curveTo(16.838f, 17.696f, 16.895f, 17.836f, 16.951f, 17.988f)
                curveTo(17.096f, 18.376f, 16.899f, 18.808f, 16.511f, 18.953f)
                curveTo(16.123f, 19.097f, 15.691f, 18.9f, 15.546f, 18.512f)
                curveTo(15.54f, 18.497f, 15.535f, 18.481f, 15.528f, 18.466f)
                curveTo(15.114f, 18.692f, 14.694f, 18.853f, 14.288f, 18.94f)
                curveTo(13.567f, 19.095f, 12.731f, 19.039f, 12.159f, 18.455f)
                curveTo(11.293f, 17.568f, 11.34f, 16.177f, 11.954f, 15.012f)
                curveTo(12.431f, 14.104f, 13.277f, 13.242f, 14.492f, 12.599f)
                curveTo(14.551f, 11.985f, 14.649f, 11.301f, 14.792f, 10.535f)
                curveTo(14.138f, 10.549f, 13.511f, 10.537f, 12.948f, 10.498f)
                curveTo(12.535f, 10.47f, 12.223f, 10.112f, 12.251f, 9.699f)
                curveTo(12.279f, 9.285f, 12.637f, 8.973f, 13.05f, 9.002f)
                curveTo(13.672f, 9.044f, 14.381f, 9.051f, 15.117f, 9.026f)
                curveTo(15.233f, 8.554f, 15.389f, 7.959f, 15.537f, 7.514f)
                curveTo(15.667f, 7.121f, 16.092f, 6.908f, 16.485f, 7.038f)
                close()
                moveTo(14.427f, 14.41f)
                curveTo(13.881f, 14.823f, 13.507f, 15.28f, 13.281f, 15.71f)
                curveTo(12.837f, 16.553f, 12.992f, 17.161f, 13.231f, 17.405f)
                curveTo(13.286f, 17.462f, 13.488f, 17.577f, 13.973f, 17.473f)
                curveTo(14.318f, 17.399f, 14.645f, 17.271f, 14.95f, 17.1f)
                curveTo(14.8f, 16.701f, 14.658f, 16.246f, 14.564f, 15.727f)
                curveTo(14.493f, 15.335f, 14.444f, 14.901f, 14.427f, 14.41f)
                close()
                moveTo(16.182f, 16.07f)
                curveTo(16.895f, 15.245f, 17.386f, 14.189f, 17.595f, 13.222f)
                curveTo(17.192f, 13.235f, 16.748f, 13.313f, 16.267f, 13.472f)
                curveTo(16.15f, 13.51f, 16.037f, 13.551f, 15.928f, 13.593f)
                curveTo(15.9f, 14.367f, 15.951f, 14.969f, 16.04f, 15.459f)
                curveTo(16.081f, 15.686f, 16.129f, 15.887f, 16.182f, 16.07f)
                close()
            }
        }
        .build()
        return _translate!!
    }

@Suppress("ObjectPropertyName")
private var _translate: ImageVector? = null

@Preview
@Composable
private fun TranslatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Translate, contentDescription = "Translate Icon")
    }
}

