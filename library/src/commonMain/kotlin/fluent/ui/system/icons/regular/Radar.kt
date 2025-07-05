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
 * Radar Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent tracking, alert, and watching scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_radar_20_regular.svg)
 * 
 * @return The [ImageVector] for the Radar icon.
 */
public val FluentIcons.Regular.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.497f, 3.382f)
                lineTo(13.775f, 4.103f)
                curveTo(11.066f, 2.365f, 7.42f, 2.681f, 5.05f, 5.05f)
                curveTo(2.317f, 7.784f, 2.317f, 12.216f, 5.05f, 14.95f)
                curveTo(7.784f, 17.683f, 12.216f, 17.683f, 14.95f, 14.95f)
                curveTo(15.145f, 14.755f, 15.462f, 14.755f, 15.657f, 14.95f)
                curveTo(15.852f, 15.145f, 15.852f, 15.462f, 15.657f, 15.657f)
                curveTo(12.533f, 18.781f, 7.467f, 18.781f, 4.343f, 15.657f)
                curveTo(1.219f, 12.533f, 1.219f, 7.467f, 4.343f, 4.343f)
                curveTo(7.105f, 1.581f, 11.383f, 1.261f, 14.497f, 3.382f)
                close()
                moveTo(11.562f, 6.317f)
                lineTo(12.313f, 5.566f)
                curveTo(10.428f, 4.582f, 8.048f, 4.881f, 6.464f, 6.464f)
                curveTo(4.512f, 8.417f, 4.512f, 11.583f, 6.464f, 13.535f)
                curveTo(8.417f, 15.488f, 11.583f, 15.488f, 13.535f, 13.535f)
                curveTo(13.731f, 13.34f, 13.731f, 13.024f, 13.535f, 12.828f)
                curveTo(13.34f, 12.633f, 13.024f, 12.633f, 12.828f, 12.828f)
                curveTo(11.266f, 14.391f, 8.734f, 14.391f, 7.172f, 12.828f)
                curveTo(5.609f, 11.266f, 5.609f, 8.734f, 7.172f, 7.172f)
                curveTo(8.359f, 5.985f, 10.106f, 5.7f, 11.562f, 6.317f)
                close()
                moveTo(15.854f, 4.146f)
                curveTo(16.049f, 4.342f, 16.049f, 4.658f, 15.854f, 4.854f)
                lineTo(10.966f, 9.741f)
                curveTo(10.988f, 9.824f, 11.0f, 9.91f, 11.0f, 10.0f)
                curveTo(11.0f, 10.552f, 10.552f, 11.0f, 10.0f, 11.0f)
                curveTo(9.448f, 11.0f, 9.0f, 10.552f, 9.0f, 10.0f)
                curveTo(9.0f, 9.448f, 9.448f, 9.0f, 10.0f, 9.0f)
                curveTo(10.09f, 9.0f, 10.176f, 9.012f, 10.259f, 9.034f)
                lineTo(15.146f, 4.146f)
                curveTo(15.342f, 3.951f, 15.658f, 3.951f, 15.854f, 4.146f)
                close()
                moveTo(17.0f, 13.5f)
                curveTo(17.0f, 13.776f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 13.776f, 16.0f, 13.5f)
                curveTo(16.0f, 13.224f, 16.224f, 13.0f, 16.5f, 13.0f)
                curveTo(16.776f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                close()
                moveTo(16.5f, 7.0f)
                curveTo(16.776f, 7.0f, 17.0f, 6.776f, 17.0f, 6.5f)
                curveTo(17.0f, 6.224f, 16.776f, 6.0f, 16.5f, 6.0f)
                curveTo(16.224f, 6.0f, 16.0f, 6.224f, 16.0f, 6.5f)
                curveTo(16.0f, 6.776f, 16.224f, 7.0f, 16.5f, 7.0f)
                close()
                moveTo(18.0f, 11.25f)
                curveTo(18.0f, 11.526f, 17.776f, 11.75f, 17.5f, 11.75f)
                curveTo(17.224f, 11.75f, 17.0f, 11.526f, 17.0f, 11.25f)
                curveTo(17.0f, 10.974f, 17.224f, 10.75f, 17.5f, 10.75f)
                curveTo(17.776f, 10.75f, 18.0f, 10.974f, 18.0f, 11.25f)
                close()
                moveTo(17.5f, 9.25f)
                curveTo(17.776f, 9.25f, 18.0f, 9.026f, 18.0f, 8.75f)
                curveTo(18.0f, 8.474f, 17.776f, 8.25f, 17.5f, 8.25f)
                curveTo(17.224f, 8.25f, 17.0f, 8.474f, 17.0f, 8.75f)
                curveTo(17.0f, 9.026f, 17.224f, 9.25f, 17.5f, 9.25f)
                close()
                moveTo(15.0f, 11.25f)
                curveTo(15.0f, 11.526f, 14.776f, 11.75f, 14.5f, 11.75f)
                curveTo(14.224f, 11.75f, 14.0f, 11.526f, 14.0f, 11.25f)
                curveTo(14.0f, 10.974f, 14.224f, 10.75f, 14.5f, 10.75f)
                curveTo(14.776f, 10.75f, 15.0f, 10.974f, 15.0f, 11.25f)
                close()
                moveTo(14.5f, 9.25f)
                curveTo(14.776f, 9.25f, 15.0f, 9.026f, 15.0f, 8.75f)
                curveTo(15.0f, 8.474f, 14.776f, 8.25f, 14.5f, 8.25f)
                curveTo(14.224f, 8.25f, 14.0f, 8.474f, 14.0f, 8.75f)
                curveTo(14.0f, 9.026f, 14.224f, 9.25f, 14.5f, 9.25f)
                close()
            }
        }
        .build()
        return _radar!!
    }

@Suppress("ObjectPropertyName")
private var _radar: ImageVector? = null

@Preview
@Composable
private fun RadarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Radar, contentDescription = "Radar Icon")
    }
}

