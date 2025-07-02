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
 * FormSparkle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: form, sparkle
 * - Source: ic_fluent_form_sparkle_20_filled.svg
 * 
 * @return The [ImageVector] for the FormSparkle icon.
 */
public val FluentIcons.Filled.FormSparkle: ImageVector
    get() {
        if (_formSparkle != null) {
            return _formSparkle!!
        }
        _formSparkle = Builder(name = "FormSparkle", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.878f, 0.282f)
                lineTo(15.226f, 1.353f)
                curveTo(15.334f, 1.679f, 15.517f, 1.974f, 15.76f, 2.217f)
                curveTo(16.003f, 2.46f, 16.299f, 2.642f, 16.625f, 2.75f)
                lineTo(17.696f, 3.098f)
                lineTo(17.718f, 3.104f)
                curveTo(17.8f, 3.133f, 17.872f, 3.187f, 17.922f, 3.258f)
                curveTo(17.973f, 3.33f, 18.0f, 3.415f, 18.0f, 3.503f)
                curveTo(18.0f, 3.59f, 17.973f, 3.676f, 17.922f, 3.747f)
                curveTo(17.872f, 3.818f, 17.8f, 3.872f, 17.718f, 3.902f)
                lineTo(16.646f, 4.25f)
                curveTo(16.32f, 4.358f, 16.024f, 4.54f, 15.781f, 4.783f)
                curveTo(15.538f, 5.026f, 15.356f, 5.321f, 15.248f, 5.647f)
                lineTo(14.899f, 6.718f)
                curveTo(14.87f, 6.8f, 14.816f, 6.872f, 14.745f, 6.922f)
                curveTo(14.673f, 6.973f, 14.588f, 7.0f, 14.5f, 7.0f)
                curveTo(14.412f, 7.0f, 14.327f, 6.973f, 14.255f, 6.922f)
                curveTo(14.248f, 6.917f, 14.242f, 6.912f, 14.235f, 6.907f)
                curveTo(14.174f, 6.858f, 14.127f, 6.792f, 14.101f, 6.718f)
                lineTo(13.752f, 5.647f)
                curveTo(13.734f, 5.59f, 13.713f, 5.534f, 13.69f, 5.479f)
                curveTo(13.58f, 5.219f, 13.42f, 4.981f, 13.22f, 4.78f)
                curveTo(13.182f, 4.742f, 13.142f, 4.705f, 13.101f, 4.67f)
                curveTo(12.883f, 4.481f, 12.629f, 4.336f, 12.354f, 4.244f)
                lineTo(11.283f, 3.896f)
                curveTo(11.2f, 3.867f, 11.128f, 3.813f, 11.078f, 3.742f)
                curveTo(11.027f, 3.67f, 11.0f, 3.585f, 11.0f, 3.497f)
                curveTo(11.0f, 3.41f, 11.027f, 3.324f, 11.078f, 3.253f)
                curveTo(11.128f, 3.182f, 11.2f, 3.128f, 11.283f, 3.098f)
                lineTo(12.354f, 2.75f)
                curveTo(12.676f, 2.639f, 12.968f, 2.455f, 13.207f, 2.213f)
                curveTo(13.445f, 1.971f, 13.625f, 1.676f, 13.731f, 1.353f)
                lineTo(14.079f, 0.282f)
                curveTo(14.108f, 0.2f, 14.163f, 0.128f, 14.234f, 0.078f)
                curveTo(14.306f, 0.027f, 14.391f, 0.0f, 14.479f, 0.0f)
                curveTo(14.566f, 0.0f, 14.652f, 0.027f, 14.723f, 0.078f)
                curveTo(14.795f, 0.128f, 14.849f, 0.2f, 14.878f, 0.282f)
                close()
                moveTo(19.783f, 8.213f)
                lineTo(19.017f, 7.965f)
                curveTo(18.785f, 7.887f, 18.573f, 7.757f, 18.4f, 7.584f)
                curveTo(18.226f, 7.41f, 18.096f, 7.199f, 18.019f, 6.966f)
                lineTo(17.77f, 6.202f)
                curveTo(17.749f, 6.143f, 17.71f, 6.092f, 17.659f, 6.056f)
                curveTo(17.608f, 6.019f, 17.547f, 6.0f, 17.485f, 6.0f)
                curveTo(17.422f, 6.0f, 17.361f, 6.019f, 17.31f, 6.056f)
                curveTo(17.259f, 6.092f, 17.22f, 6.143f, 17.2f, 6.202f)
                lineTo(16.951f, 6.966f)
                curveTo(16.875f, 7.197f, 16.747f, 7.408f, 16.576f, 7.581f)
                curveTo(16.406f, 7.754f, 16.197f, 7.885f, 15.967f, 7.965f)
                lineTo(15.202f, 8.213f)
                curveTo(15.143f, 8.234f, 15.092f, 8.273f, 15.056f, 8.324f)
                curveTo(15.019f, 8.375f, 15.0f, 8.436f, 15.0f, 8.498f)
                curveTo(15.0f, 8.561f, 15.019f, 8.622f, 15.056f, 8.673f)
                curveTo(15.092f, 8.724f, 15.143f, 8.762f, 15.202f, 8.783f)
                lineTo(15.967f, 9.032f)
                curveTo(16.2f, 9.109f, 16.412f, 9.24f, 16.586f, 9.414f)
                curveTo(16.759f, 9.588f, 16.889f, 9.8f, 16.966f, 10.033f)
                lineTo(17.215f, 10.798f)
                curveTo(17.236f, 10.857f, 17.274f, 10.908f, 17.325f, 10.944f)
                curveTo(17.376f, 10.981f, 17.437f, 11.0f, 17.5f, 11.0f)
                curveTo(17.563f, 11.0f, 17.624f, 10.981f, 17.675f, 10.944f)
                curveTo(17.726f, 10.908f, 17.764f, 10.857f, 17.785f, 10.798f)
                lineTo(18.034f, 10.033f)
                curveTo(18.111f, 9.801f, 18.242f, 9.59f, 18.415f, 9.416f)
                curveTo(18.589f, 9.243f, 18.8f, 9.113f, 19.033f, 9.035f)
                lineTo(19.798f, 8.787f)
                curveTo(19.857f, 8.766f, 19.908f, 8.727f, 19.944f, 8.676f)
                curveTo(19.981f, 8.625f, 20.0f, 8.564f, 20.0f, 8.502f)
                curveTo(20.0f, 8.439f, 19.981f, 8.378f, 19.944f, 8.327f)
                curveTo(19.908f, 8.276f, 19.857f, 8.238f, 19.798f, 8.217f)
                lineTo(19.783f, 8.213f)
                close()
                moveTo(6.5f, 10.0f)
                curveTo(6.224f, 10.0f, 6.0f, 9.776f, 6.0f, 9.5f)
                curveTo(6.0f, 9.224f, 6.224f, 9.0f, 6.5f, 9.0f)
                curveTo(6.776f, 9.0f, 7.0f, 9.224f, 7.0f, 9.5f)
                curveTo(7.0f, 9.776f, 6.776f, 10.0f, 6.5f, 10.0f)
                close()
                moveTo(7.0f, 13.5f)
                curveTo(7.0f, 13.776f, 6.776f, 14.0f, 6.5f, 14.0f)
                curveTo(6.224f, 14.0f, 6.0f, 13.776f, 6.0f, 13.5f)
                curveTo(6.0f, 13.224f, 6.224f, 13.0f, 6.5f, 13.0f)
                curveTo(6.776f, 13.0f, 7.0f, 13.224f, 7.0f, 13.5f)
                close()
                moveTo(6.0f, 3.0f)
                horizontalLineTo(10.105f)
                curveTo(10.041f, 3.158f, 10.005f, 3.328f, 10.0f, 3.5f)
                curveTo(10.003f, 3.8f, 10.102f, 4.092f, 10.282f, 4.333f)
                curveTo(10.462f, 4.574f, 10.713f, 4.751f, 11.0f, 4.84f)
                lineTo(11.489f, 5.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 5.0f, 5.0f, 5.224f, 5.0f, 5.5f)
                curveTo(5.0f, 5.776f, 5.224f, 6.0f, 5.5f, 6.0f)
                horizontalLineTo(12.833f)
                lineTo(13.15f, 7.0f)
                curveTo(13.24f, 7.258f, 13.399f, 7.486f, 13.61f, 7.66f)
                curveTo(13.742f, 7.758f, 13.891f, 7.829f, 14.05f, 7.87f)
                curveTo(13.982f, 8.073f, 13.965f, 8.289f, 14.0f, 8.5f)
                curveTo(13.999f, 8.673f, 14.033f, 8.843f, 14.099f, 9.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 9.0f, 9.0f, 9.224f, 9.0f, 9.5f)
                curveTo(9.0f, 9.776f, 9.224f, 10.0f, 9.5f, 10.0f)
                horizontalLineTo(14.5f)
                curveTo(14.685f, 10.0f, 14.847f, 9.899f, 14.933f, 9.75f)
                lineTo(15.66f, 9.98f)
                curveTo(15.741f, 10.013f, 15.816f, 10.061f, 15.88f, 10.12f)
                curveTo(15.944f, 10.185f, 15.992f, 10.264f, 16.02f, 10.35f)
                lineTo(16.26f, 11.11f)
                curveTo(16.353f, 11.372f, 16.524f, 11.599f, 16.75f, 11.76f)
                curveTo(16.828f, 11.816f, 16.912f, 11.863f, 17.0f, 11.9f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.657f, 15.657f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 17.0f, 3.0f, 15.657f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(7.328f, 11.0f, 8.0f, 10.328f, 8.0f, 9.5f)
                curveTo(8.0f, 8.672f, 7.328f, 8.0f, 6.5f, 8.0f)
                curveTo(5.672f, 8.0f, 5.0f, 8.672f, 5.0f, 9.5f)
                curveTo(5.0f, 10.328f, 5.672f, 11.0f, 6.5f, 11.0f)
                close()
                moveTo(8.0f, 13.5f)
                curveTo(8.0f, 12.672f, 7.328f, 12.0f, 6.5f, 12.0f)
                curveTo(5.672f, 12.0f, 5.0f, 12.672f, 5.0f, 13.5f)
                curveTo(5.0f, 14.328f, 5.672f, 15.0f, 6.5f, 15.0f)
                curveTo(7.328f, 15.0f, 8.0f, 14.328f, 8.0f, 13.5f)
                close()
                moveTo(9.5f, 13.0f)
                curveTo(9.224f, 13.0f, 9.0f, 13.224f, 9.0f, 13.5f)
                curveTo(9.0f, 13.776f, 9.224f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 14.0f, 15.0f, 13.776f, 15.0f, 13.5f)
                curveTo(15.0f, 13.224f, 14.776f, 13.0f, 14.5f, 13.0f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _formSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _formSparkle: ImageVector? = null

@Preview
@Composable
private fun FormSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FormSparkle, contentDescription = null)
    }
}

