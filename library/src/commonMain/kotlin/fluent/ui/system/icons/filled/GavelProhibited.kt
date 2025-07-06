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
 * GavelProhibited Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_gavel_prohibited_20_filled.svg)
 * 
 * @return The [ImageVector] for the GavelProhibited icon.
 */
public val FluentIcons.Filled.GavelProhibited: ImageVector
    get() {
        if (_gavelProhibited != null) {
            return _gavelProhibited!!
        }
        _gavelProhibited = Builder(name = "GavelProhibited", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.666f, 7.59f)
                curveTo(5.881f, 7.064f, 5.772f, 5.951f, 6.44f, 5.283f)
                lineTo(9.281f, 2.442f)
                curveTo(9.935f, 1.788f, 11.018f, 1.876f, 11.559f, 2.626f)
                lineTo(12.032f, 3.282f)
                lineTo(7.299f, 8.014f)
                lineTo(6.666f, 7.59f)
                close()
                moveTo(8.146f, 8.582f)
                lineTo(12.624f, 4.105f)
                lineTo(13.946f, 5.941f)
                curveTo(13.977f, 5.984f, 14.016f, 6.023f, 14.059f, 6.054f)
                lineTo(15.896f, 7.377f)
                lineTo(14.268f, 9.005f)
                curveTo(12.834f, 9.064f, 11.541f, 9.673f, 10.595f, 10.626f)
                lineTo(10.16f, 9.977f)
                curveTo(10.124f, 9.923f, 10.078f, 9.876f, 10.024f, 9.84f)
                lineTo(8.146f, 8.582f)
                close()
                moveTo(15.581f, 9.106f)
                curveTo(16.446f, 9.278f, 17.237f, 9.654f, 17.904f, 10.18f)
                curveTo(18.129f, 9.57f, 17.941f, 8.85f, 17.374f, 8.442f)
                lineTo(16.718f, 7.969f)
                lineTo(15.581f, 9.106f)
                close()
                moveTo(9.304f, 12.694f)
                curveTo(9.46f, 12.245f, 9.672f, 11.822f, 9.933f, 11.434f)
                lineTo(9.385f, 10.616f)
                lineTo(8.189f, 9.815f)
                lineTo(2.414f, 15.59f)
                curveTo(1.862f, 16.141f, 1.862f, 17.035f, 2.414f, 17.586f)
                curveTo(2.965f, 18.138f, 3.859f, 18.138f, 4.411f, 17.586f)
                lineTo(9.304f, 12.694f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 12.567f, 12.567f, 11.0f, 14.5f, 11.0f)
                curveTo(15.286f, 11.0f, 16.012f, 11.259f, 16.596f, 11.697f)
                lineTo(11.697f, 16.596f)
                curveTo(11.259f, 16.012f, 11.0f, 15.286f, 11.0f, 14.5f)
                close()
                moveTo(14.5f, 18.0f)
                curveTo(13.714f, 18.0f, 12.988f, 17.741f, 12.404f, 17.303f)
                lineTo(17.303f, 12.404f)
                curveTo(17.741f, 12.988f, 18.0f, 13.714f, 18.0f, 14.5f)
                curveTo(18.0f, 16.433f, 16.433f, 18.0f, 14.5f, 18.0f)
                close()
            }
        }
        .build()
        return _gavelProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _gavelProhibited: ImageVector? = null

@Preview
@Composable
private fun GavelProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GavelProhibited, contentDescription = "GavelProhibited Icon")
    }
}

