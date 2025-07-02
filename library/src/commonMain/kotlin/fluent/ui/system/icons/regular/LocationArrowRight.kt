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
 * LocationArrowRight icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: location, arrow, right
 * - Source: ic_fluent_location_arrow_right_20_regular.svg
 * 
 * @return The [ImageVector] for the LocationArrowRight icon.
 */
public val FluentIcons.Regular.LocationArrowRight: ImageVector
    get() {
        if (_locationArrowRight != null) {
            return _locationArrowRight!!
        }
        _locationArrowRight = Builder(name = "LocationArrowRight", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.95f, 4.051f)
                curveTo(17.683f, 6.786f, 17.683f, 11.22f, 14.95f, 13.955f)
                lineTo(13.822f, 15.069f)
                lineTo(11.386f, 17.439f)
                curveTo(10.656f, 18.146f, 9.522f, 18.185f, 8.747f, 17.557f)
                lineTo(8.614f, 17.439f)
                lineTo(6.571f, 15.454f)
                lineTo(5.05f, 13.955f)
                curveTo(2.317f, 11.22f, 2.317f, 6.786f, 5.05f, 4.051f)
                curveTo(7.784f, 1.316f, 12.216f, 1.316f, 14.95f, 4.051f)
                close()
                moveTo(14.245f, 4.756f)
                curveTo(11.901f, 2.411f, 8.099f, 2.411f, 5.755f, 4.756f)
                curveTo(3.471f, 7.042f, 3.412f, 10.71f, 5.579f, 13.067f)
                lineTo(5.755f, 13.25f)
                lineTo(6.326f, 13.817f)
                lineTo(9.307f, 16.722f)
                lineTo(9.4f, 16.802f)
                curveTo(9.754f, 17.07f, 10.246f, 17.07f, 10.6f, 16.802f)
                lineTo(10.693f, 16.722f)
                lineTo(12.924f, 14.554f)
                lineTo(14.245f, 13.25f)
                lineTo(14.421f, 13.067f)
                curveTo(16.588f, 10.71f, 16.529f, 7.042f, 14.245f, 4.756f)
                close()
                moveTo(10.146f, 6.354f)
                curveTo(9.951f, 6.158f, 9.951f, 5.842f, 10.146f, 5.646f)
                curveTo(10.342f, 5.451f, 10.658f, 5.451f, 10.854f, 5.646f)
                lineTo(13.354f, 8.146f)
                curveTo(13.447f, 8.24f, 13.5f, 8.367f, 13.5f, 8.5f)
                curveTo(13.5f, 8.633f, 13.447f, 8.76f, 13.354f, 8.854f)
                lineTo(10.854f, 11.354f)
                curveTo(10.658f, 11.549f, 10.342f, 11.549f, 10.146f, 11.354f)
                curveTo(9.951f, 11.158f, 9.951f, 10.842f, 10.146f, 10.646f)
                lineTo(11.793f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(6.724f, 9.0f, 6.5f, 8.776f, 6.5f, 8.5f)
                curveTo(6.5f, 8.224f, 6.724f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(11.793f)
                lineTo(10.146f, 6.354f)
                close()
            }
        }
        .build()
        return _locationArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _locationArrowRight: ImageVector? = null

@Preview
@Composable
private fun LocationArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationArrowRight, contentDescription = null)
    }
}

