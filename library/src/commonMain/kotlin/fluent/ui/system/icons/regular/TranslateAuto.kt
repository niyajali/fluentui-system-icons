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
 * TranslateAuto icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: translate, auto
 * - Source: ic_fluent_translate_auto_24_regular.svg
 * 
 * @return The [ImageVector] for the TranslateAuto icon.
 */
public val FluentIcons.Regular.TranslateAuto: ImageVector
    get() {
        if (_translateAuto != null) {
            return _translateAuto!!
        }
        _translateAuto = Builder(name = "TranslateAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.807f, 1.53f)
                curveTo(12.394f, 1.499f, 12.033f, 1.808f, 12.002f, 2.221f)
                curveTo(11.97f, 2.634f, 12.28f, 2.995f, 12.693f, 3.026f)
                curveTo(14.269f, 3.146f, 15.732f, 3.672f, 16.977f, 4.5f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 4.5f, 15.5f, 4.836f, 15.5f, 5.25f)
                curveTo(15.5f, 5.664f, 15.836f, 6.0f, 16.25f, 6.0f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 6.0f, 19.5f, 5.664f, 19.5f, 5.25f)
                verticalLineTo(2.75f)
                curveTo(19.5f, 2.336f, 19.164f, 2.0f, 18.75f, 2.0f)
                curveTo(18.336f, 2.0f, 18.0f, 2.336f, 18.0f, 2.75f)
                verticalLineTo(3.382f)
                curveTo(16.507f, 2.341f, 14.729f, 1.677f, 12.807f, 1.53f)
                close()
                moveTo(7.75f, 19.5f)
                horizontalLineTo(7.023f)
                curveTo(8.269f, 20.329f, 9.733f, 20.854f, 11.31f, 20.974f)
                curveTo(11.723f, 21.005f, 12.033f, 21.365f, 12.001f, 21.778f)
                curveTo(11.97f, 22.191f, 11.61f, 22.501f, 11.197f, 22.47f)
                curveTo(9.273f, 22.324f, 7.494f, 21.66f, 6.0f, 20.618f)
                verticalLineTo(21.25f)
                curveTo(6.0f, 21.664f, 5.664f, 22.0f, 5.25f, 22.0f)
                curveTo(4.836f, 22.0f, 4.5f, 21.664f, 4.5f, 21.25f)
                verticalLineTo(18.75f)
                curveTo(4.5f, 18.336f, 4.836f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 18.0f, 8.5f, 18.336f, 8.5f, 18.75f)
                curveTo(8.5f, 19.164f, 8.164f, 19.5f, 7.75f, 19.5f)
                close()
                moveTo(7.961f, 5.53f)
                curveTo(5.721f, 4.878f, 3.958f, 5.681f, 3.385f, 5.997f)
                curveTo(3.022f, 6.197f, 2.891f, 6.653f, 3.091f, 7.016f)
                curveTo(3.291f, 7.379f, 3.747f, 7.51f, 4.11f, 7.31f)
                curveTo(4.515f, 7.087f, 5.846f, 6.477f, 7.541f, 6.97f)
                curveTo(8.314f, 7.197f, 8.639f, 7.609f, 8.805f, 8.026f)
                curveTo(8.938f, 8.358f, 8.98f, 8.717f, 8.993f, 9.068f)
                curveTo(8.723f, 8.993f, 8.412f, 8.918f, 8.07f, 8.857f)
                curveTo(6.938f, 8.656f, 5.388f, 8.595f, 3.948f, 9.284f)
                curveTo(2.362f, 10.044f, 1.817f, 11.601f, 2.046f, 12.981f)
                curveTo(2.27f, 14.338f, 3.262f, 15.648f, 4.846f, 15.933f)
                curveTo(6.276f, 16.19f, 7.651f, 15.677f, 8.603f, 15.172f)
                curveTo(8.742f, 15.098f, 8.874f, 15.023f, 8.998f, 14.949f)
                verticalLineTo(15.25f)
                curveTo(8.998f, 15.664f, 9.334f, 16.0f, 9.748f, 16.0f)
                curveTo(10.163f, 16.0f, 10.498f, 15.664f, 10.498f, 15.25f)
                lineTo(10.498f, 9.46f)
                curveTo(10.499f, 9.006f, 10.499f, 8.224f, 10.199f, 7.47f)
                curveTo(9.868f, 6.641f, 9.194f, 5.892f, 7.962f, 5.53f)
                lineTo(7.961f, 5.53f)
                close()
                moveTo(8.998f, 10.639f)
                verticalLineTo(13.144f)
                curveTo(8.966f, 13.169f, 8.931f, 13.195f, 8.893f, 13.223f)
                curveTo(8.653f, 13.399f, 8.309f, 13.63f, 7.9f, 13.847f)
                curveTo(7.059f, 14.293f, 6.05f, 14.626f, 5.112f, 14.457f)
                curveTo(4.267f, 14.305f, 3.667f, 13.591f, 3.526f, 12.737f)
                curveTo(3.388f, 11.906f, 3.705f, 11.064f, 4.596f, 10.637f)
                curveTo(5.633f, 10.14f, 6.822f, 10.159f, 7.808f, 10.334f)
                curveTo(8.291f, 10.42f, 8.706f, 10.54f, 8.998f, 10.639f)
                close()
                moveTo(16.961f, 7.986f)
                curveTo(17.091f, 7.593f, 16.878f, 7.169f, 16.485f, 7.038f)
                curveTo(16.092f, 6.908f, 15.667f, 7.121f, 15.537f, 7.514f)
                curveTo(15.389f, 7.959f, 15.233f, 8.554f, 15.117f, 9.026f)
                curveTo(14.381f, 9.051f, 13.672f, 9.044f, 13.05f, 9.002f)
                curveTo(12.637f, 8.973f, 12.279f, 9.286f, 12.251f, 9.699f)
                curveTo(12.223f, 10.112f, 12.535f, 10.47f, 12.948f, 10.498f)
                curveTo(13.511f, 10.537f, 14.138f, 10.549f, 14.792f, 10.535f)
                curveTo(14.649f, 11.301f, 14.551f, 11.985f, 14.492f, 12.599f)
                curveTo(13.277f, 13.242f, 12.431f, 14.104f, 11.954f, 15.012f)
                curveTo(11.34f, 16.177f, 11.293f, 17.568f, 12.159f, 18.455f)
                curveTo(12.731f, 19.039f, 13.567f, 19.095f, 14.288f, 18.94f)
                curveTo(14.694f, 18.853f, 15.114f, 18.692f, 15.528f, 18.466f)
                lineTo(15.536f, 18.486f)
                lineTo(15.546f, 18.512f)
                curveTo(15.691f, 18.9f, 16.123f, 19.097f, 16.511f, 18.953f)
                curveTo(16.899f, 18.808f, 17.096f, 18.376f, 16.951f, 17.988f)
                curveTo(16.895f, 17.836f, 16.838f, 17.696f, 16.781f, 17.564f)
                curveTo(17.804f, 16.628f, 18.696f, 15.255f, 19.066f, 13.517f)
                curveTo(19.704f, 13.829f, 20.135f, 14.353f, 20.344f, 14.916f)
                curveTo(20.572f, 15.53f, 20.557f, 16.229f, 20.247f, 16.869f)
                curveTo(19.94f, 17.504f, 19.315f, 18.134f, 18.232f, 18.55f)
                curveTo(17.845f, 18.699f, 17.652f, 19.132f, 17.801f, 19.519f)
                curveTo(17.95f, 19.906f, 18.384f, 20.099f, 18.77f, 19.95f)
                curveTo(20.157f, 19.417f, 21.101f, 18.548f, 21.597f, 17.523f)
                curveTo(22.091f, 16.503f, 22.115f, 15.379f, 21.751f, 14.395f)
                curveTo(21.338f, 13.28f, 20.451f, 12.385f, 19.247f, 11.972f)
                curveTo(19.249f, 11.898f, 19.249f, 11.824f, 19.249f, 11.75f)
                curveTo(19.249f, 11.336f, 18.914f, 11.0f, 18.499f, 11.0f)
                curveTo(18.094f, 11.0f, 17.764f, 11.321f, 17.75f, 11.723f)
                curveTo(17.225f, 11.719f, 16.665f, 11.794f, 16.078f, 11.961f)
                curveTo(16.141f, 11.506f, 16.225f, 11.007f, 16.335f, 10.461f)
                curveTo(17.519f, 10.372f, 18.698f, 10.209f, 19.671f, 9.98f)
                curveTo(20.074f, 9.885f, 20.324f, 9.482f, 20.229f, 9.078f)
                curveTo(20.135f, 8.675f, 19.731f, 8.425f, 19.328f, 8.52f)
                curveTo(18.56f, 8.7f, 17.638f, 8.838f, 16.69f, 8.926f)
                curveTo(16.776f, 8.596f, 16.871f, 8.255f, 16.961f, 7.986f)
                close()
                moveTo(13.281f, 15.71f)
                curveTo(13.507f, 15.28f, 13.881f, 14.823f, 14.427f, 14.41f)
                curveTo(14.444f, 14.901f, 14.493f, 15.335f, 14.564f, 15.727f)
                curveTo(14.658f, 16.246f, 14.8f, 16.701f, 14.95f, 17.1f)
                curveTo(14.645f, 17.271f, 14.318f, 17.399f, 13.973f, 17.473f)
                curveTo(13.488f, 17.577f, 13.286f, 17.462f, 13.231f, 17.405f)
                curveTo(12.992f, 17.161f, 12.837f, 16.553f, 13.281f, 15.71f)
                close()
                moveTo(17.595f, 13.222f)
                curveTo(17.386f, 14.189f, 16.895f, 15.245f, 16.182f, 16.07f)
                curveTo(16.129f, 15.887f, 16.081f, 15.686f, 16.04f, 15.459f)
                curveTo(15.951f, 14.969f, 15.9f, 14.367f, 15.928f, 13.593f)
                curveTo(16.037f, 13.551f, 16.15f, 13.51f, 16.267f, 13.472f)
                curveTo(16.748f, 13.313f, 17.192f, 13.235f, 17.595f, 13.222f)
                close()
            }
        }
        .build()
        return _translateAuto!!
    }

@Suppress("ObjectPropertyName")
private var _translateAuto: ImageVector? = null

@Preview
@Composable
private fun TranslateAutoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TranslateAuto, contentDescription = null)
    }
}

