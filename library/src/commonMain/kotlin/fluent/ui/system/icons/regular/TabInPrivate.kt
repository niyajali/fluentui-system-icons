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
 * TabInPrivate Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in browser tab scenarios. Contains option variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tab_in_private_24_regular.svg)
 * 
 * @return The [ImageVector] for the TabInPrivate icon.
 */
public val FluentIcons.Regular.TabInPrivate: ImageVector
    get() {
        if (_tabInPrivate != null) {
            return _tabInPrivate!!
        }
        _tabInPrivate = Builder(name = "TabInPrivate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.769f, 19.769f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                close()
                moveTo(4.5f, 5.75f)
                verticalLineTo(6.793f)
                lineTo(6.793f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                close()
                moveTo(4.5f, 8.207f)
                verticalLineTo(10.793f)
                lineTo(10.793f, 4.5f)
                horizontalLineTo(8.207f)
                lineTo(4.5f, 8.207f)
                close()
                moveTo(12.207f, 4.5f)
                lineTo(4.5f, 12.207f)
                verticalLineTo(14.793f)
                lineTo(14.793f, 4.5f)
                horizontalLineTo(12.207f)
                close()
                moveTo(16.207f, 4.5f)
                lineTo(4.5f, 16.207f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.411f, 4.531f, 18.565f, 4.586f, 18.707f)
                lineTo(18.707f, 4.586f)
                curveTo(18.565f, 4.531f, 18.411f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(16.207f)
                close()
                moveTo(19.414f, 5.293f)
                lineTo(5.293f, 19.414f)
                curveTo(5.435f, 19.469f, 5.589f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(7.793f)
                lineTo(19.5f, 7.793f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.589f, 19.469f, 5.435f, 19.414f, 5.293f)
                close()
                moveTo(19.5f, 9.207f)
                lineTo(9.207f, 19.5f)
                horizontalLineTo(11.793f)
                lineTo(19.5f, 11.793f)
                verticalLineTo(9.207f)
                close()
                moveTo(19.5f, 13.207f)
                lineTo(13.207f, 19.5f)
                horizontalLineTo(15.793f)
                lineTo(19.5f, 15.793f)
                verticalLineTo(13.207f)
                close()
                moveTo(19.5f, 17.207f)
                lineTo(17.207f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
                verticalLineTo(17.207f)
                close()
            }
        }
        .build()
        return _tabInPrivate!!
    }

@Suppress("ObjectPropertyName")
private var _tabInPrivate: ImageVector? = null

@Preview
@Composable
private fun TabInPrivatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabInPrivate, contentDescription = "TabInPrivate Icon")
    }
}

