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
 * LocationArrowLeft Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in map and travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_location_arrow_left_20_filled.svg)
 * 
 * @return The [ImageVector] for the LocationArrowLeft icon.
 */
public val FluentIcons.Filled.LocationArrowLeft: ImageVector
    get() {
        if (_locationArrowLeft != null) {
            return _locationArrowLeft!!
        }
        _locationArrowLeft = Builder(name = "LocationArrowLeft", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.95f, 13.955f)
                curveTo(17.683f, 11.22f, 17.683f, 6.786f, 14.95f, 4.051f)
                curveTo(12.216f, 1.316f, 7.784f, 1.316f, 5.05f, 4.051f)
                curveTo(2.317f, 6.786f, 2.317f, 11.22f, 5.05f, 13.955f)
                lineTo(6.571f, 15.454f)
                lineTo(8.614f, 17.439f)
                lineTo(8.747f, 17.557f)
                curveTo(9.522f, 18.185f, 10.656f, 18.146f, 11.386f, 17.439f)
                lineTo(13.822f, 15.069f)
                lineTo(14.95f, 13.955f)
                close()
                moveTo(9.854f, 6.354f)
                lineTo(8.207f, 8.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 8.0f, 13.5f, 8.224f, 13.5f, 8.5f)
                curveTo(13.5f, 8.776f, 13.276f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(8.207f)
                lineTo(9.854f, 10.646f)
                curveTo(10.049f, 10.842f, 10.049f, 11.158f, 9.854f, 11.354f)
                curveTo(9.658f, 11.549f, 9.342f, 11.549f, 9.146f, 11.354f)
                lineTo(6.646f, 8.854f)
                curveTo(6.553f, 8.76f, 6.5f, 8.633f, 6.5f, 8.5f)
                curveTo(6.5f, 8.367f, 6.553f, 8.24f, 6.646f, 8.146f)
                lineTo(9.146f, 5.646f)
                curveTo(9.342f, 5.451f, 9.658f, 5.451f, 9.854f, 5.646f)
                curveTo(10.049f, 5.842f, 10.049f, 6.158f, 9.854f, 6.354f)
                close()
            }
        }
        .build()
        return _locationArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _locationArrowLeft: ImageVector? = null

@Preview
@Composable
private fun LocationArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LocationArrowLeft, contentDescription = "LocationArrowLeft Icon")
    }
}

