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
 * CursorProhibited Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cursor_prohibited_20_filled.svg)
 * 
 * @return The [ImageVector] for the CursorProhibited icon.
 */
public val FluentIcons.Filled.CursorProhibited: ImageVector
    get() {
        if (_cursorProhibited != null) {
            return _cursorProhibited!!
        }
        _cursorProhibited = Builder(name = "CursorProhibited", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 7.985f, 19.0f, 5.5f)
                curveTo(19.0f, 3.015f, 16.985f, 1.0f, 14.5f, 1.0f)
                curveTo(12.015f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                close()
                moveTo(11.0f, 5.5f)
                curveTo(11.0f, 3.567f, 12.567f, 2.0f, 14.5f, 2.0f)
                curveTo(15.286f, 2.0f, 16.012f, 2.259f, 16.596f, 2.697f)
                lineTo(11.697f, 7.596f)
                curveTo(11.259f, 7.012f, 11.0f, 6.286f, 11.0f, 5.5f)
                close()
                moveTo(14.5f, 9.0f)
                curveTo(13.714f, 9.0f, 12.988f, 8.741f, 12.404f, 8.303f)
                lineTo(17.303f, 3.404f)
                curveTo(17.741f, 3.988f, 18.0f, 4.714f, 18.0f, 5.5f)
                curveTo(18.0f, 7.433f, 16.433f, 9.0f, 14.5f, 9.0f)
                close()
                moveTo(14.5f, 11.0f)
                curveTo(11.462f, 11.0f, 9.0f, 8.538f, 9.0f, 5.5f)
                curveTo(9.0f, 5.101f, 9.043f, 4.711f, 9.123f, 4.336f)
                lineTo(6.636f, 2.288f)
                curveTo(5.983f, 1.75f, 5.0f, 2.214f, 5.0f, 3.06f)
                verticalLineTo(17.058f)
                curveTo(5.0f, 17.984f, 6.15f, 18.413f, 6.756f, 17.713f)
                lineTo(10.28f, 13.64f)
                curveTo(10.565f, 13.311f, 10.979f, 13.122f, 11.414f, 13.122f)
                lineTo(17.006f, 13.122f)
                curveTo(17.944f, 13.122f, 18.366f, 11.946f, 17.642f, 11.35f)
                lineTo(16.675f, 10.553f)
                curveTo(16.008f, 10.841f, 15.272f, 11.0f, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _cursorProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _cursorProhibited: ImageVector? = null

@Preview
@Composable
private fun CursorProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CursorProhibited, contentDescription = "CursorProhibited Icon")
    }
}

