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
 * RadarRectangleMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: radar, rectangle, multiple
 * - Source: ic_fluent_radar_rectangle_multiple_20_regular.svg
 * 
 * @return The [ImageVector] for the RadarRectangleMultiple icon.
 */
public val FluentIcons.Regular.RadarRectangleMultiple: ImageVector
    get() {
        if (_radarRectangleMultiple != null) {
            return _radarRectangleMultiple!!
        }
        _radarRectangleMultiple = Builder(name = "RadarRectangleMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.497f, 3.382f)
                lineTo(13.775f, 4.103f)
                curveTo(11.066f, 2.365f, 7.42f, 2.681f, 5.05f, 5.05f)
                curveTo(3.428f, 6.672f, 2.769f, 8.892f, 3.071f, 11.0f)
                horizontalLineTo(2.062f)
                curveTo(1.766f, 8.634f, 2.526f, 6.16f, 4.343f, 4.343f)
                curveTo(7.105f, 1.581f, 11.383f, 1.261f, 14.497f, 3.382f)
                close()
                moveTo(9.83f, 17.998f)
                curveTo(9.94f, 17.686f, 10.0f, 17.35f, 10.0f, 17.0f)
                curveTo(11.792f, 17.0f, 13.583f, 16.317f, 14.95f, 14.95f)
                curveTo(15.145f, 14.755f, 15.462f, 14.755f, 15.657f, 14.95f)
                curveTo(15.852f, 15.145f, 15.852f, 15.462f, 15.657f, 15.657f)
                curveTo(14.052f, 17.262f, 11.934f, 18.043f, 9.83f, 17.998f)
                close()
                moveTo(10.0f, 14.5f)
                verticalLineTo(15.0f)
                curveTo(11.28f, 15.0f, 12.559f, 14.512f, 13.535f, 13.535f)
                curveTo(13.731f, 13.34f, 13.731f, 13.024f, 13.535f, 12.828f)
                curveTo(13.34f, 12.633f, 13.024f, 12.633f, 12.828f, 12.828f)
                curveTo(12.026f, 13.631f, 10.966f, 14.021f, 9.914f, 13.999f)
                curveTo(9.97f, 14.156f, 10.0f, 14.324f, 10.0f, 14.5f)
                close()
                moveTo(5.1f, 11.0f)
                horizontalLineTo(6.126f)
                curveTo(5.786f, 9.675f, 6.134f, 8.209f, 7.172f, 7.172f)
                curveTo(8.359f, 5.985f, 10.106f, 5.7f, 11.562f, 6.317f)
                lineTo(12.313f, 5.566f)
                curveTo(10.428f, 4.582f, 8.048f, 4.881f, 6.464f, 6.464f)
                curveTo(5.232f, 7.696f, 4.778f, 9.411f, 5.1f, 11.0f)
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
                moveTo(1.5f, 12.0f)
                curveTo(1.224f, 12.0f, 1.0f, 12.224f, 1.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(1.0f, 16.776f, 1.224f, 17.0f, 1.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(6.776f, 17.0f, 7.0f, 16.776f, 7.0f, 16.5f)
                verticalLineTo(12.5f)
                curveTo(7.0f, 12.224f, 6.776f, 12.0f, 6.5f, 12.0f)
                horizontalLineTo(1.5f)
                close()
                moveTo(8.5f, 14.0f)
                curveTo(8.776f, 14.0f, 9.0f, 14.224f, 9.0f, 14.5f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 18.105f, 8.105f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 19.0f, 3.0f, 18.776f, 3.0f, 18.5f)
                curveTo(3.0f, 18.224f, 3.224f, 18.0f, 3.5f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(7.552f, 18.0f, 8.0f, 17.552f, 8.0f, 17.0f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.224f, 8.224f, 14.0f, 8.5f, 14.0f)
                close()
            }
        }
        .build()
        return _radarRectangleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _radarRectangleMultiple: ImageVector? = null

@Preview
@Composable
private fun RadarRectangleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RadarRectangleMultiple, contentDescription = null)
    }
}

