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
 * TextEffectsSparkle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, effects, sparkle
 * - Source: ic_fluent_text_effects_sparkle_24_regular.svg
 * 
 * @return The [ImageVector] for the TextEffectsSparkle icon.
 */
public val FluentIcons.Regular.TextEffectsSparkle: ImageVector
    get() {
        if (_textEffectsSparkle != null) {
            return _textEffectsSparkle!!
        }
        _textEffectsSparkle = Builder(name = "TextEffectsSparkle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.854f, 6.146f)
                curveTo(14.938f, 6.23f, 15.016f, 6.319f, 15.088f, 6.412f)
                curveTo(15.285f, 6.667f, 15.438f, 6.953f, 15.539f, 7.26f)
                lineTo(15.987f, 8.637f)
                curveTo(16.024f, 8.743f, 16.094f, 8.835f, 16.186f, 8.9f)
                curveTo(16.278f, 8.965f, 16.387f, 9.0f, 16.5f, 9.0f)
                curveTo(16.613f, 9.0f, 16.722f, 8.965f, 16.814f, 8.9f)
                curveTo(16.896f, 8.842f, 16.961f, 8.763f, 17.0f, 8.671f)
                curveTo(17.005f, 8.66f, 17.009f, 8.649f, 17.013f, 8.637f)
                lineTo(17.461f, 7.26f)
                curveTo(17.6f, 6.842f, 17.835f, 6.461f, 18.147f, 6.15f)
                curveTo(18.459f, 5.838f, 18.84f, 5.603f, 19.259f, 5.464f)
                lineTo(20.637f, 5.016f)
                curveTo(20.743f, 4.979f, 20.835f, 4.909f, 20.9f, 4.818f)
                curveTo(20.965f, 4.726f, 21.0f, 4.616f, 21.0f, 4.503f)
                curveTo(21.0f, 4.391f, 20.965f, 4.281f, 20.9f, 4.189f)
                curveTo(20.835f, 4.097f, 20.743f, 4.028f, 20.637f, 3.991f)
                lineTo(20.609f, 3.984f)
                lineTo(19.232f, 3.536f)
                curveTo(18.813f, 3.397f, 18.432f, 3.162f, 18.12f, 2.85f)
                curveTo(17.808f, 2.539f, 17.573f, 2.158f, 17.434f, 1.74f)
                lineTo(16.986f, 0.363f)
                curveTo(16.948f, 0.257f, 16.879f, 0.165f, 16.787f, 0.1f)
                curveTo(16.695f, 0.035f, 16.585f, 0.0f, 16.472f, 0.0f)
                curveTo(16.36f, 0.0f, 16.25f, 0.035f, 16.158f, 0.1f)
                curveTo(16.066f, 0.165f, 15.997f, 0.257f, 15.959f, 0.363f)
                lineTo(15.511f, 1.74f)
                lineTo(15.5f, 1.774f)
                curveTo(15.362f, 2.176f, 15.136f, 2.542f, 14.837f, 2.845f)
                curveTo(14.53f, 3.157f, 14.155f, 3.394f, 13.741f, 3.536f)
                lineTo(12.363f, 3.984f)
                curveTo(12.257f, 4.021f, 12.165f, 4.091f, 12.1f, 4.182f)
                curveTo(12.035f, 4.274f, 12.0f, 4.384f, 12.0f, 4.497f)
                curveTo(12.0f, 4.609f, 12.035f, 4.719f, 12.1f, 4.811f)
                curveTo(12.165f, 4.903f, 12.257f, 4.972f, 12.363f, 5.009f)
                lineTo(13.741f, 5.457f)
                curveTo(14.161f, 5.597f, 14.542f, 5.833f, 14.854f, 6.146f)
                close()
                moveTo(22.017f, 9.965f)
                lineTo(22.783f, 10.213f)
                lineTo(22.798f, 10.217f)
                curveTo(22.857f, 10.238f, 22.908f, 10.276f, 22.944f, 10.327f)
                curveTo(22.981f, 10.378f, 23.0f, 10.439f, 23.0f, 10.502f)
                curveTo(23.0f, 10.564f, 22.981f, 10.625f, 22.944f, 10.676f)
                curveTo(22.908f, 10.727f, 22.857f, 10.766f, 22.798f, 10.787f)
                lineTo(22.033f, 11.035f)
                curveTo(21.8f, 11.113f, 21.589f, 11.243f, 21.415f, 11.416f)
                curveTo(21.242f, 11.59f, 21.111f, 11.801f, 21.034f, 12.033f)
                lineTo(20.785f, 12.798f)
                curveTo(20.764f, 12.857f, 20.726f, 12.908f, 20.675f, 12.944f)
                curveTo(20.624f, 12.981f, 20.563f, 13.0f, 20.5f, 13.0f)
                curveTo(20.437f, 13.0f, 20.376f, 12.981f, 20.325f, 12.944f)
                curveTo(20.274f, 12.908f, 20.236f, 12.857f, 20.215f, 12.798f)
                lineTo(19.966f, 12.033f)
                curveTo(19.889f, 11.8f, 19.759f, 11.588f, 19.586f, 11.414f)
                curveTo(19.412f, 11.24f, 19.2f, 11.109f, 18.967f, 11.032f)
                lineTo(18.202f, 10.783f)
                curveTo(18.143f, 10.762f, 18.092f, 10.724f, 18.056f, 10.673f)
                curveTo(18.019f, 10.622f, 18.0f, 10.561f, 18.0f, 10.498f)
                curveTo(18.0f, 10.436f, 18.019f, 10.375f, 18.056f, 10.324f)
                curveTo(18.092f, 10.273f, 18.143f, 10.234f, 18.202f, 10.213f)
                lineTo(18.967f, 9.965f)
                curveTo(19.197f, 9.885f, 19.406f, 9.754f, 19.576f, 9.581f)
                curveTo(19.747f, 9.408f, 19.875f, 9.197f, 19.951f, 8.966f)
                lineTo(20.2f, 8.202f)
                curveTo(20.22f, 8.143f, 20.259f, 8.092f, 20.31f, 8.056f)
                curveTo(20.361f, 8.019f, 20.422f, 8.0f, 20.485f, 8.0f)
                curveTo(20.547f, 8.0f, 20.608f, 8.019f, 20.659f, 8.056f)
                curveTo(20.71f, 8.092f, 20.749f, 8.143f, 20.77f, 8.202f)
                lineTo(21.019f, 8.966f)
                curveTo(21.096f, 9.199f, 21.226f, 9.41f, 21.4f, 9.584f)
                curveTo(21.573f, 9.757f, 21.785f, 9.887f, 22.017f, 9.965f)
                close()
                moveTo(12.001f, 2.5f)
                curveTo(12.341f, 2.5f, 12.67f, 2.569f, 12.972f, 2.696f)
                lineTo(12.05f, 2.999f)
                curveTo(11.425f, 3.222f, 11.002f, 3.803f, 11.0f, 4.469f)
                curveTo(11.0f, 4.559f, 11.009f, 4.649f, 11.025f, 4.738f)
                lineTo(6.804f, 14.586f)
                curveTo(6.798f, 14.599f, 6.792f, 14.613f, 6.787f, 14.627f)
                lineTo(5.081f, 18.606f)
                curveTo(4.864f, 19.114f, 5.099f, 19.702f, 5.607f, 19.919f)
                curveTo(6.114f, 20.137f, 6.702f, 19.902f, 6.92f, 19.394f)
                lineTo(8.374f, 16.0f)
                horizontalLineTo(15.627f)
                lineTo(17.081f, 19.394f)
                curveTo(17.299f, 19.902f, 17.887f, 20.137f, 18.395f, 19.919f)
                curveTo(18.902f, 19.702f, 19.137f, 19.114f, 18.92f, 18.606f)
                lineTo(17.215f, 14.627f)
                curveTo(17.209f, 14.613f, 17.203f, 14.599f, 17.197f, 14.586f)
                lineTo(14.959f, 9.365f)
                curveTo(15.215f, 9.598f, 15.49f, 9.782f, 15.787f, 9.891f)
                curveTo(15.993f, 9.992f, 16.222f, 10.048f, 16.46f, 10.049f)
                curveTo(16.596f, 10.051f, 16.732f, 10.033f, 16.862f, 9.997f)
                lineTo(16.986f, 10.286f)
                curveTo(16.968f, 10.372f, 16.96f, 10.46f, 16.96f, 10.549f)
                curveTo(16.956f, 10.991f, 17.202f, 11.413f, 17.571f, 11.651f)
                lineTo(18.562f, 13.964f)
                curveTo(18.578f, 13.999f, 18.593f, 14.033f, 18.607f, 14.068f)
                lineTo(20.299f, 18.015f)
                curveTo(20.842f, 19.284f, 20.254f, 20.754f, 18.985f, 21.298f)
                curveTo(17.716f, 21.842f, 16.247f, 21.254f, 15.703f, 19.985f)
                lineTo(14.638f, 17.5f)
                horizontalLineTo(9.363f)
                lineTo(8.299f, 19.985f)
                curveTo(7.755f, 21.254f, 6.285f, 21.842f, 5.016f, 21.298f)
                curveTo(3.747f, 20.754f, 3.159f, 19.284f, 3.703f, 18.015f)
                lineTo(5.394f, 14.068f)
                curveTo(5.408f, 14.033f, 5.423f, 13.999f, 5.439f, 13.965f)
                lineTo(9.703f, 4.015f)
                curveTo(10.097f, 3.096f, 11.0f, 2.5f, 12.001f, 2.5f)
                close()
                moveTo(14.77f, 14.0f)
                horizontalLineTo(9.231f)
                lineTo(12.001f, 7.539f)
                lineTo(14.77f, 14.0f)
                close()
            }
        }
        .build()
        return _textEffectsSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _textEffectsSparkle: ImageVector? = null

@Preview
@Composable
private fun TextEffectsSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextEffectsSparkle, contentDescription = null)
    }
}

