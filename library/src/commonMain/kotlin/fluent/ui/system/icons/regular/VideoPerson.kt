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
 * VideoPerson icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, person
 * - Source: ic_fluent_video_person_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoPerson icon.
 */
public val FluentIcons.Regular.VideoPerson: ImageVector
    get() {
        if (_videoPerson != null) {
            return _videoPerson!!
        }
        _videoPerson = Builder(name = "VideoPerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.745f, 4.0f)
                curveTo(20.988f, 4.0f, 21.995f, 5.007f, 21.995f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(21.995f, 18.997f, 20.988f, 20.005f, 19.745f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2.0f, 18.997f, 2.0f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.745f)
                close()
                moveTo(19.745f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
                lineTo(6.999f, 18.504f)
                lineTo(7.0f, 15.75f)
                curveTo(7.0f, 14.832f, 7.707f, 14.079f, 8.606f, 14.006f)
                lineTo(8.75f, 14.0f)
                horizontalLineTo(15.245f)
                curveTo(16.163f, 14.0f, 16.916f, 14.707f, 16.989f, 15.606f)
                lineTo(16.995f, 15.75f)
                lineTo(16.994f, 18.504f)
                lineTo(19.745f, 18.505f)
                curveTo(20.16f, 18.505f, 20.495f, 18.169f, 20.495f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(20.495f, 5.836f, 20.16f, 5.5f, 19.745f, 5.5f)
                close()
                moveTo(15.245f, 15.5f)
                horizontalLineTo(8.75f)
                curveTo(8.632f, 15.5f, 8.533f, 15.582f, 8.507f, 15.693f)
                lineTo(8.5f, 15.75f)
                lineTo(8.499f, 18.504f)
                horizontalLineTo(15.494f)
                lineTo(15.495f, 15.75f)
                curveTo(15.495f, 15.632f, 15.413f, 15.533f, 15.302f, 15.507f)
                lineTo(15.245f, 15.5f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.657f, 7.0f, 15.0f, 8.344f, 15.0f, 10.0f)
                curveTo(15.0f, 11.657f, 13.657f, 13.0f, 12.0f, 13.0f)
                curveTo(10.343f, 13.0f, 9.0f, 11.657f, 9.0f, 10.0f)
                curveTo(9.0f, 8.344f, 10.343f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(11.172f, 8.5f, 10.5f, 9.172f, 10.5f, 10.0f)
                curveTo(10.5f, 10.829f, 11.172f, 11.5f, 12.0f, 11.5f)
                curveTo(12.828f, 11.5f, 13.5f, 10.829f, 13.5f, 10.0f)
                curveTo(13.5f, 9.172f, 12.828f, 8.5f, 12.0f, 8.5f)
                close()
            }
        }
        .build()
        return _videoPerson!!
    }

@Suppress("ObjectPropertyName")
private var _videoPerson: ImageVector? = null

@Preview
@Composable
private fun VideoPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPerson, contentDescription = null)
    }
}

