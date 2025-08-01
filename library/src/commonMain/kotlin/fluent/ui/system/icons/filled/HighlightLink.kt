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
 * HighlightLink Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to highlight content in edit scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_highlight_link_20_filled.svg)
 * 
 * @return The [ImageVector] for the HighlightLink icon.
 */
public val FluentIcons.Filled.HighlightLink: ImageVector
    get() {
        if (_highlightLink != null) {
            return _highlightLink!!
        }
        _highlightLink = Builder(name = "HighlightLink", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                curveTo(3.672f, 2.0f, 3.0f, 2.672f, 3.0f, 3.5f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 7.328f, 3.672f, 8.0f, 4.5f, 8.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 8.0f, 17.0f, 7.328f, 17.0f, 6.5f)
                verticalLineTo(3.5f)
                curveTo(17.0f, 2.672f, 16.328f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(4.895f, 11.0f, 4.0f, 10.105f, 4.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 10.105f, 15.105f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(12.5f)
                curveTo(10.567f, 12.0f, 9.0f, 13.567f, 9.0f, 15.5f)
                curveTo(9.0f, 15.923f, 9.075f, 16.328f, 9.212f, 16.704f)
                lineTo(6.724f, 17.948f)
                curveTo(6.391f, 18.114f, 6.0f, 17.873f, 6.0f, 17.501f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.5f, 13.0f)
                curveTo(11.119f, 13.0f, 10.0f, 14.119f, 10.0f, 15.5f)
                curveTo(10.0f, 16.881f, 11.119f, 18.0f, 12.5f, 18.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 18.0f, 13.5f, 17.776f, 13.5f, 17.5f)
                curveTo(13.5f, 17.224f, 13.276f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(11.672f, 17.0f, 11.0f, 16.328f, 11.0f, 15.5f)
                curveTo(11.0f, 14.672f, 11.672f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.276f, 14.0f, 13.5f, 13.776f, 13.5f, 13.5f)
                curveTo(13.5f, 13.224f, 13.276f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(12.5f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(15.724f, 13.0f, 15.5f, 13.224f, 15.5f, 13.5f)
                curveTo(15.5f, 13.776f, 15.724f, 14.0f, 16.0f, 14.0f)
                horizontalLineTo(16.5f)
                curveTo(17.328f, 14.0f, 18.0f, 14.672f, 18.0f, 15.5f)
                curveTo(18.0f, 16.328f, 17.328f, 17.0f, 16.5f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(15.724f, 17.0f, 15.5f, 17.224f, 15.5f, 17.5f)
                curveTo(15.5f, 17.776f, 15.724f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 18.0f, 19.0f, 16.881f, 19.0f, 15.5f)
                curveTo(19.0f, 14.119f, 17.881f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 15.5f)
                curveTo(12.0f, 15.224f, 12.224f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 15.0f, 17.0f, 15.224f, 17.0f, 15.5f)
                curveTo(17.0f, 15.776f, 16.776f, 16.0f, 16.5f, 16.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 16.0f, 12.0f, 15.776f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _highlightLink!!
    }

@Suppress("ObjectPropertyName")
private var _highlightLink: ImageVector? = null

@Preview
@Composable
private fun HighlightLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HighlightLink, contentDescription = "HighlightLink Icon")
    }
}

