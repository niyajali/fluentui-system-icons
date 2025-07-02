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
 * BracesCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: braces, checkmark
 * - Source: ic_fluent_braces_checkmark_16_regular.svg
 * 
 * @return The [ImageVector] for the BracesCheckmark icon.
 */
public val FluentIcons.Regular.BracesCheckmark: ImageVector
    get() {
        if (_bracesCheckmark != null) {
            return _bracesCheckmark!!
        }
        _bracesCheckmark = Builder(name = "BracesCheckmark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 13.5f)
                curveTo(4.5f, 13.776f, 4.276f, 14.0f, 4.0f, 14.0f)
                curveTo(2.895f, 14.0f, 2.0f, 13.105f, 2.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.724f, 1.776f, 8.5f, 1.5f, 8.5f)
                curveTo(1.224f, 8.5f, 1.0f, 8.276f, 1.0f, 8.0f)
                curveTo(1.0f, 7.724f, 1.224f, 7.5f, 1.5f, 7.5f)
                curveTo(1.776f, 7.5f, 2.0f, 7.276f, 2.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.895f, 2.895f, 2.0f, 4.0f, 2.0f)
                curveTo(4.276f, 2.0f, 4.5f, 2.224f, 4.5f, 2.5f)
                curveTo(4.5f, 2.776f, 4.276f, 3.0f, 4.0f, 3.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 7.384f, 2.856f, 7.735f, 2.618f, 8.0f)
                curveTo(2.856f, 8.265f, 3.0f, 8.616f, 3.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 12.552f, 3.448f, 13.0f, 4.0f, 13.0f)
                curveTo(4.276f, 13.0f, 4.5f, 13.224f, 4.5f, 13.5f)
                close()
                moveTo(14.5f, 7.5f)
                curveTo(14.224f, 7.5f, 14.0f, 7.276f, 14.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 2.895f, 13.105f, 2.0f, 12.0f, 2.0f)
                curveTo(11.724f, 2.0f, 11.5f, 2.224f, 11.5f, 2.5f)
                curveTo(11.5f, 2.776f, 11.724f, 3.0f, 12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 7.384f, 13.144f, 7.735f, 13.382f, 8.0f)
                curveTo(13.145f, 8.265f, 13.0f, 8.616f, 13.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                curveTo(11.724f, 13.0f, 11.5f, 13.224f, 11.5f, 13.5f)
                curveTo(11.5f, 13.776f, 11.724f, 14.0f, 12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(14.0f, 8.724f, 14.224f, 8.5f, 14.5f, 8.5f)
                curveTo(14.776f, 8.5f, 15.0f, 8.276f, 15.0f, 8.0f)
                curveTo(15.0f, 7.724f, 14.776f, 7.5f, 14.5f, 7.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.0f, 10.209f, 10.209f, 12.0f, 8.0f, 12.0f)
                curveTo(5.791f, 12.0f, 4.0f, 10.209f, 4.0f, 8.0f)
                curveTo(4.0f, 5.791f, 5.791f, 4.0f, 8.0f, 4.0f)
                curveTo(10.209f, 4.0f, 12.0f, 5.791f, 12.0f, 8.0f)
                close()
                moveTo(11.0f, 8.0f)
                curveTo(11.0f, 6.346f, 9.654f, 5.0f, 8.0f, 5.0f)
                curveTo(6.346f, 5.0f, 5.0f, 6.346f, 5.0f, 8.0f)
                curveTo(5.0f, 9.654f, 6.346f, 11.0f, 8.0f, 11.0f)
                curveTo(9.654f, 11.0f, 11.0f, 9.654f, 11.0f, 8.0f)
                close()
                moveTo(9.146f, 6.646f)
                lineTo(7.5f, 8.292f)
                lineTo(6.854f, 7.646f)
                curveTo(6.659f, 7.451f, 6.342f, 7.451f, 6.147f, 7.646f)
                curveTo(5.952f, 7.841f, 5.952f, 8.158f, 6.147f, 8.353f)
                lineTo(7.147f, 9.353f)
                curveTo(7.241f, 9.447f, 7.368f, 9.499f, 7.501f, 9.499f)
                curveTo(7.634f, 9.499f, 7.761f, 9.446f, 7.855f, 9.353f)
                lineTo(9.855f, 7.353f)
                curveTo(10.05f, 7.158f, 10.05f, 6.841f, 9.855f, 6.646f)
                curveTo(9.66f, 6.451f, 9.343f, 6.451f, 9.148f, 6.646f)
                horizontalLineTo(9.146f)
                close()
            }
        }
        .build()
        return _bracesCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _bracesCheckmark: ImageVector? = null

@Preview
@Composable
private fun BracesCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BracesCheckmark, contentDescription = null)
    }
}

