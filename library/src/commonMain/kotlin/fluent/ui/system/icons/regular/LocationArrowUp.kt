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
 * LocationArrowUp Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in map and travel scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_location_arrow_up_20_regular.svg)
 * 
 * @return The [ImageVector] for the LocationArrowUp icon.
 */
public val FluentIcons.Regular.LocationArrowUp: ImageVector
    get() {
        if (_locationArrowUp != null) {
            return _locationArrowUp!!
        }
        _locationArrowUp = Builder(name = "LocationArrowUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
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
                moveTo(12.146f, 8.354f)
                curveTo(12.342f, 8.549f, 12.658f, 8.549f, 12.854f, 8.354f)
                curveTo(13.049f, 8.158f, 13.049f, 7.842f, 12.854f, 7.646f)
                lineTo(10.354f, 5.146f)
                curveTo(10.26f, 5.053f, 10.133f, 5.0f, 10.0f, 5.0f)
                curveTo(9.867f, 5.0f, 9.74f, 5.053f, 9.646f, 5.146f)
                lineTo(7.146f, 7.646f)
                curveTo(6.951f, 7.842f, 6.951f, 8.158f, 7.146f, 8.354f)
                curveTo(7.342f, 8.549f, 7.658f, 8.549f, 7.854f, 8.354f)
                lineTo(9.5f, 6.707f)
                lineTo(9.5f, 11.5f)
                curveTo(9.5f, 11.776f, 9.724f, 12.0f, 10.0f, 12.0f)
                curveTo(10.276f, 12.0f, 10.5f, 11.776f, 10.5f, 11.5f)
                lineTo(10.5f, 6.707f)
                lineTo(12.146f, 8.354f)
                close()
            }
        }
        .build()
        return _locationArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _locationArrowUp: ImageVector? = null

@Preview
@Composable
private fun LocationArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationArrowUp, contentDescription = "LocationArrowUp Icon")
    }
}

