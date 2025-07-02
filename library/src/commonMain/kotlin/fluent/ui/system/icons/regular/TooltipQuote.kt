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
 * TooltipQuote icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tooltip, quote
 * - Source: ic_fluent_tooltip_quote_24_regular.svg
 * 
 * @return The [ImageVector] for the TooltipQuote icon.
 */
public val FluentIcons.Regular.TooltipQuote: ImageVector
    get() {
        if (_tooltipQuote != null) {
            return _tooltipQuote!!
        }
        _tooltipQuote = Builder(name = "TooltipQuote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 5.5f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(5.5f, 7.664f, 5.836f, 8.0f, 6.25f, 8.0f)
                curveTo(6.391f, 8.0f, 6.522f, 7.961f, 6.635f, 7.894f)
                curveTo(6.332f, 8.558f, 5.92f, 9.019f, 5.72f, 9.22f)
                curveTo(5.427f, 9.513f, 5.427f, 9.987f, 5.72f, 10.28f)
                curveTo(6.013f, 10.573f, 6.487f, 10.573f, 6.78f, 10.28f)
                curveTo(7.212f, 9.849f, 8.5f, 8.401f, 8.5f, 6.25f)
                curveTo(8.5f, 5.836f, 8.164f, 5.5f, 7.75f, 5.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(10.25f, 5.5f)
                curveTo(9.836f, 5.5f, 9.5f, 5.836f, 9.5f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(9.5f, 7.664f, 9.836f, 8.0f, 10.25f, 8.0f)
                curveTo(10.391f, 8.0f, 10.522f, 7.961f, 10.635f, 7.894f)
                curveTo(10.332f, 8.558f, 9.92f, 9.019f, 9.72f, 9.22f)
                curveTo(9.427f, 9.513f, 9.427f, 9.987f, 9.72f, 10.28f)
                curveTo(10.013f, 10.573f, 10.487f, 10.573f, 10.78f, 10.28f)
                curveTo(11.212f, 9.849f, 12.5f, 8.401f, 12.5f, 6.25f)
                curveTo(12.5f, 5.836f, 12.164f, 5.5f, 11.75f, 5.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(2.0f, 4.25f)
                curveTo(2.0f, 3.007f, 3.007f, 2.0f, 4.25f, 2.0f)
                horizontalLineTo(13.25f)
                curveTo(14.493f, 2.0f, 15.5f, 3.007f, 15.5f, 4.25f)
                verticalLineTo(11.75f)
                curveTo(15.5f, 12.993f, 14.493f, 14.0f, 13.25f, 14.0f)
                horizontalLineTo(11.308f)
                lineTo(9.414f, 17.599f)
                curveTo(9.284f, 17.846f, 9.028f, 18.0f, 8.75f, 18.0f)
                curveTo(8.471f, 18.0f, 8.216f, 17.846f, 8.086f, 17.599f)
                lineTo(6.192f, 14.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 14.0f, 2.0f, 12.993f, 2.0f, 11.75f)
                lineTo(2.0f, 4.25f)
                close()
                moveTo(4.25f, 3.5f)
                curveTo(3.836f, 3.5f, 3.5f, 3.836f, 3.5f, 4.25f)
                lineTo(3.5f, 11.75f)
                curveTo(3.5f, 12.164f, 3.836f, 12.5f, 4.25f, 12.5f)
                horizontalLineTo(6.645f)
                curveTo(6.923f, 12.5f, 7.179f, 12.654f, 7.308f, 12.901f)
                lineTo(8.75f, 15.64f)
                lineTo(10.191f, 12.901f)
                curveTo(10.321f, 12.654f, 10.577f, 12.5f, 10.855f, 12.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 12.5f, 14.0f, 12.164f, 14.0f, 11.75f)
                verticalLineTo(4.25f)
                curveTo(14.0f, 3.836f, 13.664f, 3.5f, 13.25f, 3.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(6.378f, 16.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.5f, 2.0f, 16.836f, 2.0f, 17.25f)
                curveTo(2.0f, 17.664f, 2.336f, 18.0f, 2.75f, 18.0f)
                horizontalLineTo(7.167f)
                lineTo(6.378f, 16.5f)
                close()
                moveTo(10.333f, 18.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 18.0f, 22.0f, 17.664f, 22.0f, 17.25f)
                curveTo(22.0f, 16.836f, 21.664f, 16.5f, 21.25f, 16.5f)
                horizontalLineTo(11.122f)
                lineTo(10.333f, 18.0f)
                close()
                moveTo(2.75f, 20.5f)
                curveTo(2.336f, 20.5f, 2.0f, 20.836f, 2.0f, 21.25f)
                curveTo(2.0f, 21.664f, 2.336f, 22.0f, 2.75f, 22.0f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 22.0f, 15.5f, 21.664f, 15.5f, 21.25f)
                curveTo(15.5f, 20.836f, 15.164f, 20.5f, 14.75f, 20.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _tooltipQuote!!
    }

@Suppress("ObjectPropertyName")
private var _tooltipQuote: ImageVector? = null

@Preview
@Composable
private fun TooltipQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TooltipQuote, contentDescription = null)
    }
}

