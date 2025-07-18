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
 * VideoPersonSparkle Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent general video meetings, views & settings in video meetings.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_person_sparkle_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoPersonSparkle icon.
 */
public val FluentIcons.Regular.VideoPersonSparkle: ImageVector
    get() {
        if (_videoPersonSparkle != null) {
            return _videoPersonSparkle!!
        }
        _videoPersonSparkle = Builder(name = "VideoPersonSparkle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.088f, 6.412f)
                curveTo(16.016f, 6.319f, 15.938f, 6.23f, 15.854f, 6.146f)
                curveTo(15.542f, 5.833f, 15.161f, 5.597f, 14.741f, 5.457f)
                lineTo(13.363f, 5.009f)
                curveTo(13.257f, 4.972f, 13.165f, 4.903f, 13.1f, 4.811f)
                curveTo(13.035f, 4.719f, 13.0f, 4.609f, 13.0f, 4.497f)
                curveTo(13.0f, 4.384f, 13.035f, 4.274f, 13.1f, 4.182f)
                curveTo(13.165f, 4.091f, 13.257f, 4.021f, 13.363f, 3.984f)
                lineTo(14.741f, 3.536f)
                curveTo(15.155f, 3.394f, 15.53f, 3.157f, 15.837f, 2.845f)
                curveTo(16.136f, 2.542f, 16.362f, 2.176f, 16.5f, 1.774f)
                lineTo(16.511f, 1.74f)
                lineTo(16.959f, 0.363f)
                curveTo(16.997f, 0.257f, 17.066f, 0.165f, 17.158f, 0.1f)
                curveTo(17.25f, 0.035f, 17.36f, 0.0f, 17.472f, 0.0f)
                curveTo(17.585f, 0.0f, 17.695f, 0.035f, 17.787f, 0.1f)
                curveTo(17.879f, 0.165f, 17.948f, 0.257f, 17.986f, 0.363f)
                lineTo(18.434f, 1.74f)
                curveTo(18.573f, 2.158f, 18.808f, 2.539f, 19.12f, 2.85f)
                curveTo(19.432f, 3.162f, 19.813f, 3.397f, 20.232f, 3.536f)
                lineTo(21.609f, 3.984f)
                lineTo(21.637f, 3.991f)
                curveTo(21.743f, 4.028f, 21.835f, 4.097f, 21.9f, 4.189f)
                curveTo(21.965f, 4.281f, 22.0f, 4.391f, 22.0f, 4.503f)
                curveTo(22.0f, 4.616f, 21.965f, 4.726f, 21.9f, 4.818f)
                curveTo(21.835f, 4.909f, 21.743f, 4.979f, 21.637f, 5.016f)
                lineTo(20.259f, 5.464f)
                curveTo(19.84f, 5.603f, 19.459f, 5.838f, 19.147f, 6.15f)
                curveTo(18.835f, 6.461f, 18.6f, 6.842f, 18.461f, 7.26f)
                lineTo(18.013f, 8.637f)
                curveTo(18.009f, 8.649f, 18.005f, 8.66f, 18.0f, 8.671f)
                curveTo(17.961f, 8.763f, 17.896f, 8.842f, 17.814f, 8.9f)
                curveTo(17.722f, 8.965f, 17.613f, 9.0f, 17.5f, 9.0f)
                curveTo(17.387f, 9.0f, 17.278f, 8.965f, 17.186f, 8.9f)
                curveTo(17.094f, 8.835f, 17.024f, 8.743f, 16.987f, 8.637f)
                lineTo(16.539f, 7.26f)
                curveTo(16.438f, 6.953f, 16.285f, 6.667f, 16.088f, 6.412f)
                close()
                moveTo(23.783f, 10.213f)
                lineTo(23.017f, 9.965f)
                curveTo(22.785f, 9.887f, 22.573f, 9.757f, 22.4f, 9.584f)
                curveTo(22.226f, 9.41f, 22.096f, 9.199f, 22.019f, 8.966f)
                lineTo(21.77f, 8.202f)
                curveTo(21.749f, 8.143f, 21.71f, 8.092f, 21.659f, 8.056f)
                curveTo(21.608f, 8.019f, 21.547f, 8.0f, 21.485f, 8.0f)
                curveTo(21.422f, 8.0f, 21.361f, 8.019f, 21.31f, 8.056f)
                curveTo(21.259f, 8.092f, 21.22f, 8.143f, 21.2f, 8.202f)
                lineTo(20.951f, 8.966f)
                curveTo(20.875f, 9.197f, 20.747f, 9.408f, 20.576f, 9.581f)
                curveTo(20.406f, 9.754f, 20.197f, 9.885f, 19.967f, 9.965f)
                lineTo(19.202f, 10.213f)
                curveTo(19.143f, 10.234f, 19.092f, 10.273f, 19.056f, 10.324f)
                curveTo(19.019f, 10.375f, 19.0f, 10.436f, 19.0f, 10.498f)
                curveTo(19.0f, 10.561f, 19.019f, 10.622f, 19.056f, 10.673f)
                curveTo(19.092f, 10.724f, 19.143f, 10.762f, 19.202f, 10.783f)
                lineTo(19.967f, 11.032f)
                curveTo(20.2f, 11.109f, 20.412f, 11.24f, 20.586f, 11.414f)
                curveTo(20.759f, 11.588f, 20.889f, 11.8f, 20.966f, 12.033f)
                lineTo(21.215f, 12.798f)
                curveTo(21.236f, 12.857f, 21.274f, 12.908f, 21.325f, 12.944f)
                curveTo(21.376f, 12.981f, 21.437f, 13.0f, 21.5f, 13.0f)
                curveTo(21.563f, 13.0f, 21.624f, 12.981f, 21.675f, 12.944f)
                curveTo(21.726f, 12.908f, 21.764f, 12.857f, 21.785f, 12.798f)
                lineTo(22.034f, 12.033f)
                curveTo(22.111f, 11.801f, 22.242f, 11.59f, 22.415f, 11.416f)
                curveTo(22.589f, 11.243f, 22.8f, 11.113f, 23.033f, 11.035f)
                lineTo(23.798f, 10.787f)
                curveTo(23.857f, 10.766f, 23.908f, 10.727f, 23.944f, 10.676f)
                curveTo(23.981f, 10.625f, 24.0f, 10.564f, 24.0f, 10.502f)
                curveTo(24.0f, 10.439f, 23.981f, 10.378f, 23.944f, 10.327f)
                curveTo(23.908f, 10.276f, 23.857f, 10.238f, 23.798f, 10.217f)
                lineTo(23.783f, 10.213f)
                close()
                moveTo(12.072f, 4.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 4.0f, 2.0f, 5.007f, 2.0f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(2.0f, 18.997f, 3.007f, 20.005f, 4.25f, 20.005f)
                horizontalLineTo(19.745f)
                curveTo(20.988f, 20.005f, 21.995f, 18.997f, 21.995f, 17.755f)
                verticalLineTo(13.933f)
                curveTo(21.828f, 14.009f, 21.646f, 14.05f, 21.46f, 14.05f)
                curveTo(21.191f, 14.05f, 20.929f, 13.965f, 20.71f, 13.809f)
                curveTo(20.632f, 13.753f, 20.56f, 13.689f, 20.495f, 13.619f)
                verticalLineTo(17.755f)
                curveTo(20.495f, 18.169f, 20.16f, 18.505f, 19.745f, 18.505f)
                lineTo(16.994f, 18.504f)
                lineTo(16.995f, 15.75f)
                lineTo(16.989f, 15.606f)
                curveTo(16.916f, 14.707f, 16.163f, 14.0f, 15.245f, 14.0f)
                horizontalLineTo(8.75f)
                lineTo(8.606f, 14.006f)
                curveTo(7.707f, 14.079f, 7.0f, 14.832f, 7.0f, 15.75f)
                lineTo(6.999f, 18.504f)
                lineTo(4.25f, 18.505f)
                curveTo(3.836f, 18.505f, 3.5f, 18.169f, 3.5f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
                horizontalLineTo(12.373f)
                curveTo(12.339f, 5.455f, 12.308f, 5.408f, 12.28f, 5.359f)
                curveTo(12.099f, 5.098f, 12.001f, 4.787f, 12.0f, 4.469f)
                curveTo(12.0f, 4.309f, 12.025f, 4.151f, 12.072f, 4.0f)
                close()
                moveTo(8.75f, 15.5f)
                horizontalLineTo(15.245f)
                lineTo(15.302f, 15.507f)
                curveTo(15.413f, 15.533f, 15.495f, 15.632f, 15.495f, 15.75f)
                lineTo(15.494f, 18.504f)
                horizontalLineTo(8.499f)
                lineTo(8.5f, 15.75f)
                lineTo(8.507f, 15.693f)
                curveTo(8.533f, 15.582f, 8.632f, 15.5f, 8.75f, 15.5f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(15.0f, 8.344f, 13.657f, 7.0f, 12.0f, 7.0f)
                curveTo(10.343f, 7.0f, 9.0f, 8.344f, 9.0f, 10.0f)
                curveTo(9.0f, 11.657f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 11.657f, 15.0f, 10.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(10.5f, 9.172f, 11.172f, 8.5f, 12.0f, 8.5f)
                curveTo(12.828f, 8.5f, 13.5f, 9.172f, 13.5f, 10.0f)
                curveTo(13.5f, 10.829f, 12.828f, 11.5f, 12.0f, 11.5f)
                curveTo(11.172f, 11.5f, 10.5f, 10.829f, 10.5f, 10.0f)
                close()
            }
        }
        .build()
        return _videoPersonSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _videoPersonSparkle: ImageVector? = null

@Preview
@Composable
private fun VideoPersonSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPersonSparkle, contentDescription = "VideoPersonSparkle Icon")
    }
}

