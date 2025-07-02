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
 * RadarCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: radar, checkmark
 * - Source: ic_fluent_radar_checkmark_20_filled.svg
 * 
 * @return The [ImageVector] for the RadarCheckmark icon.
 */
public val FluentIcons.Filled.RadarCheckmark: ImageVector
    get() {
        if (_radarCheckmark != null) {
            return _radarCheckmark!!
        }
        _radarCheckmark = Builder(name = "RadarCheckmark", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.284f, 3.241f)
                lineTo(13.19f, 4.335f)
                curveTo(10.713f, 2.938f, 7.513f, 3.294f, 5.404f, 5.404f)
                curveTo(4.297f, 6.511f, 3.673f, 7.918f, 3.531f, 9.363f)
                curveTo(2.973f, 9.577f, 2.458f, 9.88f, 2.004f, 10.254f)
                curveTo(1.937f, 8.123f, 2.716f, 5.97f, 4.343f, 4.343f)
                curveTo(7.042f, 1.644f, 11.19f, 1.277f, 14.284f, 3.241f)
                close()
                moveTo(9.746f, 17.996f)
                curveTo(10.12f, 17.542f, 10.423f, 17.028f, 10.637f, 16.469f)
                curveTo(12.082f, 16.327f, 13.489f, 15.703f, 14.596f, 14.596f)
                curveTo(14.889f, 14.303f, 15.364f, 14.303f, 15.657f, 14.596f)
                curveTo(15.95f, 14.889f, 15.95f, 15.364f, 15.657f, 15.657f)
                curveTo(14.03f, 17.284f, 11.877f, 18.063f, 9.746f, 17.996f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 14.671f, 10.992f, 14.839f, 10.977f, 15.006f)
                curveTo(11.94f, 14.819f, 12.86f, 14.352f, 13.606f, 13.606f)
                curveTo(13.899f, 13.313f, 13.899f, 12.839f, 13.606f, 12.546f)
                curveTo(13.313f, 12.253f, 12.839f, 12.253f, 12.546f, 12.546f)
                curveTo(12.075f, 13.016f, 11.507f, 13.329f, 10.906f, 13.485f)
                curveTo(10.968f, 13.814f, 11.0f, 14.153f, 11.0f, 14.5f)
                close()
                moveTo(5.5f, 9.0f)
                curveTo(5.847f, 9.0f, 6.186f, 9.032f, 6.515f, 9.094f)
                curveTo(6.671f, 8.493f, 6.984f, 7.925f, 7.454f, 7.454f)
                curveTo(8.411f, 6.498f, 9.772f, 6.192f, 10.988f, 6.537f)
                lineTo(12.151f, 5.374f)
                curveTo(10.264f, 4.497f, 7.951f, 4.837f, 6.394f, 6.394f)
                curveTo(5.648f, 7.14f, 5.181f, 8.06f, 4.994f, 9.023f)
                curveTo(5.161f, 9.008f, 5.329f, 9.0f, 5.5f, 9.0f)
                close()
                moveTo(8.504f, 9.892f)
                curveTo(9.143f, 10.31f, 9.69f, 10.857f, 10.108f, 11.496f)
                curveTo(10.886f, 11.441f, 11.5f, 10.792f, 11.5f, 10.0f)
                curveTo(11.5f, 9.866f, 11.482f, 9.735f, 11.449f, 9.611f)
                lineTo(15.78f, 5.28f)
                curveTo(16.073f, 4.987f, 16.073f, 4.513f, 15.78f, 4.22f)
                curveTo(15.487f, 3.927f, 15.013f, 3.927f, 14.72f, 4.22f)
                lineTo(10.389f, 8.551f)
                curveTo(10.265f, 8.518f, 10.134f, 8.5f, 10.0f, 8.5f)
                curveTo(9.208f, 8.5f, 8.559f, 9.114f, 8.504f, 9.892f)
                close()
                moveTo(17.25f, 13.25f)
                curveTo(17.25f, 13.664f, 16.914f, 14.0f, 16.5f, 14.0f)
                curveTo(16.086f, 14.0f, 15.75f, 13.664f, 15.75f, 13.25f)
                curveTo(15.75f, 12.836f, 16.086f, 12.5f, 16.5f, 12.5f)
                curveTo(16.914f, 12.5f, 17.25f, 12.836f, 17.25f, 13.25f)
                close()
                moveTo(16.5f, 7.5f)
                curveTo(16.914f, 7.5f, 17.25f, 7.164f, 17.25f, 6.75f)
                curveTo(17.25f, 6.336f, 16.914f, 6.0f, 16.5f, 6.0f)
                curveTo(16.086f, 6.0f, 15.75f, 6.336f, 15.75f, 6.75f)
                curveTo(15.75f, 7.164f, 16.086f, 7.5f, 16.5f, 7.5f)
                close()
                moveTo(18.0f, 11.25f)
                curveTo(18.0f, 11.664f, 17.664f, 12.0f, 17.25f, 12.0f)
                curveTo(16.836f, 12.0f, 16.5f, 11.664f, 16.5f, 11.25f)
                curveTo(16.5f, 10.836f, 16.836f, 10.5f, 17.25f, 10.5f)
                curveTo(17.664f, 10.5f, 18.0f, 10.836f, 18.0f, 11.25f)
                close()
                moveTo(17.25f, 9.5f)
                curveTo(17.664f, 9.5f, 18.0f, 9.164f, 18.0f, 8.75f)
                curveTo(18.0f, 8.336f, 17.664f, 8.0f, 17.25f, 8.0f)
                curveTo(16.836f, 8.0f, 16.5f, 8.336f, 16.5f, 8.75f)
                curveTo(16.5f, 9.164f, 16.836f, 9.5f, 17.25f, 9.5f)
                close()
                moveTo(15.0f, 11.25f)
                curveTo(15.0f, 11.664f, 14.664f, 12.0f, 14.25f, 12.0f)
                curveTo(13.836f, 12.0f, 13.5f, 11.664f, 13.5f, 11.25f)
                curveTo(13.5f, 10.836f, 13.836f, 10.5f, 14.25f, 10.5f)
                curveTo(14.664f, 10.5f, 15.0f, 10.836f, 15.0f, 11.25f)
                close()
                moveTo(14.25f, 9.5f)
                curveTo(14.664f, 9.5f, 15.0f, 9.164f, 15.0f, 8.75f)
                curveTo(15.0f, 8.336f, 14.664f, 8.0f, 14.25f, 8.0f)
                curveTo(13.836f, 8.0f, 13.5f, 8.336f, 13.5f, 8.75f)
                curveTo(13.5f, 9.164f, 13.836f, 9.5f, 14.25f, 9.5f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 7.985f, 19.0f, 5.5f, 19.0f)
                curveTo(3.015f, 19.0f, 1.0f, 16.985f, 1.0f, 14.5f)
                curveTo(1.0f, 12.015f, 3.015f, 10.0f, 5.5f, 10.0f)
                curveTo(7.985f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(7.854f, 12.646f)
                curveTo(7.658f, 12.451f, 7.342f, 12.451f, 7.146f, 12.646f)
                lineTo(4.5f, 15.293f)
                lineTo(3.854f, 14.646f)
                curveTo(3.658f, 14.451f, 3.342f, 14.451f, 3.146f, 14.646f)
                curveTo(2.951f, 14.842f, 2.951f, 15.158f, 3.146f, 15.354f)
                lineTo(4.146f, 16.354f)
                curveTo(4.342f, 16.549f, 4.658f, 16.549f, 4.854f, 16.354f)
                lineTo(7.854f, 13.354f)
                curveTo(8.049f, 13.158f, 8.049f, 12.842f, 7.854f, 12.646f)
                close()
            }
        }
        .build()
        return _radarCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _radarCheckmark: ImageVector? = null

@Preview
@Composable
private fun RadarCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.RadarCheckmark, contentDescription = null)
    }
}

