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
 * TextPeriodAsterisk icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: text, period, asterisk
 * - Source: ic_fluent_text_period_asterisk_20_regular.svg
 * 
 * @return The [ImageVector] for the TextPeriodAsterisk icon.
 */
public val FluentIcons.Regular.TextPeriodAsterisk: ImageVector
    get() {
        if (_textPeriodAsterisk != null) {
            return _textPeriodAsterisk!!
        }
        _textPeriodAsterisk = Builder(name = "TextPeriodAsterisk", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.996f, 4.496f)
                curveTo(11.996f, 4.22f, 11.772f, 3.996f, 11.496f, 3.996f)
                curveTo(11.22f, 3.996f, 10.996f, 4.22f, 10.996f, 4.496f)
                verticalLineTo(6.961f)
                lineTo(8.655f, 6.201f)
                curveTo(8.392f, 6.115f, 8.11f, 6.259f, 8.025f, 6.522f)
                curveTo(7.939f, 6.784f, 8.083f, 7.066f, 8.346f, 7.152f)
                lineTo(10.69f, 7.913f)
                lineTo(9.239f, 9.911f)
                curveTo(9.077f, 10.134f, 9.127f, 10.447f, 9.35f, 10.609f)
                curveTo(9.573f, 10.771f, 9.886f, 10.722f, 10.048f, 10.498f)
                lineTo(11.498f, 8.503f)
                lineTo(12.947f, 10.498f)
                curveTo(13.11f, 10.722f, 13.422f, 10.771f, 13.646f, 10.609f)
                curveTo(13.869f, 10.447f, 13.919f, 10.134f, 13.756f, 9.911f)
                lineTo(12.306f, 7.914f)
                lineTo(14.654f, 7.152f)
                curveTo(14.917f, 7.066f, 15.06f, 6.784f, 14.975f, 6.522f)
                curveTo(14.89f, 6.259f, 14.608f, 6.115f, 14.345f, 6.201f)
                lineTo(11.996f, 6.964f)
                verticalLineTo(4.496f)
                close()
                moveTo(6.0f, 16.0f)
                curveTo(6.552f, 16.0f, 7.0f, 15.552f, 7.0f, 15.0f)
                curveTo(7.0f, 14.447f, 6.552f, 14.0f, 6.0f, 14.0f)
                curveTo(5.448f, 14.0f, 5.0f, 14.447f, 5.0f, 15.0f)
                curveTo(5.0f, 15.552f, 5.448f, 16.0f, 6.0f, 16.0f)
                close()
            }
        }
        .build()
        return _textPeriodAsterisk!!
    }

@Suppress("ObjectPropertyName")
private var _textPeriodAsterisk: ImageVector? = null

@Preview
@Composable
private fun TextPeriodAsteriskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextPeriodAsterisk, contentDescription = null)
    }
}

