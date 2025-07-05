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
 * SquareDismiss Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general UI, app tile, content or other general layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_square_dismiss_20_regular.svg)
 * 
 * @return The [ImageVector] for the SquareDismiss icon.
 */
public val FluentIcons.Regular.SquareDismiss: ImageVector
    get() {
        if (_squareDismiss != null) {
            return _squareDismiss!!
        }
        _squareDismiss = Builder(name = "SquareDismiss", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.438f, 16.683f, 9.306f, 16.349f, 9.207f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                verticalLineTo(9.207f)
                curveTo(16.349f, 9.306f, 16.683f, 9.438f, 17.0f, 9.6f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(16.354f, 12.646f)
                curveTo(16.549f, 12.842f, 16.549f, 13.158f, 16.354f, 13.354f)
                lineTo(15.207f, 14.5f)
                lineTo(16.354f, 15.646f)
                curveTo(16.549f, 15.842f, 16.549f, 16.158f, 16.354f, 16.354f)
                curveTo(16.158f, 16.549f, 15.842f, 16.549f, 15.646f, 16.354f)
                lineTo(14.5f, 15.207f)
                lineTo(13.354f, 16.354f)
                curveTo(13.158f, 16.549f, 12.842f, 16.549f, 12.646f, 16.354f)
                curveTo(12.451f, 16.158f, 12.451f, 15.842f, 12.646f, 15.646f)
                lineTo(13.793f, 14.5f)
                lineTo(12.646f, 13.354f)
                curveTo(12.451f, 13.158f, 12.451f, 12.842f, 12.646f, 12.646f)
                curveTo(12.842f, 12.451f, 13.158f, 12.451f, 13.354f, 12.646f)
                lineTo(14.5f, 13.793f)
                lineTo(15.646f, 12.646f)
                curveTo(15.842f, 12.451f, 16.158f, 12.451f, 16.354f, 12.646f)
                close()
            }
        }
        .build()
        return _squareDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _squareDismiss: ImageVector? = null

@Preview
@Composable
private fun SquareDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SquareDismiss, contentDescription = "SquareDismiss Icon")
    }
}

