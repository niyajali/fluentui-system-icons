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
 * VideoPersonCall Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent general video meetings, views & settings in video meetings.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_person_call_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoPersonCall icon.
 */
public val FluentIcons.Regular.VideoPersonCall: ImageVector
    get() {
        if (_videoPersonCall != null) {
            return _videoPersonCall!!
        }
        _videoPersonCall = Builder(name = "VideoPersonCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.995f, 6.25f)
                curveTo(21.995f, 5.007f, 20.988f, 4.0f, 19.745f, 4.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 4.0f, 2.0f, 5.007f, 2.0f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(2.0f, 18.997f, 3.007f, 20.005f, 4.25f, 20.005f)
                horizontalLineTo(14.008f)
                curveTo(14.044f, 19.578f, 14.202f, 19.158f, 14.486f, 18.799f)
                lineTo(14.72f, 18.504f)
                horizontalLineTo(8.499f)
                lineTo(8.5f, 15.75f)
                lineTo(8.507f, 15.693f)
                curveTo(8.533f, 15.582f, 8.632f, 15.5f, 8.75f, 15.5f)
                horizontalLineTo(15.245f)
                lineTo(15.302f, 15.507f)
                curveTo(15.413f, 15.533f, 15.495f, 15.632f, 15.495f, 15.75f)
                lineTo(15.494f, 17.561f)
                curveTo(15.901f, 17.174f, 16.439f, 16.96f, 16.994f, 16.957f)
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
                horizontalLineTo(19.745f)
                curveTo(20.16f, 5.5f, 20.495f, 5.836f, 20.495f, 6.25f)
                verticalLineTo(10.023f)
                curveTo(20.83f, 9.973f, 21.182f, 9.998f, 21.525f, 10.111f)
                lineTo(21.956f, 10.252f)
                lineTo(21.995f, 10.265f)
                verticalLineTo(6.25f)
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
                moveTo(19.192f, 12.995f)
                lineTo(19.668f, 11.79f)
                curveTo(19.91f, 11.176f, 20.589f, 10.857f, 21.216f, 11.062f)
                lineTo(21.647f, 11.203f)
                curveTo(22.371f, 11.44f, 22.973f, 12.009f, 22.997f, 12.772f)
                curveTo(23.096f, 15.883f, 20.521f, 20.354f, 17.784f, 21.827f)
                curveTo(17.111f, 22.189f, 16.316f, 21.95f, 15.748f, 21.436f)
                lineTo(15.412f, 21.131f)
                curveTo(14.923f, 20.688f, 14.861f, 19.942f, 15.27f, 19.425f)
                lineTo(16.07f, 18.415f)
                curveTo(16.36f, 18.048f, 16.837f, 17.884f, 17.291f, 17.995f)
                lineTo(18.582f, 18.308f)
                curveTo(19.685f, 17.578f, 20.277f, 16.552f, 20.356f, 15.229f)
                lineTo(19.44f, 14.265f)
                curveTo(19.117f, 13.926f, 19.021f, 13.43f, 19.192f, 12.995f)
                close()
            }
        }
        .build()
        return _videoPersonCall!!
    }

@Suppress("ObjectPropertyName")
private var _videoPersonCall: ImageVector? = null

@Preview
@Composable
private fun VideoPersonCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPersonCall, contentDescription = "VideoPersonCall Icon")
    }
}

