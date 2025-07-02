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
 * BracesDismiss icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: braces, dismiss
 * - Source: ic_fluent_braces_dismiss_16_filled.svg
 * 
 * @return The [ImageVector] for the BracesDismiss icon.
 */
public val FluentIcons.Filled.BracesDismiss: ImageVector
    get() {
        if (_bracesDismiss != null) {
            return _bracesDismiss!!
        }
        _bracesDismiss = Builder(name = "BracesDismiss", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(2.895f, 2.0f, 2.0f, 2.895f, 2.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 7.276f, 1.776f, 7.5f, 1.5f, 7.5f)
                curveTo(1.224f, 7.5f, 1.0f, 7.724f, 1.0f, 8.0f)
                curveTo(1.0f, 8.276f, 1.224f, 8.5f, 1.5f, 8.5f)
                curveTo(1.776f, 8.5f, 2.0f, 8.724f, 2.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 13.105f, 2.895f, 14.0f, 4.0f, 14.0f)
                curveTo(4.276f, 14.0f, 4.5f, 13.776f, 4.5f, 13.5f)
                curveTo(4.5f, 13.224f, 4.276f, 13.0f, 4.0f, 13.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 8.616f, 2.856f, 8.265f, 2.618f, 8.0f)
                curveTo(2.856f, 7.735f, 3.0f, 7.384f, 3.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                curveTo(4.276f, 3.0f, 4.5f, 2.776f, 4.5f, 2.5f)
                curveTo(4.5f, 2.224f, 4.276f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(13.105f, 2.0f, 14.0f, 2.895f, 14.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(14.0f, 7.276f, 14.224f, 7.5f, 14.5f, 7.5f)
                curveTo(14.776f, 7.5f, 15.0f, 7.724f, 15.0f, 8.0f)
                curveTo(15.0f, 8.276f, 14.776f, 8.5f, 14.5f, 8.5f)
                curveTo(14.224f, 8.5f, 14.0f, 8.724f, 14.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(11.724f, 14.0f, 11.5f, 13.776f, 11.5f, 13.5f)
                curveTo(11.5f, 13.224f, 11.724f, 13.0f, 12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 8.616f, 13.144f, 8.265f, 13.382f, 8.0f)
                curveTo(13.144f, 7.735f, 13.0f, 7.384f, 13.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                curveTo(11.724f, 3.0f, 11.5f, 2.776f, 11.5f, 2.5f)
                curveTo(11.5f, 2.224f, 11.724f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(10.209f, 12.0f, 12.0f, 10.209f, 12.0f, 8.0f)
                curveTo(12.0f, 5.791f, 10.209f, 4.0f, 8.0f, 4.0f)
                curveTo(5.791f, 4.0f, 4.0f, 5.791f, 4.0f, 8.0f)
                curveTo(4.0f, 10.209f, 5.791f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(6.146f, 6.854f)
                curveTo(5.951f, 6.658f, 5.951f, 6.342f, 6.146f, 6.146f)
                curveTo(6.342f, 5.951f, 6.658f, 5.951f, 6.854f, 6.146f)
                lineTo(8.0f, 7.293f)
                lineTo(9.146f, 6.146f)
                curveTo(9.342f, 5.951f, 9.658f, 5.951f, 9.854f, 6.146f)
                curveTo(10.049f, 6.342f, 10.049f, 6.658f, 9.854f, 6.854f)
                lineTo(8.707f, 8.0f)
                lineTo(9.854f, 9.146f)
                curveTo(10.049f, 9.342f, 10.049f, 9.658f, 9.854f, 9.854f)
                curveTo(9.658f, 10.049f, 9.342f, 10.049f, 9.146f, 9.854f)
                lineTo(8.0f, 8.707f)
                lineTo(6.854f, 9.854f)
                curveTo(6.658f, 10.049f, 6.342f, 10.049f, 6.146f, 9.854f)
                curveTo(5.951f, 9.658f, 5.951f, 9.342f, 6.146f, 9.146f)
                lineTo(7.293f, 8.0f)
                lineTo(6.146f, 6.854f)
                close()
            }
        }
        .build()
        return _bracesDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _bracesDismiss: ImageVector? = null

@Preview
@Composable
private fun BracesDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BracesDismiss, contentDescription = null)
    }
}

